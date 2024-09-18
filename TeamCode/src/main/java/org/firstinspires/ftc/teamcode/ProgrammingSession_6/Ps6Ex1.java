/*
    Ps6Ex1: Voltage = 11.9 V and current = 0.83 A

        Part 1: Creating a class

                Task 1: Create a class "MyDcMotor"

                Task 2: Create fields "voltage", "current", "power"

                Task 3: Create a method to calculate power using the following equation -

                                input power = voltage * current

         Part 2: Using class

                 Task 1: Create an object "dcMotor1" using the class you created in part 1

                 Task 2: Store the above data into the fields of your class

                 Task 3: Calculate the power using the method you have in your class

                 Task 4: Print the result of task 3 in terminal
 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_6;

public class Ps6Ex1 {

    public static class MyDcMotor {

        // Fields

        public double voltage = 10.0;
        public double current = 0.0;
        public double power = 0.0;

        public double calculateInputPower(double voltage, double current)
        {
            power = voltage * current;

            return power;
        }
    }
    public static void main(String[] args)
    {
        // Part 2: Using a class

        // Task 1: Creating an object

        MyDcMotor dcMotor1 = new MyDcMotor();

        // Task 2: Storing data

        dcMotor1.voltage = 11.0;
        dcMotor1.current = 0.83;

        dcMotor1.calculateInputPower(dcMotor1.voltage, dcMotor1.current);

        System.out.println(dcMotor1.power);
    }
}


