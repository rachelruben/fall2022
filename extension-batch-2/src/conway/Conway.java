package conway;

import support.cse131.NotYetImplementedException;

public class Conway {

	/**
	 * Constructs a new Conway board rows X columns in size with each cell's alive
	 * status false.
	 * 
	 * @param rows the number of rows
	 * @param cols the number of columns
	 */
	public Conway(int rows, int cols) {

		// FIXME
//		int[][] board = new int[rows][cols];
//		boolean isAlive = false;
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < cols; j++) {
//				if (isAlive == true) {
//					board[rows][cols]
//					return; 
//				}
//				
//			}
//		//for(int i = 0; i < )
		throw new NotYetImplementedException();
//
	}
	
	

	/**
	 * @return the number of rows
	 */
	public int getRows() {

		// FIXME
		return 0;
		//throw new NotYetImplementedException();

	}

	/**
	 * @return the number of columns
	 */
	public int getColumns() {

		// FIXME
		return 0;
		//throw new NotYetImplementedException();

	}

	/**
	 * Sets the current status of the cell at (row, col)
	 * 
	 * @param isAlive if true, the cell is alive; if false, the cell is dead
	 * @param row
	 * @param col
	 */
	public void setAlive(boolean isAlive, int row, int col) {

		// FIXME
		throw new NotYetImplementedException();

	}

	/**
	 * @param row
	 * @param col
	 * @return whether or not a cell at a specific row and column is alive.
	 *         If row or col is out of bounds, you must return false.
	 */
	public boolean isAlive(int row, int col) {

		// FIXME
		throw new NotYetImplementedException();

	}

	/**
	 * Make every cell not alive
	 */
	public void clear() {

		// FIXME
		throw new NotYetImplementedException();

	}

	/**
	 * Consider the 3x3 cell array that has the cell at (row, col) at its center.
	 * Let's call all cells but that center cell the neighbors of that center cell.
	 * This method returns the number of neighbors that are alive.
	 * 
	 * n n n
	 * n c n
	 * n n n
	 * 
	 * Above, if c represents the cell at (row, col), each n is
	 * a neighbor of c, according to the above definition.
	 * The result is at most 8 and at least 0.
	 * 
	 * @param row
	 * @param col
	 * @return the number of living neighbors
	 */
	public int countLivingNeighbors(int row, int col) {

		// FIXME
		int aliveNeighbors = 0;
		for(int i = row - 1; i <= row + 1; i++) {
			for(int j = col - 1; j <= col + 1; j++) {
				if(i == row && j == col) {
				}
				else if(this.isAlive(i, j)) {
					aliveNeighbors++;
				}
			}
		}
		return aliveNeighbors;
		//throw new NotYetImplementedException();

	}

	/**
	 * Executes a generation of life. Be sure to read the specification
	 * for this assignment, because it points out a common mistake students
	 * make when implementing this method.
	 * 
	 */
	public void step() {

		// FIXME
		throw new NotYetImplementedException();

	}
}