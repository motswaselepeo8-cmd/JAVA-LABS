public class Question9 {

    static class Vehicle {
        public void describe() {
            System.out.println("This is a vehicle.");
        }

        public void describe(String type) {
            System.out.println("This is a " + type + ".");
        }

        public void move() {
            System.out.println("The vehicle moves.");
        }
    }

    static class Car extends Vehicle {
        @Override
        public void move() {
            System.out.println("The car drives on the road.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.describe();
        vehicle.describe("truck");
        vehicle.move();

        Car car = new Car();
        car.move();
    }
}