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

        // North SJ
        addLocation(new Location("Penitencia Creek Park - 3050 Berryessa Rd", Sector.BERRYESSA, false, true, "None", "Sunrise to sunset", new Coordinate(37.3892, -121.8400)));
        addLocation(new Location("Berryessa Branch Library - 3355 Noble Ave", Sector.BERRYESSA, true, true, "None", "Varies per day", new Coordinate(37.3898, -121.8567)));
        addLocation(new Location("Citaldi Park - 2900 Citaldi Dr.", Sector.BERRYESSA, true, true, "None", "Sunrise to sunset", new Coordinate(37.3893, -121.8662)));
        addLocation(new Location("Alviso County Park - 1195 Hope St.", Sector.ALVISO, true, true, "None", "8AM - 8PM", new Coordinate(37.4182, -121.9757)));
        addLocation(new Location("Alviso Branch Library - 5050 North First St.", Sector.ALVISO, true, true, "Changing station available", "Varies per day", new Coordinate(37.4170, -121.9745)));
        addLocation(new Location("River View Park - Riverview Parkway", Sector.RINCONGOLDENTRIANGLE, true, true, "None", "Sunrise to sunset", new Coordinate(37.3920, -121.8760)));


        //South SJ
        addLocation(new Location("Almaden Lake Park - 6099 Winfield Blvd", Sector.ALMADEN, true, true, "None", "8AM - 8PM", new Coordinate(37.2400, -121.8350)));
        addLocation(new Location("Almaden Community Center - 6445 Camden Ave", Sector.ALMADEN, true, true, "None", "Varies per day", new Coordinate(37.2405, -121.8583)));
        addLocation(new Location("Almaden Branch Library - 6445 Camden Ave", Sector.ALMADEN, true, true, "None", "Varies per day", new Coordinate(37.2405, -121.8583)));
        addLocation(new Location("Santa Teresa Branch Library - 290 International Cir", Sector.SANTATERESA, true, true, "Changing station available", "Varies per day", new Coordinate(37.2400, -121.8450)));
        addLocation(new Location("La Colina Park - 6138 Ansdell Way #6100", Sector.SANTATERESA, true, true, "None", "Sunrise to sunset", new Coordinate(37.2405, -121.8500)));
        addLocation(new Location("Martial Cottle Park - 5283 Snell Ave", Sector.SANTATERESA, true, true, "None", "8AM to 6PM", new Coordinate(37.2400, -121.8600)));
        addLocation(new Location("Vineland Branch Library - 1450 Blossom Hill Rd", Sector.BLOSSOMVALLEY, true, true, "None", "Varies per day", new Coordinate(37.2405, -121.8600)));
        addLocation(new Location("Cahalan Park - 770 Pearlwood Way", Sector.BLOSSOMVALLEY, true, true, "None", "7AM - 7PM", new Coordinate(37.2400, -121.8700)));
        addLocation(new Location("Paul Moore Park - 1426 Hillsdale Ave", Sector.BLOSSOMVALLEY, true, true, "None", "7AM - 10PM", new Coordinate(37.2405, -121.8750)));
        addLocation(new Location("Pearl Avenue Branch Library - 4270 Pearl Ave", Sector.BLOSSOMVALLEY, true, true, "Changing station available", "Sunrise to sunset", new Coordinate(37.2400, -121.8800)));
        addLocation(new Location("Basking Ridge Park - 7260 Downs Dr", Sector.BASKINGRIDGE, true, true, "None", "Sunrise to sunset", new Coordinate(37.2405, -121.8850)));
        addLocation(new Location("Edenvale Branch Library - 101 Branham Ln E", Sector.EDENVALE, true, true, "Changing station available", "Varies per day", new Coordinate(37.2400, -121.8900)));
        addLocation(new Location("Edenvale Gardens Regional Park - 200 Edenvale Ave", Sector.EDENVALE, true, true, "None", "6AM - 9:30PM", new Coordinate(37.2405, -121.8950)));
        addLocation(new Location("Seven Trees Branch Library - 3590 Cas Dr", Sector.SEVENTREEW, true, true, "Changing Station available", "Varies per day", new Coordinate(37.2400, -121.9000)));
        addLocation(new Location("Seven Trees Community Center - 3590 Cas Dr", Sector.SEVENTREEW, true, true, "None", "9AM - 8PM", new Coordinate(37.2405, -121.9050)));
        addLocation(new Location("Del Monte Park - 806 W Home St", Sector.NORTHMONTEREY, true, true, "None", "Sunrise to sunset", new Coordinate(37.2400, -121.9100)));
        addLocation(new Location("Willow Street Frank Bramhall Park - 1320 Willow St", Sector.NORTHMONTEREY, true, true, "None", "8AM - 8PM", new Coordinate(37.2405, -121.9150)));


        //West SJ
        addLocation(new Location("Cambrian Branch Library - 1780 Hillsdale Ave.", Sector.CAMBRIAN, true, true, "Changing station available", "Varies per day", new Coordinate(37.2631, -121.9246)));
        addLocation(new Location("Houge Park - Twilight Drive & White Oaks Ave", Sector.CAMBRIAN, true, true, "None", "8AM - 8PM", new Coordinate(37.2601, -121.9384)));
        addLocation(new Location("Doerr Park - Potrero Dr & Park Wilshire Dr", Sector.CAMBRIAN, true, true, "None", "7AM - 8PM", new Coordinate(37.2844, -121.9114)));
        addLocation(new Location("Willow Glen Branch Library - 1157 Minnesota Ave", Sector.WILLOWGLEN, true, true, "Changing station available", "Varies per day", new Coordinate(37.3005, -121.9001)));
        addLocation(new Location("Willow Glen Community Center - 2175 Lincoln Ave", Sector.WILLOWGLEN, true, true, "None", "Varies per day", new Coordinate(37.2947, -121.8997)));
        addLocation(new Location("Lincoln Glen Park - Curtner Ave & Radio Ave", Sector.WILLOWGLEN, true, true, "None", "8AM - 9PM", new Coordinate(37.2905, -121.8890)));
        addLocation(new Location("Marijane Hamann Park - 2747 Westfield Ave", Sector.FRUITDALE, true, true, "None", "6AM - 7PM", new Coordinate(37.3124, -121.9364)));
        addLocation(new Location("Bascom Branch Library - 1000 S Bascom Ave", Sector.BASCOM, true, true, "Changing station available", "Varies per day", new Coordinate(37.3123, -121.9319)));
        addLocation(new Location("Stevens Creek County Park - 11401 Stevens Canyon Rd", Sector.STEVENSCREEK, true, true, "None", "8AM - 8PM", new Coordinate(37.3138, -122.0680)));
        addLocation(new Location("Calabazas Branch Library - 1230 S Blaney Ave", Sector.CALABAZAS, true, true, "Changing station available", "Varies per day", new Coordinate(37.3058, -122.0012)));
        addLocation(new Location("Calabazas Park - 6852 Rainbow Dr", Sector.CALABAZAS, true, true, "None", "24 Hours", new Coordinate(37.3062, -122.0024)));
        addLocation(new Location("West Valley Branch Library - 1243 San Tomas Aquino Rd", Sector.PASEODESARATOGA, true, true, "Changing stations available", "Varies per day", new Coordinate(37.3121, -121.9854)));

        //Central SJ
        addLocation(new Location("MLK Library - 150 E San Fernando St", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3354, -121.8783)));
        addLocation(new Location("Biblioteca Latinoamericana Branch Library - 921 S 1st St", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3220, -121.8850)));
        addLocation(new Location("Joyce Ellington Branch Library - 491 E Empire St", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3346, -121.8769)));
        addLocation(new Location("Tully Branch Library - 880 Tully Rd", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3121, -121.8410)));
        addLocation(new Location("Rose Garden Branch Library - 1580 Naglee Ave", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3320, -121.9263)));
        addLocation(new Location("East San Jose Carnegie Library - 1102 E Santa Clara St", Sector.DOWNTOWN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3464, -121.8683)));

        //East SJ
        addLocation(new Location("Alum Rock Branch Library - 3090 Alum Rock Ave.", Sector.ALUMROCK, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3580, -121.8493)));
        addLocation(new Location("Mt. Pleasant Neighborhood Library - 3411 Rocky Mountain Dr.", Sector.ALUMROCK, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3584, -121.7999)));
        addLocation(new Location("Lake Cunningham Regional Park - 2305 S. White Rd", Sector.ALUMROCK, true, true, "None", "Sunrise to Sunset", new Coordinate(37.3311, -121.8102)));
        addLocation(new Location("Alum Rock State Park - 15350 Penetencia Creek Rd.", Sector.ALUMROCK, true, true, "None", "Sunrise to Sunset", new Coordinate(37.4060, -121.8132)));
        addLocation(new Location("Educational Park Branch Library - 1772 Educational Park Dr.", Sector.ALUMROCK, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3585, -121.8347)));
        addLocation(new Location("Dr. Roberto Cruz Alum Rock Branch Library - 3090 Alum Rock Ave.", Sector.ALUMROCK, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3580, -121.8493)));
        addLocation(new Location("Evergreen Branch Library - 2635 Aborn Rd.", Sector.EVERGREEN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3186, -121.8033)));
        addLocation(new Location("Village Branch Square Library - 4001 Evergreen Village Square", Sector.EVERGREEN, true, true, "Baby changing station", "Varies per day", new Coordinate(37.3161, -121.7912)));
        addLocation(new Location("Arcadia Ballpark - 2208 Quimby Rd.", Sector.EVERGREEN, false, false, "None", "Sunrise to Sunset", new Coordinate(37.3042, -121.8065)));
        addLocation(new Location("Boggini Park - Remington Way & Millbrook Drive", Sector.SILVERCREEKVALLEY, true, true, "None", "Sunrise to Sunset", new Coordinate(37.2992, -121.7668)));



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
