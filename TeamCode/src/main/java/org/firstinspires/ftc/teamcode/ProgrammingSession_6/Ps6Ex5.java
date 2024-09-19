/*
    Ps6Ex5: We know that speed = distance / time. Our robot moved 8 ft in 3.5 seconds

            Part 1: Creating class

                    Task 1: Create a class "MyDcMotor5"

                    Task 2: Create three fields "speed", "distance", and "time

                    Task 3: Create a method to calculate speed

             Part 2: Using the class

                Task 1: Create an object from MyDcMotor5 class

                Task 2: Store the data into the field

                Task 3:  Use the method created in part 1 task 3 to calculate speed

                Task 4: Print the result of task 3 in terminal

 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_6;

public class Ps6Ex5 {

    // Part 1:

    // Task 1: Creating class

    public static class MyDcMotor5
    {
        // Task 2: Creating fields

        public double speed = 0.0;
        public double distance = 0.0;
        public double time = 0.0;

        // Task 3: Creating method to calculate speed

        public double calculateSpeed()
        {
            speed = distance / time;

            return speed;
        }
    }

    public static void main(String[] args) {

        // Part 2: Using class

        // Task 1: Creating an object

        MyDcMotor5 dcMotor1 = new MyDcMotor5();

        // Task 2: Storing data into the fields

        dcMotor1.distance = 8;
        dcMotor1.time = 3.5;

        // Task 3: Using calculateResistance method to calculate resistance

        dcMotor1.calculateSpeed();

        // Task 4: Printing result of task 3

        System.out.println(dcMotor1.speed);

    }
}
