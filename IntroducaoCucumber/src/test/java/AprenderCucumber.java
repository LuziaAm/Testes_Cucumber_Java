
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {
	
	@Dado("que criei o arquivo corretamente")
	public void que_criei_o_arquivo_corretamente() {
	    System.out.println("Passei no passo 1");
	}

	@Quando("executá-lo")
	public void executá_lo() {
	    System.out.println("Passei no passo 2");
	}

	@Entao("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {
		System.out.println("Passei no passo 3");
	}
	
	private int contador =  0;
	
	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(Integer int1) {
	    contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(Integer int1) {
	    contador = contador + int1;
	}	

	@Então("o valor do contador será {int}")
	public void o_valor_do_contador_será(Integer int1) {
	    System.out.println(int1);
	    System.out.println(contador);
	    //throw new RuntimeException();
	}
	
	
	Date entrega = new Date();
	
	@Dado("que a entrega é dia {int}\\/{int}\\/{int}")
	public void que_a_entrega_é_dia(Integer int1, Integer int2, Integer int3) {
		Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DAY_OF_MONTH, int1);
	    cal.set(Calendar.MONTH, int2);
	    cal.set(Calendar.YEAR, int3);
	    entrega = cal.getTime();
	}

	@Quando("a entrega atrasar em {int} dias")
	public void a_entrega_atrasar_em_dias(Integer int1) {
		Calendar  cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.add(Calendar.DAY_OF_MONTH, int1);
		entrega = cal.getTime();
	}

	@Então("a entrega será efetuada em {int}\\/{int}\\/{int}")
	public void a_entrega_será_efetuada_em(String data) {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatada = format.format(entrega);
	    Assert.assertEquals(data, dataFormatada);
	}
	
}
