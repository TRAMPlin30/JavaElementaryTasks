package com.ElementaryTasks.ChessBoard;

public class Main {

    public static int horizon, vertical;

    public static void main(String[] args) {

        runToBuild();

        Chess chess = new Chess(horizon, vertical);
        chess.chessBoardBuild();
    }

    public static void runToBuild() {
        UserInteraction userInteraction = new UserInteraction();
        userInteraction.printInstruction();
        System.out.print("Enter width: ");
        horizon = userInteraction.enterParameters();
        System.out.print("Enter height: ");
        vertical = userInteraction.enterParameters();
    }

}
