package boardgame;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class PositionTest {
	
	Position position;
	
	@Test
	
	public void deveImprimirPosicaoNaTela() {
		//cenario
		position = new Position();
		position.setRow(1);
		position.setColumn(1);
		//acao
		String impressao = position.toString();
		//verificacao
		assertEquals("1, 1", impressao);
	}
	
}
