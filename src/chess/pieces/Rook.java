package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.enums.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        if (getColor() == Color.WHITE) {
            return "♖";
        }

        if (getColor() == Color.BLACK) {
            return "♜";
        }

        return "R";
    }
}
