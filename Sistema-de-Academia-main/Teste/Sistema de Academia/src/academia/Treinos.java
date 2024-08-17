package academia;

import java.util.ArrayList;
import java.util.List;

public class Treinos {
    String nomeTreino;
    String descricao;
    int duracao;
    List<Aluno> alunos;
    String horario;
    String local;

    public Treinos( String nomeTreino, String descricao, int duracao, String horario, String local){
        this.nomeTreino = nomeTreino;
        this.descricao = descricao;
        this.duracao = duracao;
        this.horario = horario;
        this.local = local;
        this.alunos = new ArrayList<>();
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }



    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.adicionarTreino(this);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        aluno.removerTreino(this);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public String exibirInformacoes() {
        return "Treino: " + nomeTreino +
                "\nDescrição: " + descricao +
                "\nDuração: " + duracao + " minutos" +
                "\nHorário: " + horario +
                "\nLocal: " + local;
    }

}
