package SJHacks;

import MVCFramework.AppFactory;
import MVCFramework.Command;
import MVCFramework.Model;
import MVCFramework.View;

public class MenstrualEquityFactory implements AppFactory {
    @Override
    public Model makeModel() {
        return new MenstrualEquity();
    }

    @Override
    public View makeView(Model m) {
        return new MenstrualEquityView((MenstrualEquity) m);
    }

    @Override
    public String getTitle() {
        return "SJLunaria";
    }

    @Override
    public String[] getHelp() {
        return new String[]{"Input your known general location on the drop down and select from the given list for specific information. Look on the map for help!"};
    }

    @Override
    public String about() {
        return "Help find nearest locations or restrooms and get updates on menstrual product availability. Just input your general location in San Jose!";
    }

    @Override
    public String[] getEditCommands() {
        return new String[0];
    }

    @Override
    public Command makeEditCommands(Model model, String type, Object source) {
        return null;
    }
}
