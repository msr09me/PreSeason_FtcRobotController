/*
    Ps4Ex8: We know that speed = distance / time. Our robot moved 8 ft in 3.5 seconds

            Task 1: Create a function to calculate the speed

            Task 2: Create and initialize variable to store above data

            Task 3: Create a variable "speed"

            Task 4: Use the function created in task 1 to calculate speed and
                     store in the variable created in task 3

            Task 5: Print the result of task 4 in terminal

 */


package org.firstinspires.ftc.teamcode.ProgrammingSession_4;

public class Ps4Ex8 {

    // Create the function below for task 1

    static double calculateSpeed(double distance, double time)
    {
        double speed = distance / time;

        return speed;
    }


    public static void main(String[] args)
    {
        // Start your code below for task 2, 3, 4, and 5

        // Task 2

        double distance = 8;
        double time = 3.5;

        // Task 3

        double speed;

        // Task 4

        speed = calculateSpeed(distance, time);

        // Task 5

        System.out.println("Speed: " + speed);

        // End your code above
    }
}