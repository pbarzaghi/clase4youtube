package ar.programa;

import ar.programa.musica.Cancion;
import ar.programa.musica.EnAuge;
import ar.programa.musica.Normal;
import ar.programa.musica.Tendencia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class CancionTest {
    private Cancion cancion;

    @BeforeEach
    public void init(){
        String nombreCancion="“The Scientist";
        String artista="“Coldplay";
        String album="A Rush of Blood to the head";
        String  anioAlbun="2002";
        cancion=new Cancion(artista,album,nombreCancion,anioAlbun);


    }
    @Test
    public void  recienSeLanza_PopularidadNormal(){
        System.out.println("Metodo 1: recienSeLanza_PopularidadNormal()");
        System.out.println(cancion.reproducir());
        Assertions.assertTrue( cancion.getPopularidad() instanceof Normal );
    }

     @Test
    public void estaEnAaugePorSuperarElMinimoDeReproducciones(){
       cancion.setReproducciones(1000);
       System.out.println("Metodo 2: estaEnAaugePorSuperarElMinimoDeReproducciones()");
         System.out.println(cancion.reproducir());
         Assertions.assertTrue( cancion.getPopularidad() instanceof EnAuge);
    }

    @Test
    public void bajaDeAugePorTenerMuchosDislikes(){

        cancion.setCambiarMusica(new EnAuge());
        cancion.setReproducciones(1001);
        cancion.setDisLikes(7000);
        System.out.println("Metodo 3: bajaDeAugePorTenerMuchosDislikes()");
        System.out.println(cancion.reproducir());
        Assertions.assertTrue( cancion.getPopularidad() instanceof Normal);
    }

    @Test
    public void esTendenciaPorRecordReproduccionesYLikes(){
        cancion.setCambiarMusica(new EnAuge());
        cancion.setReproducciones(600000);
        cancion.setLikes(37000);
        System.out.println("Metodo 4: esTendenciaPorRecordReproduccionesYLikes()");
        System.out.println(cancion.reproducir());
        Assertions.assertTrue( cancion.getPopularidad() instanceof Tendencia);


    }

    @Test
    public void esTendenciaPeroBajaPorNoSeEscuchadaDurantelas24Hs(){
        cancion.setCambiarMusica(new Tendencia());
        cancion.setUltimaReproduccion( LocalDateTime.parse("2023-11-08T10:15:30"));
        System.out.println("Metodo 5: esTendenciaPeroBajaPorNoSeEscuchadaDurantelas24Hs()");
        System.out.println(cancion.reproducir());
        Assertions.assertTrue( cancion.getPopularidad() instanceof Normal);


    }

}