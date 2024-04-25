package guilherme.operadores;

// import java.sql.Date;

public class Operadores {
    public static void main(String[] args) {
        //Atribuição
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        // Date dataNascimento = new Date();

        //Aritiméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //Concatenação com "+"
        String nomeCompleto = "LINGUAGEM" + "JAVA";
            // System.out.println(nomeCompleto);
        String concatenacao ="?"; 

        // System.out.println(concatenacao);

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);
            
        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);
            
        // concatenacao = 1+"1"+1+"1";

        // System.out.println(concatenacao);
            
        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);
            
        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);


        //Unários
        int numero = 5;

        numero = - numero;
        System.out.println(numero);
        numero = numero * -1 ;
        System.out.println(numero);
    }
}
