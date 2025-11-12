package factoryMethod;

import java.math.BigDecimal;

public interface Pagamento {
	boolean processarPagamento(BigDecimal valor);

	String getNome();
}
