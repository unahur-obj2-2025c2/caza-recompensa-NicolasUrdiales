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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean esNervioso() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void volverseNervioso() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void dejarDeEstarNervioso() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void reducirHabilidad(Integer valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void disminuirInociencia(Integer valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

}
