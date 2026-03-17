import java.util.Scanner;
public class Ex17 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe o valor do produto: ");
    Double valor = leia.nextDouble();
    if(valor > 500){
       valor = valor - (valor * 0.20);
       System.out.println("O seu produto com desconto de 20% ficou "+valor+"$");
    }
    else if (valor >= 200 && valor <= 500){
               valor = valor - (valor * 0.10);
       System.out.println("O seu produto com desconto de 10% ficou "+valor+"$");
    }
    else {
        System.out.println("Seu produto não tem desconto, ficou "+valor+"$");
    }
 
    leia.close();
         }
}
