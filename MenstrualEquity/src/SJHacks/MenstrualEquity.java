package SJHacks;

import MVCFramework.Model;

import java.util.*;

public class MenstrualEquity extends Model {

    private String language;
    protected HashMap<Sector,ArrayList<Location>> locations;

    public MenstrualEquity() {
        super();
        initializeDataBase();

    }
    private void initializeDataBase() {
        locations = new HashMap<>();

        addLocation(new Location("3050 Berryessa Rd", Sector.BERRYESSA, false, true, "None"));
        addLocation(new Location("3355 Noble Ave", Sector.BERRYESSA, true, true, "None"));
        addLocation(new Location("123 Alviso St", Sector.ALVISO, false, true, "Pads available"));
        // etc.
    }
    private void addLocation(Location loc) {
        locations.computeIfAbsent(loc.getSector(), k -> new ArrayList<>()).add(loc);
    }



    public ArrayList<Location> getLocations(String sec) {
        Sector sector = Sector.valueOf(sec);
        return locations.get(sector);
    }




    //sets language here
}
