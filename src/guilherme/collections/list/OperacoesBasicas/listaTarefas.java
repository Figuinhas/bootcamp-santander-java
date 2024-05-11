package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class listaTarefas {
    //atributo
    private List<Tarefa> listaTarefa;

    public listaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefa);
    }





    //testando
    public static void main(String[] args) {
        listaTarefas listatarefa = new listaTarefas();

        System.out.println("O numero total de elementos na lista é: " + listatarefa.obterNumeroTotalTarefas() );

        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listatarefa.obterNumeroTotalTarefas() );

        // listatarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listatarefa.obterNumeroTotalTarefas() );

        listatarefa.obterDescricoesTarefas();
    }
}
