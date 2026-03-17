import java.util.Scanner;
public class Ex09 {
   public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

          System.out.println("Informe um dia da semana(em numeral): ");
            int dia = leia.nextInt();

            switch (dia) {
                case 1 :
                    System.out.println("O dia é Domingo");
                    break;
                case 2 :
                    System.out.println("O dia é Segunda-feira");
                    break;
                case 3 :
                    System.out.println("O dia é Terça-feira");
                    break;
                case 4 :
                    System.out.println(" O dia é Quarta-feira");
                    
                    break;
                case 5 :
                    System.out.println(" O dia é Quinta-feira");
                    
                    break;
                case 6 :
                    System.out.println(" O dia é Sexta-feira");
                    
                    break;
                case 7 :
                    System.out.println(" O dia é Sabado-feira");
                    
                    break;
                    default:
                        System.out.println("O numero informado não existe, digite numeros entre 1 a 7");
                        break;


            }
            leia.close();
    }
}
