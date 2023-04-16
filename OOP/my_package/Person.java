package my_package;

public class Person {

  public String name;
  public int age;
  public double height;
  public double weight;
  

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
