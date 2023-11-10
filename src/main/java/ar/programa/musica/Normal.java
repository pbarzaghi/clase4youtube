package ar.programa.musica;

import ar.programa.icono.Icono;

public class Normal extends Popularidad{


    /*
           TODO:
           Cuando una cancion supere las 1.000 reproducciones en esa popularidad pasa
           a considerearse que esta en Augue
          */
    @Override
    public void reproducirCancion(Cancion cancion) {
       if (cancion.getReproducciones() >=1000)
           cancion.setCambiarMusica(new EnAuge());



    }


    /*
     Debe mostrar el icono llamado MUSICAL NOTE
     */
    @Override
    public Icono getIcono() {
        return Icono.MUSICAL_NOTE;
    }

    /*
     La leyenda que se debe mostrar debe respetar el siguiente formato:
     “Nombre del artista – Nombre del álbum – Título de la canción”
     */
    @Override
    public String getLeyecda(Cancion cancion) {
        return cancion.getNombreArtista()+"-"+cancion.getNombreAlbun()+"-"+cancion.getTituloCancion() ;
    }

}
