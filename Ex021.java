import java.util.Scanner;
import java.util.Arrays;
public class Ex021{
   public static void main(String[] args){ 
         char[][][] matriz = new char[8][12][12];
      for(int m = 0; m < matriz.length; m++){

        for (int i = 0; i < matriz[m].length; i++) {

            for (int j = 0; j < matriz[m][i].length; j++) {
                matriz[m][i][j] = 'L';
            }}}
    Scanner leia = new Scanner(System.in);
        System.out.println("----------------MENU DE SALAS----------------");
    System.out.println("Sala 1-- Sala Cientifica");
    System.out.println("Sala 2-- Sala de TCC");
    System.out.println("Sala 3-- Sala de apresentações");
    System.out.println("Sala 4-- Sala de monitoria educacional");
    System.out.println("Sala 5-- Sala facultativa");
    System.out.println("Sala 6-- Sala de debate politico");
    System.out.println("Sala 7-- Sala Devisate");
    System.out.println("Sala 8-- Sala de provas");
    System.out.println("---------------------------------------------");
    System.out.println("Escolha qual sala você quer entrar(Escolha pelo numero): ");
    int opcao = leia.nextInt();

    switch (opcao) {
      case 1:
int enquanto;

do{ 

          System.out.println("Sala 1-- Sala Cientifica");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");


        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[0][i].length; j++) {



                System.out.print("["+matriz[0][i][j]+"]" + "   ");


            }
            System.out.println();
            



        }
        System.out.println("Informe a linha da cadeira");
        char linha = leia.next().charAt(0);
        System.out.println("Informe a coluna da cadeira");
        int coluna = leia.nextInt();
        linha = (char)(linha - 'A');
        coluna = coluna - 1;

            
           System.out.println("Quer continuar o programa? digite 1 se quiser continuar;\nSe quiser sair digite qualquer numero: ");
        enquanto = leia.nextInt();
    }while(enquanto == 1);
    break;






    }

   



    

}   

}



