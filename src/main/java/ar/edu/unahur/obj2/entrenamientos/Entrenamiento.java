package ar.edu.unahur.obj2.entrenamientos;

import ar.edu.unahur.obj2.profugos.IProfugo;

public abstract class Entrenamiento implements IProfugo {
    protected IProfugo profugo;

    public Entrenamiento(IProfugo profugo) {
        this.profugo = profugo;
    }

    @Override
    public Integer getInociencia() {
        return profugo.getInociencia();
    }

    

    

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso();
    }
}
