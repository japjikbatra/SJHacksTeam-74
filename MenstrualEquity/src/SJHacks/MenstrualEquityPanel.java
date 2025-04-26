package SJHacks;

import Customizations.MineFieldFactory;
import MVCFramework.AppFactory;
import MVCFramework.AppPanel;
import MVCFramework.Utilities;

import javax.swing.*;

public class MenstrualEquityPanel extends AppPanel {
    JPanel langPanel;
    JPanel sectorPanel;
    public MenstrualEquityPanel(AppFactory factory) {
        super(factory);
        this.factory = factory;

        //String language = Utilities.ask("Please Select A Language.");
        //String genericLocation = Utilities.ask("Which region of San Jose?");
        String language = selectLanguage();
        selectLocation();
    }

    private String selectLanguage(){
        langPanel = new JPanel();
        String[] langOptions = {"English", "Spanish", "Punjabi"};
        JComboBox<String> dropdown = new JComboBox<>(langOptions);
        langPanel.add(dropdown);
        controlPanel.add(langPanel);
        Object selected = dropdown.getSelectedItem();
        String lang = (String) selected;
        return lang;
    }

    private void selectLocation(){
        sectorPanel = new JPanel();
        String[] langOptions = {"Central San Jose", "North San Jose", "West San Jose", "South San Jose", "East San Jose"};
        JComboBox<String> dropdown = new JComboBox<>(langOptions);
        zonePanel.add(dropdown);
        controlPanel.add(zonePanel);
        Object selected = dropdown.getSelectedItem();
        String zone = (String) selected;
        if(zone.equals("Central San Jose")){
            String[] sectors = {"Hyde Park", "Northside", "Japantown", "Civic Center", "Coleman", "The Alameda", "Rose Garden", "Shasta-Hanchett Park", "St. Leo's", "West San Carlos", "Midtown", "Washington-Guadalupe", "Tamien", "Alma", "Spartan Keyes", "Naglee Park", "Downtown"};
            JComboBox<String> dropdown2 = new JComboBox<>(sectors);
            zonePanel.add(dropdown2);
            controlPanel.add(zonePanel);
        }
    }

    //private voi

    private void createControlPanel() {

    }

    public static void main(String[] args){
        FRAME_HEIGHT = 500;
        FRAME_WIDTH = 1000;
        AppPanel app = new MenstrualEquityPanel(new MenstrualEquityFactory());
        app.display();
    }
}
