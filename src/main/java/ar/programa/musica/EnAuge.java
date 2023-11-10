package ar.programa.musica;

import ar.programa.icono.Icono;

public class EnAuge extends Popularidad{


    /*

         Si la camcion supera los 50 mil reproducciones en esa popularidad y tiene
         mas de 20 mil LIKES sera considerado TENDENCIA

         Si la camcion tiene 5 mil DISLIKES,mientrsas estee esta popularidad(EN_EUGE) volvera estar
         en popularidad NORMAL
        */
    @Override
    public void reproducirCancion(Cancion cancion) {

        if (cancion.getReproducciones() >=50000 && cancion.getLikes()>20000)
            cancion.setCambiarMusica(new Tendencia());

        if (cancion.getDisLikes()>=5000)
            cancion.setCambiarMusica(new Normal());

    }
   /*
     Debe mostrar el ícono llamado “ROCKET”
    */
    @Override
    public Icono getIcono() {
       return Icono.ROCKET;
    }


     /*
     La leyenda que se debe mostrar debe respetar el siguiente formato:
      “Nombre del artista – Título de la canción (Nombre del Álbum – Año del Álbum)”
      */
    @Override
    public String getLeyecda(Cancion cancion) {
        return cancion.getNombreArtista()+"-"+cancion.getTituloCancion()+"("+cancion.getNombreAlbun()+"-"+cancion.getAnioAlbun()+")";
    }

}
