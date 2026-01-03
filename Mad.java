//madlibs-userinput
import java.util.Scanner;
public class Mad {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.print("enter a adjective(despriction)");
        adjective1=scanner.nextLine();
        System.out.print("enter a noun (animal)");
        noun1=scanner.nextLine();
        System.out.print("enter a adjective(despriction)");
        adjective2=scanner.nextLine();
        System.out.print("enter a verb with -ing");
        verb1=scanner.nextLine();
        System.out.print("enter a adjective(despriction)");
        adjective3=scanner.nextLine();


         

        System.out.println("today i went to a "+adjective1 +"zoo.");
        System.out.println("inn a exhibit, i saw a "+noun1+".");
        System.out.println(noun1 +"was "+adjective2 +"and"+verb1+"!");
        System.out.println("i was "+adjective3 +"!");

     scanner.close();
    }
}