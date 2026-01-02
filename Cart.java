//cart-userinput
import java.util.Scanner;
public class Cart{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        String item;
        int quantity;
        double price;
        String currency="rupees";
       double total;
         System.out.print("what item would you like to buy ");
         item=scanner.nextLine();
          System.out.print("what is the price of each ");
           price=scanner.nextDouble();
            System.out.print("how many of it would you like ");
            quantity=scanner.nextInt();
            total=price*quantity;
             System.out.print("your total comes to "+total+currency);

        scanner.close();


    }
}