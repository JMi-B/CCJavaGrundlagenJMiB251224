package oop.thema1.grundlagen.tictactoe;

import java.util.Random;

public class ComputerPlayer extends AbstractPlayer {

	private Random random = new Random();

	// Konstruktor
	public ComputerPlayer(Symbol symbol, String name) {
		super(symbol, name); // Name und Symbol korrekt an die abstrakte Klasse weitergeben
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Symbol getSymbol() {
		return symbol;
	}

	@Override
	public boolean isHuman() {
		return false;
	}

	// todo:
	public void makeMove(Board board) {
			
			do {
				row random.nextInt(GameConfig.Board_SIZE);
				col random.nextInt(GameConfig.Board_SIZE);
				
			}while(!board.makeMove(row, col, symbol));
			
			System.out.println(name +"plaziert " +symbol +" auf("+ row + "," +col +")");
			
		}

	@Override
	public Symbol getSymbol(Symbol symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
