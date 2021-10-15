package Loja.lojaPagamento.venda;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Venda {
	
	private String Produto;
	private int Quantidade;
	private BigDecimal PrecoUnitario;
	

}
