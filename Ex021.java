import java.util.Scanner;
public class Ex021{
   public static void main(String[] args){ 


            Scanner leia = new Scanner(System.in);
            System.out.println("-----MENU PRINCIPAL-----");
            System.out.println("1-- TEATRO");
            System.out.println("2-- MENU DE EXERCICIOS");
            System.out.println("Outro numero -- Sair do programa");
            System.out.println("Escolha entre essas duas opções: ");
            int menuPrincipal = leia.nextInt();
            switch (menuPrincipal) {
                case 1:
         char[][][] matriz = new char[8][12][12];
      for(int m = 0; m < matriz.length; m++){

        for (int i = 0; i < matriz[m].length; i++) {

            for (int j = 0; j < matriz[m][i].length; j++) {
                matriz[m][i][j] = 'L';
            }}}

                    

    
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
        String verificação = (matriz[opcao - 1][linhaInt][coluna]== 'L')? "Lugar disponivel": "Lugar ocupado/reservado";
        System.out.println(verificação);
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
        String verificação = (matriz[opcao - 1][linhaInt][coluna] == 'L' || matriz[opcao - 1][linhaInt][coluna] == 'R')? "Lugar disponivel": "Lugar ocupado";
        System.out.println(verificação);
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
        String verificação = (matriz[opcao - 1][linhaInt][coluna] == 'R')? "Lugar reservado": "Lugar ocupado/livre";
        System.out.println(verificação);
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





break;    
case 2: 
    Ex22 obj = new Ex22();
    obj.executar();

    break;
    default:
        System.out.println("Programa finalizado");
        break;
            }

    }

   



    

}
class Ex01{
    public void executar(Scanner leia){
           
    System.out.println("Informe o numero que deseja verificar se é PAR ou ÍMPAR: ");
    int numero = leia.nextInt();
    numero = numero % 2; 
    String resultado = (numero == 0) ? "O numero é PAR": "O numero é ÍMPAR";
    System.out.println(resultado);
    
    }
}
class Ex02{
        public void executar(Scanner leia){
    System.out.println("Informe o numero: ");
    int numero = leia.nextInt();
    System.out.println("Informe o numero: ");
    int numero2 = leia.nextInt(); 
    String resultado = (numero > numero2) ? numero+" É o maior numero": (numero2 > numero) ? numero2+" É o maior numero": "Os numeros são iguais";
    System.out.println(resultado);
        }
}
class Ex03{
    public void executar(Scanner leia){
    
    System.out.println("Informe a sua nota: ");
    int numero = leia.nextInt();
    String resultado = (numero >= 7) ? "Aprovado": (numero >= 5) ? "Está de recuperação": "Reprovado";
    System.out.println(resultado);
    }
}
class Ex04{
    public void executar(Scanner leia){
        
    System.out.println("Informe a temperatura: ");
    int temperatura = leia.nextInt();
    String resultado = (temperatura < 15) ? "Frio": (temperatura >= 15 && temperatura <= 25) ? "Agradavel": "Quente";
    System.out.println("Hoje está "+resultado);
    }
}
class Ex05{
    public void executar(Scanner leia){
            System.out.println("1---SOMA");
        System.out.println("2---SUBTRAÇÃO");
        System.out.println("3---MULTIPLICAÇÃO");
        System.out.println("4---DIVISÃO");
          System.out.println("Escolha uma opção de 1 a 4: ");
            int opcao = leia.nextInt();
            System.out.println("Informe o numero: ");
            int numero = leia.nextInt();
            switch (opcao) {
                case 1 :
                    numero = numero + numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    break;
                case 2 :
                    numero = numero - numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    break;
                case 3 :
                    numero = numero * numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    break;
                case 4 :
                    if(numero == 0){
                        System.out.println("Não é possivel dividir por 0");
                    }
                    else{
                    numero = numero / numero;
                    System.out.println("O resultado do seu calculo é "+numero);
                    }
                    break;
                    default:
                        System.out.println("O numero informado não é uma opção");
                        break;


            }
    }
}

class Ex06{
    public void executar(Scanner leia){
      System.out.println("Informe o seu ano: ");
    int ano = leia.nextInt();
    String resultado = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? "Seu ano é bissexto": "Seu ano não é bissexto";
    System.out.println(resultado);
    }
}

