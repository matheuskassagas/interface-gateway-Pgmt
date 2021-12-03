package Loja.lojaPagamento;


import Loja.lojaPagamento.pagamento.PicPayService;
import Loja.lojaPagamento.venda.Venda;
import Loja.lojaPagamento.venda.VendaService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class vendaServiceTest {

    @Test
    public void registrarVenda(){
        Venda venda = new Venda();
        venda.setProduto("Camiseta branca basica");
        venda.setQuantidade(2);
        venda.setPrecoUnitario(new BigDecimal(109.5));


//      VendaService vendaService = new VendaService(new PagSeguroService("86727hsjba2342shj3432au826178828"));
//      VendaService vendaService = new VendaService(new PicPayService("gigli_@hotmail.com", "1234"));
//      VendaService vendaService = new VendaService(new PayPalService("matheusg", "123"));
//        VendaService vendaService = new VendaService(new MockGatewayService());
//      vendaService.registrar(venda, "4020302310203039");
    }
}
