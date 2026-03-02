import java.util.Scanner;
import java.util.ArrayList;

import entity.Aluno;
import entity.Atividade;
import entity.Bimestre;
import entity.Disciplina;

void main() {

    Scanner input = new Scanner(System.in);

    System.out.println("========== e-turma Univille ==========");
    System.out.println();

    System.out.println("Digite o nome do Aluno:");
    String nomeAluno = input.nextLine();

    System.out.println();
    System.out.println("Digite o curso do Aluno");
    String curso = input.nextLine();

    Aluno aluno = new Aluno(nomeAluno, curso);

    System.out.println();
    System.out.println("=====================================");
    System.out.println();

    System.out.println("Digite o número do bimestre:");
    int numeroBimestre = input.nextInt();
    input.nextLine(); // CORREÇÃO

    System.out.println();

    System.out.println("Digite o nome da atividade 1:");
    String nomeAtividade1 = input.nextLine();

    System.out.println("Digite a nota 1:");
    double nota1 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println("Digite peso 1:");
    double peso1 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println();

    System.out.println("Digite o nome da atividade 2:");
    String nomeAtividade2 = input.nextLine();

    System.out.println("Digite a nota 2:");
    double nota2 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println("Digite peso 2:");
    double peso2 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println();

    System.out.println("Digite o nome da atividade 3:");
    String nomeAtividade3 = input.nextLine();

    System.out.println("Digite a nota 3:");
    double nota3 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println("Digite peso 3:");
    double peso3 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    Bimestre bimestre1 = new Bimestre(numeroBimestre, new ArrayList<>());
    bimestre1.atividades().add(new Atividade(nomeAtividade1, nota1, peso1));
    bimestre1.atividades().add(new Atividade(nomeAtividade2, nota2, peso2));
    bimestre1.atividades().add(new Atividade(nomeAtividade3, nota3, peso3));

    System.out.println();
    System.out.println("=====================================");
    System.out.println();

    System.out.println("Digite o número do bimestre:");
    numeroBimestre = input.nextInt();
    input.nextLine(); // CORREÇÃO

    System.out.println();

    System.out.println("Digite o nome da atividade 1:");
    String nomeAtividade4 = input.nextLine();

    System.out.println("Digite a nota 1:");
    double nota4 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println("Digite peso 1:");
    double peso4 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println();

    System.out.println("Digite o nome da atividade 2:");
    String nomeAtividade5 = input.nextLine();

    System.out.println("Digite a nota 2:");
    double nota5 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println("Digite peso 2:");
    double peso5 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println();

    System.out.println("Digite o nome da atividade 3:");
    String nomeAtividade6 = input.nextLine();

    System.out.println("Digite a nota 3:");
    double nota6 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    System.out.println("Digite peso 3:");
    double peso6 = input.nextDouble();
    input.nextLine(); // CORREÇÃO

    Bimestre bimestre2 = new Bimestre(numeroBimestre, new ArrayList<>());
    bimestre2.atividades().add(new Atividade(nomeAtividade4, nota4, peso4)); // CORREÇÃO
    bimestre2.atividades().add(new Atividade(nomeAtividade5, nota5, peso5)); // CORREÇÃO
    bimestre2.atividades().add(new Atividade(nomeAtividade6, nota6, peso6)); // CORREÇÃO

    Disciplina disciplina1 = new Disciplina("Estrutura de Dados I", new ArrayList<>());
    disciplina1.bimestres().add(bimestre1);
    disciplina1.bimestres().add(bimestre2);

    disciplina1.verificarResultado();

    input.close();
}