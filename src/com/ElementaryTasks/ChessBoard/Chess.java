package com.ElementaryTasks.ChessBoard;

public class Chess {
    private int horizon;
    private int vertical;

    public Chess(int horizon, int vertical) {
        this.horizon = horizon;
        this.vertical = vertical;
    }

    public void chessBoard_All() {
        if (vertical % 2 != 0) {
            chessBoard_line_();
        }
        for (int i = 1; i <= vertical / 2; i += 1) {
            chessBoard_line();
            chessBoard_line_();
        }
    }

    private void chessBoard_line() {
        for (int i = 1; i <= horizon; i += 1)
            System.out.print("*  ");
        System.out.println();
    }

    private void chessBoard_line_() {
        for (int i = 1; i <= horizon; i += 1)
            System.out.print("  *");
        System.out.println();
    }
}
