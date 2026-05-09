import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VerificadorMaioridade {

    public static void main(String[] args){

        LocalDate dataNascimento = LocalDate.of(2010,03,29);
        LocalDate hoje = LocalDate.now();

        long idade = ChronoUnit.YEARS.between(dataNascimento, hoje);

        if (idade >= 18){
            System.out.println("A idade e " + idade);
            System.out.println("Status: maior de idade!");
        }else {
            long anosParaMaioridade = 18 - idade;
            System.out.println("A idade e " + idade);
            System.out.println("Status: menor de idade!");
            System.out.println("Faltam " + anosParaMaioridade + " para completar 18 anos.");
        }
    }
}
