package AulasSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenaçãoDosElementos {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");

        //Lista
        Set<series> minhasseries1 =new HashSet<>(){{
            add(new series("got", "Fantasia", 60));
            add(new series("suits", "Drama", 60));
            add(new series("The Big Bang", "comédia", 25));
        }};
        // Prints
        /*for (series series: minhasseries1) System.out.println(series.getNome() + " - " + 
        series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\t Ordem natural (TempoEpisodio)\t--");
        Set<series> minhasSeries2 = new TreeSet<>(minhasseries1);
        System.out.println(minhasSeries2);

        for (series series: minhasSeries2) System.out.println(series.getNome() + " - " + 
        series.getGenero() + " - " + series.getTempoEpisodio());*/

        System.out.println("--\tOrdem Nome/Genero/TempoEpisódio\t--");
        Set<series> minhasseries3 = new TreeSet<>(new CompNomeGeneroTempoEpisodio());

        minhasseries3.addAll(minhasseries1);
        for (series series: minhasseries3) System.out.println(series.getNome() + " - " + 
        series.getGenero() + " - " + series.getTempoEpisodio());
    }
    
}
    //Implementações
 class series implements Comparable<series> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    public series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
    @Override
    public String toString() {
        return "[genero=" + genero + 
        ", nome=" + nome + 
        ", tempoEpisodio=" + tempoEpisodio + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    //Diferente do umbunto
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        series other = (series) obj;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }
    @Override
    public int compareTo(series series) {
        // TODO Auto-generated method stub
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
        if  (tempoEpisodio !=0) return tempoEpisodio;

        return this.getGenero().compareTo(series.getGenero());
    }
 }

 class CompNomeGeneroTempoEpisodio implements Comparator<series>{

    @Override
    public int compare(series s1, series s2) {
        // TODO Auto-generated method stub
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome !=0) return nome;
        
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero!=0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());   
    }

}