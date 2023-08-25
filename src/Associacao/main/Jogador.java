package Associacao.main;

public class Jogador {
    
    private String nome;
    private Time time;

    

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time=time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        if (this.time == null) return;
        for (Time i : time[]  {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        if (this.time == null ){
            Time timeD = new Time("SELEÇÃO BRASILEIRA");
            //this.time = new Time("Não Informado");
            this.time=timeD;
        }
        return "Torcedor: " + nome + " " + this.time.toString();
    }
    
    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", time=" + time + "]";
    }

    public void setTime(Time time) {
        this.time = time;
    }

    

    
    
}
