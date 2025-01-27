package oop.thema1.grundlagen.tictactoe;

public class TicTacToeGame {

	private Board board;
	
	private Player player1;
	
	private Player player2;
	
	public TicTacToeaGame() {
		board = new Board();
		player1 =new HumanPlayer("Spiler", Gamecomfig.SYMOLS.get("PLAYER"));
		player = new ComputerPlayer("Computer", GameConfig.Symbols.get("Compter"));
	}
	public void play()
	{
		wheil(!board.isFull()){
			board.printBoard();
			currentPlayer.makeMove(board);
			if(board.checkWin(currentPlayer.getSymbol())) {
				board.printBoard();
				System.out.println(currentPlayer.getSymbol() + " gewinnt!");
return;				}currewnPlayer (currentPlayer == player1) ? player2: player1;

		} board.printBoard();
		System.out.println("Unterscheiden!");
		
	}
}
