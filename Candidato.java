public class Candidato {

    private String nome;
    private String partido;
    private int numeroPartido;
    private int numeroVotos;
    public Cargo cargoCandidato;




    //executado uma unica vez na construção do objeto
      public Candidato(String nome, String partido, int numeroPartido, Cargo cargoCandidato) {
        this.nome = nome;
        this.partido = partido;
        this.numeroPartido = numeroPartido;
        this.cargoCandidato = cargoCandidato;
    }


    public String getPartido() {
        return partido;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public int getNumeroVotos() {
        return numeroVotos;
    }

    void votosRecebidos(){
        numeroVotos++;
    }




}