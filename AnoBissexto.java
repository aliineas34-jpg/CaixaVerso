import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class AnoBissexto {

    public static void main(String[] args){

        List<Integer> testeAno = List.of(1900, 1600, 1700, 2000, 2019, 2023, 2024, 2012, 2009);

        System.out.println("Vrificar ano Bissexto");

        for(int ano : testeAno){
            LocalDate dataReferencia = LocalDate.of(ano, 1,1);

            if (dataReferencia.isLeapYear()){
                System.out.println("O ano " + ano + " e bissexto.");
            }else {
                System.out.println("O ano " + ano + " nao e bissexto");
            }
        }



    }
}
