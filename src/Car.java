public class Car extends Vehicle{
    public String model;


    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    @Override
    public String toString(){
        return String.format("Make is %s, model is %s, year is %d%n",this.make,this.model,this.year);
    }

    @Override
    public String displayInfo(){
        return  String.format("%s , model is %s",super.displayInfo(),this.model);
    }
}
