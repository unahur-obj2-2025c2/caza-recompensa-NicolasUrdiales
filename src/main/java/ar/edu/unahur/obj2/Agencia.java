package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.cazadores.Cazador;
import ar.edu.unahur.obj2.profugos.IProfugo;

public class Agencia {
    private List<IProfugo> profugosCapturados = new ArrayList<>();
    private List<Cazador> cazadores = new ArrayList<>();

    public void agregarCazador(Cazador cazador) {
        cazadores.add(cazador);
    }

    public void encerrarProfugosDeCazadores(){
        cazadores.stream().forEach(c -> profugosCapturados.addAll(c.getProfugosCapturados()) );
    }
    public List<IProfugo> getProfugosCapturados() {
        return profugosCapturados;
    }

    public IProfugo profugoMasHabil(){
        return profugosCapturados.stream().max((p1, p2) -> p1.getHabilidad() - p2.getHabilidad()).orElse(null);
    }

    public Cazador cazadorConMasCapturas(){
        return cazadores.stream().max((c1, c2) -> c1.getProfugosCapturados().size() - c2.getProfugosCapturados().size()).orElse(null);
    }
}
