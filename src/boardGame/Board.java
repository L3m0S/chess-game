package boardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece getBoardPieceByPosition(int row, int column) {
        Piece piece = pieces[row][column];
        return piece;
    }

    public Piece getBoardPieceByPosition(Position position) {
        Piece piece = pieces[position.getRow()][position.getColumn()];
        return piece;
    }
}
