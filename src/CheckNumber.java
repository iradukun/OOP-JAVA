import java.util.Scanner;
public class CheckNumber {
    static Scanner inputScanner= new Scanner(System.in);
    static char choice;
    public static void main(String[] checknum) {
       do{
        System.out.println("Enter the number to be checked! :");
        double num= inputScanner.nextDouble();
        if(num<0){
            System.out.print("The entered number is negative!");
        }else if(num >0){
          System.out.print("The number is Positive");
        }else{
            System.out.print("The number is Zero(both)");
        }
        System.out.println("Do you want to check another ? (y/n) :");
        choice= inputScanner.next().charAt(0);

       }while(choice=='y' || choice== 'Y'); 

    }
    
}
