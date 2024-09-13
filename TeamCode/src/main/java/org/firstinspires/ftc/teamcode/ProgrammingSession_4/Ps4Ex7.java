/*
    Ps4Ex7: We know that Resistance = voltage / current.

            The voltage of our battery was 12.1 and our robot consumed 2.3 current.

            Task 1: Create a function to calculate the resistance

            Task 2: Create and initialize variable to store above data

            Task 3: Create a variable "resistance"

            Task 4: Use the function created in task 1 to calculate resistance and
                     store in the variable created in task 3

            Task 5: Print the result of task 4 in terminal

 */


package org.firstinspires.ftc.teamcode.ProgrammingSession_4;

public class Ps4Ex7 {

    // Create the function below for task 1

    static double calculate_resistance(double voltage, double current)
    {
        double resistance;

        resistance = voltage / current;

        return resistance;
    }

    public static void main(String[] args)
    {
        // Start your code below for task 2, 3, 4, and 5

        // Task 2

        double voltage = 12.1;
        double current = 2.3;

        // Task 3

        double resistance;

        // Task 4

        resistance = calculate_resistance(voltage, current);

        // Task 5

        System.out.println("Resistance: " + resistance);


        // End your code above
    }
}