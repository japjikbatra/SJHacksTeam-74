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
        String[] zoneOptions = {"ALVISO", "BERRYESSA", "RINCONGOLDENTRIANGLE", "RINCONSOUTH", "AIRPORT", "ALUMROCK", "EVERGREEN", "SILVERCREEKVALLEY", "LITTLEPORTUGAL", "OLINDERBONITA", "LITTLESAIGON", "STORYANDKING", "YERBABUENA", "MCLAUGHLIN", "NORTHMONTEREY", "SEVENTREEW", "EDENVALE", "BASKINGRIDGE", "SANTATERESA", "BLOSSOMVALLEY", "ALMADEN", "CANOAS", "COMMUNICATIONSHILL", "WILLOWGLEN", "CAMBRIAN", "BASCOM", "FRUITDALE", "WINCHESTER", "PASEODESARATOGA", "CALABAZAS", "STEVENSCREEK", "SANTANAROWVALLEYFAIR", "DOWNTOWN", "ALMA", "COLEMAN", "CIVICCENTER", "HYDEPARK", "JAPANTOWN", "MIDTOWN", "NAGLEEPARK", "NORTHSIDE", "SPARTANKEYES", "SANTOMASAQUINO", "TAMIEN", "THEALAMEDA", "WASHINGTONGUADALUPE", "STLEOS", "ROSEGARDEN", "SHASTAHANCHETTPARK"};
        JComboBox<String> dropdown = new JComboBox<>(zoneOptions);
        zonePanel.add(dropdown);
        controlPanel.add(zonePanel);
        Object selected = dropdown.getSelectedItem();
        String zone = (String) selected;
        return zone;
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
