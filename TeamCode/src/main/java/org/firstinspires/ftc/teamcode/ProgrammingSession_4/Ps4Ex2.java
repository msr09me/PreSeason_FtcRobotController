/*
    Ps4Ex2: We know that,
                            wheel speed = distance / time
                            motor speed = wheel speed * gear ratio
                            motor angular velocity = motor speed * 0.1047

             Our robot travelled 235 inches in 8 seconds.

             The gear ratio for all of our wheel motor is 4.

             Task 1: Create necessary variables based on above information

             Task 2: Store the data into the variables created in task 1

             Task 3: Calculate motor angular velocity

             Task 4: Print the result of task 3 in the terminal
 */


package org.firstinspires.ftc.teamcode.ProgrammingSession_4;

public class Ps4Ex2 {

    public static void main(String[] args)
    {
        // Start your code below

        // Task 1

        double wheelSpeed;
        double distance;
        double time;
        double motorSpeed;
        double gearRatio;
        double motorAngularVelocity;

        // Task 2

        distance = 235;
        time = 8;
        gearRatio = 4;

        // Task 3

        wheelSpeed = distance / time;
        motorSpeed = wheelSpeed * gearRatio;
        motorAngularVelocity = motorSpeed * 0.1047;

        // Task 4

        System.out.println(motorAngularVelocity);

        // End your code above
    }
}
