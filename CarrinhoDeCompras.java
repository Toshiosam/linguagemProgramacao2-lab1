package lp2_lab;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void processarCompra() {
        double total = 0;
        System.out.println("--- TALÃO DE COMPRA ---");
        for (Produto p : itens) {
            double precoFinal = p.calcularPrecoFinal();
            System.out.printf("%s | Valor Final: R$ %.2f%n", p.nome, precoFinal);
            total += precoFinal;
        }
        System.out.println("-----------------------");
        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", total);
    }
}