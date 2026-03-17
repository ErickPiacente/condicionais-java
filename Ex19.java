import java.util.Scanner;
public class Ex19 {
    //Esse aqui eu tentei fazer mas eu não consegui achar uma solução, espero aprender depois
             public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Informe a sua velocidade: ");
    int velocidade = leia.nextInt();
    System.out.println("Informe o limite da via: ");
    int limite = leia.nextInt();
    String resultado = (velocidade <= limite) ? "Está sem multa": (velocidade % 200 == 0  ) ? "Multa leve": "Multa media";
    System.out.println(resultado);
    leia.close();
         }
}
