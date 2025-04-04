package exerciciosC;

public class CAnimalCachorro extends CAnimal {
    public String som1 = "AU AU";

    @Override
    public void emitirSom() {
        System.out.println(som1);
    }
    public void abanarRabo(){
        System.out.println("""
                       _=,_        
                    o_/6 /#\\       
                    \\__ |##/       
                     ='|--\\        
                       /   #'-.    
                       \\#|_   _'-. /
                        |/ \\_( # |"
                       C/ ,--___/  
                """);
        System.out.println("""
                       _=,_        
                    o_/6 /#\\       
                    \\__ |##/       
                     ='|--\\        
                       /   #'-.    
                       \\#|_   _'-. 
                        |/ \\_( # |" \\
                       C/ ,--___/  
                """);
    }
}
