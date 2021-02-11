package task3;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        Vehicle plane = new Plane(12);
        Vehicle car = new Car();
        Vehicle ship = new Ship("Odessa", 112);

        System.out.println("Самолет: " + plane.toString());
        System.out.println("Корабль: " + ship.toString());
        System.out.println("Машина: " + car.toString());


    }
}
