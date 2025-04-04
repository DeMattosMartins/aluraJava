package br.com.mateus.materialprincipal.calculos;

import br.com.mateus.materialprincipal.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return tempoTotal;
    }
    public void inclui(Titulo titulo){
        this.tempoTotal+= titulo.getDuracaoEmMinutos();
    }
}
