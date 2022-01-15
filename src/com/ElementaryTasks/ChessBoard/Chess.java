package com.ElementaryTasks.ChessBoard;

public class Chess {
    public int horizon;
    public int vertical;

    public Chess(int horizon, int vertical) {
        this.horizon = horizon;
        this.vertical = vertical;
    }

    public void chessBoardBuild() {
        if (vertical % 2 != 0) {
            boardLineTwo();
        }
        for (int i = 1; i <= vertical / 2; i += 1) {
            boardLineOne();
            boardLineTwo();
        }
    }

    private void boardLineOne() {
        for (int i = 1; i <= horizon; i += 1)
            System.out.print("*  ");
        System.out.println();
    }

    private void boardLineTwo() {
        for (int i = 1; i <= horizon; i += 1)
            System.out.print("  *");
        System.out.println();
    }
}
