package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atribuo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtoPorPreco.addAll(produtoSet);

        return produtoPorPreco;
        

    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastro.adicionarProduto(2L, "Produto 0", 13d, 5);
        cadastro.adicionarProduto(1L, "Produto 3", 17d, 5);
        cadastro.adicionarProduto(9L, "Produto 9", 23d, 5);

        System.out.println(cadastro.produtoSet);

        System.out.println(cadastro.exibirProdutosPorNome());

        System.out.println(cadastro.exibirProdutosPorPreco());
    }
    
}
