package academia;
import java.util.ArrayList;
import java.util.List;

public class Instrutor {
    String nome;
    int matricula;
    int idade;
    long telefone;
    String especialidade;
    String horarioDeTrabalho;
    double salario;
    List<Treinos> treinos;

    public Instrutor(String nome, int matricula, int idade, long telefone, String especialidade,
                     String horarioDeTrabalho, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.horarioDeTrabalho = horarioDeTrabalho;
        this.salario = salario;
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
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public String[] sugerirExercicios(String[] partesDoMusculo) {
        List<String> exercicios = new ArrayList<>();

        for (String parteDoMusculo : partesDoMusculo) {
            switch (parteDoMusculo.toLowerCase()) {
                case "peito":
                    exercicios.add("Supino inclinado");
                    exercicios.add("Crossover polia alta");
                    exercicios.add("Voador");
                    break;
                case "pernas":
                    exercicios.add("Agachamento");
                    exercicios.add("Leg Press");
                    exercicios.add("Cadeira extensora");
                    exercicios.add("Cadeira flexora");
                    exercicios.add("Mesa flexora");
                    break;
                case "costas":
                    exercicios.add("Puxada alta");
                    exercicios.add("Remada curvada");
                    exercicios.add("Pulldown");
                    break;
                case "bíceps":
                    exercicios.add("Rosca direta");
                    exercicios.add("Rosca scott");
                    exercicios.add("Rosca martelo");
                    break;

                case "tríceps":
                    exercicios.add("Tríceps pulley");
                    exercicios.add("Tríceps testa");
                    exercicios.add("Tríceps francês");
                    break;

                case "ombro":
                    exercicios.add("Elevação lateral");
                    exercicios.add("Desenvolmento com halteres");
                    exercicios.add("Elevação Frontal");
                    break;
                default:
                    exercicios.add("Exercício não encontrado para " + parteDoMusculo);
            }
        }

        return exercicios.toArray(new String[0]);
    }
}


