import java.util.Scanner;
public class yourSiteType_03 {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        System.out.println("Enter your site:");
       String website = mr.nextLine();
       
       if(website.endsWith(".in")){
         System.out.println("this is indian website");
       }else if(website.endsWith(".com")){
         System.out.println("this is comircial websit");
       }else if(website.endsWith(".org")){
         System.out.println("this is organization sit");
       }
        }
}
