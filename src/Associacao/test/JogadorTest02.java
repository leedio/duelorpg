package Associacao.test;

import Associacao.main.Jogador;
import Associacao.main.Time;

public class JogadorTest02 {
   
    public static void main(String[] args) {
        
        Time time1 = new Time("BRASIL");
        Time time2 = new Time("CHINA");
        Time time3 = new Time("EUA");
        Jogador jogador1 = new Jogador("CAFU", time1);
        Jogador jogador4 = new Jogador("BEBETO", time1);
        Jogador jogador5 = new Jogador("ROMARIO", time1);
        Jogador jogador6 = new Jogador("HOOK LEE", time2);
        Jogador jogador2 = new Jogador("LEE TSUNG", time2);
        Jogador jogador3 = new Jogador("STEVE");
        jogador3.setTime(time3);

        Jogador[] selecaoBr = {jogador1,jogador4,jogador5};
        Jogador[] selecaoCh = {jogador2,jogador6};
        Jogador[] selecaoEu = {jogador3};

        
        jogador1.setTime(time1);
        jogador4.setTime(time1);
        jogador5.setTime(time1);

        time1.setJogadores(selecaoBr);
        time2.setJogadores(selecaoCh);
        time3.setJogadores(selecaoEu);

        


        System.out.println("--- Jogador ---");
        System.out.println("--- Jogador ---");
        System.out.println("--- Jogador ---");

        //System.out.println(time1.toString());
        

    }
}
