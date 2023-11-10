package ar.programa.musica;

import ar.programa.icono.Icono;

import java.time.LocalDateTime;

public class Tendencia extends Popularidad{


    /* TODO:
        Si la cancion no fue reproducida durante las ultimas 24 hs, entonces volvera a ser una
        cancion NORMAL
        */
    @Override
    public void reproducirCancion(Cancion cancion) {


        if(!isMenor24hs(cancion.getUltimaReproduccion()))
            cancion.setCambiarMusica(new Normal());

    }


    /*
      Funcion que retrorna true si la fecha de reproduccion es menor a 24 horas.
      Fase en caso contrario
     */
    private boolean isMenor24hs(LocalDateTime ultimaReproduccion){
        LocalDateTime fechaActual=LocalDateTime.now();

        if(ultimaReproduccion.getDayOfMonth() < fechaActual.getDayOfMonth()){
            int cantidadHsReproduccion=fechaActual.getHour()+24-ultimaReproduccion.getHour();
               return (cantidadHsReproduccion <24);

        }

        return true;
    }


    /*
     Debe mostrar el icono llamado FIRE
     */
    @Override
    public Icono getIcono() {
        return Icono.FIRE;
    }

    /*
     La leyenda que se debe mostrar debe respetar el siguiente formato
     “Título de la canción – Nombre del artista (Nombre del Álbum – Año del álbum)”

     */
    @Override
    public String getLeyecda(Cancion cancion) {
        return"\""+ cancion.getTituloCancion()+"-"+cancion.getNombreArtista()+"("+cancion.getNombreAlbun()+"-"+ cancion.getAnioAlbun() +")\"";
    }
}
