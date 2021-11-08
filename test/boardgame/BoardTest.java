package boardgame;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	
	Position position;
	Board board;
	
	@Before
	public void setup() {
		board = new Board(8, 8);
	}
	
	@Test
	
	public void deveRetornarAPecaDadaLinhaEColuna() {
		//cenario
		position = new Position();
		//acao
		Piece resultado = board.piece(1, 1);
		//verificacao
		assertEquals(null, resultado);
	}
	
@Test
	
	public void deveRetornarAPecaDadaPosicao() {
		//cenario
		position = new Position(1, 1);
		//acao
		Piece resultado = board.piece(position);
		//verificacao
		assertEquals(null, resultado);
	}
	
	
}
