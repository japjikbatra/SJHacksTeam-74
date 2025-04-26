package SJHacks;

import MVCFramework.AppFactory;
import MVCFramework.Command;
import MVCFramework.Model;
import MVCFramework.View;

public class MenstrualEquityFactory implements AppFactory {
    @Override
    public Model makeModel() {
        return null;
    }

    @Override
    public View makeView(Model m) {
        return null;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String[] getHelp() {
        return new String[0];
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
