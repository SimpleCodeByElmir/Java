package my_package;

public class Person {

  private String name;
  private int age;
  private double height;
  private double weight;
  private int id;
  private static int counter = 1;

  public Person() {
    id = counter++;
  }

  /* getters */
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }
  public int getId() {
    return id;
  }
  public static void getCounter() {
    System.out.println(counter);
  }


  /* setters */
  public void setName(String newName) {
    name = newName;
  }

  public void setAge(int newAge) {
    if (newAge >= 0 && newAge < 125) {
      age = newAge;
    } else {
      do_print("Error: invalid age value.");
      System.exit(0);
    }
  }

  public void setHeight(double newHeight) {
    if (newHeight >= 0 && newHeight < 3.1) {
      height = newHeight;
    } else {
      do_print("Error: invalid height value.");
      System.exit(0);
    }
  }

  public void setWeight(double newWeight) {
    if (newWeight >= 0 && newWeight < 650) {
      weight = newWeight;
    } else {
      do_print("Error: invalid weight value.");
      System.exit(0);
    }
  }


  /* methods */
  public void greetings() {
    do_print("Hello, my name is " + name + ".");
  }

  public void talking() {
    do_print("I'am " + age + " years old. I like to ride a bike. And just so You to know my height is " + height + " and my weight is " + weight + " kilograms.");
  }

  public void goodbye() {
    do_print("Nice to meet You! Goodbye!");
  }
  
  private void do_print(String str) {
    System.out.println(str);
  }
}
