import collection.ProdutoFactory;
import collection.ProdutoFactoryImpl;
import collection.ProdutoService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ProdutoFactory produtoFactory = new ProdutoFactoryImpl();
        ProdutoService produtoService = new ProdutoService(produtoFactory);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("O que você deseja fazer? \n[1] Criar Produto \n[2] Editar Produto \n[3] Remover Produto \n[4] Listar Produtos \n[5]Consultar Produto \n[6] Sair");
            int acaoSelecionada = scanner.nextInt();
            scanner.nextLine(); 

            if (acaoSelecionada == 1) {
                System.out.println("Insira o ID:");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.println("Insira o nome:");
                String nome = scanner.nextLine();
                System.out.println("Insira a descrição:");
                String desc = scanner.nextLine();
                System.out.println("Insira o preço:");
                double preco = scanner.nextDouble();
                System.out.println("Insira a quantidade:");
                int qtd = scanner.nextInt();
                produtoService.criaProduto(id, nome, desc, preco, qtd);
            } else if (acaoSelecionada == 2) {
                System.out.println("Insira o ID do produto a ser editado:");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.println("Insira o novo nome:");
                String nome = scanner.nextLine();
                System.out.println("Insira a nova descrição:");
                String desc = scanner.nextLine();
                System.out.println("Insira o novo preço:");
                double preco = scanner.nextDouble();
                System.out.println("Insira a nova quantidade:");
                int qtd = scanner.nextInt();
                produtoService.editarProduto(id, nome, desc, preco, qtd);
            } else if (acaoSelecionada == 3) {
                System.out.println("Insira o ID do produto a ser removido:");
                int id = scanner.nextInt();
                produtoService.removerProduto(id); 
            } else if (acaoSelecionada == 4) {
                produtoService.listarProdutos();
            } else if(acaoSelecionada == 5){
                System.out.println("Insira o ID do produto a ser consultado");
                int id = scanner.nextInt();
                produtoService.consultarProduto(id);
            } 
            else if (acaoSelecionada == 6) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
