import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Pedro", "Bruno", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.2f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do Aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;

    }
}
