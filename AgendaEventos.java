import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgendaEventos {

    public static void main(String[] args){

        List<LocalDateTime> dataEventos =  new ArrayList<>();

        dataEventos.add(LocalDateTime.of(2026, Month.MARCH, 3, 13, 30));
        dataEventos.add(LocalDateTime.of(2026, Month.JANUARY, 11, 8, 00));
        dataEventos.add(LocalDateTime.of(2025, Month.DECEMBER, 20, 14, 30));
        dataEventos.add(LocalDateTime.of(2026, Month.APRIL, 20, 18, 00));
        dataEventos.add(LocalDateTime.of(2026, Month.JUNE, 9, 15, 00));
        dataEventos.add(LocalDateTime.of(2026, Month.SEPTEMBER, 23, 10, 30));
        dataEventos.add(LocalDateTime.of(2026, Month.FEBRUARY, 10, 11, 00));
        dataEventos.add(LocalDateTime.of(2026, Month.MAY, 8, 16, 00));

        Collections.sort(dataEventos);

        LocalDateTime hoje = LocalDateTime.now();
        System.out.println("Data e hora atual " + hoje);

        System.out.println("Todos eventos do Setor");
        for (LocalDateTime eventos : dataEventos){
            System.out.println(eventos);
        }

        System.out.println("Proximos Eventos:");
        for (LocalDateTime eventos : dataEventos ){
            if (eventos.isAfter(hoje));
            System.out.println(eventos);
        }

        System.out.println("Eventos Passados:");
        for (LocalDateTime eventos : dataEventos){
            if (eventos.isBefore(hoje)){
                System.out.println(eventos);
            }
        }

    }
}
