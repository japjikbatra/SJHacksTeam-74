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
        //start of Central SJ Locations
        addLocation(new Location("MLK Library - 150 E San Fernando St.", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Biblioteca Latinoamericana Branch Library - 921 S 1st St.", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Joyce Ellington Branch Library - 491 E. Empire St.", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Tully Branch Library - 880 Tully Rd.", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Rose Garden Branch Library - 1580 Naglee Ave.", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("East San Jose Carnegie Library - 1102 E Santa Clara St.", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day"));
        //start of East SJ Locations
        addLocation(new Location("Alum Rock Branch Library - 3090 Alum Rock Ave.", Sector. ALUMROCK, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Mt. Pleasant Neighborhood Library - 3411 Rocky Mountain Dr.", Sector.ALUMROCK, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Lake Cunnigham Regional Park - 2305 S. White Rd", Sector.ALUMROCK, true, true, "None", "Sunrise to Sunset"));
        addLocation(new Location("Alum Rock State Park - 15350 Penetencia Creek Rd.", Sector.ALUMROCK, true, true, "none", "Sunrise to Sunset"));
        addLocation(new Location("Educational Park Branch Library - 1772 Educational Park Dr.", Sector.ALUMROCK, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Dr. Roberto Cruz Alum Rock Branch Library - 3090 Alum Rock Ave.", Sector.ALUMROCK, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Evergreen Branch Library - 2635 Aborn Rd.", Sector.EVERGREEN, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Village Branch Square Library - 4001 Evergreen Village Square", Sector.EVERGREEN, true, true, "Baby changing station", "Varies per day"));
        addLocation(new Location("Arcadia Ballpark - 2208 Quimby Rd.", Sector.EVERGREEN, false, false, "none", "Sunrise to Sunset"));
        addLocation(new Location("Boggini Park - Remington Way & Millbrook Drive", Sector.SILVERCREEKVALLEY, true, true, "none", "Sunrise to Sunset"));

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
