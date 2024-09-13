/*
    Ps4Ex5: Our data collection team gave us the following data:

                  Motors	  |      Gear Ratio         |    	Torque Constant
              -------------------------------------------------------------------
                              |                         |
                Left Front    |         4.1             |           0.2
                              |                         |
                Left Back     |         4.05            |           0.18
                              |                         |
                Right Front   |         3.75            |           0.21
                              |                         |
                Right Back    |         4.15            |           0.17


            We also learn the following equations:

                        motor speed = wheel speed * gear ratio
                        motor angular velocity = motor speed * 0.1047
                        motor torque = torque constant * current
                        motor power = motor torque * motor angular velocity

            During the data collection, the wheel speed was 3 and current was 1.3

            Task 1: Create and initialize variables to store the above table's data

            Task 2: Create and initialize 2 variables to store the wheel speed and current data

            Task 3: Create 16 variables for motor speed, motor angular velocity, motor torque and
                    motor power for 4 wheel motors

            Task 4: Calculate motor power for all 4 motors

            Task 5: Print the motor power of each motor in the terminal

 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_4;

public class Ps4Ex5 {

    public static void main(String[] args)
    {
        // Start your code below

        // Task 1

        double gearRatioLF = 4.1;                       // LF = Left front
        double gearRatioLB = 4.05;                      // LB = Left back
        double gearRatioRF = 3.75;                      // RF = Right front
        double gearRatioRB = 4.15;                      // RB = Right back

        double torqueConstantLF = 0.2;
        double torqueConstantLB = 0.18;
        double torqueConstantRF = 0.21;
        double torqueConstantRB = 0.17;

        // Task 2

        double wheelSpeed = 3.0;
        double current = 1.3;

        // Task 3

        double motorSpeedLF;
        double motorSpeedLB;
        double motorSpeedRF;
        double motorSpeedRB;

        double motorAngularVelocityLF;
        double motorAngularVelocityLB;
        double motorAngularVelocityRF;
        double motorAngularVelocityRB;

        double motorTorqueLF;
        double motorTorqueLB;
        double motorTorqueRF;
        double motorTorqueRB;

        double motorPowerLF;
        double motorPowerLB;
        double motorPowerRF;
        double motorPowerRB;

        // Task 4

        // Calculating motor power for Left Front motor

        motorSpeedLF = wheelSpeed * gearRatioLF;
        motorAngularVelocityLF = motorSpeedLF * 0.1047;
        motorTorqueLF = torqueConstantLF * current;
        motorPowerLF = motorTorqueLF * motorAngularVelocityLF;

        // Calculating motor power for Left bACK motor

        motorSpeedLB = wheelSpeed * gearRatioLB;
        motorAngularVelocityLB = motorSpeedLB * 0.1047;
        motorTorqueLB = torqueConstantLB * current;
        motorPowerLB = motorTorqueLB * motorAngularVelocityLB;

        // Calculating motor power for Right Front motor

        motorSpeedRF = wheelSpeed * gearRatioRF;
        motorAngularVelocityRF = motorSpeedRF * 0.1047;
        motorTorqueRF = torqueConstantRF * current;
        motorPowerRF = motorTorqueRF * motorAngularVelocityRF;

        // Calculating motor power for Right Back motor

        motorSpeedRB = wheelSpeed * gearRatioRB;
        motorAngularVelocityRB = motorSpeedRB * 0.1047;
        motorTorqueRB = torqueConstantRB * current;
        motorPowerRB = motorTorqueRB * motorAngularVelocityRB;

        // Task 5

        System.out.println("Left front motor power: " + motorPowerLF);
        System.out.println("Left back motor power: " + motorPowerLB);
        System.out.println("Right front motor power: " + motorPowerRF);
        System.out.println("Right back motor power: " + motorPowerRB);

        // End your code above
    }
}
