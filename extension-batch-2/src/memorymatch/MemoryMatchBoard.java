package memorymatch;

import java.awt.Color;

import support.cse131.NotYetImplementedException;

public class MemoryMatchBoard {
	/**
	 * @return an array of 8 discernible colors
	 */
	public static Color[] getPalette() {
		// http://mkweb.bcgsc.ca/colorblind/img/colorblindness.palettes.v11.pdf
		Color[] palette = new Color[] {
				new Color(0, 0, 0),
				new Color(34, 113, 178),
				new Color(61, 183, 233),
				new Color(247, 72, 165),
				new Color(53, 155, 115),
				new Color(213, 94, 0),
				new Color(230, 159, 0),
				new Color(240, 228, 66)
		};
		return palette;
	}

	/**
	 * Swaps the colors located at board[aRow][aCol] and board[bRow][bCol].
	 * 
	 * Note: this mutates (changes) the contents of the specified board.
	 * 
	 * @param board the 2D array of colors
	 */
	public static void swapCells(Color[][] board, int aRow, int aCol, int bRow, int bCol) {
		
			// TODO
		Color temp = board[aRow][aCol];
		board[aRow][aCol] = board[bRow][bCol];
		board[bRow][bCol] = temp;
	}

	

	/**
	 * Rearranges the colors in the specified board until they are in a reasonably
	 * random arrangement.
	 * 
	 * Note: this mutates (changes) the contents of the specified board.
	 * 
	 * @param board the 2D array of colors to shuffle
	 */
	public static void shuffle(Color[][] board) {
		
			// TODO
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				int i1 = (int)(Math.random() * board.length);
				int j1 = (int)(Math.random() * board.length);
				Color temp = board[i][j];
				board[i][j] = board[i1][j1];
				board[i1][j1] = temp;
			}
			System.out.println();
		}
	}

	/**
	 * @param palette an array of 8 Colors
	 * @return shuffled 4x4 2D array of Colors suitable for a memory match game
	 */
	public static Color[][] generateShuffled4x4Board(Color[] palette) {
		
			// Delete the line below and implement this method
		Color[][] board = new Color[4][4];
		int paletteFillIn = 0; //fill in the empty board with colors in the palette one at a time
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(paletteFillIn >= palette.length) {
					paletteFillIn -= palette.length;
				}
				board[i][j] = palette[paletteFillIn];
				paletteFillIn += 1;
			}
		}
		shuffle(board);
		return board; 
	
			//throw new NotYetImplementedException();
	}
}
