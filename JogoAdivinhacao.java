import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

   public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

       int numeroGerado = new Random().nextInt(100);
       int tentativas = 0;
       int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite o numero entre 0 e 100:");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabens voce acertou na " + tentativas + "tentativa!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Numero escolhido é menor!");
            } else {
                System.out.println("Numero escolhido é maior!");
            }
        }

            if (tentativas == 5 && numeroDigitado != numeroGerado){
                System.out.println("Voce nao conseguiu acertar nas 5 tentativas. O numero era: " + numeroGerado);
            }







    }

}
