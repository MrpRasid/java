import java.util.Scanner;
public class taxOfemploy_02 {
    
    public static void main(String[] args) {
        Scanner mr= new Scanner(System.in);
        System.out.println("enter your earning:");
         float amount = mr.nextInt();
         float tax =0.0f;
         if (amount<2.5f) {
           tax = tax +0.0f;
           
         }

if (amount>2.5 && amount<=5) {
       tax = tax +0.05f * (amount-2.5f);
  
}else if(amount>5.0f && amount<=10.0f){
   tax = tax+ 0.05f * (amount-2.5f);
   tax = tax+ 0.2f * (amount -5.0f);
}else if(amount >10.0f){
  tax = tax+ 0.05f * (amount-2.5f);
  tax = tax+ 0.2f * (amount -5.0f);
  tax = tax + 0.3f * (amount-10.0f);
}
System.out.println("the total tax paid by employ is: " +tax);
     } 
}
