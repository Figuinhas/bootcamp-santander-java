public class ResultadoEscolar {
    public static void main(String[] args) {
        //condicao composta + encadeada
       int nota = 6;
       
        if (nota >= 7)
		    System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");


            //condição ternaria cenario 1
            //String resultado = nota >=7 ? "Aprovado" : "Reprovado";
            //System.out.println(resultado);

            //condicao ternaria cenario 2
            //String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		    //System.out.println(resultado);
     }

}