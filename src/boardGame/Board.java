package boardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column!");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece getBoardPieceByPosition(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not valid!");
        }
        Piece piece = pieces[row][column];
        return piece;
    }

    public Piece getBoardPieceByPosition(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not valid!");
        }
        Piece piece = pieces[position.getRow()][position.getColumn()];
        return piece;
    }

    public void placePiece(Piece piece, Position position) {
        if (positionOccupiedByPiece(position)) {
            throw new BoardException(STR."There is already a piece on position \{position}");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column) {
        return (row >= 0 && row < rows) && (column >= 0 && column < columns);
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean positionOccupiedByPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not valid!");
        }
        return getBoardPieceByPosition(position) != null;
    }
}
