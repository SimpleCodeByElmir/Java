package my_package;

// Subclass of Superclass Person
public class Student extends Person {
  
  public Student() {
    //super();             // Sublcass calls the constructor of the Superclass
    do_print("\nConstructor... Class 'Student'.");    // calling protected method from Superclass
  }
  
  @Override
  public void greetings() {
    super.greetings();          // calling Superclass method (not overrode - the original).
    do_print("\n*Calling overrode, in Subclass 'Student', method 'greetings()'.\n\nWow, Hello! My name is " + getName() + ". And I'm cool.");
    double hw_sum = super.HeightWeightSum();        // getting sum of height and weight values. Now we can use it in this overrode method
    do_print("\nSum of Height and Weight is " + hw_sum + ".\nSqrt of Height and Weight Sum " + java.lang.Math.sqrt(hw_sum));
  }
}
