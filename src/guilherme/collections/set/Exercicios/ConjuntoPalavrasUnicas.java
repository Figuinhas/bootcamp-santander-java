package set.Exercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ConjuntoPalavrasUnicas {
    //atributo

    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Iterator<Palavra> iterator = palavraSet.iterator();
        while (iterator.hasNext()) {
            Palavra p = iterator.next();
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                iterator.remove(); // Remove a palavra do conjunto
            }
        }
    }

    public void verificarPalavra(String palavra){
        Set<Palavra> palavraNoConjunto = new HashSet<>();
        boolean encontrada = false;
        for(Palavra p : palavraSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                System.out.println("A palavra " + p.getPalavra() + " existe dentro do conjunto.");
                palavraNoConjunto.add(p);
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Essa palavra não existe no conjunto.");
        }

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavra = new ConjuntoPalavrasUnicas();

        palavra.adicionarPalavra("Arroz");
        palavra.adicionarPalavra("Arroz");
        palavra.adicionarPalavra("Feijão");
        palavra.adicionarPalavra("Feijao");
        palavra.adicionarPalavra("Brocolis");
        palavra.adicionarPalavra("Ovo");


        //palavra.exibirPalavrasUnicas();
        palavra.verificarPalavra("Ovo");
        palavra.removerPalavra("Ovo");
        palavra.verificarPalavra("Ovo");    

        palavra.exibirPalavrasUnicas();
        
    }
}
