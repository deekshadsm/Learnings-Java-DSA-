import java.util.Scanner;
public class Weight{
public static void main(String [] args){
double weight;
double newWeight;
int choice;

Scanner scanner=new Scanner(System.in);
System.out.print("enter your choice option 1 lbs to kgs \n  option 2 kgs to lbs ");
choice=scanner.nextInt();
System.out.print("your choice is "+choice);

if(choice==1){
    System.out.print("enter the weight in lbs");
    weight=scanner.nextDouble();
    newWeight=weight*0.453592;
    System.out.print("the new weight in kgs is "+newWeight);


}
else if(choice==2){
     System.out.print("enter the weight in kgs");
    weight=scanner.nextDouble();
    newWeight=weight*2.20462;
    System.out.print("the new weight in kgs is "+newWeight);

  
}
scanner.close();
}
}