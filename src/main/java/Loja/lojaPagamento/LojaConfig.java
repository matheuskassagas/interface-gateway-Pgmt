package Loja.lojaPagamento;

import Loja.lojaPagamento.interfac.GatewayPagamento;
import Loja.lojaPagamento.pagamento.PagSeguroService;

import Loja.lojaPagamento.pagamento.PayPalService;
import Loja.lojaPagamento.venda.VendaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class LojaConfig {

    @Primary
    @Bean
    public PagSeguroService pagSeguroService(){
        return new PagSeguroService("86727hsjba2342shj3432au826178828");
    }

    @Bean
    public PayPalService payPalService(){
        return new PayPalService("matheus_g", "123");
    }
//
//    @Bean
//    public PicPayService picPayService(){
//        return new PicPayService("gigli_@hotmail.com", "1234");
//    }

}
