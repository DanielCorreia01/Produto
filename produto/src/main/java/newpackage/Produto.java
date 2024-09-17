package newpackage;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);

    }

    public double totalEstoque() {

        return quantidade * preco;

    }

    public void AddProdutos(int quantidade) {

        this.quantidade += quantidade;
        System.out.println("");
        System.out.println("Produto(s) adicionado(s) com sucesso!");
        System.out.println("");

    }

    public void RemoverProdutos(int quantidade) {

        this.quantidade -= quantidade;
        System.out.println("");
        System.out.println("Produto(s) removido(s) com sucesso!");
        System.out.println("");

    }

    public String toString() {

        return "\n"
                + "Nome: " + nome + "\n"
                + "Preço: R$" + preco + "\n"
                + "Quantidade no estoque: " + quantidade + "\n"
                + "Valor total do estoque: R$" + totalEstoque() + "\n";

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
