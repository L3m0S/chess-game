package chess;

import boardGame.Board;

public class ChessMatch {

    private final Board board;

    public ChessMatch() {
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getColumns()];
        for (int row=0; row<board.getRows(); row++) {
            for (int column=0; column< board.getColumns();column++) {
                pieces[row][column] = (ChessPiece) board.getBoardPieceByPosition(row, column);
            }
        }
        return pieces;
    };
}
