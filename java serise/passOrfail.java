import java.util.Scanner;
public class passOrfail {
  public static void main(String[] args) {
    Scanner mr = new Scanner(System.in);
    byte m, p , c;
   System.out.println("enter your Mth marks:");
    m =mr.nextByte();
    System.out.println("enter your physics marks");
    p = mr.nextByte();
    System.out.println("enter your chemistry maks");
    c= mr.nextByte();
    float sum = m+p+c;
    float value = sum/3.0f;
    if (value>40 && m>33 && p>33 && c>33) {
      System.out.println("cogratulation! you are promoted");
    }else{
      System.out.println("sorry ! you are not promoted");
    }
    }
}
