import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExercicioAula {

    public static void main(String[] args){
        LocalDate dataNascimento = LocalDate.parse("1990-01-11");
        LocalTime horarioLevanto = LocalTime.parse("08:30");
        LocalDateTime ultimaAula = LocalDateTime.parse("2026-05-05T19:10");

        System.out.println("Minha data de nascimento e " + dataNascimento);
        System.out.println("Horario que me levanto " + horarioLevanto);
        System.out.println("Dia e hora da minha ultima aula " + ultimaAula);

        System.out.println("Detalhado");
        System.out.println("Ano: " + dataNascimento.getYear());
        System.out.println("Mes: " + dataNascimento.getMonth());
        System.out.println("Dia da semana: " + dataNascimento.getDayOfWeek());
        System.out.println("Acordo: " + horarioLevanto.getHour());
        System.out.println("Minutos: " + horarioLevanto.getMinute());

        System.out.println();
        System.out.println("Exercicio 2");
        //LocalDate d1 = LocalDate.of(2024, 13, 1);A função localdate.of é imutavel..
        //LocalDate d2 = LocalDate.of(2024, 2, 30); ela valida se um mês é valido ou se o dia é valido no mes
        System.out.println("Correção...");//corrigidos mês e dia
        LocalDate d1 = LocalDate.of(2024, 12, 1);
        LocalDate d2 = LocalDate.of(2024, 2, 28);

        System.out.println(d1);
        System.out.println(d2);

    }
}
