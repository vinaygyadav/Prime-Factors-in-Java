import java.util.Scanner;

public class Main {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter given the required new number ::");
      number = sc.nextInt();
     
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i +" ");
            number = number/i;
         }
      }
      if(number > 2) {
         System.out.println(number);
      }
   }
}
