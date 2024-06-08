import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;
import chess.enums.Color;
import chess.pieces.King;
import chess.pieces.Rook;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Position position = new Position(3, 5);
        System.out.println(position.toString());

        Board board = new Board(8,8);

        ChessMatch chessMatch = new ChessMatch();
        BoardUi.printBoard(chessMatch.getPieces());

        System.out.println(new King(board, Color.WHITE).toString());

    }
}