package Loja.lojaPagamento;

import Loja.lojaPagamento.venda.Venda;
import Loja.lojaPagamento.venda.VendaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class LojaPagamentoApplication {

	public static void main(String[] args) {
		//SpringApplication retorna um metodo applicationContext
		//applicationContext representa o conteiner de inversao de dependencia do spring
		//nos da acesso aos beans gerenciados pelo spring
		ApplicationContext applicationContext = SpringApplication.run(LojaPagamentoApplication.class, args);

		VendaService vendaService = applicationContext.getBean(VendaService.class);

		Venda venda = new Venda();
		venda.setProduto("Camiseta branca basica");
		venda.setQuantidade(2);
		venda.setPrecoUnitario(new BigDecimal(109.5));

		vendaService.registrar(venda, "4020302310203039");

	}

}
