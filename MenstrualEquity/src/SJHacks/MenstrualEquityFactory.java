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
        return "MenstrualEquityApp";
    }

    @Override
    public String[] getHelp() {
        return new String[]{""};
    }

    @Override
    public String about() {
        return "";
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
