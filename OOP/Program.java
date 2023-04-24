import my_package.*;

public class Program {
  public static void main (String[] args) {

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
    
    //Subclass    (calls the counstructor of the class Person)
    Inheritance ivan = new Inheritance();
    ivan.setName("Ivan");
    System.out.printf("\n%s\n", ivan.getName());
  }

  static void changeCountry (Objects obj) {
    obj.setCountry("USA");
  }

  static void changeObject (Objects obj) {
    obj = new Objects("Germany");
    obj.setCountry("Britain");
    //System.out.println(obj.getCountry());
  }
}
