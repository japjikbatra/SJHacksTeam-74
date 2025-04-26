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

    public ArrayList<Location> getLocations(String sec){
        ArrayList<Location> locs = new ArrayList<>();
        for (Sector key : locations.keySet()) {
            if(key.name().equalsIgnoreCase(sec) ){
                locs.add(locations.get(key));
            }
        }
        return locs;
    }




    //sets language here
}
