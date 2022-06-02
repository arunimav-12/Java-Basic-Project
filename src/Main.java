import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=(int)(Math.random()*100);
        int usernumber;
        do{
            System.out.println("Guess the number(1-100 )");
            usernumber=sc.nextInt();
            if(usernumber==number){
                System.out.println("Yayy! Correct");
                break;
            }
            else if(usernumber>number){
                System.out.println("Your number is too large");
            }
            else
                System.out.println("Your number is too small");
        }while(usernumber>=0);
        System.out.print("Coorect number was:");
        System.out.println(number);
    }
}