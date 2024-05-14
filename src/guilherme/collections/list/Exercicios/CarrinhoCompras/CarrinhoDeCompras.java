package list.Exercicios.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    //atributo
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item item : carrinhoCompras){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : carrinhoCompras){
            valorTotal = valorTotal +(item.getPreco()*item.getQuantidade());
        }
        System.out.println(valorTotal);
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Item 1",2.50, 4);
        carrinho.adicionarItem("Item 2",2.50, 4);
        carrinho.adicionarItem("Item 3",2.50, 4);
        carrinho.adicionarItem("Item 4",2.50, 4);

        carrinho.calcularValorTotal();

        carrinho.exibirItens();
    }
}
