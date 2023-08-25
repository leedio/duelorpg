package Associacao.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Escola {
    private String nomeEscola;
    private Professor[] professores;
    private ArrayList<Professor> professorArray;
    
    
    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Escola(String nomeEscola, Professor[] professores) {
        this.nomeEscola = nomeEscola;
        this.professores = professores;
    }

    

    public Escola(String nomeEscola, ArrayList<Professor> professorArray) {
        this.nomeEscola = nomeEscola;
        this.professorArray = professorArray;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }


    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    

    public Professor[] getProfessores() {
        return professores;
    }


    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nomeEscola);
        if (professores == null) return;
        for (Professor i : professores) {
            System.out.print(i.getNomeProfessor() + " \t ");
        }
    }

    @Override
    public String toString() {
        return "Colegio: " + nomeEscola + "-> Professores: " + Arrays.toString(professores);
    }

    
    public ArrayList<Professor> getProfessorArray() {
        return professorArray;
    }

    public void setProfessorArray(ArrayList<Professor> professorArray) {
        this.professorArray = professorArray;
    }
    
    
    



}
