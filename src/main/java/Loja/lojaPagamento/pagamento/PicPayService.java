package Loja.lojaPagamento.pagamento;

import Loja.lojaPagamento.interfac.GatewayPagamento;

import java.math.BigDecimal;

public class PicPayService implements GatewayPagamento {

    private String nome;
    private String email;

    public PicPayService(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor) {
        System.out.printf("[PicPay] Combrando de %s:\n", this.nome);
        System.out.printf("[PicPay] Cobrando %f do cartao %s...\n", valor, numeroCartao);

    }
}
