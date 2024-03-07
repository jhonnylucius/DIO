import java.util.Scanner;

public class CalculadoraImc 
{
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        int number1;
        int number2;
        int resultado;

        System.out.print("Enter first integer: ");
            number1 = inputScanner.nextInt();

        System.out.print("Enter second integer: "); 
            number2 = input.nextInt();

        resultado = number1 / (number2 * 2);
    
     if (resultado < 18.5)  { 
        System.out.println("Não ha obesidade");}
    }

        

}
