package Jogo.test;

import java.util.Random;

import Jogo.main.Personagem;

public class PersonagemTest {
    public static void main(String[] args) {
       
    

        Personagem twitch = new Personagem("Twitch", 115, 27, 682,11);
        Personagem ashe = new Personagem("Ashe", 105, 26, 640,9);
        Personagem teemo = new Personagem("Teemo", 94, 24, 598,9);
        Personagem garen = new Personagem("Garen", 90, 40, 690,6);
        Personagem talon = new Personagem("Talon", 108, 35, 658,7);

       //twitch.atacar(talon);

       //twitch.x1(twitch, talon);

       //twitch.atacar(talon);
       //twitch.duelo(talon);
       //ashe.duelo(teemo);

        twitch.torneio(twitch, teemo, garen, talon);


    }
}
