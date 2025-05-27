package memorymatch;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.NotYetImplementedException;

public class MemoryMatchGame {
	private static final int X = 0;
	private static final int Y = 1;

	private static void defineWorldBoundaries() {
		// TODO: change values to a more convenient space if you so desire
		double xMin = 0.0;
		double xMax = 1.0;
		double yMin = 0.0;
		double yMax = 1.0;

		

		StdDraw.setXscale(xMin, xMax);
		StdDraw.setYscale(yMin, yMax);
	}

	private static double[] waitForMouseClick() {
		// wait for the mouse to be pressed
		while (!StdDraw.isMousePressed()) {
			StdDraw.pause(10);
		}
		// wait for the mouse to be released
		while (StdDraw.isMousePressed()) {
			StdDraw.pause(10);
		}
		// TODO: return the current mouse position
		double[] mouseClick = new double[2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; i < 2; j++) {
				mouseClick[i] = StdDraw.mouseX();
				mouseClick[j] = StdDraw.mouseY();
			}
		}
		return mouseClick;
		
			// Delete the line below and implement this method
			//throw new NotYetImplementedException();
		
	}

	private static int toRow(double[] xy) {
		double y = xy[Y];
		
			// Delete the line below and implement this method
		int row = 0;
		for(int i = 0; i < xy.length; i++) {
			if(y > 0 + i && y < 1 + i) {
				row = i;
			}
		}
		return row;
			//throw new NotYetImplementedException();
		
	}

	private static int toColumn(double[] xy) {
		double x = xy[X];
		
			// Delete the line below and implement this method
		int col = 0;
		for(int j = 0; j < xy.length; j++) {
			if(x > 0 + j && x < 1 + j) {
				col = j;
			}
		}
		return col;
			//throw new NotYetImplementedException();
		
	}

	private static int[] waitForClickOnRowColumn() {
		double[] xy = waitForMouseClick();
		int r = toRow(xy);
		int c = toColumn(xy);
		return new int[] { r, c };
	}

	private static void drawBoard(Color[][] board, boolean[][] mask) {
	// TODO
		StdDraw.clear();
		StdDraw.enableDoubleBuffering();
		double halfLength = 1.0 / (board.length * 2);
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				double curX = halfLength * (2 * i + 1);
				double curY = halfLength * (2 * j + 1);
				if(mask[i][j]) {
					StdDraw.setPenColor(Color.white);
				}
				else {
					StdDraw.setPenColor(board[i][j]);
				}
				StdDraw.filledSquare(curX, curY, halfLength);
				StdDraw.setPenColor(Color.black);
				StdDraw.square(curX, curY, halfLength);
			}
		}
		StdDraw.show();
	}

	

	private static boolean isGameStillAlive(int rounds) {
	// TODO
		if(rounds == 8) {
			return false;
		}
		else {
			return true;
		}
	}

	

	public static void playGame() {
		defineWorldBoundaries();
		Color[] palette = MemoryMatchBoard.getPalette();
		Color[][] board = MemoryMatchBoard.generateShuffled4x4Board(palette);
		
			// Delete the line below and implement this method
		int rounds = 0;
		int turns = 0;
		//drawBoard(board, mask[i][j]);
		
		while(isGameStillAlive(rounds) == true) {
			int[] cardOne = waitForClickOnRowColumn();
			StdDraw.setPenColor(Color.white);
			StdDraw.filledSquare(0.5 + cardOne[Y], 0.5 + cardOne[X], 0.4);
			StdDraw.setPenColor(board[cardOne[X]][cardOne[Y]]);
			StdDraw.filledCircle(0.5 + cardOne[Y], 0.5 + cardOne[X], 0.25);
			int[] cardTwo = waitForClickOnRowColumn();
			StdDraw.setPenColor(Color.white);
			StdDraw.filledSquare(0.5 + cardTwo[Y], 0.5 + cardTwo[X], 0.4);
			StdDraw.setPenColor(board[cardTwo[X]][cardTwo[Y]]);
			StdDraw.filledCircle(0.5 + cardTwo[Y], 0.5 + cardTwo[X], 0.25);
			
			if(board[cardOne[X]][cardOne[Y]] != board[cardTwo[X]][cardTwo[Y]]) {
				StdDraw.pause(500);
				StdDraw.setPenColor();
				StdDraw.filledSquare(0.5 + cardOne[Y], 0.5 + cardOne[X], 0.4);
				StdDraw.filledSquare(0.5 + cardTwo[Y], 0.5 + cardTwo[X], 0.4);
			}
			else {
				rounds++;
			}
			turns++;
		}
		StdDraw.setPenColor(Color.white);
		StdDraw.filledSquare(2, 2, 2);
		StdDraw.setPenColor();
		StdDraw.text(2, 2, "It took you " + turns + " turns");
			//throw new NotYetImplementedException();
		
	}

	public static void main(String[] args) {
		playGame();
	}

}
