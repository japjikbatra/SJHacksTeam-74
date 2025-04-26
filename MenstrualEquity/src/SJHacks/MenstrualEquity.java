package SJHacks;

import MVCFramework.Model;

import java.util.*;

public class MenstrualEquity extends Model {

    private String language;
    protected HashMap<Sector,Location> locations;

    public MenstrualEquity() {
        super();
    }
    public void addLocation(Location loc){
        locations.put(loc.getSector(),loc);
        changed();
    }
    public Location getLocation(Sector sector){
        return locations.get(sector);
    }
    



    //sets language here
}
