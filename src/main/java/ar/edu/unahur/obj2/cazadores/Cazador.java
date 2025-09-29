package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.zonas.Zona;

public abstract class Cazador {
    private Integer experiencia;
    private List<IProfugo> profugosCapturados = new ArrayList<>();
    private List<IProfugo> profugosIntimidados = new ArrayList<>();


    


    public Cazador(Integer experiencia, List<IProfugo> profugosCapturados) {
        this.experiencia = experiencia;
        this.profugosCapturados = profugosCapturados;
    }

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    private void capturar(IProfugo profugo, Zona zona){
        if(this.puedeCapturar(profugo)){
            profugosCapturados.add(profugo);
            zona.eliminarProfugo(profugo);
            this.aumentarExperiencia();
        }else{
            this.intimidar(profugo);
        }
    }

    public Boolean puedeCapturar(IProfugo profugo){
        return experiencia > profugo.getInociencia() && this.doPuedeCapturar(profugo);
    }

    public void intimidar(IProfugo profugo){
        profugo.disminuirInociencia(2);
        profugosIntimidados.add(profugo);
        this.doIntimidar(profugo);
    }

    private void aumentarExperiencia(){
        Integer minimoHabilidadIntimidados = profugosIntimidados.stream()
                                                .mapToInt(p -> p.getHabilidad())
                                                .min().orElse(0);
        Integer cantidadCapturados = profugosCapturados.size();


        experiencia += minimoHabilidadIntimidados + (2 * cantidadCapturados);
    }

    public void realizarBusqueda(Zona zona){
        List<IProfugo> profugosEnZona = new ArrayList<>(zona.getProfugos());
        profugosEnZona.forEach(p -> this.capturar(p, zona));
    }

    protected abstract Boolean doPuedeCapturar(IProfugo profugo);
    protected abstract void doIntimidar(IProfugo profugo);

}