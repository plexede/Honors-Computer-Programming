public class CarDriver {
    public static void main(String[] args) {
        Car car1 = new Car("Blue", 25, 10000);
        Car car2 = new Car("Red", 45, 12000);
        Car car3 = new Car("Black", 65, 35000);

        System.out.println("Car 1 is " + car1.getColor());
        System.out.println("Car 1 has " + car1.getMileage() + " miles");
        System.out.println("Car 1 is going " + car1.getSpeed() + " miles per hour");
        car1.setSpeed(55);
        System.out.println("Now car 1 is going " + car1.getSpeed() + " miles per hour");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Car 2 is " + car2.getColor());
        System.out.println("Car 2 has " + car2.getMileage() + " miles");
        System.out.println("Car 2 is going " + car2.getSpeed() + " miles per hour");
        car2.setSpeed(72);
        System.out.println("Now car 2 is going " + car2.getSpeed() + " miles per hour");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Car 3 is " + car3.getColor());
        System.out.println("Car 3 has " + car3.getMileage() + " miles");
        System.out.println("Car 3 is going " + car3.getSpeed() + " miles per hour");
        car3.setSpeed(34);
        System.out.println("Now car 3 is going " + car3.getSpeed() + " miles per hour");
        System.out.println("------------------------------------------------------------------------------");
    }
}