public class bubble_sort {
  public static void main (String args[]) {
    sort();  
  }

  static void sort () {		  
    int[] mass = {9,8,7,6,5,4,3,2,1,0};

    for (int i = 0; i < mass.length; i++) {
      for (int p = 0; p < mass.length-1; p++) {
        if (mass[p] > mass[p+1]) {
          int c = mass[p];
          mass[p] = mass[p+1];
          mass[p+1] = c;
        }
      }
    }

    System.out.printf("The array contains %d numbers.\nSorted: ", mass.length);

    // output elements of the array
    int i = 0;
    while (i < mass.length) {
      if (i != mass.length-1) {           // put spaces between
        System.out.printf("%d ", mass[i]);
        i++;
      } else {                            // no space for the last element
        System.out.printf("%d\n", mass[i]);
        break;
      }
    }
  }
}
