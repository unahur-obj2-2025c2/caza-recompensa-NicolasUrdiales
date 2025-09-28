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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInociencia'");
    }
    @Override
    public Integer getHabilidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHabilidad'");
    }
    @Override
    public Boolean esNervioso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esNervioso'");
    }
    @Override
    public void volverseNervioso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volverseNervioso'");
    }
    @Override
    public void dejarDeEstarNervioso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dejarDeEstarNervioso'");
    }
    @Override
    public void reducirHabilidad(Integer valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reducirHabilidad'");
    }
    @Override
    public void disminuirInociencia(Integer valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'disminuirInociencia'");
    }

    

    
}
