import java.util.Random;

public class ExemploDoWhile {
    
    public static void main(String[] args){
        System.out.println("Discando...");

        do {
            //exceutando repetidas vezes até alguem atender
            System.out.println("Telefone tocando...");
        }while(tocando());
        System.out.println("Alô!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato continuar tocando
        return ! atendeu;
    }

}
