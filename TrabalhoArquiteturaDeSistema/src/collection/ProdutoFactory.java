package collection;

public interface ProdutoFactory {
    Produto criarProduto(int id, String nome, String descricao, double preco, int quantidade);
    
}
