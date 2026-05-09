import java.time.LocalDate;

public class ExercicioCalculadora {

    public static void main(String[] args){
        LocalDate dataInicio = LocalDate.of(2026,7,8);
        System.out.println("A data de inicio e " + dataInicio);

        LocalDate dataFinalDias = dataInicio.plusDays(90);
        System.out.println("A data final em dias e " + dataFinalDias);

        LocalDate dataFinalMeses = dataInicio.plusMonths(3);
        System.out.println("A data final em meses e " + dataFinalMeses
        );

        //dá diferença pq o metodo plusDays adiciona numero absoluto em dias, e os meses não possuem exatamente
        //30 dias
        //o metodo plusMonths adiciona os meses do calendario e ignora a quantidade de dias existentes
    }

}
