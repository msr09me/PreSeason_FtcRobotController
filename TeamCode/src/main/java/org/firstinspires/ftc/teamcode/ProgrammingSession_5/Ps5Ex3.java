/*
    Ps5Ex1: We know that for a motor,

                            input power = voltage * current

                            torque = torque constant * current

                            output power = torque * angular velocity

                            efficiency = (output power / input power) * 100

            We got the following data from our last run. Torque constant = 0.19

                  Voltage	  |       Current           |    Angular Velocity
              -------------------------------------------------------------------
                              |                         |
                    12.3      |         0.85            |          20.1
                              |                         |
                    12.1      |         0.81            |          18.4
                              |                         |
                    11.9      |         0.97            |          19.7

            Task 1: Create a function to calculate efficiency
            Task 2: Create and initialize variables to store above data
            Task 3: Calculate the efficiency using the function created in task 1
            Task 4: Print the result of task 3 in the terminal
 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_5;

public class Ps5Ex3 {
    public static double calculateEfficiency(double voltage, double current, double angularVelocity)
    {
        double torqueConstant = 0.19;
        double inputPower = voltage * current;
        double torque = torqueConstant * current;
        double outputPower = torque * angularVelocity;
        double efficiency = (outputPower / inputPower) * 100;

        return efficiency;
    }

    public static void main(String[] args) {

        double voltage1 = 12.3;
        double voltage2 = 12.1;
        double voltage3 = 11.9;

        double current1 = 0.85;
        double current2 = 0.81;
        double current3 = 0.97;

        double angularVelocity1 = 20.1;
        double angularVelocity2 = 15.8;
        double angularVelocity3 = 17.5;

        double efficiency1 = calculateEfficiency(voltage1, current1, angularVelocity1);
        double efficiency2 = calculateEfficiency(voltage2, current2, angularVelocity2);
        double efficiency3 = calculateEfficiency(voltage3, current3, angularVelocity3);

        System.out.println("Efficiency1: " + efficiency1);
        System.out.println("Efficiency2: " + efficiency2);
        System.out.println("Efficiency3: " + efficiency3);

    }
}