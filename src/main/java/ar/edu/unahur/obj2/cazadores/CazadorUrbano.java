package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorUrbano extends Cazador {

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean doPuedeCapturar(IProfugo profugo) {
        return !profugo.esNervioso();
    }

    @Override
    protected void doIntimidar(IProfugo profugo) {
        profugo.dejarDeEstarNervioso();
    }

}
