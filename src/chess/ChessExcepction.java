package chess;

import boardgame.BoardException;

public class ChessExcepction extends BoardException {
	private static final long serialVersionUID = 1L;
	
	public ChessExcepction(String msg) {
		super(msg);
	}

}
