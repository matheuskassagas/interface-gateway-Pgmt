package Loja.lojaPagamento.pagamento;

import Loja.lojaPagamento.interfac.GatewayPagamento;

import java.math.BigDecimal;

public class PayPalService implements GatewayPagamento {

	private String usuario;
	private String senha;

	public PayPalService(String usuario, String senha) {
		this.usuario = usuario;
		this.senha  = senha;
	}

	@Override
	public void efetuarPagamento(String numeroCartao, BigDecimal valor) {
		System.out.printf("[PagSeguro] Usando usuario: %s\n", this.usuario);
		System.out.printf("[PagSeguro] Cobrando %f do cartao %s...\n", valor, numeroCartao);
	}
}
