package collection;

public class Produto {
    private int idProduto;
    private String nomeProduto;
    private String descProduto;
    private double precoProduto;
    private int qtdProduto;

    public Produto(int id, String nome, String descricao, double preco, int quantidade) {
        this.idProduto = id;
        this.nomeProduto = nome;
        this.descProduto = descricao;
        this.precoProduto = preco;
        this.qtdProduto = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int id) {
        this.idProduto = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nome) {
        this.nomeProduto = nome;
    }
    public String getDescProduto() {
        return descProduto;
    }
    public void setDescProduto(String desc) {
        this.descProduto = desc;
    }
    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double preco) {
        this.precoProduto = preco;
    }
    public int getQtdProduto() {
        return qtdProduto;
    }
    public void setQtdProduto(int qtd) {
        this.qtdProduto = qtd;
    }
}
