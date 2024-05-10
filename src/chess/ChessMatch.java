package chess;

import boardgame.Board;

public class ChessMatch {
    
    private Board board;

    //Instancia, na classe Board, a quantidade de linhas e colunas que irá ter no jogo:
    public ChessMatch(){
        board = new Board(8, 8);
    }

    // método que retorna uam matriz de peças do tipo ChessPiece. Esse método serve para 
    //fazer um downcasting para transformar as pieces em ChessPiece
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
