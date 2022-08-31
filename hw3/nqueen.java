package hw3;

public class nqueen {
    static int size = 8;
    static int num = 8;
    static int chessBoard[][] = new int[size][size];
    public static void main(String[] args) {
        settleQueen(0);
        print();
    }
    public static boolean check(int x, int y) {
        for (int i = 0; i < y; i++) {
            if (chessBoard[x][i] == 1) {
                return false;
            }
            if (x - 1 - i >= 0 && chessBoard[x - 1 - i][y - 1 - i] == 1) {
                return false;
            }
            if (x + 1 + i < size && chessBoard[x + 1 + i][y - 1 - i] == 1) {
                return false;
            }
        }
        return true;
    }
    public static boolean settleQueen(int n) {
        if (n == num) {
            return true;
        }
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[j][n] = 0;
            }
            if (check(i, n)) {
                chessBoard[i][n] = 1;
                if (settleQueen(n + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void print() {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}