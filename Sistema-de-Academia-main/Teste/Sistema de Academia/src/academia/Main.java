package academia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do Instrutor:");
        System.out.print("Nome: ");
        String nomeInstrutor = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matriculaInstrutor = scanner.nextInt();
        System.out.print("Idade: ");
        int idadeInstrutor = scanner.nextInt();
        System.out.print("Telefone: ");
        long telefoneInstrutor = scanner.nextLong();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt ou nextLong
        System.out.print("Especialidade: ");
        String especialidadeInstrutor = scanner.nextLine();
        System.out.print("Horário de Trabalho: ");
        String horarioDeTrabalhoInstrutor = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioInstrutor = scanner.nextDouble();

        Instrutor instrutor = new Instrutor(nomeInstrutor, matriculaInstrutor, idadeInstrutor, telefoneInstrutor, especialidadeInstrutor, horarioDeTrabalhoInstrutor, salarioInstrutor);

        System.out.println("\nInsira os dados do Aluno 1:");
        System.out.print("Nome: ");
        scanner.nextLine(); // Consumir a nova linha
        String nomeAluno1 = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matriculaAluno1 = scanner.nextInt();
        System.out.print("Idade: ");
        int idadeAluno1 = scanner.nextInt();
        System.out.print("Telefone: ");
        long telefoneAluno1 = scanner.nextLong();
        scanner.nextLine(); // Consumir a nova linha
        Aluno aluno1 = new Aluno(nomeAluno1, matriculaAluno1, idadeAluno1, telefoneAluno1, null);

        System.out.println("\nInsira os dados do Aluno 2:");
        System.out.print("Nome: ");
        String nomeAluno2 = scanner.nextLine();
        System.out.print("Matrícula: ");
        int matriculaAluno2 = scanner.nextInt();
        System.out.print("Idade: ");
        int idadeAluno2 = scanner.nextInt();
        System.out.print("Telefone: ");
        long telefoneAluno2 = scanner.nextLong();
        scanner.nextLine();
        Aluno aluno2 = new Aluno(nomeAluno2, matriculaAluno2, idadeAluno2, telefoneAluno2, null);

        System.out.println("\nEscolha as partes do corpo que o Aluno 1 deseja trabalhar:");
        System.out.println("1. Costas");
        System.out.println("2. Bíceps");
        System.out.println("3. Peito");
        System.out.println("4. Tríceps");
        System.out.println("5. Pernas");
        System.out.println("Digite o número da(s) opção(ões) desejada(s) separada(s) por espaço: ");
        String partesDoCorpoAluno1 = scanner.nextLine();
        String[] partesAluno1 = partesDoCorpoAluno1.split(" ");

        System.out.println("\nEscolha as partes do corpo que o Aluno 2 deseja trabalhar:");
        System.out.println("1. Costas");
        System.out.println("2. Bíceps");
        System.out.println("3. Peito");
        System.out.println("4. Tríceps");
        System.out.println("5. Pernas");
        System.out.println("Digite o número da(s) opção(ões) desejada(s) separada(s) por espaço: ");
        String partesDoCorpoAluno2 = scanner.nextLine();
        String[] partesAluno2 = partesDoCorpoAluno2.split(" ");

        // Mapear opções para nomes das partes do corpo
        String[] partesCorpo = {"Costas", "Bíceps", "Peito", "Tríceps", "Pernas"};

        // Exercícios sugeridos para cada parte do corpo
        String[][] exerciciosPorParte = {
                {"Remada Curvada", "Puxada Aberta", "Levantamento Terra"},
                {"Rosca Direta", "Rosca Martelo", "Rosca Inversa"},
                {"Supino Reto", "Supino Inclinado", "Crucifixo"},
                {"Tríceps Corda", "Tríceps Francês", "Mergulho"},
                {"Agachamento Livre", "Leg Press", "Extensão de Pernas"}
        };

        System.out.println("\nInstrutor: " + instrutor.getNome());
        System.out.println("Local: Academia Topfit");
        System.out.println("Horário de Trabalho: " + instrutor.getHorarioDeTrabalho());

        System.out.println("\nTreinos do Aluno 1: " + aluno1.getNome());
        for (String parte : partesAluno1) {
            int parteIndex = Integer.parseInt(parte) - 1;
            Treinos treino = new Treinos(partesCorpo[parteIndex], "Exercícios para " + partesCorpo[parteIndex], 60, "09:00", "Academia Topfit");
            treino.adicionarAluno(aluno1);
            instrutor.adicionarTreino(treino);

            System.out.println("Treino: " + treino.getNomeTreino() + " | Descrição: " + treino.getDescricao() + " | Horário: " + treino.getHorario() + " | Local: " + treino.getLocal());
            System.out.println("Exercícios sugeridos:");
            for (String exercicio : exerciciosPorParte[parteIndex]) {
                System.out.println("- " + exercicio);
            }
        }

        System.out.println("\nTreinos do Aluno 2: " + aluno2.getNome());
        for (String parte : partesAluno2) {
            int parteIndex = Integer.parseInt(parte) - 1;
            Treinos treino = new Treinos(partesCorpo[parteIndex], "Exercícios para " + partesCorpo[parteIndex], 60, "10:00", "Academia Topfit");
            treino.adicionarAluno(aluno2);
            instrutor.adicionarTreino(treino);

            // Listando os exercícios sugeridos
            System.out.println("Treino: " + treino.getNomeTreino() + " | Descrição: " + treino.getDescricao() + " | Horário: " + treino.getHorario() + " | Local: " + treino.getLocal());
            System.out.println("Exercícios sugeridos:");
            for (String exercicio : exerciciosPorParte[parteIndex]) {
                System.out.println("- " + exercicio);
            }
        }

        scanner.close();
    }
}
