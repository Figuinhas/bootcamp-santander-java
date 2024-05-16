import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);

        Function<Integer, Integer> dobrar = numero -> numero*2;

        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
