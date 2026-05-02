import java.util.InputMismatchException;
import java.util.Scanner;

public class UrnaEletronica {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        //dados candidatos Vereador
        Candidato candidato1 = new Candidato("Luiz Fernado", "Partido Aurea - PA", 18, Cargo.VEREADOR);

        Candidato candidato2 = new Candidato("Simba Charles", "Partido do Ferro - PDF", 19, Cargo.VEREADOR);

        Candidato candidato3 = new Candidato("Cristovam Lombardi","Partido Celeste - PC", 20, Cargo.VEREADOR);

        //dados prefeitos
        Candidato candidato4 = new Candidato("Silvio Silva","Partido Rubi - PR", 29, Cargo.PREFEITO);

        Candidato candidato5 = new Candidato("Abravanel Coimbra","Partido Clandestino do sul - PCDS", 99, Cargo.PREFEITO);

        Candidato candidato6 = new Candidato("Pele Maradon","Partido dos Craques - PDC",10, Cargo.PREFEITO);


        int qtdBrancos = 0;
        int qtdNulos = 0;

        System.out.println("Bem Vindo a Votacao 2026!");
        System.out.println("Os Candidatos a Vereador são: ");
        System.out.println(candidato1.getNumeroPartido() + "-" + candidato1.getNome());
        System.out.println(candidato2.getNumeroPartido() + "-" + candidato2.getNome());
        System.out.println(candidato3.getNumeroPartido() + "-" + candidato3.getNome());
        System.out.println();
        System.out.println("Os Candidatos a Prefeito são: ");
        System.out.println(candidato4.getNumeroPartido() + "-" + candidato4.getNome());
        System.out.println(candidato5.getNumeroPartido() + "-" + candidato5.getNome());
        System.out.println(candidato6.getNumeroPartido() + "-" + candidato6.getNome());
        System.out.println();

        int qtdBranco = 0;
        System.out.println("Para votar em BRANCO digite: 0");

        int qtdNulo = 0;
        System.out.println("Para votar NULO digite: 1");
        System.out.println();

        boolean continuar = true;
        while (continuar) {


            System.out.println("Digite o seu nome:");
            String nome = entrada.nextLine();
            Eleitor eleitor = new Eleitor(nome);

            if (nome.equals("-1"))
                break;

            System.out.println("Digite seu voto para Vereador:");


            int votoVereador = 0;

            try {
                votoVereador = entrada.nextInt();
                if (votoVereador == -1) {
                    continuar = false;
                }

                switch (votoVereador) {
                    case 18:
                        candidato1.votosRecebidos();
                        break;
                    case 19:
                        candidato2.votosRecebidos();
                        break;
                    case 20:
                        candidato3.votosRecebidos();
                    default:
                        qtdNulo++;
                        break;
                }

                System.out.println("Voto Verador computado!");

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros!");
                entrada.nextLine();
                continue;
            } finally {
                if (votoVereador == -1 ) {
                    System.out.println("Eleição Encerrada!Veja apuração.");
                }
            }

            System.out.println("Digite seu voto para Prefeito:");

            int votoPrefeito = 0;

            try {
                votoPrefeito = entrada.nextInt();

                switch (votoPrefeito) {

                    case 29:
                        candidato4.votosRecebidos();
                        break;
                    case 99:
                        candidato5.votosRecebidos();
                        break;
                    case 10:
                        candidato6.votosRecebidos();
                        break;
                    case 0:
                        qtdBranco++;
                        break;
                    case -1:
                        System.out.println("Eleição finalizada.");
                        continuar = false;
                        break;
                    default:
                        qtdNulo++;
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada Invallida!");
                System.out.println("Digite novo valor:");
                entrada.nextLine();
            } finally {
                if (votoVereador == -1 ) {
                    System.out.println("Eleição Encerrada!Veja apuração.");
                }
                entrada.nextLine();
            }

        }

            System.out.println();
            System.out.println("Aparução em tempo real para Vereador:");
            System.out.println("Votos " + candidato1.getNome() + ":" + candidato1.getNumeroVotos());
            System.out.println("Votos " + candidato2.getNome() + ":" + candidato2.getNumeroVotos());
            System.out.println("Votos " + candidato3.getNome() + ":" + candidato3.getNumeroVotos());
            System.out.println();
            System.out.println("Aparução em tempo real para Prefeito:");
            System.out.println("Votos " + candidato4.getNome() + ":" + candidato4.getNumeroVotos());
            System.out.println("Votos " + candidato5.getNome() + ":" + candidato5.getNumeroVotos());
            System.out.println("Votos " + candidato6.getNome() + ":" + candidato6.getNumeroVotos());
            System.out.println();
            System.out.println("Votos Brancos:" + qtdBranco);
            System.out.println("Votos Nulo:" + qtdNulo);



        entrada.close();


    }

}
