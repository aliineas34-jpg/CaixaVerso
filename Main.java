public class Main {

    public static void main(String[] args){

        System.out.println("Exercicio Um: Classe Carro.");

        Carro carro1 = new Carro();
        carro1.ano = 2025;
        carro1.marca = "Jeep";
        carro1.modelo = "Jeep Compass";

        Carro carro2 = new Carro();
        carro2.ano = 2018;
        carro2.marca = "Ford";
        carro2.modelo = "Ford KA";

        System.out.println("Carro do ano " + carro1.ano + " da marca " + carro1.marca + " " + carro1.modelo + ".");
        System.out.println("Carro do ano " + carro2.ano + " da marca " + carro2.marca + " " + carro2.modelo + ".");

        System.out.println();
        System.out.println("Exercicio Dois: Classe Pessoa.");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Adam";
        pessoa1.idade = 37;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Aline";
        pessoa2.idade = 36;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos.");
        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos.");

        System.out.println();
        System.out.println("Exercicio Três: Classe Celular.");

        Celular celular1 = new Celular();
        celular1.marca = "Motorola";
        celular1.numero = "98765-4025";

        Celular celular2 = new Celular();
        celular2.marca = "Samsung";
        celular2.numero = "93216-45687";

        System.out.println("Celular da marca " + celular1.marca + " possui o numero de telefone " + celular1.numero + ".");
        System.out.println("Celular da marca " + celular2.marca + " possui o numero de telefone " + celular2.numero + ".");

        System.out.println();
        System.out.println("Exercicio Quatro: Classe Livro.");

        Livro livro1 = new Livro();
        livro1.titulo = "O morro dos ventos uivantes";
        livro1.autor = "Emily Brontë";
        livro1.ano = 1847;

        Livro livro2 = new Livro();
        livro2.titulo = "Inteligencia Emocional";
        livro2.autor = "Daneil Goleman";
        livro2.ano = 1995;

        System.out.println("O livro " + livro1.titulo + " foi escrito por " + livro1.autor + " na data de " + livro1.ano + ".");
        System.out.println("O livro " + livro2.titulo + " foi escrito por " + livro2.autor + " na data de " + livro2.ano + ".");

        System.out.println();
        System.out.println("Exercicio Cinco: Classe Cachorro.");

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Dona";
        cachorro1.raca = "Desconhecida";

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Luna";
        cachorro2.raca = "Shih Tzu";

        System.out.println("O cachoro " + cachorro1.nome + " e da raca " + cachorro1.raca + ".");
        System.out.println("O cachoro " + cachorro2.nome + " e da raca " + cachorro2.raca + ".");

        System.out.println();
        System.out.println("Exercicio Seis: Classe Casa.");

        Casa casa1 = new Casa();
        casa1.cor = "Cimento Queimado";
        casa1.numero = 04;

        Casa casa2 = new Casa();
        casa2.cor = "Verde Militar";
        casa2.numero = 666;

        System.out.println("Casa " + casa1.cor + ",numero " + casa1.numero + ".");
        System.out.println("Casa " + casa2.cor + ",numero " + casa2.numero + ".");




    }
}
