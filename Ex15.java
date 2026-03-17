import java.util.Scanner;
public class Ex15 {
     public static void main(String[] args){
    Scanner leia = new Scanner(System.in);
    String usuario = "usuario";
    int senha = 1234;
    System.out.println("Digite seu usuário: ");
    String usuarioLogin = leia.next();
    System.out.println("Digite sua senha: ");
    int senhaLogin = leia.nextInt();
    String resultado = (usuarioLogin == usuario && senhaLogin == senha)? "Acesso aprovado":"Acesso negado";
    System.out.println(resultado);
    leia.close();
    // Professor, eu tentei resolver o problema desse exercicio, mas não consigo achar o erro então esse aqui estarei mandando errado mesmo 
 }   
}
