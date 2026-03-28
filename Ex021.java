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
int contador = 0;
int contadorReserva = 0;
int contadorComprado = 0;

          System.out.println("Sala 1-- Sala Cientifica");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");


        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[0][i].length; j++) {



                System.out.print("["+matriz[0][i][j]+"]" + "   ");


            }
            System.out.println();
            



        }
        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz[0][i].length; j++){
                if(matriz[0][i][j] == 'L'){
                    contador++;
                }

            }
        }
    System.out.print("Cadeiras livres: "+ contador);

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz[0][i].length; j++){
                if(matriz[0][i][j] == 'R'){
                    contadorReserva++;
                }

            }
        }
    System.out.print("\tCadeiras reservadas: "+ contadorReserva);

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz[0][i].length; j++){
                if(matriz[0][i][j] == 'C'){
                    contadorComprado++;
                }

            }
        }
    System.out.println("\tCadeiras compradas: "+ contadorComprado);

        System.out.println("MENU DE OPERAÇÔES!");
        System.out.println("1--Reservar cadeira");
        System.out.println("2--Comprar cadeira");
        System.out.println("3--Cancelar reserva");
        System.out.println("Informe se quer reservar ou comprar uma cadeira");
        int opcao2 = leia.nextInt();
        int valorIngresso = 20;
        switch(opcao2){
            case 1:
        System.out.println("Você escolheu reservar uma cadeira");        
        System.out.println("Informe a linha da cadeira(em maisculo)");
        char linha = leia.next().charAt(0);
        System.out.println("Informe a coluna da cadeira");
        int coluna = leia.nextInt();
        int linhaInt = linha - 'A';
        linhaInt = (linha - 'A');


        coluna = coluna - 1;
        if(linhaInt <= 12 && coluna <= 12 || linhaInt >= 1 && coluna >= 1){
        if(matriz[0][linhaInt][coluna] == 'L'){
        matriz[0][linhaInt][coluna] = 'R';
                  System.out.println("Sala 1-- Sala Cientifica");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");


        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[0][i].length; j++) {


         
                System.out.print("["+matriz[0][i][j]+"]" + "   ");


            }
            
            System.out.println();
            



        }
        System.out.println("O valor pago pela reserva é de "+ (valorIngresso - 10));
    }
}
    else{
        System.out.println("O lugar já está reservado/ocupado, por favor escolha outro");
    }
    break;
    case 2:
        System.out.println("Você escolheu comprar uma cadeira");
        System.out.println("Informe a linha da cadeira(em maisculo)");
        linha = leia.next().charAt(0);
        System.out.println("Informe a coluna da cadeira");
        coluna = leia.nextInt();
        linhaInt = linha - 'A';
        linhaInt = (linha - 'A');


        coluna = coluna - 1;
        if(linhaInt <= 12 && coluna <= 12 || linhaInt >= 1 && coluna >= 1){
        if(matriz[0][linhaInt][coluna] == 'L'){
        matriz[0][linhaInt][coluna] = 'C';
                  System.out.println("Sala 1-- Sala Cientifica");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");


        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[0][i].length; j++) {


            
                System.out.print("["+matriz[0][i][j]+"]" + "   ");


            }
            
            System.out.println();
            



        }
        System.out.println("O valor pago pela compra do lugar é de "+ (valorIngresso));
    }
}
    else{
        System.out.println("O lugar já está reservado/ocupado, por favor escolha outro");
    }




    break;
    case 3:
                System.out.println("Você escolheu cancelar sua reserva");        
        System.out.println("Informe a linha da cadeira(em maisculo)");
        linha = leia.next().charAt(0);
        System.out.println("Informe a coluna da cadeira");
        coluna = leia.nextInt();
        linhaInt = linha - 'A';
        linhaInt = (linha - 'A');


        coluna = coluna - 1;
        if(linhaInt <= 12 && coluna <= 12 || linhaInt >= 1 && coluna >= 1){
        if(matriz[0][linhaInt][coluna] == 'R'){
        matriz[0][linhaInt][coluna] = 'L';
                  System.out.println("Sala 1-- Sala Cientifica");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");


        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[0][i].length; j++) {


         
                System.out.print("["+matriz[0][i][j]+"]" + "   ");


            }
            
            System.out.println();
            



        }
        System.out.println("O valor de rembolso é: "+ (valorIngresso - 10));
    }
}
    else{
        System.out.println("O lugar foi comprado ou está livre, só é possivel reembolsar lugares reservados");
    }
        break;
        }


            
           System.out.println("Quer continuar o programa? digite 1 se quiser continuar;\nSe quiser sair digite qualquer numero: ");
        enquanto = leia.nextInt();
    }while(enquanto == 1);
    break;
    case 2:
    do{ 

          System.out.println("Sala 2-- Sala de TCC");
          System.out.println("  1      2      3      4      5      6      7      8      9     10     11     12");


        for (int i = 0; i < matriz[1].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[1][i].length; j++) {



                System.out.print("["+matriz[1][i][j]+"]" + "   ");


            }
            System.out.println();
            



        }


            
           System.out.println("Quer continuar o programa? digite 1 se quiser continuar;\nSe quiser sair digite qualquer numero: ");
        enquanto = leia.nextInt();
    }while(enquanto == 1);
    break;






    }

   



    

}   

}



