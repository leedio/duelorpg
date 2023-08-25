package Associacao.main;

import java.util.Arrays;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome, Jogador[] jogadores){
        this.nome= nome;
        this.jogadores=jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(jogadores == null) return;
        for (Jogador i : jogadores) {
            System.out.println(i.getNome());
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public String toString() {
        return "Time -> " + nome + ", Jogadores: " + Arrays.toString(jogadores);
    }
    

    

    public Jogador[] getJogadores() {
        return jogadores;
    }


 

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    

    
}
