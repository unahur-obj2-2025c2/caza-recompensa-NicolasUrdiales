package ar.edu.unahur.obj2.profugos;

public class Profugo implements IProfugo{

    private Integer inociencia;
    private Integer habilidad;
    private Boolean esNervioso;

    /*Un nivel de habilidad es un valor entre 1 y 100 que determina la capacidad de evadir la captura. */

    public Profugo(Integer inociencia, Integer habilidad) {
        if(habilidad < 1 || habilidad > 100) {
            throw new IllegalArgumentException("La habilidad debe estar entre 1 y 100");
        }
        this.inociencia = inociencia;
        this.habilidad = habilidad;
        this.esNervioso = false;
    }

    @Override
    public Integer getInociencia() {
        return this.inociencia;
    }

    @Override
    public Integer getHabilidad() {
        return this.habilidad;
    }

    @Override
    public Boolean esNervioso() {
        return this.esNervioso;
    }

    @Override
    public void volverseNervioso() {
        this.esNervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
        this.esNervioso = false;
    }

    @Override
    public void reducirHabilidad(Integer valor) {
        this.habilidad -= Math.max(0, this.habilidad - valor);
    }

    @Override
    public void disminuirInociencia(Integer valor) {
        this.inociencia -= Math.max(0, this.inociencia - valor);
    }
    
}
