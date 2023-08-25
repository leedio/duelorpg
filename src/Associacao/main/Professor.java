package Associacao.main;

public class Professor {
    
    private String nomeProfessor;

    public Professor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    @Override
    public String toString() {
        return " " + nomeProfessor;
    }

    
    
}
