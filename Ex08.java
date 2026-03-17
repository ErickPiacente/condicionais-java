import java.util.Scanner;
public class Ex08 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o seu peso: ");
    Double peso = leia.nextDouble();
    System.out.println("Informe a sua altura: ");
    Double altura = leia.nextDouble();
    Double imc = peso / (altura * altura);
    String resultado = (imc < 18.5)? "Você está abaixo do peso": (imc < 25) ? "Você está com o peso normal":(imc < 30) ? "Você está com sobrepeso":"Você está com obesidade" ;
    System.out.println(resultado);
    leia.close();
         }
}
