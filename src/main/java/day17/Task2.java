package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] board = new ChessPiece[8][8];
        ChessBoard chessBoard = new ChessBoard(board);

        board[0][0] = ChessPiece.ROOK_BLACK;
        board[0][1] = ChessPiece.EMPTY;
        board[0][2] = ChessPiece.EMPTY;
        board[0][3] = ChessPiece.EMPTY;
        board[0][4] = ChessPiece.EMPTY;
        board[0][5] = ChessPiece.ROOK_BLACK;
        board[0][6] = ChessPiece.KING_BLACK;
        board[0][7] = ChessPiece.EMPTY;
        board[1][0] = ChessPiece.EMPTY;
        board[1][1] = ChessPiece.ROOK_WHITE;
        board[1][2] = ChessPiece.EMPTY;
        board[1][3] = ChessPiece.EMPTY;
        board[1][4] = ChessPiece.PAWN_BLACK;
        board[1][5] = ChessPiece.PAWN_BLACK;
        board[1][6] = ChessPiece.EMPTY;
        board[1][7] = ChessPiece.PAWN_BLACK;
        board[2][0] = ChessPiece.PAWN_BLACK;
        board[2][1] = ChessPiece.EMPTY;
        board[2][2] = ChessPiece.KNIGHT_BLACK;
        board[2][3] = ChessPiece.EMPTY;
        board[2][4] = ChessPiece.EMPTY;
        board[2][5] = ChessPiece.EMPTY;
        board[2][6] = ChessPiece.PAWN_BLACK;
        board[2][7] = ChessPiece.EMPTY;
        board[3][0] = ChessPiece.QUEEN_BLACK;
        board[3][1] = ChessPiece.EMPTY;
        board[3][2] = ChessPiece.EMPTY;
        board[3][3] = ChessPiece.BISHOP_WHITE;
        board[3][4] = ChessPiece.EMPTY;
        board[3][5] = ChessPiece.EMPTY;
        board[3][6] = ChessPiece.EMPTY;
        board[3][7] = ChessPiece.EMPTY;
        board[4][0] = ChessPiece.EMPTY;
        board[4][1] = ChessPiece.EMPTY;
        board[4][2] = ChessPiece.EMPTY;
        board[4][3] = ChessPiece.BISHOP_BLACK;
        board[4][4] = ChessPiece.PAWN_WHITE;
        board[4][5] = ChessPiece.EMPTY;
        board[4][6] = ChessPiece.EMPTY;
        board[4][7] = ChessPiece.EMPTY;
        board[5][0] = ChessPiece.EMPTY;
        board[5][1] = ChessPiece.EMPTY;
        board[5][2] = ChessPiece.EMPTY;
        board[5][3] = ChessPiece.EMPTY;
        board[5][4] = ChessPiece.BISHOP_WHITE;
        board[5][5] = ChessPiece.PAWN_WHITE;
        board[5][6] = ChessPiece.EMPTY;
        board[5][7] = ChessPiece.EMPTY;
        board[6][0] = ChessPiece.PAWN_WHITE;
        board[6][1] = ChessPiece.EMPTY;
        board[6][2] = ChessPiece.EMPTY;
        board[6][3] = ChessPiece.QUEEN_WHITE;
        board[6][4] = ChessPiece.EMPTY;
        board[6][5] = ChessPiece.PAWN_WHITE;
        board[6][6] = ChessPiece.EMPTY;
        board[6][7] = ChessPiece.PAWN_WHITE;
        board[7][0] = ChessPiece.EMPTY;
        board[7][1] = ChessPiece.EMPTY;
        board[7][2] = ChessPiece.EMPTY;
        board[7][3] = ChessPiece.EMPTY;
        board[7][4] = ChessPiece.EMPTY;
        board[7][5] = ChessPiece.ROOK_WHITE;
        board[7][6] = ChessPiece.KING_WHITE;
        board[7][7] = ChessPiece.EMPTY;

        chessBoard.print();
    }
}