class Ex07{
   public void executar(Scanner leia){
        System.out.println("Informe o primeiro lado: ");
    int lado1 = leia.nextInt();
     System.out.println("Informe o segundo lado: ");
    int lado2 = leia.nextInt();
     System.out.println("Informe o terceiro lado: ");
    int lado3 = leia.nextInt();
    String resultado = (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) ? "Seu triangulo é equilatero":
     (lado1 != lado2 && lado1 == lado3) || (lado2 != lado3 && lado2 == lado1) || (lado1 != lado3 && lado3 == lado2) ? "Seu triangulo é isosceles":
      "Seu triangulo é escaleno";
    System.out.println(resultado);
    }
 
}
class Ex08{
    public void executar(Scanner leia){
      System.out.println("Informe o seu peso: ");
    Double peso = leia.nextDouble();
    System.out.println("Informe a sua altura: ");
    Double altura = leia.nextDouble();
    Double imc = peso / (altura * altura);
    String resultado = (imc < 18.5)? "Você está abaixo do peso": (imc < 25) ? "Você está com o peso normal":(imc < 30) ? "Você está com sobrepeso":"Você está com obesidade" ;
    System.out.println(resultado);
    }
}

class Ex09{
    public void executar(Scanner leia){
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
    }
}

class Ex010{
    public void executar(Scanner leia){
        System.out.println("Informe um numero: ");
    int numero = leia.nextInt();

    String resultado = (numero > 0) ? "Positivo": (numero < 5) ? "Negativo": "Nulo";
    System.out.println("Seu numero é "+resultado);
    }
}

class Ex011{
    public void executar(Scanner leia){
     System.out.println("Informe a sua idade: ");
    int idade = leia.nextInt();
    String resultado = (idade <= 12) ? "Você paga 10,00$": (idade > 12 && idade < 60) ? "Você paga inteira que é 20,00$": "Você paga meia que é 10,00$";
    System.out.println(resultado);
    }
}

class Ex012{
    public void executar(Scanner leia){
        System.out.println("Informe a sua nota: ");
    int numero = leia.nextInt();
    String resultado = (numero <= 10 && numero >= 9) ? "Sua nota é A": (numero <= 8 && numero >= 7) ? "Sua nota é B":(numero <= 6 && numero >= 5) ? "Sua nota é C":(numero <= 4 && numero >= 0)? "Sua nota é D": "Sua nota é invalida";
    System.out.println(resultado);
    }
}

class Ex013{
    public void executar(Scanner leia){
              System.out.println("Digite o numero do mês: ");
            int mes = leia.nextInt();

            switch (mes) {
                case 1, 2, 3 :
                    System.out.println("A estação é verão");
                    break;

                case 4, 5, 6 :
                    System.out.println("A estação é outono");
                    
                    break;
                case 7,8,9 :
                    System.out.println("A estação é inverno");
                    
                    break;
                case 10, 11, 13 :
                    System.out.println("A estação é primavera(a melhor)");
                    
                    break;
                    default:
                        System.out.println("O numero do mês informado é invalido, digite numeros netre 1 e 12");
                        break;
                        
            }
    }
}

class Ex014{
    public void executar(Scanner leia){
        System.out.println("Informe o primeiro numero: ");
    int numero1 = leia.nextInt();
     System.out.println("Informe o segundo numero: ");
    int numero2 = leia.nextInt();
     System.out.println("Informe o terceiro numero: ");
    int numero3 = leia.nextInt();
    String resultado = (numero1 >= numero2 && numero1 > numero3) ? "O numero 1 é o maior":
     (numero2 > numero1 && numero2 > numero3) ? "O numero 2 é o maior":
      (numero3 > numero1 && numero3 > numero2)?"O numero 3 é o maior": "Os numeros são todos iguais ";
    System.out.println(resultado);
    }
}

class Ex015{
    public void executar(Scanner leia){
        String usuario = "usuario";
    int senha = 1234;
    System.out.println("Digite seu usuário: ");
    String usuarioLogin = leia.next();
    System.out.println("Digite sua senha: ");
    int senhaLogin = leia.nextInt();
    String resultado = (usuarioLogin.equals(usuario) && senhaLogin == senha)? "Acesso aprovado":"Acesso negado";
    System.out.println(resultado);
    }
}

class Ex016{
    public void executar(Scanner leia){
        System.out.println("Informe o seu numero: ");
    int numero = leia.nextInt();
    String resultado = (numero % 3 == 0 && numero % 5 == 0) ? "Seu numero é multiplo de 3 e de 5": 
    (numero % 3 == 0 && numero % 5 !=0) ? "Seu numero é multilpo somente do 3":
    (numero % 5 == 0 && numero % 3 != 0)? "Seu numero é multiplo apenas de 5":
    "Seu numero não é multiplo de nenhum dos dois";
    System.out.println(resultado);
    }
}

class Ex017{
    public void executar(Scanner leia){
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
    }
}

