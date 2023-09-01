import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        String aluno;
        float nota;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        aluno = scanner.nextLine();

        System.out.println("Nota do aluno " + aluno + ":");
        nota = scanner.nextFloat();

        if(nota >= 7){
            System.out.println(aluno + " foi aprovado(a).");
        } else {
            System.out.println(aluno + " reprovou.");
        }

    }
}
