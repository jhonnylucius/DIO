import java.util.Scanner;

public class CalculadoraImc 
{
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        int a;
        int b;
        int return;

        System.out.print("Enter first integer: ");
            a = inputScanner.nextInt();

        System.out.print("Enter second integer: "); 
            b = inputScanner.nextInt();

        return = (a / (b * 2));
    
     if (return < 18.5)  { 
        System.out.println("Não ha obesidade");}
    }

}
