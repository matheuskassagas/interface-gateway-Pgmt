package Loja.lojaPagamento.pagamento;

import Loja.lojaPagamento.interfac.GatewayPagamento;

import java.math.BigDecimal;

public class PicPayService implements GatewayPagamento {

    private String email;
    private String senha;

    public PicPayService(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor) {
        System.out.printf("[PicPay] Combrando de %s:\n", this.email);
        System.out.printf("[PicPay] Cobrando %f do cartao %s...\n", valor, numeroCartao);

    }
}
