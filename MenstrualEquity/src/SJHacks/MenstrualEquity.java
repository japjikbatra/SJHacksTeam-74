package SJHacks;

import MVCFramework.Model;

import java.util.*;

public class MenstrualEquity extends Model {

    private String language;
    protected HashMap<Sector,Location> locations;

    public MenstrualEquity() {
        super();
        initializeDataBase();

    }
    private void initializeDataBase(){
        locations = new HashMap<>();
        Location berry = new Location("3050 Berryessa Rd",Sector.BERRYESSA,false, true,"None" );
        locations.put(berry.getSector(), berry);
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
