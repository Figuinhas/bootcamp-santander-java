package set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarCOnvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome,codigo));
    }

    public void removerCandidatoPorCodigoConvite(int codigo){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigo() == codigo){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();  
      }

      public void exibirConvidados(){
        System.out.println(convidadoSet);
      }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem "+ convidados.contarConvidados()+ " convidado(s) dentro do Set de convidados.");

        convidados.adicionarCOnvidado("Convidado 1", 1234);
        convidados.adicionarCOnvidado("Convidado 2", 1235);
        convidados.adicionarCOnvidado("Convidado 3", 1235);
        convidados.adicionarCOnvidado("Convidado 4", 1236);

        System.out.println("Existem "+ convidados.contarConvidados()+ " convidado(s) dentro do Set de convidados.");

        convidados.removerCandidatoPorCodigoConvite(1234);

        System.out.println("Existem "+ convidados.contarConvidados()+ " convidado(s) dentro do Set de convidados.");

        convidados.exibirConvidados();
    }
}