package Jogo.test;

import java.util.Random;

import Jogo.main.Personagem;

public class PersonagemTest {
    public static void main(String[] args) {
       
    

        Personagem twitch = new Personagem("Twitch", 100, 27, 682,11);
        Personagem ashe = new Personagem("Ashe", 59, 26, 640,9);
        Personagem teemo = new Personagem("Teemo", 54, 24, 598,8);
        Personagem garen = new Personagem("Garen", 69, 38, 690,5);
        Personagem talon = new Personagem("Talon", 68, 30, 658,6);

       //twitch.atacar(talon);

       //twitch.x1(twitch, talon);

       //twitch.atacar(talon);
       twitch.duelo(talon);
       ashe.duelo(teemo);


    }
}
