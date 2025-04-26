package SJHacks;

import Customizations.MineFieldFactory;
import MVCFramework.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class MenstrualEquityPanel extends AppPanel {
    MenstrualEquity menstrualEquity;
    JPanel langPanel;
    JPanel sectorPanel;
    JPanel zonePanel;
    JComboBox<String> dropdown;
    public MenstrualEquityPanel(AppFactory factory) {
        super(factory);
        this.factory = factory;
        JLabel question = new JLabel("Please Select A Location");
        controlPanel.add(question);
        //String language = Utilities.ask("Please Select A Language.");
        //String genericLocation = Utilities.ask("Which region of San Jose?");
        //String language = selectLanguage();
        String location = selectLocation();
    }

    private String selectLanguage(){
        langPanel = new JPanel();
        String[] langOptions = {"English", "Spanish", "Punjabi"};
        dropdown = new JComboBox<>(langOptions);
        langPanel.add(dropdown);
        controlPanel.add(langPanel);
        Object selected = dropdown.getSelectedItem();
        String lang = (String) selected;
        return lang;
    }

    private String selectLocation(){
        zonePanel = new JPanel();
        String[] zoneOptions = {"ALVISO", "BERRYESSA", "RINCONGOLDENTRIANGLE", "RINCONSOUTH", "AIRPORT", "ALUMROCK", "EVERGREEN", "SILVERCREEKVALLEY", "LITTLEPORTUGAL", "OLINDERBONITA", "LITTLESAIGON", "STORYANDKING", "YERBABUENA", "MCLAUGHLIN", "NORTHMONTEREY", "SEVENTREEW", "EDENVALE", "BASKINGRIDGE", "SANTATERESA", "BLOSSOMVALLEY", "ALMADEN", "CANOAS", "COMMUNICATIONSHILL", "WILLOWGLEN", "CAMBRIAN", "BASCOM", "FRUITDALE", "WINCHESTER", "PASEODESARATOGA", "CALABAZAS", "STEVENSCREEK", "SANTANAROWVALLEYFAIR", "DOWNTOWN", "ALMA", "COLEMAN", "CIVICCENTER", "HYDEPARK", "JAPANTOWN", "MIDTOWN", "NAGLEEPARK", "NORTHSIDE", "SPARTANKEYES", "SANTOMASAQUINO", "TAMIEN", "THEALAMEDA", "WASHINGTONGUADALUPE", "STLEOS", "ROSEGARDEN", "SHASTAHANCHETTPARK"};
        dropdown = new JComboBox<>(zoneOptions);
        zonePanel.add(dropdown);
        dropdown.addActionListener(this);
        controlPanel.add(zonePanel);
        Object selected = dropdown.getSelectedItem();
        String zone = (String) selected;
        return zone;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {

            String selectedValue = dropdown.getSelectedItem().toString();
            System.out.println(selectedValue);
            ArrayList<Location> locations = menstrualEquity.getLocations(selectedValue);


            String cmmd = ae.getActionCommand();


            if (cmmd.equals("About")) {
                Utilities.inform(factory.about());
            } else if (cmmd.equals("Help")) {
                Utilities.inform(factory.getHelp());
            } else {
                Command command = factory.makeEditCommands(model, cmmd, ae.getSource());
                command.execute();
                repaint();
            }
        } catch (Exception e) {
            handleException(e);
        }
    }

    public static void main(String[] args){
        FRAME_HEIGHT = 500;
        FRAME_WIDTH = 1000;
        AppPanel app = new MenstrualEquityPanel(new MenstrualEquityFactory());
        app.display();
    }
}
