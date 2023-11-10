package ar.programa;

import ar.programa.icono.Icono;
import ar.programa.musica.*;

import java.time.LocalDateTime;

/**
 * @author pBarzaghi
 *
 */
public class App 
{
    public static void main( String[] args )
    {


          String nombreCancion="“The Scientist";
          String artista="“Coldplay";
          String album="A Rush of Blood to the head";
          String  anioAlbun="2002";

        Cancion cancion=new Cancion(artista,album,nombreCancion,anioAlbun);

        // Cancio Normal
        System.out.println( cancion.reproducir()     );

        cancion.setReproducciones(100000);


        cancion.setLikes(2200000);
        cancion.setDisLikes(3);
        cancion.setUltimaReproduccion( LocalDateTime.parse("2023-11-10T10:15:30"));


     // Cambia en auge
        System.out.println( cancion.reproducir()     );

        // Cambia en Tendencia

        System.out.println( cancion.reproducir()     );
     // Cambia en Normal

        cancion.setUltimaReproduccion( LocalDateTime.parse("2023-11-08T10:15:30"));
        System.out.println( cancion.reproducir()     );
    }
}
