import java.util.Scanner;

public class Compound{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        double principal;
        double rate;
        int years;
        int timesComponded;
        double amount;

        System.out.print("enter the principal amount");
        principal=scanner.nextDouble();
        System.out.print("enter the interest rate in %");
        rate=scanner.nextDouble()/100;
        System.out.print("enter the  # number of times compounded per year ");
        timesComponded=scanner.nextInt();
        System.out.print("enter the # of years ");
        years=scanner.nextInt();
        amount=principal*Math.pow(1+rate/timesComponded,timesComponded*years);
        System.out.print(" the amount after"+years+"is" +amount+"rupees");
         
           scanner.close();

    }
    }
