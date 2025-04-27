package SJHacks;

public class Location {
    private String address;
    private boolean pads;
    private boolean tampons;
    private String additionalFacilities;
    private Sector sector;
    private String hours;

    public Location(String address, Sector sector) {
        this.address = address;
        this.sector = sector;
        this.pads = false;
        this.tampons = false;
        this.additionalFacilities = "";
        this.hours = "";


    }
    public Location(String address, Sector sector, boolean pads, boolean tampons, String additionalFacilities, String hours) {
        this.address = address;
        this.sector = sector;
        this.pads = pads;
        this.tampons = tampons;
        this.additionalFacilities = additionalFacilities;
        this.hours = hours;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Sector getSector() {
        return this.sector;
    }
    public void setSector(Sector sector) {
        this.sector = sector;
    }
    public boolean hasPads() {
        return pads;
    }
    public boolean hasTampons() {
        return tampons;
    }
    public String getAdditionalFacilities() {
        return additionalFacilities;
    }
    public void setAdditionalFacilities(String additionalFacilities) {
        this.additionalFacilities = additionalFacilities;
    }
    public String getHours() {
        return hours;
    }



}