class Ex018{
    public void executar(Scanner leia){
              System.out.println("Informe um numero: ");
            int numero = leia.nextInt();

            switch (numero) {
                case 1 :
                    System.out.println("O numero 1 em romano é I");
                    break;
                case 2 :
                    System.out.println("O numero 2 em romano é II");
                    break;
                case 3 :
                    System.out.println("O numero 3 em romano é III");
                    break;
                case 4 :
                    System.out.println(" O numero 4 em romano é IV");
                    
                    break;
                case 5 :
                    System.out.println(" O numero 5 em romano é V");
                    
                    break;
                case 6 :
                    System.out.println(" O numero 6 em romano é VI");
                    
                    break;
                case 7 :
                    System.out.println(" O numero 7 em romano é VII");
                    
                    break;
                case 8 :
                    System.out.println(" O numero 8 em romano é VIII");
                    
                    break;
                case 9 :
                    System.out.println(" O numero 9 em romano é IX");
                    
                    break;
                case 10 :
                    System.out.println(" O numero 10 em romano é X");
                    
                    break;    

                    default:
                        System.out.println("O seu numero não esta entre 1 e 10");
                        break;


            }
    }
}

class Ex019{
    public void executar(Scanner leia){
       System.out.println("Informe a sua velocidade: ");
    int velocidade = leia.nextInt();
    System.out.println("Informe o limite da via: ");
    int limite = leia.nextInt();
    String resultado = (velocidade <= limite) ? "Está sem multa":
    (velocidade <= limite + (limite*0.20)  ) ? "Multa leve":
    (velocidade <= limite + (limite*0.50)) ? "Multa media":
    "Multa grave";
    System.out.println(resultado);
    }
}

class Ex020{
    public void executar(Scanner leia){
            System.out.println("1--Pedra");
        System.out.println("2--Papel ");
        System.out.println("3--Tesoura ");
            System.out.println("Informe sua escolha jogador 1: ");
    int escolha = leia.nextInt();
            System.out.println("Informe sua escolha jogador 2: ");
    int escolha2 = leia.nextInt();
    String resultado = (escolha == 1 && escolha2 == 2)? "O jogador 2 ganhou":
     (escolha == 2 && escolha2 == 1)? "O jogador 1 ganhou":
     (escolha == 1 && escolha2 == 3)? "O jogador 1 ganhou":
     (escolha == 3 && escolha2 == 1)? "O jogador 2 ganhou":
     (escolha == 2 && escolha2 == 3)? "O jogador 2 ganhou":
     (escolha == 3 && escolha2 == 2)?"O jogador 1 ganhou":"Valor invalido";


     System.out.println(resultado);
    }
}

class Ex22{
    Scanner leia = new Scanner(System.in);
    String[] titulos = new String[20];
    String[] enunciados = new String[20];
    
