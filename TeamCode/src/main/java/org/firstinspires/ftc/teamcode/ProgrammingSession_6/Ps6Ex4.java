/*
    Ps6Ex4: We know that Resistance = voltage / current.

            The voltage of our battery was 12.1 and our robot consumed 2.3 current.

            Part 1: Creating class

                    Task 1: Create a class "MyDcMotor3"

                    Task 2: Create three fields "voltage", "current", and "resistance"

                    Task 3: Create a method to calculate resistance

             Part 2: Using the class

                Task 1: Create an object from MyDcMotor3 class

                Task 2: Store the data into the field

                Task 3:  Use the method created in part 1 task 3 to calculate resistance

                Task 4: Print the result of task 3 in terminal

 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_6;

public class Ps6Ex4 {

    // Part 1:

    // Task 1: Creating class

    public static class MyDcMotor3
    {
        // Task 2: Creating fields

        public double voltage = 0.0;
        public double current = 0.0;
        public double resistance = 0.0;

        // Task 3: Creating method to calculate resistance

        public double calculate_resistance()
        {
            resistance = voltage / current;

            return resistance;
        }
    }

    public static void main(String[] args) {

        // Part 2: Using class

        // Task 1: Creating an object

        MyDcMotor3 dcMotor1 = new MyDcMotor3();

        // Task 2: Storing data into the fields

        dcMotor1.voltage = 12.1;
        dcMotor1.current = 2.3;

        // Task 3: Using calculateResistance method to calculate resistance

        dcMotor1.calculate_resistance();

        // Task 4: Printing result of task 3

        System.out.println(dcMotor1.resistance);

    }
}
