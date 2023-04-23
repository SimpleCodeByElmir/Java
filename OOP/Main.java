import my_package.*;

public class Main {
  public static void main (String[] args) {

    Person alex = new Person();

    alex.setName("Alesandro");
    alex.setAge(15);
    alex.setHeight(1.75);
    alex.setWeight(55.2);

    alex.greetings();
    alex.talking();
    alex.goodbye();

    System.out.printf("\n# Summary\nname: %s\nage: %d\nheight: %f\nweight: %f\n", alex.getName(), alex.getAge(), alex.getHeight(), alex.getWeight());
	
	
	
    System.out.print("\n\n\n##############################################\n\n## Cars\n");

    Car cheap = new Car();                           // constructor 1
    System.out.printf("\n*object #1, constructor #1:\n%s\n%f\n%s\n", cheap.name, cheap.price, cheap.dealer);
    
    Car expensive = new Car("Mercedes", 5000);       // constructor 2
    System.out.printf("\n*object #2, constructor #2:\n%s\n%.2f\n%s\n", expensive.name, expensive.price, expensive.dealer);

    Car nice = new Car("Skoda");                     // constructor 3
    System.out.printf("\n*object #3, constructor #3:\n%s\n%.2f\n%s\n", nice.name, nice.price, nice.dealer);
  }
}
