package SJHacks;

import MVCFramework.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.net.URL;


public class MenstrualEquityPanel extends AppPanel {

    JPanel topPanel;
    JComboBox<String> dropdown;
    JPanel buttonPanel;
    MenstrualEquity menstrualEquity;
    MenstrualEquityView menstrualEquityView;
    public MenstrualEquityPanel(AppFactory factory) {
        super(factory);
        this.factory = factory;
        topPanel = new JPanel();
        topPanel.setBackground(Color.decode("#f2ceed")); // color light pink!
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        JLabel question = new JLabel("Please Select A Location");
        topPanel.add(question);
        controlPanel.add(topPanel);
        menstrualEquityView = (MenstrualEquityView) view;
        //String language = Utilities.ask("Please Select A Language.");
        //String genericLocation = Utilities.ask("Which region of San Jose?");
        //String language = selectLanguage();
        String location = selectLocation();
        menstrualEquity = (MenstrualEquity) model;
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.decode("#3a3ae8"));  // color royal blue!
        buttonPanel.setPreferredSize(new Dimension(400, 500));
        buttonPanel.setLayout(new GridLayout(0, 1));
        controlPanel.add(buttonPanel);
    }
    /*private String selectLanguage(){
        langPanel = new JPanel();
        String[] langOptions = {"English", "Spanish", "Punjabi"};
        dropdown = new JComboBox<>(langOptions);
        langPanel.add(dropdown);
        controlPanel.add(langPanel);
        Object selected = dropdown.getSelectedItem();
        String lang = (String) selected;
        return lang;
    }*/

    private String selectLocation(){
        String[] zoneOptions = {"ALVISO", "BERRYESSA", "RINCONGOLDENTRIANGLE", "RINCONSOUTH", "AIRPORT", "ALUMROCK", "EVERGREEN", "SILVERCREEKVALLEY", "LITTLEPORTUGAL", "OLINDERBONITA", "LITTLESAIGON", "STORYANDKING", "YERBABUENA", "MCLAUGHLIN", "NORTHMONTEREY", "SEVENTREEW", "EDENVALE", "BASKINGRIDGE", "SANTATERESA", "BLOSSOMVALLEY", "ALMADEN", "CANOAS", "COMMUNICATIONSHILL", "WILLOWGLEN", "CAMBRIAN", "BASCOM", "FRUITDALE", "WINCHESTER", "PASEODESARATOGA", "CALABAZAS", "STEVENSCREEK", "SANTANAROWVALLEYFAIR", "DOWNTOWN", "ALMA", "COLEMAN", "CIVICCENTER", "HYDEPARK", "JAPANTOWN", "MIDTOWN", "NAGLEEPARK", "NORTHSIDE", "SPARTANKEYES", "SANTOMASAQUINO", "TAMIEN", "THEALAMEDA", "WASHINGTONGUADALUPE", "STLEOS", "ROSEGARDEN", "SHASTAHANCHETTPARK"};
        dropdown = new JComboBox<>(zoneOptions);
        topPanel.add(dropdown);
        dropdown.addActionListener(this);

        Object selected = dropdown.getSelectedItem();
        String zone = (String) selected;
        return zone;
    }

    private void displayLocations(ArrayList<Location> locations) {
        buttonPanel.removeAll(); // Clear old buttons first

        for (Location loc : locations) {
            JButton button = new JButton(loc.getAddress());
            button.setActionCommand(loc.getAddress());
            button.addActionListener(this);
            buttonPanel.add(button);
            button.setMaximumSize(new Dimension(300, 200)); // fixed width/height
            button.setAlignmentX(Component.LEFT_ALIGNMENT); // align to left
        }

        buttonPanel.revalidate();
        buttonPanel.repaint();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmmd = ae.getActionCommand();
        try {
            if (cmmd.equals("About")) {
                Utilities.inform(factory.about());
            } else if (cmmd.equals("Help")) {
                Utilities.inform(factory.getHelp());
            }else{
                String selectedValue = dropdown.getSelectedItem().toString();
                ArrayList<Location> locationList = menstrualEquity.getLocations(selectedValue);
                for(Location loc : locationList){
                    if(loc.getAddress().equals(cmmd)){
                        showLocationInfo(loc);
                    }
                }
                displayLocations(locationList);
                menstrualEquityView.showMarkersPerZone(selectedValue);
            }
        } catch (Exception e) {
            Utilities.inform("No locations available");
        }
    }
    private void showLocationInfo(Location loc) {
        String info = "Address: " + loc.getAddress() + "\n"
                + "Pads Available: " + (loc.hasPads() ? "Yes" : "No") + "\n"
                + "Tampons Available: " + (loc.hasTampons() ? "Yes" : "No") + "\n"
                + "Notes: " + loc.getAdditionalFacilities() + "\n"
                + "Hours: " + loc.getHours();

        JOptionPane.showMessageDialog(this, info, "Location Info", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args){
        try{
            File libDir = new File("lib");
            URL[] classLoaderUrls = {libDir.toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(classLoaderUrls);
            Thread.currentThread().setContextClassLoader(urlClassLoader);
        }catch(Exception e){
            e.printStackTrace();
        }
        FRAME_HEIGHT = 500;
        FRAME_WIDTH = 1000;
        AppPanel app = new MenstrualEquityPanel(new MenstrualEquityFactory());
        app.display();
    }
}