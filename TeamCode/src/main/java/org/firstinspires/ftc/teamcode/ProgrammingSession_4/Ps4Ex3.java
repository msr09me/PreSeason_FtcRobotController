/*
    Ps4Ex3: We know that,
                            wheel speed = distance / time
                            motor speed = wheel speed * gear ratio
                            motor angular velocity = motor speed * 0.1047

             We ran our robot again for 10 seconds. It travelled 135 inches.

             Because of efficient power distribution,
                we use different gear ratio in four wheel motors as following -

             Front left wheel motor = 4
             Front right wheel motor = 3.75
             Back left wheel motor = 4.05
             Back right wheel motor = 4.15

             Task 1: Create and initialize 4 variables to store gear ratio of 4 wheel motors

             Task 2: Create 4 variables for 4 wheel motor speed

             Task 3: Create 4 variables for 4 wheel motor angular velocity

             Task 4: Create and initialize 3 variables for wheel speed, distance, and time

             Task 5: Calculate motor angular velocity of 4 wheel motors

             Task 6: Print the result of task 5 in the terminal
 */


package org.firstinspires.ftc.teamcode.ProgrammingSession_4;

public class Ps4Ex3 {

    public static void main(String[] args)
    {
        // Start your code below

        // Task 1

        double grFrontLeft = 4;                     // gr = gear ratio
        double grFrontRight = 3.75;
        double grBackLeft = 4.05;
        double grBackRight = 4.15;

        // Task 2

        double motorSpeedFrontLeft;
        double motorSpeedFrontRight;
        double motorSpeedBackLeft;
        double motorSpeedBackRight;

        // Task 3

        double mavFrontLeft;                        // mav = motor angular velocity
        double mavFrontRight;
        double mavBackLeft;
        double mavBackRight;

        // Task 4

        double distance = 135;
        double time = 10;
        double wheelSpeed = distance / time;

        // Task 5

        motorSpeedFrontLeft = wheelSpeed * grFrontLeft;
        motorSpeedFrontRight = wheelSpeed * grFrontRight;
        motorSpeedBackLeft = wheelSpeed * grBackLeft;
        motorSpeedBackRight = wheelSpeed * grBackRight;

        mavFrontLeft = motorSpeedFrontLeft * 0.1047;
        mavFrontRight = motorSpeedFrontRight * 0.1047;
        mavBackLeft = motorSpeedBackLeft * 0.1047;
        mavBackRight = motorSpeedBackRight * 0.1047;

        // Task 6

        System.out.println("Front left motor angular velocity: " + mavFrontLeft);
        System.out.println("Front right motor angular velocity: " + mavFrontRight);
        System.out.println("Back left motor angular velocity: " + mavBackLeft);
        System.out.println("Back right motor angular velocity: " + mavBackRight);


        // End your code above
    }
}
