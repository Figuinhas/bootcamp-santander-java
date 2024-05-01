public class ExemploForArray {
    
    public static void main(String[] args) {
        String alunos[] = {"Guilherme", "Isabelle", "Vitor", "Gabs", "Juia", "João"};
        //laço for
        for (int x = 0 ; x<alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
        //for each
        for(String aluno : alunos){
            System.out.println(aluno);
        }

    }
}
