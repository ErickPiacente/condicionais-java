import java.util.Scanner;
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
System.out.println("1 - Sala Científica | Espetáculo: Viagem Pelo Universo");
System.out.println("2 - Sala Acadêmica | Espetáculo: Apresentação de projetos");
System.out.println("3 - Sala de Apresentações | Espetáculo: Show de Talentos");
System.out.println("4 - Sala Educacional | Espetáculo: História da Tecnologia");  //Usei IA para gerar os nomes e espetaculos da sala
System.out.println("5 - Sala Cultural | Espetáculo: Festival de Dança");
System.out.println("6 - Sala de Debates | Espetáculo: O Futuro do Brasil");
System.out.println("7 - Sala Mundial | Espetáculo: Ideias que Mudam o Mundo");
System.out.println("8 - Sala de Provas | Espetáculo: Resultado das provas");        
    System.out.println("---------------------------------------------");
    System.out.println("Escolha qual sala você quer entrar(Escolha pelo numero): ");
    int opcao = leia.nextInt();



int enquanto;

do{ 

int contador = 0;
int contadorReserva = 0;
int contadorComprado = 0;
Double totalCompra = 0.00;
Double totalReserva = 0.00;
Double valorIngresso = 20.00;
Double valorPotencial = 0.00;
    switch(opcao){
         case 1:
         System.out.println("Sala 1-- Sala Científica ");
         System.out.println("Espetaculo: Viagem Pelo Universo");
         break;
         case 2:
         System.out.println("Sala 2-- Sala Acadêmica");
         System.out.println("Espetáculo: Apresentação de projetos");
         break;
         case 3:
         System.out.println("Sala 3-- Sala de Apresentações");
         System.out.println("Espetáculo: Show de talentos");
         break;
         case 4:
         System.out.println("Sala 4-- Sala educacional");
         System.out.println("Espetáculo: História da Tecnologia");
         break;
         case 5:
         System.out.println("Sala 5-- Sala cultural");
         System.out.println("Espetáculo: Festival de Dança");
         break;
         case 6:
         System.out.println("Sala 6-- Sala de debates");
         System.out.println("Espetáculo: O futuro do Brasil");
         break;
         case 7:
         System.out.println("Sala 7-- Sala mundial");
         System.out.println("Espetáculo: Ideias que mudam o mundo");
         break;
         case 8:
         System.out.println("Sala 8-- Sala de provas");
         System.out.println("Espetáculo: Resultado das provas");
         break;
         default:
            System.out.println("A sala digitada não existe!");
         return;
         
               

    }

          System.out.println();
          System.out.println("    1     2     3     4     5     6     7     8     9    10    11    12");


        for (int i = 0; i < matriz[opcao - 1].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[opcao - 1][i].length; j++) {



                System.out.print("["+matriz[opcao - 1][i][j]+"]" + "   ");


            }
            System.out.println();
            



        }
        for(int i = 0; i < matriz[opcao - 1].length; i++){
            for(int j = 0; j < matriz[opcao - 1][i].length; j++){
                if(matriz[opcao - 1][i][j] == 'L'){
                    contador++;
                    valorPotencial = valorPotencial + valorIngresso;

                }

            }
        }
    System.out.print("Cadeiras livres: "+ contador);

        for(int i = 0; i < matriz[opcao - 1].length; i++){
            for(int j = 0; j < matriz[opcao - 1][i].length; j++){
                if(matriz[opcao - 1][i][j] == 'R'){
                    contadorReserva++;
                    totalReserva = totalReserva + valorIngresso;

                }

            }
        }
    System.out.print("\tCadeiras reservadas: "+ contadorReserva);
    

        for(int i = 0; i < matriz[opcao - 1].length; i++){
            for(int j = 0; j < matriz[opcao - 1][i].length; j++){
                if(matriz[opcao - 1][i][j] == 'C'){
                    contadorComprado++;
                    totalCompra = totalCompra + valorIngresso;
                    
                }

            }
        }
    System.out.print("\tCadeiras compradas: "+ contadorComprado);
    System.out.print("\tTotal arrecadado: "+ totalCompra);
    System.out.println("\tTotal de reservas pagas: "+ (totalReserva / 2));
    System.out.println("Total arrecadado: "+ valorPotencial);

        System.out.println("MENU DE OPERAÇÔES!");
        System.out.println("1--Reservar cadeira");
        System.out.println("2--Comprar cadeira");
        System.out.println("3--Cancelar reserva");
        System.out.println("4--Mudar de sala");
        System.out.println("Outro numero--Termina o programa");
        System.out.println("Informe se quer reservar ou comprar uma cadeira");
        int opcao2 = leia.nextInt();
        
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
        if(linhaInt <= 11 && coluna <= 11 && linhaInt >= 0 && coluna >= 0){
        if(matriz[opcao - 1][linhaInt][coluna] == 'L'){
        matriz[opcao - 1][linhaInt][coluna] = 'R';

         System.out.println("    1     2     3     4     5     6     7     8     9    10    11    12");


        for (int i = 0; i < matriz[opcao - 1].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[opcao - 1][i].length; j++) {


         
                System.out.print("["+matriz[opcao - 1][i][j]+"]" + "   ");


            }
            
            System.out.println();
            



        }
        System.out.println("O valor pago pela reserva é de "+ (valorIngresso - 10));
    }
    else{
        System.out.println("O lugar já está reservado/ocupado, por favor escolha outro");
    }
}
else{
        System.out.println("O lugar digitado não existe, por favor tente outro");
  
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


        if(linhaInt <= 11 && coluna <= 11 && linhaInt >= 0 && coluna >= 0){
        if(matriz[opcao - 1][linhaInt][coluna] == 'L' || matriz[opcao - 1][linhaInt][coluna] == 'R'){
        matriz[opcao - 1][linhaInt][coluna] = 'C';

          System.out.println("    1     2     3     4     5     6     7     8     9    10    11    12");


        for (int i = 0; i < matriz[opcao - 1].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[opcao - 1][i].length; j++) {


            
                System.out.print("["+matriz[opcao - 1][i][j]+"]" + "   ");


            }
            
            System.out.println();
            



        }
        System.out.println("O valor pago pela compra do lugar é de "+ (valorIngresso));
    }
        else{
        System.out.println("O lugar já está ocupado, por favor escolha outro");
    }
}
else{
        System.out.println("O lugar digitado não existe, por favor tente outro");
  
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
        if(linhaInt <= 11 && coluna <= 11 && linhaInt >= 0 && coluna >=0){
        if(matriz[opcao - 1][linhaInt][coluna] == 'R'){
        matriz[opcao - 1][linhaInt][coluna] = 'L';

          System.out.println("    1     2     3     4     5     6     7     8     9    10    11    12");


        for (int i = 0; i < matriz[opcao - 1].length; i++) {
            System.out.print((char) ('A' + i)+"  ");
            for (int j = 0; j < matriz[opcao - 1][i].length; j++) {


         
                System.out.print("["+matriz[opcao - 1][i][j]+"]" + "   ");


            }
            
            System.out.println();
            



        }
        System.out.println("O valor de rembolso é: "+ (valorIngresso - 10));
    }
        else{
        System.out.println("O lugar foi comprado ou está livre, só é possivel reembolsar lugares reservados");
    }
}
else{
        System.out.println("O lugar digitado não existe, por favor tente outro");
  
}

        break;
        case 4:
            System.out.println("Escolha outra sala");
            opcao = leia.nextInt();
            break;
            default:
                System.out.println("A opção é invalida, programa encerrado");
        }


            
           System.out.println("Quer continuar o programa? digite 1 se quiser continuar;\nSe quiser sair digite qualquer numero: ");
        enquanto = leia.nextInt();
    }while(enquanto == 1);








    }

   



    

}   





