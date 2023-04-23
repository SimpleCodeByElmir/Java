package my_package;

public class Car {

  public String name;
  public double price;

  public Car() {                                    // constructor #1 - without parameters
    name = "Undefined";
    price = 0.999;
  }
  public Car(String car_name, double car_price) {   // constructor #2 - with two parameters
    name = car_name;
    price = car_price;
  }
  public Car(String name) {                         // constructor #3 - with one param
    this.name = name;
    price = 1000;
  }
  
  public void getCarName() {
    System.out.println(name);
  }
}
