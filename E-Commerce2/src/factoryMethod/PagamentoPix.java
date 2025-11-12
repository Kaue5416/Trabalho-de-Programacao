package factoryMethod;

import java.math.BigDecimal;

public class PagamentoPix implements Pagamento {
	@Override
	public boolean processarPagamento(BigDecimal valor) {
		System.out.println("Processando Pix de R$ " + valor.toPlainString());
		return true; // simulação
	}

	@Override
	public String getNome() {
		return "PIX";
	}
}
