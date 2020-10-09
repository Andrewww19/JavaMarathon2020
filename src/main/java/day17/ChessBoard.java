package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print() {
        for (ChessPiece row[] : board) {
            for (ChessPiece chessPiece : row) {
                System.out.print(chessPiece.getSymbol());
            }
            System.out.println();
        }
    }
}
