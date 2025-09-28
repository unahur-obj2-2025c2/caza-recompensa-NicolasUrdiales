package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.zonas.Zona;

public abstract class Cazador {
    private Integer experiencia;
    private List<IProfugo> profugosCapturados = new ArrayList<>();


    public void cazar(IProfugo profugo){
        if(this.puedeCapturar(profugo)){
            profugosCapturados.add(profugo);
        }else{
            this.intimidar(profugo);
        }
    }

    public Boolean puedeCapturar(IProfugo profugo){
        return experiencia > profugo.getInociencia() && this.doPuedeCapturar(profugo);
    }

    protected abstract Boolean doPuedeCapturar(IProfugo profugo);

}