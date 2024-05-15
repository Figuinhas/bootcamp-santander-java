package map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;
public class AgendaContatos {
    //atributo 

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Figas 1", 33445588);
        contatos.adicionarContato("Figas 1", 77414589);
        contatos.adicionarContato("Figas 3", 68445587);
        contatos.adicionarContato("Figas 4", 33445583);
        contatos.adicionarContato("Figas 5", 18715582);

        contatos.exibirContato();
        contatos.removerContato("Figas 3");
        contatos.exibirContato();
    }
}
