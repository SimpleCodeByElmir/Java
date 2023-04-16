import my_package.*;

public class Main {
  public static void main (String[] args) {
    Person alex = new Person();
	alex.name = "Alesandro";
    alex.age = 15;
	alex.height = 1.75;
	alex.weight = 55.2;
	alex.greetings();
	alex.talking();
	alex.goodbye();
  }
}
