package ar.edu.unahur.obj2.cazadores;

import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorRural extends Cazador{

    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    public CazadorRural(Integer experiencia, List<IProfugo> profugosCapturados) {
        super(experiencia, profugosCapturados);
    }

    @Override
    protected void doIntimidar(IProfugo profugo) {
        profugo.volverseNervioso();
        
    }

    @Override
    protected Boolean doPuedeCapturar(IProfugo profugo) {
        return profugo.esNervioso();
    }

    

}
