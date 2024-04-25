package guilherme.anatomiaclasses;
public class MinhaClasse {
    
    public static void main (String [] args) {
        String primeiroNome ="Guilherme";

        String segundoNome ="Figueira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

       int anoNascimento = 2002;

       boolean verdade = true;
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
