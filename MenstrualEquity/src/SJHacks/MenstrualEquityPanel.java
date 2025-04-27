package SJHacks;

import MVCFramework.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class MenstrualEquityPanel extends AppPanel {
    //MenstrualEquity menstrualEquity;
    //JPanel langPanel;
    JPanel topPanel;
    JPanel zonePanel;
    JComboBox<String> dropdown;
    JPanel buttonPanel;
    MenstrualEquity menstrualEquity;
    public MenstrualEquityPanel(AppFactory factory) {
        super(factory);
        this.factory = factory;

        ImageIcon icon = new ImageIcon("images/menstrual.png");
        topPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        JLabel question = new JLabel("Please Select A Location");
        topPanel.add(question);
        controlPanel.add(topPanel);
        //String language = Utilities.ask("Please Select A Language.");
        //String genericLocation = Utilities.ask("Which region of San Jose?");
        //String language = selectLanguage();

        String location = selectLocation();
        menstrualEquity = (MenstrualEquity) model;

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setLayout(new GridLayout(0, 1)); // One column, flexible rows
        controlPanel.add(new JScrollPane(buttonPanel));
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
        //zonePanel = new JPanel();
        String[] zoneOptions = {"ALVISO", "BERRYESSA", "RINCONGOLDENTRIANGLE", "RINCONSOUTH", "AIRPORT", "ALUMROCK", "EVERGREEN", "SILVERCREEKVALLEY", "LITTLEPORTUGAL", "OLINDERBONITA", "LITTLESAIGON", "STORYANDKING", "YERBABUENA", "MCLAUGHLIN", "NORTHMONTEREY", "SEVENTREEW", "EDENVALE", "BASKINGRIDGE", "SANTATERESA", "BLOSSOMVALLEY", "ALMADEN", "CANOAS", "COMMUNICATIONSHILL", "WILLOWGLEN", "CAMBRIAN", "BASCOM", "FRUITDALE", "WINCHESTER", "PASEODESARATOGA", "CALABAZAS", "STEVENSCREEK", "SANTANAROWVALLEYFAIR", "DOWNTOWN", "ALMA", "COLEMAN", "CIVICCENTER", "HYDEPARK", "JAPANTOWN", "MIDTOWN", "NAGLEEPARK", "NORTHSIDE", "SPARTANKEYES", "SANTOMASAQUINO", "TAMIEN", "THEALAMEDA", "WASHINGTONGUADALUPE", "STLEOS", "ROSEGARDEN", "SHASTAHANCHETTPARK"};
        dropdown = new JComboBox<>(zoneOptions);
        topPanel.add(dropdown);
        dropdown.addActionListener(this);
        //controlPanel.add(Panel);
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
            buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            // Set button size and alignment
            button.setMaximumSize(new Dimension(300, 40)); // fixed width/height
            button.setAlignmentX(Component.LEFT_ALIGNMENT); // align to left


        }

        buttonPanel.revalidate();
        buttonPanel.repaint();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmmd = ae.getActionCommand();
        System.out.println(cmmd);
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
            }
        } catch (Exception e) {
            handleException(e);
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
        FRAME_HEIGHT = 500;
        FRAME_WIDTH = 1000;
        AppPanel app = new MenstrualEquityPanel(new MenstrualEquityFactory());
        app.display();
    }
}
