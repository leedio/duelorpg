package Associacao.test;

import Associacao.main.Jogador;
import Associacao.main.Time;

public class JogadorTest {
    
    public static void main(String[] args) {
        
        Time timeA = new Time("BAHIA");
        Time timeB = new Time("VITORIA");
        Time timeC = new Time("BRASIL");

        Jogador jogador1 = new Jogador("LIDIO",timeA);
        Jogador jogador2 = new Jogador("LUARA",timeA);
        Jogador jogador3 = new Jogador("DIANA",timeB);

        Jogador[] jogadors = new Jogador[3];
        Jogador[] jogadores = {jogador1,jogador2,jogador3};


        Jogador torcedor1 = new Jogador("Zezinho");
        Jogador torcedor2 = new Jogador("Luizinho");
        Jogador torcedor3 = new Jogador("Joãozinho");

        jogadors[0]=torcedor1;
        jogadors[1]=torcedor2;
        jogadors[2]=torcedor3;

        torcedor1.setTime(timeB);
       





        
        //System.out.println(jogador1.toString());
        for (Jogador i : jogadores) {
            System.out.println(i.toString());
        }

        for (Jogador i : jogadors) {
            System.out.println(i.toString());
        }
    }
}
