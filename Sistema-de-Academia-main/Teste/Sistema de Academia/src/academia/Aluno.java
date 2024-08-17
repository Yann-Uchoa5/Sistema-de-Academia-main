package academia;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    int matricula;
    int Idade;
    long telefone;
    List<Treinos>treinos;

    public Aluno(String nome, int matricula, int idade, long telefone, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.Idade = idade;
        this.telefone = telefone;
        this.treinos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }


    public List<Treinos> getTreinos() {
        return treinos;
    }

    public void adicionarTreino(Treinos treino) {
        treinos.add(treino);
    }

    public void removerTreino(Treinos treino) {
        treinos.remove(treino);
    }

    public List<Treinos> listarTreinos() {
        return treinos;
    }

    public String exibirInformacoes() {
        return "Aluno: " + nome +
                "\nMatricula: " + matricula +
                "\nIdade: " + Idade +
                "\nTelefone: " + telefone;
    }


}
