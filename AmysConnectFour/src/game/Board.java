package game;

import java.util.ArrayList;

public class Board {

	int[] board = new int[42];
	
	public Board() {
		for (int i = 0; i < board.length; i++) {
			board[i] = 0;
		}
	}

	/**
	 * 
	 * @param c - the circle to be inserted into the board
	 * @param index - number from  1-7
	 * @return
	 */
	public boolean insert(Player p, int index) {

		for (int i = (index*6)-1; i > (index*6)-7; i--) {
			if (board[i] == 0) {
				board[i] = p.colour;
				return true;
			}
		}
		return false;
	}
	
//	
//	public int returnHeightDifference() {
//		
//	}
	
	/**
	 * 
	 * @param index - index from 1-7 (the columns)
	 * @return
	 */ 
	public boolean wonHorizontal(Player p, int index) {
		
		int topMostIndex = 0;
		for (int i = (index*6)-1; i > (index*6)-7; i--) {
			if (board[i] != 0) {
				topMostIndex += 1;
			} else {
				break;
			}
		}
		//topmostindex = 4
		
		int[] temp = new int[7];		
		int counter = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[i] = board[(6-topMostIndex) + counter];
			counter += 6;
		}
		
		int subsequentValues = 0;
		for (int i = 0; i < temp.length; i++) {
			if (subsequentValues == 4) {
				return true;
			} else {
				if (temp[i] == p.colour) {
					subsequentValues++;
				} else {
					subsequentValues = 0;
				}
			}	
		}
		return false;	
	}
	
	public boolean wonVertical(Player p, int index) {
		int[] temp = new int[6];
		for (int i = 0; i < temp.length; i++) {
			int currentIndex = (index*6)-1-i;
			temp[i] = board[currentIndex];
		}
		
		int subsequentValues = 0;
		for (int i = 0; i < temp.length; i++) {
			if (subsequentValues == 4) {
				return true;
			} else {
				if (temp[i] == p.colour) {
					subsequentValues++;
				} else {
					subsequentValues = 0;
				}
			}	
		}
		return false;
	}
	
	public ArrayList<Integer> getBoard() {
		ArrayList<Integer> tempBoard = new ArrayList<Integer>();
		for (int i = 0; i < board.length; i++) {
			tempBoard.add(board[i]);
		}
		return tempBoard;
	}
	
	public String toString() {
		return getBoard().toString();
	}
	
	
	public static void main(String[] args) {
		Board board = new Board();
		Player player1 = new Player("Amy", 1);
		
		board.insert(player1, 1);
		board.insert(player1, 1);
		board.insert(player1, 1);
		board.insert(player1, 1);
		board.insert(player1, 1);
		board.insert(player1, 1);

		
		//will evaluate to false since there isn't a horizontal line beginning
		// from the topmost circle in the 1st column (at height 6)
		System.out.println(board.wonHorizontal(player1, 1));
		//will evaluate to true since there is a vertical line of 1s
		// in the first column
		System.out.println(board.wonVertical(player1, 1));
		
		
		
		
	}
}
