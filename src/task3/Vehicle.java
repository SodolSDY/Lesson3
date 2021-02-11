package task3;

public class Vehicle {
    public double height;
    public double cost;
    public int speed;
    public int year;

     Vehicle() {
        cost = 15.650;
        speed = 160;
        year = 2000;
        height = 2.0;
    }
}
class Plane extends Vehicle{

    int passengers;


    Plane( int passengers) {
        this.passengers = passengers;
        height = 4.7;
    }

    @Override
    public String toString() {
        return "Plane {" +
                "height=" + height +
                ", passengers=" + passengers + " cost: "
        + cost + " Speed " + speed+ " " + "Год выпуска " + year + "}";
    }

}
    class Car extends Vehicle{

        public Car() {
            speed = 140;
            year = 1995;


        }

        @Override
        public String toString() {
            return "Car{" +
                    "cost= " + cost +
                    ", speed= " + speed +
                    ", year= " + year +
                    '}';
        }
    }
  class Ship extends Vehicle{
    int passengers;
    String port;


    Ship(String port, int passengers){
        height = 5.6;
        this.passengers = passengers;
        this.port = port;
    }

      @Override
      public String toString() {
          return "Ship{" +
                  "cost=" + cost +
                  ", speed=" + speed +
                  ", year=" + year +
                  ", passengers=" + passengers +
                  ", port='" + port + '\'' +
                  '}';
      }
  }

