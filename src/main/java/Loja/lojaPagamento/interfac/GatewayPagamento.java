package Loja.lojaPagamento.interfac;

import java.math.BigDecimal;

public interface GatewayPagamento {

    void efetuarPagamento(String numeroCartao, BigDecimal valor);
}
