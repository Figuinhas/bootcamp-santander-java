package list.Exercicios.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    private List<Numeros> numerosInt;

    public SomaDeNumeros() {
        this.numerosInt = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInt.add(new Numeros(numero));
    }

    public void calcularSoma(){
        int somaNumeros = 0;
        for(Numeros num : numerosInt){
            somaNumeros += num.getNumero();
        }
        System.out.println(somaNumeros);
    }
    public void encontrarMaiorNumero(){
        Numeros maiorNumero = numerosInt.get(0);
        for(Numeros num : numerosInt){
            if(num.getNumero() > maiorNumero.getNumero()){
                maiorNumero = num;
            }
        }
        System.out.println("O maior numero da lista é o: " + maiorNumero);
    }
    public void encontrarMenorNumero(){
        Numeros menorNumero = numerosInt.get(0);
        for(Numeros num : numerosInt){
            if(num.getNumero() < menorNumero.getNumero()){
                menorNumero = num;
            }
        }
        System.out.println("O maior numero da lista é o: " + menorNumero);
    }
    public void exibirNumeros(){
        System.out.println(numerosInt);
    }

    public static void main(String[] args) {
        SomaDeNumeros numero = new SomaDeNumeros();

        numero.adicionarNumero(13);
        numero.adicionarNumero(80);
        numero.adicionarNumero(37);
        numero.adicionarNumero(15);
        numero.adicionarNumero(97);
        numero.adicionarNumero(22);
        numero.adicionarNumero(1);

        numero.exibirNumeros();
        numero.encontrarMaiorNumero();
        numero.encontrarMenorNumero();
        numero.calcularSoma();
    }
}
