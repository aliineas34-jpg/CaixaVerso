import java.util.Locale;
import java.util.function.*;

public class ExerciciosAula04 {
    static void main() {

        //Q1
        Predicate<Integer> ehPar = n -> (n % 2) == 0;
        System.out.println(ehPar.test(5));

        //Q2
        Function<String, Integer> qtdLetras = str -> str.length();
        System.out.println(qtdLetras.apply("abc 123"));

        //Q3
        Supplier<String> stringSupplier = () -> "Java";
        System.out.println(stringSupplier.get());

        //Q4
        BiFunction<Integer, Integer,Integer> somaNumeros = (a, b) -> a + b;
        int resultado = somaNumeros.apply(20,50 );
        System.out.println(resultado);

        //Q5
        Consumer<String> imprimirMinusculo = s -> System.out.println(s.toLowerCase());
        imprimirMinusculo.accept("ALINE ALVES SOARES");

        //Q6
        Predicate<String> letraA = a -> a.startsWith("A");
        System.out.println(letraA.test("Banana"));
        System.out.println(letraA.test("aline"));
        System.out.println(letraA.test("Abacaxi"));

        //Q7
        Function<Integer, Integer> dobroNum = c -> ( c * 2);
        int resultado2 = dobroNum.apply(65);
        System.out.println(resultado2);

        //Q8
        BiFunction<Integer, Integer, Integer> menorNum = (c, d) -> Math.min(c, d);
        int resultado3 = menorNum.apply(154, 25);
        System.out.println(resultado3);

        //Q9
        Function<String, String> invertida = e -> new StringBuilder(e).reverse().toString();
        System.out.println(invertida.apply("brasilidade"));

        //Q10
        Predicate<String> maiorCinco = g -> g.length() > 5 && g.contains("e");
        System.out.println(maiorCinco.test("Tubarao"));
        System.out.println(maiorCinco.test("Ele"));
        System.out.println(maiorCinco.test("Elefante"));



    }
}
