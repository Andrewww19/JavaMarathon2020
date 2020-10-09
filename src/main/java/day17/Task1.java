package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] arr = {ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK,
                ChessPiece.ROOK_BLACK};
        
        for(ChessPiece piece : arr) {
            System.out.print(piece.getSymbol() + " ");
        }
    }
}
