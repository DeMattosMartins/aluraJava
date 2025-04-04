package br.com.mateus.materialprincipal.calculos;

public class FiltroRecomendacao {

    public void filtra (Classificavel classificavel){
        if(classificavel.getClassificacao()>= 4){
            System.out.println("Esta entre os prefiridos do momento");
        }else if (classificavel.getClassificacao()>=2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na sua lista pra assistir depois");
        }
    }
}
