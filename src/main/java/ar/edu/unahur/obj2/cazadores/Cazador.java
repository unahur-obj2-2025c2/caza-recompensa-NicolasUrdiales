package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.zonas.Zona;

public abstract class Cazador {
    private Integer experiencia;
    private final List<IProfugo> profugosCapturados = new ArrayList<>();
    private final List<IProfugo> profugosIntimidados = new ArrayList<>();

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public Boolean puedeCapturar(IProfugo profugo) {
        return this.getExperiencia() > profugo.getInociencia() && this.doPuedeCapturar(profugo);
    }

    protected abstract Boolean doPuedeCapturar(IProfugo profugo);

    public void intimidar(IProfugo profugo){
        profugo.disminuirInociencia(2);
        this.doIntimidar(profugo);
        this.profugosIntimidados.add(profugo);
    }

    public void capturar(IProfugo profugo){
        if(this.puedeCapturar(profugo)){
            this.profugosCapturados.add(profugo);
            this.aumentarExperiencia();
        }else{
            this.intimidar(profugo);
        }
    }

    private void aumentarExperiencia(){
        Integer habilidadDeIntimidados = profugosIntimidados.stream()
            .mapToInt(p -> p.getHabilidad()).sum();
        Integer cantidadProfugosCapturados = profugosCapturados.size();
        experiencia += habilidadDeIntimidados 
            + (2 * cantidadProfugosCapturados);
    }

    protected abstract void doIntimidar(IProfugo profugo);

    public void realizarCaptura(Zona zona){
        zona.getProfugos().stream().forEach(p -> this.capturar(p));
    }

    public List<IProfugo> getProfugosCapturados() {
        return profugosCapturados;
    }


}