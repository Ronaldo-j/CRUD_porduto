package collection;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> listaDeProduto = new ArrayList<>();
    private ProdutoFactory produtoFactory;

    public ProdutoService(ProdutoFactory produtoFactory) {
        this.produtoFactory = produtoFactory;
    }

    public void criaProduto(int id, String nome, String descricao, double preco, int quantidade) {
        Produto produto = produtoFactory.criarProduto(id, nome, descricao, preco, quantidade);
        listaDeProduto.add(produto);
        System.out.println("Produto criado com sucesso!");
    }

    public void listarProdutos() {
        if (listaDeProduto.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaDeProduto) {
                System.out.println("Id: " + produto.getIdProduto() + 
                                   ", Nome: " + produto.getNomeProduto() +
                                   ", Descrição: " + produto.getDescProduto() +
                                   ", Preço: " + produto.getPrecoProduto() +
                                   ", Quantidade: " + produto.getQtdProduto());
            }
        }
    }

    public void editarProduto(int id, String novoNome, String novaDescricao, double novoPreco, int novaQuantidade){
        Produto produto = buscarProdutoPorId(id);
        if(produto != null){
            produto.setNomeProduto(novoNome);
            produto.setDescProduto(novaDescricao);
            produto.setPrecoProduto(novoPreco);
            produto.setQtdProduto(novaQuantidade);
        }else{
            System.out.println("Produto com ID " + id +"não encontrado!");
        }
    }

    public void removerProduto(int id){
        Produto produto = buscarProdutoPorId(id);
        if(produto != null){
            listaDeProduto.remove(produto);
            System.out.println("Produto removido com sucesso");
        }else{
            System.out.println("Produto com ID " + id +"não encontrado!");
        }
    }

    public void consultarProduto(int id){
        Produto produto = buscarProdutoPorId(id);
        if(produto != null){
            System.out.println("Produto Encontrado ");
            System.out.println("Id: " + produto.getIdProduto());
            System.out.println("Nome: " + produto.getNomeProduto());
            System.out.println("Descrição: " + produto.getDescProduto());
            System.out.println("Preço: " + produto.getPrecoProduto());
            System.out.println("Quantidade: " + produto.getQtdProduto());
        }
    }

    public Produto buscarProdutoPorId(int id){
        for(Produto produto : listaDeProduto){
            if(produto.getIdProduto() == id){
                return produto;
            }
        }
        return null;
    }
}
