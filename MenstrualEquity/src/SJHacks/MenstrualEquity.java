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

        mv/addingmorelocations
        //North SJ
        addLocation(new Location("Penitencia Creek Park - 3050 Berryessa Rd", Sector.BERRYESSA, false, true, "None"));
        addLocation(new Location("Berryessa Branch Library - 3355 Noble Ave", Sector.BERRYESSA, true, true, "None"));
        addLocation(new Location("Citaldi Park - 2900 Citaldi Dr.", Sector.BERRYESSA, true, true, "None"));
        addLocation(new Location("Alviso County Park - 1195 Hope St.", Sector.ALVISO, true, true, "None"));
        addLocation(new Location("Alviso Branch Library - 5050 North First St.", Sector.ALVISO, true, true, "Changing station available"));
        addLocation(new Location("River View Park - Riverview Parkway", Sector.RINCONGOLDENTRIANGLE, true, true, "None"));

        //South SJ
        addLocation(new Location("Almaden Lake Park - 6099 Winfield Blvd", Sector.ALMADEN, true, true, "None"));
        addLocation(new Location("Almaden Community Center - 6445 Camden Ave", Sector.ALMADEN, true, true, "None"));
        addLocation(new Location("Almaden Branch Library - 6445 Camden Ave", Sector.ALMADEN, true, true, "None"));
        addLocation(new Location("Santa Teresa Branch Library - 290 International Cir", Sector.SANTATERESA, true, true, "Changing station available"));
        addLocation(new Location("La Colina Park - 6138 Ansdell Way #6100", Sector.SANTATERESA, true, true, "None"));
        addLocation(new Location("Martial Cottle Park - 5283 Snell Ave", Sector.SANTATERESA, true, true, "None"));
        addLocation(new Location("Vineland Branch Library - 1450 Blossom Hill Rd", Sector.BLOSSOMVALLEY, true, true, "None"));
        addLocation(new Location("Cahalan Park - 770 Pearlwood Way", Sector.BLOSSOMVALLEY, true, true, "None"));
        addLocation(new Location("Paul Moore Park - 1426 Hillsdale Ave", Sector.BLOSSOMVALLEY, true, true, "None"));
        addLocation(new Location("Pearl Avenue Branch Library - 4270 Pearl Ave", Sector.BLOSSOMVALLEY, true, true, "Changing station available"));
        addLocation(new Location("Basking Ridge Park - 7260 Downs Dr", Sector.BASKINGRIDGE, true, true, "None"));
        addLocation(new Location("Edenvale Branch Library - 101 Branham Ln E", Sector.EDENVALE, true, true, "Changing station available"));
        addLocation(new Location("Edenvale Gardens Regional Park - 200 Edenvale Ave", Sector.EDENVALE, true, true, "None"));
        addLocation(new Location("Seven Trees Branch Library - 3590 Cas Dr", Sector.SEVENTREEW, true, true, "Changing Station available"));
        addLocation(new Location("Seven Trees Community Center - 3590 Cas Dr", Sector.SEVENTREEW, true, true, "None"));
        addLocation(new Location("Del Monte Park - 806 W Home St", Sector.NORTHMONTEREY, true, true, "None"));
        addLocation(new Location("Willow Street Frank Bramhall Park - 1320 Willow St", Sector.NORTHMONTEREY, true, true, "None"));

        //West SJ
        addLocation(new Location("Cambrian Branch Library - 1780 Hillsdale Ave.", Sector.CAMBRIAN, true, true, "Changing station available"));
        addLocation(new Location("Houge Park - Twilight Drive & White Oaks Ave", Sector.CAMBRIAN, true, true, "None"));
        addLocation(new Location("Doerr Park - Potrero Dr & Park Wilshire Dr", Sector.CAMBRIAN, true, true, "None"));
        addLocation(new Location("Willow Glen Branch Library - 1157 Minnesota Ave", Sector.WILLOWGLEN, true, true, "Changing station available"));
        addLocation(new Location("Willow Glen Community Center - 2175 Lincoln Ave", Sector.WILLOWGLEN, true, true, "None"));
        addLocation(new Location("Lincoln Glen Park - Curtner Ave & Radio Ave", Sector.WILLOWGLEN, true, true, "None"));
        addLocation(new Location("Marijane Hamann Park - 2747 Westfield Ave", Sector.FRUITDALE, true, true, "None"));
        addLocation(new Location("Bascom Branch Library - 1000 S Bascom Ave", Sector.BASCOM, true, true, "Changing station available"));
        addLocation(new Location("Stevens Creek County Park - 11401 Stevens Canyon Rd", Sector.STEVENSCREEK, true, true, "None"));
        addLocation(new Location("Calabazas Branch Library - 1230 S Blaney Ave", Sector.CALABAZAS, true, true, "Changing station available"));
        addLocation(new Location("Calabazas Park - 6852 Rainbow Dr", Sector.CALABAZAS, true, true, "None"));
        addLocation(new Location("West Valley Branch Library - 1243 San Tomas Aquino Rd", Sector.PASEODESARATOGA, true, true, "Changin stations available"));

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

    main
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
