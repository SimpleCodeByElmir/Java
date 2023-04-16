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
  }
}
