package ar.programa.musica;

import ar.programa.icono.Icono;

import java.time.LocalDateTime;


public abstract class  Popularidad {


    public abstract void reproducirCancion(Cancion cancion);
    public abstract Icono getIcono();
    public abstract String getLeyecda(Cancion cancion);





}
