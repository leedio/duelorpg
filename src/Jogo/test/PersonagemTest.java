package Jogo.test;

import java.util.Random;

import Jogo.main.Personagem;

public class PersonagemTest {
    public static void main(String[] args) {
       
    

        Personagem twitch = new Personagem("Twitch", 105, 25, 602,11);
        Personagem ashe = new Personagem("Ashe", 105, 26, 640,9);
        Personagem teemo = new Personagem("Teemo", 94, 34, 598,10);
        Personagem garen = new Personagem("Garen", 90, 40, 850,7);
        Personagem talon = new Personagem("Talon", 108, 35, 658,7);
        Personagem alistar= new Personagem("Alistar", 70, 55, 858,8);
        Personagem fizz = new Personagem("Fizz", 85, 30, 600,12);
        Personagem gnar = new Personagem("Gnar", 89, 30, 900,8);

       //twitch.atacar(talon);

       //twitch.x1(twitch, talon);

       //twitch.atacar(talon);
       //twitch.duelo(talon);
       //ashe.duelo(teemo);

        //twitch.torneio(twitch, teemo, garen, talon);

        twitch.campeonado(twitch, ashe, teemo, garen, talon, alistar, fizz, gnar);

         
        System.out.println(twitch.toString());
        System.out.println(ashe.toString());
        System.out.println(talon.toString());
        System.out.println(teemo.toString());
        System.out.println(garen.toString());
        System.out.println(alistar.toString());
        System.out.println(gnar.toString());
        System.out.println(fizz.toString());
        System.out.println();
        




    }
}
