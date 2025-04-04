import br.com.mateus.materialprincipal.calculos.CalculadoraDeTempo;
import br.com.mateus.materialprincipal.calculos.FiltroRecomendacao;
import br.com.mateus.materialprincipal.modelos.Filme;
import br.com.mateus.materialprincipal.modelos.Serie;

public class Main {

    //classe e outros criados apenas para entender como funciona e praticar
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDuracaoEmMinutos(180);

        filme.avalia(8);
        filme.avalia(9);
        filme.avalia(10);

        filme.exibeFicha();
        System.out.println("Total de avaliação: " + filme.getTotalDeAvaliacao());
        System.out.println(filme.obterMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(50);
        serie.setMinutoPorEpisodio(10);
        System.out.println("Duração do para maratonar lost: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("O poderoso chefão");
        outroFilme.setAnoDeLancamento(1972);
        outroFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculos = new CalculadoraDeTempo();
        calculos.inclui(filme);
        calculos.inclui(outroFilme);
        System.out.println(calculos.getTempoTotal());
        System.out.println(calculos);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);
    }
}