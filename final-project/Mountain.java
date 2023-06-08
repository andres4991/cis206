// #1 A class to store Mountain details. With getter and setter methods.
// With a member function toMeters that returns the converted value.
public class Mountain {
    private String name;
    private String country;
    private Double elevationFt;

    public String getName() {return this.name;}
    public String getCountry() {return this.country;}
    public Double getElevation() {return this.elevationFt;}
    public Double toMeters() {return (this.elevationFt/3.2808);}
    
    public void setName(String Name) {this.name = Name;}
    public void setCountry(String Country) {this.country = Country;}
    public void setElevation(Double ElevationFt) {this.elevationFt = ElevationFt;}

    public Mountain(String Name, String Country, Double ElevationFt) {
        this.name = Name;
        this.country = Country;
        this.elevationFt = ElevationFt;
    }

    public void print() {
        System.out.printf("%-27s | %-18s | %-8.2f | %7f\n", this.name, this.country, this.elevationFt, toMeters());
    }
}