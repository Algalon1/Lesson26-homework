public class Vehicle {
    public String make;
    public int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String displayInfo(){
        return String.format("Make is %s, year is %d",this.make,this.year);
    }
}
