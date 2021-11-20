import java.util.Scanner;


public class Raf_all {
public static void main(String[] args) {
Scanner mr =new Scanner(System.in);

float [] marks ={54.6f, 85.63f, 78.23f, 78.23f, 96.56f,};
float sum =0;
float num = 85.63f;
boolean isInArray = false;
for(float element : marks){
  if(num==element){
    isInArray = true;
    break;
  }
}
if(isInArray){
  System.out.println("this number is present in the array");
}else{
  System.out.println("this number is not present in the array");
}
  
}

}
  