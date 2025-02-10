import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int count = 0;
        
        for (int move : moves) {
            int column = move - 1;
            
            for (int row = 0; row < board.length; row++) {
                if (board[row] [column] != 0) {
                    int doll = board[row][column];
                    board[row][column] = 0;
                    
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        count += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        
        return count;
    }
}