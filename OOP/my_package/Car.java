package my_package;

public class Car {

  public String name;
  public double price;

  public Car() {
    name = "Undefined";
    price = 0.999;
  }
  public Car(String car_name, double car_price) {
    name = car_name;
    price = car_price;
  }
  
  public void getCarName() {
    System.out.println(name);
  }
}
