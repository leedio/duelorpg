package Associacao.test;

import java.util.ArrayList;

import Associacao.main.Escola;
import Associacao.main.Professor;

public class EscolaTest {
    
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Jirayia");
        Professor professor2 = new Professor("KaKashi");
        Professor professor3 = new Professor("Tsunade");
        Professor professor4 = new Professor("Naruto");
        Professor professor5 = new Professor("Orochimaru");

        Escola escola1 = new Escola("Konoha");
        Professor[] professores = {professor1,professor2,professor3};
        Professor[] professores2= new Professor[4];
        Escola escola2 = new Escola("Dojo Senin", professores);

        //escola2.imprime();
        System.out.println();
        System.out.println(escola2.toString());

        
        professores2[0]=professor1;
        professores2[1]=professor4;
        professores2[2]=professor5;
        professores2[3]=professor2;
        escola1.setProfessores(professores2);
        System.out.println(escola1.toString());

        ArrayList<Professor>  ProfessorArray1 = new ArrayList<>();






    }
}
