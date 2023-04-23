package my_package;

public class Person {

  private String name;
  private int age;
  private double height;
  private double weight;
  private int id;
  public static int counter = 1;

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


  /* setters */
  public void setName(String newName) {
    name = newName;
  }

  public void setAge(int newAge) {
    if (newAge >= 0 && newAge < 125) {
      age = newAge;
    } else {
      System.out.println("Error: invalid age value.");
    }
  }

  public void setHeight(double newHeight) {
    if (newHeight >= 0 && newHeight < 3.1) {
      height = newHeight;
    } else {
      System.out.println("Error: invalid height value.");
    }
  }

  public void setWeight(double newWeight) {
    if (newWeight >= 0 && newWeight < 650) {
      weight = newWeight;
    } else {
      System.out.println("Error: invalid weight value.");
    }
  }


  /* methods */
  public void greetings() {
    System.out.printf("Hello, my name is %s.\n", name);
  }

  public void talking() {
    System.out.println("I'am " + age + " years old. I like to ride a bike. And just so You to know my height is " + height + " and my weight is " + weight + " kilograms.");
  }

  public void goodbye() {
    System.out.println("Nice to meet You! Goodbye!");
  }
}
