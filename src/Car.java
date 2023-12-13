public class Car extends Vehicle{
    public String model;


    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    @Override
    public String toString(){
        return String.format("Make is %s, model is %s, year is %d",this.make,this.model,this.year);
    }
}
