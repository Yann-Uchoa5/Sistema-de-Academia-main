# Sistema de Academia

<div align="center">
<img src="https://github.com/user-attachments/assets/922371bd-4666-4326-aacc-739170660c38"/>
</div>

IDE: IntelliJ

Este projeto é uma aplicação em Java com interface gráfica, desenvolvida para gerenciar os instrutores e alunos de uma academia, além de facilitar a administração dos treinos oferecidos.

## Funcionalidades

- **Cadastro de Instrutor**: O sistema permite que os dados do instrutor (nome, matrícula, idade, telefone, especialidade, horário de trabalho e salário) sejam cadastrados na primeira vez que um aluno é adicionado.
- **Cadastro de Alunos**: Permite o cadastro de novos alunos, inserindo informações como nome, matrícula, idade e telefone.
- **Associação de Treinos**: Os alunos podem ser associados a diferentes treinos (costas, bíceps, peito, tríceps e pernas).
- **Remoção de Alunos**: Possibilidade de remover um aluno do sistema, confirmando a remoção através de um diálogo de confirmação.
- **Visualização de Dados**: Exibe as informações do instrutor e os treinos associados aos alunos na área de saída.

## Estrutura do Código

### AcademiaGUI

A classe `AcademiaGUI` é responsável por toda a interface gráfica e controle das funcionalidades. Ela estende `JFrame`, que é a classe principal para criar janelas em Java Swing.

- **Componentes da Interface**: 
  - `JTextField`: Campos de texto para entrada de dados.
  - `JCheckBox`: Caixas de seleção para escolher os treinos.
  - `JTextArea`: Área de texto para exibir as informações cadastradas.
  - `JButton`: Botões para adicionar e remover alunos.

- **Métodos Principais**:
  - `adicionarAluno()`: Adiciona um novo aluno ao sistema, associando os treinos selecionados e exibindo as informações no campo de saída.
  - `removerAluno()`: Solicita a matrícula de um aluno para removê-lo do sistema. Se o aluno for encontrado, uma confirmação de remoção é exibida antes de concluir a ação.

## Como Usar

1. **Executando o Programa**:
   - Para executar o sistema, compile e execute a classe `AcademiaGUI` em um ambiente que suporte Java.

2. **Cadastro de Instrutor**:
   - O cadastro do instrutor é realizado automaticamente na primeira vez que um aluno é adicionado, preenchendo os campos com os dados necessários.

3. **Adicionando Alunos**:
   - Preencha os campos de nome, matrícula, idade e telefone do aluno.
   - Selecione os treinos desejados para o aluno.
   - Clique em "Adicionar Aluno" para cadastrar o aluno e associar os treinos selecionados.

4. **Removendo Alunos**:
   - Clique em "Remover Aluno".
   - Insira a matrícula do aluno que deseja remover.
   - Confirme a remoção quando solicitado.

## Requisitos

- Java 8 ou superior.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto é licenciado sob a licença MIT.
