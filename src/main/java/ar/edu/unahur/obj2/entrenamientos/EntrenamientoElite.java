package ar.edu.unahur.obj2.entrenamientos;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class EntrenamientoElite extends Entrenamiento{

    public EntrenamientoElite(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public void dejarDeEstarNervioso() {}

    @Override
    public void disminuirInociencia(Integer valor) {
        profugo.disminuirInociencia(valor);
    }

    @Override
    public Boolean esNervioso() {
        return Boolean.FALSE;
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }

    @Override
    public Integer getInociencia() {
        return profugo.getInociencia();
    }

    @Override
    public void reducirHabilidad(Integer valor) {
        profugo.reducirHabilidad(valor);
        
    }

    @Override
    public void volverseNervioso() {
    }

    


}
