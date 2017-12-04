package com.javabasics.robot;

public class MovingRobot {

    public static void main(String[] args) {
        moveRobot(new Robot(), -2, 6  );
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        //TODO: this could be done much easier!

        System.out.println("Where to move: \n" + toX + "; " + toY + "\n");

        int robotX = robot.getX();
        int robotY = robot.getY();

        //Calculate where to move by x scale.
        int stepsX = Math.abs(toX - robotX);
        //Calculate where to move by y scale.
        int stepsY = Math.abs(toY - robotY);


        //Get robot into the right direction for x scale

        Direction directionX = robot.getDirection();

        String rotateX;

        if(toX >= robotX) {
            if((toX >= 0 && robotX >= 0) || (toX >=0 && robotX < 0)) {
                rotateX = "R";
            }
            else {
                rotateX = "L";
            }
        }
        else {
            if((toX >= 0 && robotX <0) || (toX <0 && robotX < 0)) {
                rotateX = "R";
            }
            else {
                rotateX = "L";
            }

        }

        if (rotateX.equalsIgnoreCase("L")) { //spin it to the right
            switch (directionX) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case LEFT:
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
            }
        } else if(rotateX.equalsIgnoreCase("R")) {//spin it to the left
            switch (directionX) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    break;
            }
        }

        //Move robot by x scale
        for(int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }

        //Get robot into the right direction for y scale

        Direction directionY = robot.getDirection();

        String rotateY;

        if(toY >= robotY) {
            if((toY >= 0 && robotY >= 0) || (toY >=0 && robotY < 0)) {
                rotateY = "U";
            }
            else {
                rotateY = "D";
            }
        }
        else {
            if((toY >= 0 && robotY <0) || (toY <0 && robotY < 0)) {
                rotateY = "U";
            }
            else {
                rotateY = "D";
            }

        }



        if (rotateY.equalsIgnoreCase("D")) {
            switch (directionY) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
            }
        } else if (rotateY.equalsIgnoreCase("U")){
            switch (directionY) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
            }
        }

        //Move robot by y scale
        for(int i = 0; i < stepsY; i++) {
            robot.stepForward();
        }

        //Print the result
        System.out.println("We are here: \n" + robot.getX() + ";" + robot.getY());
    }
}
