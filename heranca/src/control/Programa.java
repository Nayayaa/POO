package control;

import model.Aluno;
import model.Monitor;
import model.Pessoa;
import model.Professor;

public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "0123456789";

        System.out.println("Telefone: " + pessoa1.telefone);
        pessoa1.mudarTelefone("0987654321");
        System.out.println("Telefone: " + pessoa1.telefone + "\n");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.telefone = "7418529630" + "\n";

        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Nome: " + aluno1.telefone);

        Professor professor1 = new Professor();
        professor1.professor = "Gustavo";
        professor1.telefone = "7894561230";
        professor1.titulacao = "Mestre";

        System.out.println("Nome do professor: " + professor1.professor);
        System.out.println("Nome do professor: " + professor1.telefone);
        System.out.println("Nome do professor: " + professor1.titulacao + "\n");

        Monitor monitor1 = new Monitor();
        monitor1.nome = "Pedro";
        monitor1.telefone = "1237894560";
        monitor1.percentualDeBolsa = 30.0;
        System.out.println("Nome: " + monitor1.nome);
        System.out.println("Telefone: " + monitor1.telefone);
        System.out.println("Percntual de bolsa: " + monitor1.percentualDeBolsa);

    }
}