    public void executar(){
        System.out.println("Menu inicializado");
titulos[0] = "1-- Par ou Ímpar";
enunciados[0] = "Leia um número inteiro e informe se ele é par ou ímpar.";
titulos[1] = "2-- Maior de Dois Números";
enunciados[1] = "Leia dois números inteiros e exiba qual é o maior.";
titulos[2] = "3-- Aprovação Escolar";
enunciados[2] = "Leia a média de um aluno e informe se está aprovado, recuperação ou reprovado.";
titulos[3] = "4-- Classificação de Temperatura";
enunciados[3] = "Leia a temperatura em Celsius e classifique em frio, agradável ou quente.";
titulos[4] = "5-- Calculadora Simples";
enunciados[4] = "Leia dois números e um operador e faça a operação usando switch.";
titulos[5] = "6-- Ano Bissexto";
enunciados[5] = "Leia um ano e informe se ele é bissexto.";
titulos[6] = "7-- Triângulo Válido";
enunciados[6] = "Leia três lados e verifique se formam um triângulo.";
titulos[7] = "8-- IMC";
enunciados[7] = "Leia peso e altura, calcule IMC e classifique.";
titulos[8] = "9-- Dia da Semana";
enunciados[8] = "Leia um número de 1 a 7 e mostre o dia correspondente."; //Usei IA para resumir os enunciados e fazer essa parte de titulos
titulos[9] = "10-- Positivo, Negativo ou Zero";
enunciados[9] = "Leia um número e informe sua classificação.";
titulos[10] = "11-- Ingresso de Cinema";
enunciados[10] = "Leia idade e informe o valor do ingresso.";
titulos[11] = "12-- Nota por Conceito";
enunciados[11] = "Leia nota e exiba conceito A, B, C ou D.";
titulos[12] = "13-- Estação do Ano";
enunciados[12] = "Leia mês e informe a estação do ano.";
titulos[13] = "14-- Maior de Três Números";
enunciados[13] = "Leia três números e exiba o maior.";
titulos[14] = "15-- Verificador de Login";
enunciados[14] = "Leia usuário e senha e valide acesso.";
titulos[15] = "16-- Múltiplo de 3 e 5";
enunciados[15] = "Leia número e verifique múltiplos.";
titulos[16] = "17-- Desconto em Compra";
enunciados[16] = "Leia valor da compra e aplique desconto.";
titulos[17] = "18-- Número Romano";
enunciados[17] = "Leia número de 1 a 10 e mostre em romano.";
titulos[18] = "19-- Velocidade e Multa";
enunciados[18] = "Leia velocidade e limite da via.";
titulos[19] = "20-- Pedra, Papel e Tesoura";
enunciados[19] = "Leia jogadas e determine vencedor.";
    int inicio = 0;
    int itensPorPagina = 7;
    int enquanto = 0; 
    do{
     for(int i = inicio; i < inicio+itensPorPagina && i < titulos.length; i++){
         System.out.println(titulos[i]);

        }
        System.out.println("=========================================");
        System.out.println("A-- Página anterior");
        System.out.println("P-- Proxima página");
        System.out.println("3-- Acessar exercicios");
        System.out.println("Escolha A, P ou 3: ");
        System.out.println("=========================================");
        String escolha = leia.next();
        switch (escolha) {
            case "A":
                if(inicio >= 7){
                inicio = inicio - 7;
                }
                break;
            case "P":
                if(inicio < 14){
                inicio = inicio + 7;
                }
                break;
            case "3":
                System.out.println("Escolha seu exercicio: ");
                int opcao = leia.nextInt();
                int posicao = inicio + opcao - 1;
                if(opcao >= 1 && opcao <= itensPorPagina && posicao < titulos.length){
                    
                switch (posicao) {
                    case 0:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex01 obj1 = new Ex01();
                           obj1.executar(leia);
                        
                        break;
                        case 1:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex02 obj2 = new Ex02();
                           obj2.executar(leia);
                        
                        break;
                        case 2:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex03 obj3 = new Ex03();
                           obj3.executar(leia);
                        
                        break;
                        case 3:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex04 obj4 = new Ex04();
                           obj4.executar(leia);
                        
                        break;
                        case 4:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex05 obj5 = new Ex05();
                           obj5.executar(leia);
                        
                        break;
                        case 5:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex06 obj6 = new Ex06();
                           obj6.executar(leia);
                        
                        break;
                        case 6:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex07 obj7 = new Ex07();
                           obj7.executar(leia);
                        
                        break;
                        case 7:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex08 obj8 = new Ex08();
                           obj8.executar(leia);
                        
                        break;
                        case 8:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex09 obj9 = new Ex09();
                           obj9.executar(leia);
                        
                        break;
                        case 9:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex010 obj10 = new Ex010();
                           obj10.executar(leia);
                        
                        break;
                        case 10:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex011 obj11 = new Ex011();
                           obj11.executar(leia);
                        
                        break;
                        case 11:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex012 obj12 = new Ex012();
                           obj12.executar(leia);
                        
                        break;
                        case 12:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex013 obj13 = new Ex013();
                           obj13.executar(leia);
                        
                        break;
                        case 13:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex014 obj14 = new Ex014();
                           obj14.executar(leia);
                        
                        break;
                        case 14:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex015 obj15 = new Ex015();
                           obj15.executar(leia);
                        
                        break;
                        case 15:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex016 obj16 = new Ex016();
                           obj16.executar(leia);
                        
                        break;
                        case 16:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex017 obj17 = new Ex017();
                           obj17.executar(leia);
                        
                        break;
                        case 17:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex018 obj18 = new Ex018();
                           obj18.executar(leia);
                        
                        break;
                        case 18:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex019 obj19 = new Ex019();
                           obj19.executar(leia);
                        
                        break;
                        case 19:
                        System.out.println(titulos[posicao]);
                        System.out.println(enunciados[posicao]);

                       Ex020 obj20 = new Ex020();
                           obj20.executar(leia);
                        
                        break;
                
                    default:
                        System.out.println("Exercicio invalido");
                        break;
                }
            }
            else{System.out.println("Exercicio digitado não está nessa pagina");}
                break;
            default:
                System.out.println("Letra digitada não é valida");
                return;
        }

     System.out.println("Se quiser continuar o programa digite 1: ");
     enquanto = leia.nextInt();
    }while(enquanto == 1);
    




    leia.close();
    }
    

}






