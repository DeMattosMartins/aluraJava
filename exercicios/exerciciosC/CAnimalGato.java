package exerciciosC;

import java.util.Scanner;

public class CAnimalGato extends CAnimal {
    String som2 = "Miauu";
    Scanner scanner = new Scanner(System.in);

    @Override
    public void emitirSom() {
        System.out.println(som2);
    }
    public void gatoFeliz(){
        System.out.println("""
                                            ╱|、
                                          (˚ˎ 。7 
                                           |、˜〵         
                                           じしˍ,)ノ
                """);
        System.out.println("Deixar o gato feliz (sim ou não)?");
        String simOuNao = scanner.nextLine();
        if(simOuNao.equalsIgnoreCase("sim")){
            System.out.println("""
           |\\   ♡    ╱|、
         ૮ - ՛)     (` -7
         / ⁻ ៸|       |、⁻〵
    乀  (ˍ,ل ل       じしˍ,)ノ
                    """);
        } else {
            System.out.println(":(");
        }
    }

}
