import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("give 2 words");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();
    lastFirstN(word1, word2, 3);

    System.out.println("Doing problem 2");
    System.out.println("give 2 words");
    String word3 = scan.nextLine();
    String word4 = scan.nextLine();

    stringManip(word3, word4);
   

   System.out.println(removeStr())
    // write your code here
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output ;
    String firstN  ;
    String lastN ;

    firstN = s2.substring(0, n);
    int startPosition = s1.length() -n;
    lastN = s1.substring(startPosition);
    output = lastN + firstN;

  //substring (3) ;

    System.out.println(output);
 
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();
    String s3;
    s3 = s3substring(1, s2.length));
    s3 = s2.substring (0,1);
    output = s3
    System.out.println(output);



  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
      String output;
      String before;
      String after;
      int startOfs2 = s1.indexOf(s2);
      int endOfs2 = startOfs2 + s2.length();
      
      before = s1.substring(0, startOfs2);
      after = s1.substring(endOfs2);
      output = before + after;
    return output;
   




  }

    
  
}
