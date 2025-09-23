package ar.edu.unahur.obj2.entrenamientos;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class EntrenamientoElite extends Entrenamiento{
    public EntrenamientoElite(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Boolean esNervioso() {
        return false;
    }

    @Override
    public void dejarDeEstarNervioso() {}

    @Override
    public void volverseNervioso() {}

    @Override
    public void reducirHabilidad(Integer valor) {
        profugo.reducirHabilidad(valor);
    }

    @Override
    public void disminuirInociencia(Integer valor) {
        profugo.disminuirInociencia(valor);
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }
}