import java.util.Scanner;

public class Ex021{
   public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    System.out.println("Escreva o nome da sala que você quer criar: ");
    String sala = leia.nextLine();


          System.out.println("Sala "+sala);

                 int[][] matriz = new int[12][12];



        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]" + "   ");
            }
            System.out.println();

        }



    }

   



    

    

}



