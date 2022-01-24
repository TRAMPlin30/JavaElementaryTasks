package com.ElementaryTasks.AtOnlineLessons.MyPrototip;

public class Main {
    public static void main(String[] args) {

        Robot mainRobot = new Robot(5, "Verter", "X86");
        System.out.println(mainRobot);

//        Robot robot1 = new Robot(5, "Verter", "X86"); ///
//        Robot robot2 = new Robot(5, "Verter", "X86");
//        Robot robot3 = new Robot(5, "Verter", "X86");


//-----------------------создаем клонов робота "mainRobot"---------------------------------
        System.out.println("------------clones---------------------");

        Robot clone1 = (Robot) mainRobot.copy();
        System.out.println(clone1);

        Robot clone2 = (Robot) mainRobot.copy();
        System.out.println(clone2);

        Robot clone3 = (Robot) mainRobot.copy();
        System.out.println(clone3);


//        RobotFactory factory = new RobotFactory(mainRobot);
//
//        Robot clone1 = factory.cloneRobot();
//        System.out.println(clone1);
//
//        Robot clone2 = factory.cloneRobot();
//        System.out.println(clone2);




    }
}
