import my_package.*;

public class Program {
  public static void main (String[] args) {
    
    /* Object as an argument */
    Objects A = new Objects("Germany");
    System.out.println(A.getCountry());

    changeCountry(A);
    System.out.println(A.getCountry());

    changeObject(A);
    System.out.println(A.getCountry());
    
    
    /* Inheritance realization */
    // Superclass
    Person oleg = new Person();
    oleg.setName("Oleg");
    System.out.printf("\n%s\n", oleg.getName());
    
    // Subclass
    Student ivan = new Student();
    ivan.setName("Ivan");
    System.out.printf("\n%s\n\n", ivan.getName());
    
    ivan.setHeight(1.8);
    ivan.setWeight(68.2);
    ivan.greetings();              // calling overrode, by Subclass, method
  }

  // methods with parameters of type Object of a Class 
  static void changeCountry (Objects obj) {
    obj.setCountry("USA");
  }

  static void changeObject (Objects obj) {
    obj = new Objects("Germany");      // creates new object
    obj.setCountry("Britain");
    //System.out.println(obj.getCountry());
  }
}
