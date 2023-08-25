package Jogo.main;

import java.util.Random;



public class Personagem {
    private String nome;
    private int ataque;
    private int acerto;
    private int defesa;
    private int vida;

    Random rd = new Random();
    int mira = rd.nextInt(6)+1;

    public Personagem(String nome, int ataque, int defesa, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
        this.acerto=5;
    }

    public Personagem(String nome, int ataque, int defesa, int vida, int acerto) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
        this.acerto=acerto;
    }


    
    public void atacar(Personagem alvo){
        int mira = rd.nextInt(15);
        if (this.acerto >= mira) { 
        int danoCausado = Math.max(0,ataque-alvo.defesa);
        alvo.receberDano(danoCausado);
        System.out.println(nome + " Atacou "+ alvo.nome + " causando "+ danoCausado + " de dano.");
        System.out.println(alvo.nome + ": HP -> " + alvo.vida);
        } else {
            System.out.println(this.nome+ " ERROU");
        }
    }

    public void duelo(Personagem alvo){
        while (estaVivo()== true && alvo.estaVivo()==true){
            atacar(alvo);
            if(alvo.estaVivo()){
                alvo.atacar(this);
            } else {
                System.out.println(alvo.nome + " Perdeu");
                System.out.println();
                System.out.println(this.toString());
                System.out.println();
                System.out.println(this.nome + " GANHOU a PARTIDA");
            }
            if (estaVivo()== false){
                System.out.println(this.nome + " Perdeu");
                System.out.println();
                System.out.println(alvo.toString());
                System.out.println();
                System.out.println(alvo.nome + " GANHOU a PARTIDA");

            }
        }
        
    }

    public void campeonado(Personagem p1, Personagem p2, Personagem p3, Personagem p4, Personagem p5, Personagem p6, Personagem p7, Personagem p8){
        torneio(p1, p3, p2, p4);
        torneio(p5, p7, p6, p8);
    }

    public void torneio(Personagem p1, Personagem p2, Personagem p3, Personagem p4){
        Personagem p5;
        Personagem p6;
        p1.duelo(p2);
        if (p1.vida<=0){
            System.out.println(p2.nome + " Avança");
            p2.vida+=300;
            p5 = p2;
        } else {
            System.out.println(p1.nome + " Avança");
            p1.vida+=300;
            p5 = p1;
        }
        p3.duelo(p4);
        if (p3.vida<=0){
            p4.vida+=300;
            System.out.println(p4.nome + " Avança");
            p6 =p4;
        } else {
            p3.vida+=300;
            p6=p3;
            System.out.println(p3.nome + " Avança");
        }

            p5.duelo(p6);

    }

    private void receberDano(int dano) {
        vida = Math.max(0,vida -dano);
       // System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

    public boolean estaVivo(){
        return vida>0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\t ataque: " + ataque + "\t defesa: " + defesa + "\t vida: " + vida + "\t Taxa de Acerto: " + acerto+"/15";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }    
}
