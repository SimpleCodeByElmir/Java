import my_package.*;

public class Main {
  public static void main (String[] args) {

    // Alex, id = 1
    Person alex = new Person();

    alex.setName("Alesandro");
    alex.setAge(15);
    alex.setHeight(1.75);
    alex.setWeight(55.2);

    System.out.printf("*Created Person page with ID: %d\n\n", alex.getId());
    alex.greetings();
    alex.talking();
    alex.goodbye();

    System.out.printf("\n# Summary\nID: %d\nname: %s\nage: %d\nheight: %f\nweight: %f\n", alex.getId(), alex.getName(), alex.getAge(), alex.getHeight(), alex.getWeight());
	
    // Arthur, id = 2
    Person arthur = new Person();
    arthur.setName("Arthur");
    System.out.printf("\n\n*Created Person page with ID: %d\n\n# Summary\nID: %d\nname: %s\nage: %d\nheight: %f\nweight: %f\n", arthur.getId(), arthur.getId(), arthur.getName(), arthur.getAge(), arthur.getHeight(), arthur.getWeight());

    System.out.printf("\n\nFollowing Person ID will be: %d\n", Person.counter);
	

    System.out.print("\n\n\n##############################################\n\n## Cars\n");

    Car cheap = new Car();                           // constructor 1
    System.out.printf("\n*object #1, constructor #1:\n%s\n%f\n%s\n", cheap.name, cheap.price, cheap.dealer);
    
    Car expensive = new Car("Mercedes", 5000);       // constructor 2
    System.out.printf("\n*object #2, constructor #2:\n%s\n%.2f\n%s\n", expensive.name, expensive.price, expensive.dealer);

    Car nice = new Car("Skoda");                     // constructor 3
    System.out.printf("\n*object #3, constructor #3:\n%s\n%.2f\n%s\n", nice.name, nice.price, nice.dealer);
  }
}
