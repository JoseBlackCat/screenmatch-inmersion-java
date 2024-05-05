package modelo;

public class Serie extends Titulo {
    private int temporada;
    private int episodioPorTemporada;
    private int duracionPorEpisodioEnMinutos;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getDuracionPorEpisodioEnMinutos() {
        return duracionPorEpisodioEnMinutos;
    }

    public void setDuracionPorEpisodioEnMinutos(int duracionPorEpisodioEnMinutos) {
        this.duracionPorEpisodioEnMinutos = duracionPorEpisodioEnMinutos;
    }
}
