package ar.edu.unahur.obj2.entrenamientos;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class ArtesMarcialesAvanzadas extends Entrenamiento {
    public ArtesMarcialesAvanzadas(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(100, profugo.getHabilidad() * 2);
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
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
