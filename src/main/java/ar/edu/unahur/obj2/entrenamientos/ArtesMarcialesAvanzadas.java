package ar.edu.unahur.obj2.entrenamientos;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class ArtesMarcialesAvanzadas extends Entrenamiento{

    public ArtesMarcialesAvanzadas(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getInociencia() {
        return profugo.getInociencia();
    }

    @Override
    public Integer getHabilidad() {
        return Integer.min(profugo.getHabilidad() * 2, 100);
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugo.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad(Integer valor) {
        profugo.reducirHabilidad(valor);
    }

    @Override
    public void disminuirInociencia(Integer valor) {
        profugo.disminuirInociencia(valor);
    }

    

}
