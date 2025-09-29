package ar.edu.unahur.obj2.profugos;

public class Profugo implements IProfugo{
    private Integer inociencia;
    private Integer habilidad;
    private Boolean esNervioso;
    public Profugo(Integer inociencia, Integer habilidad, Boolean esNervioso) {
        this.inociencia = inociencia;
        if(habilidad >= 0 && habilidad <= 100){
            this.habilidad = habilidad;
        }else{
            throw new RuntimeException("la habilidad es un valor del 0 al 100");
        }
        this.esNervioso = esNervioso;
    }
    @Override
    public Integer getInociencia() {
        return inociencia;
    }
    @Override
    public Integer getHabilidad() {
        return habilidad;
    }
    @Override
    public Boolean esNervioso() {
        return esNervioso;
    }
    @Override
    public void volverseNervioso() {
        esNervioso = Boolean.TRUE;
    }
    @Override
    public void dejarDeEstarNervioso() {
        esNervioso = Boolean.FALSE;
    }
    @Override
    public void reducirHabilidad(Integer valor) {
        habilidad = Integer.max(0, habilidad - valor);
    }
    @Override
    public void disminuirInociencia(Integer valor) {
        inociencia = Integer.max(0, inociencia - valor);
    }

    

    
}
