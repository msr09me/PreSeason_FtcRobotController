/*
    Ps5Ex1: We know that motor input power = voltage * current.
            During the last run, the voltage was 11.9 V and current was 0.83 A

            Task 1: Create a function to calculate motor input power
            Task 2: Create and initialize variables to store above data
            Task 3: Calculate the motor input power using the function created in task 1
            Task 4: Print the result of task 3 in the terminal
 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_5;

public class Ps5Ex1 {
    public static double calculateMotorInputPower(double voltage, double current)
    {
        double power = voltage * current;

        return power;
    }

    public static void main(String[] args) {

        double voltage = 11.9;
        double current = 0.83;

        double motorInputPower = calculateMotorInputPower(voltage, current);

        System.out.println("Motor Input power: " + motorInputPower + " W");
    }
}
