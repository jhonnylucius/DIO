import java.util.Scanner;
public class Imc {
private static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in); 
// vamos solicitar o peso e a altura da pessoa
    System.out.print("Informe seu peso: ");
        double peso = Double.parseDouble(entrada.nextLine());
    System.out.print("Informe sua altura: ");
        double altura = Double.parseDouble(entrada.nextLine()); 
// vamos calcular o IMC 
    double imc = peso / (altura * altura);
        System.out.println(String.format("Seu IMC é %.2f",  imc));
// vamos mostrar a classificação
if(imc < 16){
    System.out.println("Sua classificação é Magreza grave"); }
else if((imc >= 16) && (imc < 17)){
    System.out.println("Sua classificação é Magreza moderada"); }
else if((imc >= 17) && (imc < 18.5)){
    System.out.println("Sua classificação é Magreza leve"); }
else if((imc >= 18.5) && (imc < 25)){
    System.out.println("Sua classificação é Saudável"); }
else if((imc >= 25) && (imc < 30)){
    System.out.println("Sua classificação é Sobrepeso"); }
else if((imc >= 30) && (imc < 35)){
    System.out.println("Sua classificação é Obesidade Grau I"); }
else if((imc >= 35) && (imc < 40)){
    System.out.println("Sua classificação é Obesidade Grau II"); }
else{System.out.println("Sua classificação é Obesidade Grau III (mórbida)"); }
    System.out.println("\n");
    }

}
