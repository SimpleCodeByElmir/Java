import java.util.Scanner;
import java.util.Arrays;

public class input_output {
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input name: ");
    String name = input.nextLine();
    
    System.out.print("Input age: ");
    int age = input.nextInt();
    if (age <= 0 || age > 110) {
      System.out.println("Error: invalid age."); 
      System.exit(1);
    }
    
    System.out.print("Input height: ");
    float height = input.nextFloat();
    if (height <= 0 || height > 3) {
      System.out.println("Error: invalid height."); 
      System.exit(1);
    }
    
    System.out.printf("Name: %s\nAge: %d\nHeight: %.2f\n", name, age, height);
    input.close();
  }
}
