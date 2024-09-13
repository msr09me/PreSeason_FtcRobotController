/*
    Ps4Ex9: Drive team gave us the following data about movement of our robot in last trial:

                  Direction	  |      Distance           |    	   Time
              -------------------------------------------------------------------
                              |                         |
                    Left      |         10              |           4
                              |                         |
                  Reverse     |          4              |          1.5
                              |                         |
                   Right      |          6              |           5
                              |                         |
                  Forward     |         15              |           3



              Task 1: Create a function to calculate the speed of our robot

              Task 2: Create and initialize 8 variables to store the above data

              Task 3: Create 4 variables to store the different speed of our robot for each movement

              Task 4: Calculate the speed for each movement using function created in task 1

              Task 5: Print the result in the terminal

 */


package org.firstinspires.ftc.teamcode.ProgrammingSession_4;

public class Ps4Ex9 {

    // Create your function below for task 1

    static double calculateSpeed(double distance, double time)
    {
        double speed = distance / time;

        return speed;
    }


    public static void main(String[] args)
    {
        // Start your code below for task 2, 3, 4, and 5

        // Task 2

        // Distance data

        double distanceLeft = 10;
        double distanceReverse = 4;
        double distanceRight = 6;
        double distanceForward = 15;

        // Time data

        double timeLeft = 4;
        double timeReverse = 1.5;
        double timeRight = 5;
        double timeForward = 3;

        // Task 3

        double speedLeft;
        double speedReverse;
        double speedRight;
        double speedForward;

        // Task 4

        speedLeft = calculateSpeed(distanceLeft, timeLeft);
        speedReverse = calculateSpeed(distanceReverse, timeReverse);
        speedRight = calculateSpeed(distanceRight, timeRight);
        speedForward = calculateSpeed(distanceForward, timeForward);

        // Task 5

        System.out.println("Speed left: " + speedLeft);
        System.out.println("Speed reverse: " + speedReverse);
        System.out.println("Speed right: " + speedRight);
        System.out.println("Speed forward: " + speedForward);


        // End your code above
    }
}