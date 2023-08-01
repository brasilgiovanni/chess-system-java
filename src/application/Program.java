package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// CONSTRUIR UM JOGO DE XADREZ
		
		Board board = new Board(8, 8);
		
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
		

	}

}
