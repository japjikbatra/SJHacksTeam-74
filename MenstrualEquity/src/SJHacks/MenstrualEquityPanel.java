package SJHacks;

import Customizations.MineFieldFactory;
import MVCFramework.AppFactory;
import MVCFramework.AppPanel;
import MVCFramework.Utilities;

public class MenstrualEquityPanel extends AppPanel {
    public MenstrualEquityPanel(AppFactory factory) {
        super(factory);
        this.factory = factory;

        String language = Utilities.ask("Please Select A Language.");
        String genericLocation = Utilities.ask("Which region of San Jose?");

        createControlPanel();
    }

    private void createControlPanel() {

    }

    public static void main(String[] args){
        FRAME_HEIGHT = 500;
        FRAME_WIDTH = 1000;
        AppPanel app = new MenstrualEquityPanel(new MenstrualEquityFactory());
        app.display();
    }
}
