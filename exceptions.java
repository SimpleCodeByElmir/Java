public class exceptions {
  public static void main(String[] args) {

    int my_array[] = new int[5];
    
    try {
      //my_array[6] = 6;                          // ArrayIndexOutOfBoundsException ex
      //my_array[6] = Integer.parseInt("gfd");    // NumberFormatException ex
      my_array[0] = 11;
      if (my_array[0] > 10) {
        throw new Exception("Throwing exception: my_array[0] > 10.");
      }
    }
    catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Array out of bounds.");
    }
    catch (NumberFormatException ex) {
      System.out.println("Invalid convertion from string to int.");
    }
    catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println("Program ended correctly.");
  }
}
