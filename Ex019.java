import java.util.Scanner;
public class Ex019 {
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe a sua velocidade: ");
    int velocidade = leia.nextInt();
    System.out.println("Informe o limite da via: ");
    int limite = leia.nextInt();
    String resultado = (velocidade <= limite) ? "Está sem multa":
    (velocidade <= limite + (limite*0.20)  ) ? "Multa leve":
    (velocidade <= limite + (limite*0.50)) ? "Multa media":
    "Multa grave";
    System.out.println(resultado);
    leia.close();
         }
}
