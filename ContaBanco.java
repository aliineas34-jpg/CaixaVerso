import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        String nomeCliente = "Aline Alves";
        String tipoConta = "Corrente";
        double saldo = 2345.78;

        System.out.println("*******************");
        System.out.println();
        System.out.println("Bem vindo " + nomeCliente + " ao Banco Class");
        System.out.println("Sua Conta " + tipoConta + " está ativa!");
        System.out.println("Possui saldo de " + saldo + ".");
        System.out.println();
        System.out.println("*******************");

        String menu = """
                      **Digite qual opção deseja:**
                      1 - Consultar Saldo
                      2 - Realizar Pix
                      3 - Receber
                      4 - Sair
                      """;

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atualizado e de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo suficiente.");
                }else {
                    saldo -= valor;
                    System.out.println("O valor do saldo atual e de " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual valor será transferido?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Transferencia recebida com sucesso!Saldo e de " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcao invalida! ");
            }
        }
    }
}
