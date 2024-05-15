package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    //atributo

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
        

    }
    public void obterProximoEvento(){
        //Set<LocalDate> dataSet = eventosMap.keySet();
        //Collection<Evento> values = eventosMap.values();
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 15), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 10), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
