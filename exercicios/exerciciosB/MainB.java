package exerciciosB;

import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
// 1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.
        BContaBancaria banco = new BContaBancaria();

        //solicita o nome e o titular da conta(presentes em exerciciosB.BContaBancaria).
        System.out.println("Qual o nome do titular?");
        String titular1 = scanner1.nextLine();
        System.out.println("Qual o número da conta?");
        int numeroConta = scanner1.nextInt();

        //estrutura de repeticao para o usuario selecionar a opçao que deseja
        int opcao;
        while (true) {
            //verifica se o usuario e conta estão corretos.
            if (titular1.equalsIgnoreCase(banco.titular) && numeroConta == banco.getNumeroConta()) {
                System.out.println("""
                        \n
                        Selecione o número da opção que deseja:
                        1-Ver saldo.
                        2-Movimentação.
                        3-Sair.
                        """);
                opcao = scanner1.nextInt();

                //mostra o saldo da conta
                if (opcao == 1) {
                    System.out.println(banco.getSaldo());
                }
                //realiza a movimentação: saque ou deposito
                else if (opcao == 2) {
                    //verifica qual movimentacao deve ser feita
                    System.out.println("""
                            \n
                            Qual movimentação gostaria de realizar?
                            1-Deposito.
                            2-Saque.
                            """);
                    int mov2 = scanner1.nextInt();
                    banco.movimentacao(mov2);
                }
                //encerra a repetição e o exercicio
                else if (opcao == 3) {
                    System.out.println("Obrigado! Volte sempre\n");
                    break;
                }
                //caso a opção digitada não seja valida
                else {
                    System.out.println("Opção inválida.\n");
                }
            }
            //caso o usuario esteja incorreto
            else {
                System.out.println("Usuário não encontrado.");
                break;
            }
        }
//2.Crie uma classe IdadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.
        BIdadePessoa idade = new BIdadePessoa();
        Scanner scanner2 = new Scanner(System.in);

        //estrutura de repetição para o usuario selecionar a opção que deseja
        while(true){

            //verifica qual opção o usuario deseja
            System.out.println("""
               
                Selecione a opção que deseja:
                1-Verificar nome;
                2-Verificar idade;
                3-Modificar nome ou idade.
                4-Verificar se é maior de idade.
                5-Sair
                """);

            int opcao2 = scanner2.nextInt();
            //verificar nome
            if(opcao2 == 1){
                System.out.println(idade.getNome());
            }
            //verificar idade
            else if(opcao2 == 2){
                System.out.println(idade.getIdade());
            }
            //modificar nome ou idade
            else if (opcao2==3) {
                System.out.println("""
                        
                        O que deseja mudar?
                        1. Idade
                        2. Nome
                        """);
                int mudar = scanner2.nextInt();
                idade.modifica(mudar);
            }
            //encerrar a repetição
            else if (opcao2 == 5){
                System.out.println("Obrigado!");
                break;
            //verifica maior de idade
            } else if (opcao2 == 4){
                idade.verificaIdade();
            }
            //caso a opção digitada não seja valida
            else {
                System.out.println("Opção inválida.");
            }
        }

//3.Desenvolva uma classe Produto com os atributos privados nome e preco.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
            BProdutos produtos = new BProdutos();
            Scanner scanner3 = new Scanner(System.in);

            //solicita os dados do produto: nome, preço e desconto
            System.out.println("Diga o nome do produto: ");
            String nomeProduto = scanner3.nextLine();
            produtos.setNome(nomeProduto);

            System.out.println("Diga o preço do produto: ");
            double precoProduto = scanner3.nextDouble();
            produtos.setPreco(precoProduto);


            System.out.println("Diga o desconto do produto");
            double desconto = scanner3.nextInt();

            // imprime o nome do produto, o valor e o valor final com desconto
            System.out.println("O item " + produtos.getNome() + " no valor de " + produtos.getPreco() + " com o desconto de " + (int)(desconto) + "% fica no valor final de " + produtos.aplicarDesconto(desconto));

//Desenvolva uma classe Aluno com os atributos privados nome e notas.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo calcularMedia que retorna a média das notas do aluno.
        BAluno aluno = new BAluno();
        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Diga o nome do aluno: ");
        String nomeAluno = scanner4.nextLine();
        aluno.setAluno(nomeAluno);

        int contagem = 0;
        while(true){
            System.out.println("Diga a nota do aluno(digite -1 para parar): ");
            double nota = scanner4.nextInt();
            if(nota != -1){
                aluno.setNotas(nota);
                contagem++;
            } else if(nota < -1) {
                System.out.println("Notas negativas não são validas");
            } else {
                break;
            }
        }
        System.out.println("A media das notas do aluno " + aluno.getAluno() + " é: " + aluno.calcularMedia(aluno.getNotas(), contagem));

//Desenvolva uma classe Livro com os atributos privados titulo e autor.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo exibirDetalhes que imprime o título e o autor do livro.

        BLivro livro = new BLivro();
        Scanner scanner5 = new Scanner(System.in);

        //solicita nome do livro e autor;
        System.out.println("Diga o nome do livro: ");
        String nomeLivro = scanner5.nextLine();
        livro.setTitulo(nomeLivro);

        System.out.println("Diga o nome do Autor: ");
        String nomeAutor= scanner5.nextLine();
        livro.setAutor(nomeAutor);

        //chama a função exibirDetalhe para imprimir os dados passados.
        livro.exibirDetalhe(livro.getAutor(), livro.getTitulo());
    }
}