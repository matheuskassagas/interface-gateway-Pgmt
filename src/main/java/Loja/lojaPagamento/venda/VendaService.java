package Loja.lojaPagamento.venda;

import java.math.BigDecimal;

import Loja.lojaPagamento.interfac.GatewayPagamento;
import Loja.lojaPagamento.pagamento.PagSeguroService;
import Loja.lojaPagamento.venda.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //significa que essa class e um bean
public class VendaService {

	@Autowired
	private GatewayPagamento gatewayPagamento;



	public void registrar(Venda venda, String numeroCartao) {
		BigDecimal valorTotal = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));
		
		System.out.printf("[Venda] Registrando venda de %s no valor total de %f... \n",
				venda.getProduto(), valorTotal);

		gatewayPagamento.efetuarPagamento(numeroCartao, valorTotal);

		//VendaService esta muito dependente da class PagSeguro, altamente acoplada.
		//A dependencia é necessaria atraves de uma abstração
		//PagSeguroService pagSeguroService = new PagSeguroService("86727hsjba2342shj3432au826178828");
		//pagSeguroService.efetuarPagamento(numeroCartao, valorTotal);
	}

}
