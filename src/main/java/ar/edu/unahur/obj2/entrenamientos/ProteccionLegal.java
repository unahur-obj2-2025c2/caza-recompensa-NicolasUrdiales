package ar.edu.unahur.obj2.entrenamientos;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class ProteccionLegal extends Entrenamiento {
    public ProteccionLegal(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
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
        if(profugo.getInociencia() > 40){
            profugo.disminuirInociencia(valor);
        }
    }

}
