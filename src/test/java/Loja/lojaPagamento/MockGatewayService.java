package Loja.lojaPagamento;

import Loja.lojaPagamento.interfac.GatewayPagamento;
import Loja.lojaPagamento.pagamento.PagSeguroService;

import java.math.BigDecimal;

public class MockGatewayService implements GatewayPagamento {

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor) {
    }
}
