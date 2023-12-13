public class Vehicle {
    public String make;
    public int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayInfo(){
        System.out.printf("Make is %s, year is %d%n",this.make,this.year);
    }
}
