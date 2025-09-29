package ar.edu.unahur.obj2.cazadores;

import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorUrbano extends Cazador{

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    public CazadorUrbano(Integer experiencia, List<IProfugo> profugosCapturados) {
        super(experiencia, profugosCapturados);
    }

    @Override
    protected void doIntimidar(IProfugo profugo) {
        profugo.dejarDeEstarNervioso();
        
    }

    @Override
    protected Boolean doPuedeCapturar(IProfugo profugo) {
       return !profugo.esNervioso();
    }

    

}
