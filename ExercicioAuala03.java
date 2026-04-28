import java.util.Scanner;
    public class ExercicioAuala03 {
        public static void main(String[] args){

            //CRIAR UM PROGRAMA PARA VERIFICAR SE PODE VOTAR

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();

            while (idade > 0) {

                if (idade >= 18 && idade <= 70) {
                    System.out.println("Voto obrigatorio!Pode votar!");
                } else if (idade >= 16 && idade <= 18 || idade >= 70) {
                    System.out.println("Voto facultativo!Pode votar!");
                } else {
                    System.out.println("Voce ainda não atingiu idade minima para votar!");
                }
                    System.out.println("Digite sua idade: ");
                    idade = entrada.nextInt();
            }
                System.out.println("Voto encerrado!");
                entrada.close();

        }

    }
