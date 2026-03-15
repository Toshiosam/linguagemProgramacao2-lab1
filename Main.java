package lp2_lab;

public class Main {
	
    public static void main(String[] args) {
        // 1. Fornecedores
        Fornecedor fazenda = new Fornecedor("Fazenda Local", "123-4", "Brasil");
        Fornecedor tech = new Fornecedor("TechGlobal", "567-8", "Japão");

        // 2. Produtos
        Produto leite = new ProdutoAlimenticio("Leite Integral", 101, 5.00, fazenda, 3); // Com desconto
        Produto celular = new ProdutoEletronico("Smartphone", 202, 1000.00, tech, 24); // Com taxa garantia

        // 3. Carrinho
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(leite);
        carrinho.adicionarItem(celular);

        // 4. Resultado
        carrinho.processarCompra();
    }
}