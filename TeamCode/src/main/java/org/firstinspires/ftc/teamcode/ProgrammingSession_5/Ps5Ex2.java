/*
    Ps5Ex1: We know that motor output power = torque * angular velocity
            During the last run, when the torque was 10.9 N-m, angular velocity was 0.81 rad/s
                                 when the torque was 11.3 N-m, angular velocity was 0.87 rad/s

            Task 1: Create a function to calculate motor output power
            Task 2: Create and initialize variables to store above data
            Task 3: Calculate the motor output power using the function created in task 1
            Task 4: Print the result of task 3 in the terminal
 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_5;

public class Ps5Ex2 {
    public static double calculateMotorOutputPower(double torque, double angularVelocity)
    {
        double power = torque * angularVelocity;

        return power;
    }

    public static void main(String[] args) {

        double torque1 = 10.9;
        double angularVelocity1 = 0.81;

        double torque2 = 11.3;
        double angularVelocity2 = 0.87;

        double motorInputPower1 = calculateMotorOutputPower(torque1, angularVelocity1);
        double motorInputPower2 = calculateMotorOutputPower(torque2, angularVelocity2);

        System.out.println("Motor Input power 1: " + motorInputPower1);
        System.out.println("Motor Input power 2: " + motorInputPower2);

    }
}