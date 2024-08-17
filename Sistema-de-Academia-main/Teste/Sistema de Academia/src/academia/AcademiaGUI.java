package academia;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AcademiaGUI extends JFrame {
    JTextField nomeInstrutorField;
    JTextField matriculaInstrutorField;
    JTextField idadeInstrutorField;
    JTextField telefoneInstrutorField;
    JTextField especialidadeInstrutorField;
    JTextField horarioInstrutorField;
    JTextField salarioInstrutorField;

    JTextField nomeAlunoField;
    JTextField matriculaAlunoField;
    JTextField idadeAlunoField;
    JTextField telefoneAlunoField;

    JCheckBox costasCheckBox;
    JCheckBox bicepsCheckBox;
    JCheckBox peitoCheckBox;
    JCheckBox tricepsCheckBox;
    JCheckBox pernasCheckBox;

    JTextArea outputArea;

    Instrutor instrutor;
    List<Aluno> alunos;

    public AcademiaGUI() {
        alunos = new ArrayList<>();

        setTitle("Sistema de Academia");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Estilo geral
        Font font = new Font("Arial", Font.PLAIN, 14);
        Color backgroundColor = new Color(245, 245, 245);
        Color panelColor = new Color(255, 255, 255);
        Color borderColor = new Color(0, 123, 255);
        Border border = BorderFactory.createLineBorder(borderColor, 2);

        JPanel instrutorPanel = new JPanel(new GridLayout(7, 2, 10, 10));
        instrutorPanel.setBackground(panelColor);
        instrutorPanel.setBorder(BorderFactory.createTitledBorder(border, "Dados do Instrutor"));
        instrutorPanel.setOpaque(true);
        nomeInstrutorField = new JTextField(20);
        matriculaInstrutorField = new JTextField(20);
        idadeInstrutorField = new JTextField(20);
        telefoneInstrutorField = new JTextField(20);
        especialidadeInstrutorField = new JTextField(20);
        horarioInstrutorField = new JTextField(20);
        salarioInstrutorField = new JTextField(20);

        JLabel nomeInstrutorLabel = new JLabel("Nome:");
        JLabel matriculaInstrutorLabel = new JLabel("Matrícula:");
        JLabel idadeInstrutorLabel = new JLabel("Idade:");
        JLabel telefoneInstrutorLabel = new JLabel("Telefone:");
        JLabel especialidadeInstrutorLabel = new JLabel("Especialidade:");
        JLabel horarioInstrutorLabel = new JLabel("Horário de Trabalho:");
        JLabel salarioInstrutorLabel = new JLabel("Salário:");

        nomeInstrutorLabel.setFont(font);
        matriculaInstrutorLabel.setFont(font);
        idadeInstrutorLabel.setFont(font);
        telefoneInstrutorLabel.setFont(font);
        especialidadeInstrutorLabel.setFont(font);
        horarioInstrutorLabel.setFont(font);
        salarioInstrutorLabel.setFont(font);

        instrutorPanel.add(nomeInstrutorLabel);
        instrutorPanel.add(nomeInstrutorField);
        instrutorPanel.add(matriculaInstrutorLabel);
        instrutorPanel.add(matriculaInstrutorField);
        instrutorPanel.add(idadeInstrutorLabel);
        instrutorPanel.add(idadeInstrutorField);
        instrutorPanel.add(telefoneInstrutorLabel);
        instrutorPanel.add(telefoneInstrutorField);
        instrutorPanel.add(especialidadeInstrutorLabel);
        instrutorPanel.add(especialidadeInstrutorField);
        instrutorPanel.add(horarioInstrutorLabel);
        instrutorPanel.add(horarioInstrutorField);
        instrutorPanel.add(salarioInstrutorLabel);
        instrutorPanel.add(salarioInstrutorField);

        add(instrutorPanel, BorderLayout.NORTH);

        JPanel alunoPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        alunoPanel.setBackground(panelColor);
        alunoPanel.setBorder(BorderFactory.createTitledBorder(border, "Dados do Aluno"));
        alunoPanel.setOpaque(true);
        nomeAlunoField = new JTextField(20);
        matriculaAlunoField = new JTextField(20);
        idadeAlunoField = new JTextField(20);
        telefoneAlunoField = new JTextField(20);

        JLabel nomeAlunoLabel = new JLabel("Nome:");
        JLabel matriculaAlunoLabel = new JLabel("Matrícula:");
        JLabel idadeAlunoLabel = new JLabel("Idade:");
        JLabel telefoneAlunoLabel = new JLabel("Telefone:");

        nomeAlunoLabel.setFont(font);
        matriculaAlunoLabel.setFont(font);
        idadeAlunoLabel.setFont(font);
        telefoneAlunoLabel.setFont(font);

        alunoPanel.add(nomeAlunoLabel);
        alunoPanel.add(nomeAlunoField);
        alunoPanel.add(matriculaAlunoLabel);
        alunoPanel.add(matriculaAlunoField);
        alunoPanel.add(idadeAlunoLabel);
        alunoPanel.add(idadeAlunoField);
        alunoPanel.add(telefoneAlunoLabel);
        alunoPanel.add(telefoneAlunoField);

        add(alunoPanel, BorderLayout.CENTER);

        JPanel treinoPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        treinoPanel.setBackground(panelColor);
        treinoPanel.setBorder(BorderFactory.createTitledBorder(border, "Treinos"));
        treinoPanel.setOpaque(true);
        costasCheckBox = new JCheckBox("Costas");
        bicepsCheckBox = new JCheckBox("Bíceps");
        peitoCheckBox = new JCheckBox("Peito");
        tricepsCheckBox = new JCheckBox("Tríceps");
        pernasCheckBox = new JCheckBox("Pernas");

        treinoPanel.add(costasCheckBox);
        treinoPanel.add(bicepsCheckBox);
        treinoPanel.add(peitoCheckBox);
        treinoPanel.add(tricepsCheckBox);
        treinoPanel.add(pernasCheckBox);

        add(treinoPanel, BorderLayout.EAST);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(backgroundColor);
        JButton addButton = new JButton("Adicionar Aluno");
        JButton removeButton = new JButton("Remover Aluno");

        // Definindo as cores dos botões
        addButton.setBackground(Color.GREEN);
        removeButton.setBackground(Color.RED);

        addButton.setFont(font);
        removeButton.setFont(font);

        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        outputArea = new JTextArea(12, 40);
        outputArea.setEditable(false);
        outputArea.setFont(font);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(buttonPanel, BorderLayout.NORTH);
        outputPanel.add(scrollPane, BorderLayout.CENTER);

        add(outputPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarAluno();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerAluno();
            }
        });
    }

    void adicionarAluno() {
        if (instrutor == null) {
            String nome = nomeInstrutorField.getText();
            int matricula = Integer.parseInt(matriculaInstrutorField.getText());
            int idade = Integer.parseInt(idadeInstrutorField.getText());
            long telefone = Long.parseLong(telefoneInstrutorField.getText());
            String especialidade = especialidadeInstrutorField.getText();
            String horario = horarioInstrutorField.getText();
            double salario = Double.parseDouble(salarioInstrutorField.getText());

            instrutor = new Instrutor(nome, matricula, idade, telefone, especialidade, horario, salario);
        }

        String nomeAluno = nomeAlunoField.getText();
        int matriculaAluno = Integer.parseInt(matriculaAlunoField.getText());
        int idadeAluno = Integer.parseInt(idadeAlunoField.getText());
        long telefoneAluno = Long.parseLong(telefoneAlunoField.getText());

        Aluno aluno = new Aluno(nomeAluno, matriculaAluno, idadeAluno, telefoneAluno, null);
        alunos.add(aluno);

        if (costasCheckBox.isSelected()) {
            Treinos treino = new Treinos("Costas", "Exercícios para Costas", 60, "09:00", "Academia Topfit");
            treino.adicionarAluno(aluno);
        }
        if (bicepsCheckBox.isSelected()) {
            Treinos treino = new Treinos("Bíceps", "Exercícios para Bíceps", 45, "10:00", "Academia Topfit");
            treino.adicionarAluno(aluno);
        }
        if (peitoCheckBox.isSelected()) {
            Treinos treino = new Treinos("Peito", "Exercícios para Peito", 50, "11:00", "Academia Topfit");
            treino.adicionarAluno(aluno);
        }
        if (tricepsCheckBox.isSelected()) {
            Treinos treino = new Treinos("Tríceps", "Exercícios para Tríceps", 40, "12:00", "Academia Topfit");
            treino.adicionarAluno(aluno);
        }
        if (pernasCheckBox.isSelected()) {
            Treinos treino = new Treinos("Pernas", "Exercícios para Pernas", 60, "13:00", "Academia Topfit");
            treino.adicionarAluno(aluno);
        }

        outputArea.setText("Aluno adicionado:\n");
        outputArea.append("Nome: " + nomeAluno + "\n");
        outputArea.append("Matrícula: " + matriculaAluno + "\n");
        outputArea.append("Idade: " + idadeAluno + "\n");
        outputArea.append("Telefone: " + telefoneAluno + "\n");
    }

    void removerAluno() {
        String matriculaText = matriculaAlunoField.getText();
        int matricula = Integer.parseInt(matriculaText);
        Aluno alunoToRemove = null;

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunoToRemove = aluno;
                break;
            }
        }

        if (alunoToRemove != null) {
            alunos.remove(alunoToRemove);
            outputArea.setText("Aluno removido:\n");
            outputArea.append("Nome: " + alunoToRemove.getNome() + "\n");
            outputArea.append("Matrícula: " + alunoToRemove.getMatricula() + "\n");
            outputArea.append("Idade: " + alunoToRemove.getIdade() + "\n");
            outputArea.append("Telefone: " + alunoToRemove.getTelefone() + "\n");
        } else {
            outputArea.setText("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public static void main(String[] args) {
        AcademiaGUI gui = new AcademiaGUI();
        gui.setVisible(true);
    }
}
