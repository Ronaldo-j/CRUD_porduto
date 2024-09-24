package collection;

public class ProdutoFactoryImpl implements ProdutoFactory {
    public Produto criarProduto(int id, String nome, String descricao, double preco, int quantidade) {
        return new Produto(id, nome, descricao, preco, quantidade);
    }

}
