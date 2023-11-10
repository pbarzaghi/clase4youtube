package ar.programa.musica;

import java.time.LocalDateTime;

public class Cancion {
    private Popularidad popularidad;

    private  String nombreArtista;
    private  String nombreAlbun;
    private String tituloCancion;
    private String  anioAlbun;
    private int likes;
    private int disLikes;
    private int reproducciones;
    private LocalDateTime ultimaReproduccion;


    public Cancion(String nombreArtista, String nombreAlbum, String tituloCancion, String anioAlbun){

        this.nombreAlbun=nombreAlbum;
        this.nombreArtista=nombreArtista;
        this.tituloCancion=tituloCancion;
        this.anioAlbun=anioAlbun;
        this.disLikes=0;
        this.likes=0;
        this.reproducciones=0;
        this.ultimaReproduccion=LocalDateTime.now();

        this.popularidad=new Normal();

    }


    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public void setNombreAlbun(String nombreAlbun) {
        this.nombreAlbun = nombreAlbun;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public void setAnioAlbun(String anioAlbun) {
        this.anioAlbun = anioAlbun;
    }
    public void setCambiarMusica(Popularidad newMusica){
        setPopularidad(newMusica);
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public String getNombreAlbun() {
        return nombreAlbun;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public String getAnioAlbun() {
        return anioAlbun;
    }


    public String reproducir(){

       this.getPopularidad().reproducirCancion(this);
       return  popularidad.getIcono().texto()+" - "+popularidad.getLeyecda(this);

    }


    public void setPopularidad(Popularidad popularidad) {
        this.popularidad = popularidad;
    }

    public Popularidad getPopularidad() {
        return popularidad;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDisLikes(int disLikes) {
        this.disLikes = disLikes;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void setUltimaReproduccion(LocalDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public int getLikes() {
        return likes;
    }

    public int getDisLikes() {
        return disLikes;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public LocalDateTime getUltimaReproduccion() {
        return ultimaReproduccion;
    }
}
