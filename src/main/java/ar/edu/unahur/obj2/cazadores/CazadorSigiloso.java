package ar.edu.unahur.obj2.cazadores;

import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorSigiloso extends Cazador{

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    public CazadorSigiloso(Integer experiencia, List<IProfugo> profugosCapturados) {
        super(experiencia, profugosCapturados);
    }


    @Override
    protected void doIntimidar(IProfugo profugo) {
        profugo.reducirHabilidad(5);
        
    }

    @Override
    protected Boolean doPuedeCapturar(IProfugo profugo) {
        return profugo.getHabilidad() < 50;
    }

}
