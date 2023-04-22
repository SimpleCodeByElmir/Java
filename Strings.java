public class Strings {
  public static void main (String[] args) {

    String str1 = "Miss";
    String str2 = "Jackson";
    String str3 = str1+ " " + str2;
    
    System.out.println(str3);
 
    char c = str3.charAt(5);
    System.out.printf("char c = %c\n", c);
    int len = str3.length();
    System.out.printf("the last char of str3 = %c\n", str3.charAt(len-1)); 

    int start = 5;
    int end = 9;
    char[] dst = new char[end - start];
    str3.getChars(start, end, dst, 0);
    System.out.println(dst);

    String copied = "";
    for (int i=0; i<dst.length; i++) {
      copied += dst[i];
    }
    System.out.println(copied);


    String convert_year = "\n*By the way, now is " + 2023 + " year."; 
    System.out.println(convert_year);
  }
}
