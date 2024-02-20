package factory;

public enum Facility {
    HONGKONG("Hongkong CURA Healthcare Center"),
    SEOUL("Seoul CURA Healthcare Center"),
    TOKYO("Tokyo CURA Healthcare Center");

    public final String facilityName;

    Facility(String facilityName) {
        this.facilityName = facilityName;
    }
    public String getFacilityName() {
        return facilityName;
    }
}
