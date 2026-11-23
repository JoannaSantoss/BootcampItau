import java.util.Scanner;

public class Aula1 {
   private final String WELCOME_MESSAGE = "Olá, Digite seu nome:"; 
/*
*Declaração de constante, var global.
*/

    public static void main(String[] args) {
 /*
 *Name com Scanner.
 */
       Scanner scanner = new Scanner(System.in);
      //*var Scanner = new Scanner(System.in);
       System.out.println("Digite seu nome:");
       String name = scanner.next();
/*
*Idade com Scanner.
*/
       System.out.println("Digite sua idade:");
       int age = scanner.nextInt();

/*Saída dos dados recebidos pelo Scanner através de %s
As váriaveis que são utilizadas na saída através do %s 
devem ser declaradas depois.
*/

       System.out.printf("Olá %s, Sua idade é %s", name, age);
    }
} 