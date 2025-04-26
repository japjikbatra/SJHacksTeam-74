package SJHacks;

import Customizations.MineFieldFactory;
import MVCFramework.AppFactory;
import MVCFramework.AppPanel;
import MVCFramework.Utilities;

import javax.swing.*;

public class MenstrualEquityPanel extends AppPanel {
    JPanel langPanel;
    JPanel sectorPanel;
    JPanel zonePanel;
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
        JComboBox<String> dropdown = new JComboBox<>(langOptions);
        langPanel.add(dropdown);
        controlPanel.add(langPanel);
        Object selected = dropdown.getSelectedItem();
        String lang = (String) selected;
        return lang;
    }

    private String selectLocation(){
        zonePanel = new JPanel();
        String[] zoneOptions = {"CENTRAL SAN JOSE", "NORTH SAN JOSE", "WEST SAN JOSE", "SOUTH SAN JOSE", "EAST SAN JOSE"};
        JComboBox<String> dropdown = new JComboBox<>(zoneOptions);
        zonePanel.add(dropdown);

        controlPanel.add(zonePanel);

        Object selected = dropdown.getSelectedItem();
        String zone = (String) selected;
        JComboBox<String> dropdown2 = null;
        if(zone.equals("CENTRAL SAN JOSE")){
            sectorPanel = new JPanel();
            String[] centralSectors = {"HYDE PARK", "NORTHSIDE", "JAPANTOWN", "CIVIC CENTER", "COLEMAN", "THE ALAMEDA", "ROSE GARDEN", "SHASTA-HANCHETT PARK", "ST. LEO'S", "WEST SAN CARLOS", "MIDTOWN", "WASHINGTON-GUADALUPE", "TAMIEN", "ALMA", "SPARTAN KEYES", "NAGLEE PARK", "DOWNTOWN"};
            dropdown2 = new JComboBox<>(centralSectors);
            sectorPanel.add(dropdown2);
            controlPanel.add(sectorPanel);
        }else if(zone.equals("NORTH SAN JOSE")){
            sectorPanel = new JPanel();
            String[] centralSectors = {"HYDE PARK", "NORTHSIDE", "JAPANTOWN", "CIVIC CENTER", "COLEMAN", "THE ALAMEDA", "ROSE GARDEN", "SHASTA-HANCHETT PARK", "ST. LEO'S", "WEST SAN CARLOS", "MIDTOWN", "WASHINGTON-GUADALUPE", "TAMIEN", "ALMA", "SPARTAN KEYES", "NAGLEE PARK", "DOWNTOWN"};
            dropdown2 = new JComboBox<>(centralSectors);
            sectorPanel.add(dropdown2);
            controlPanel.add(sectorPanel);
        }else if(zone.equals("SOUTH SAN JOSE")){
            sectorPanel = new JPanel();
            String[] centralSectors = {"HYDE PARK", "NORTHSIDE", "JAPANTOWN", "CIVIC CENTER", "COLEMAN", "THE ALAMEDA", "ROSE GARDEN", "SHASTA-HANCHETT PARK", "ST. LEO'S", "WEST SAN CARLOS", "MIDTOWN", "WASHINGTON-GUADALUPE", "TAMIEN", "ALMA", "SPARTAN KEYES", "NAGLEE PARK", "DOWNTOWN"};
            dropdown2 = new JComboBox<>(centralSectors);
            sectorPanel.add(dropdown2);
            controlPanel.add(sectorPanel);
        }else if(zone.equals("EAST SAN JOSE")){
            sectorPanel = new JPanel();
            String[] centralSectors = {"HYDE PARK", "NORTHSIDE", "JAPANTOWN", "CIVIC CENTER", "COLEMAN", "THE ALAMEDA", "ROSE GARDEN", "SHASTA-HANCHETT PARK", "ST. LEO'S", "WEST SAN CARLOS", "MIDTOWN", "WASHINGTON-GUADALUPE", "TAMIEN", "ALMA", "SPARTAN KEYES", "NAGLEE PARK", "DOWNTOWN"};
            dropdown2 = new JComboBox<>(centralSectors);
            sectorPanel.add(dropdown2);
            controlPanel.add(sectorPanel);
        }else if(zone.equals("WEST SAN JOSE")){
            sectorPanel = new JPanel();
            String[] centralSectors = {"HYDE PARK", "NORTHSIDE", "JAPANTOWN", "CIVIC CENTER", "COLEMAN", "THE ALAMEDA", "ROSE GARDEN", "SHASTA-HANCHETT PARK", "ST. LEO'S", "WEST SAN CARLOS", "MIDTOWN", "WASHINGTON-GUADALUPE", "TAMIEN", "ALMA", "SPARTAN KEYES", "NAGLEE PARK", "DOWNTOWN"};
            dropdown2 = new JComboBox<>(centralSectors);
            sectorPanel.add(dropdown2);
            controlPanel.add(sectorPanel);
        }else{
            return null;
        }
        Object location = dropdown2.getSelectedItem();
        String selectedLocation = (String) location;
        return selectedLocation;
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
