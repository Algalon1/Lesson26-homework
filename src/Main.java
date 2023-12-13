public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW", 2015);
        System.out.println(vehicle.displayInfo());

        Car car = new Car("Toyota",2023,"Camry");
        System.out.println(car.displayInfo());

    }
}
