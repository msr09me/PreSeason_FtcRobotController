/*
    Ps6Ex2: We know that motor output power = torque * angular velocity

            During the last run, we got the following data

                Wheel   	  |      torque          |     Angular Velocity
              -------------------------------------------------------------------
                              |                      |
               LeftFront      |         10           |           4
                              |                      |
               LeftRear       |          4           |          1.5
                              |                      |
               RightFront     |          6           |           5
                              |                      |
               RightRear      |         15           |           3



            Part 1: Creating class

                    Task 1: Create a class "MyDcMotor2"

                    Task 2: Create fields "torque", "angularVelocity", and "outputPower"

                    Task 3: Create a method to calculate power using the above equation -

             Part 2:

                    Task 1: Create four object for four wheels using the class created in part 1

                    Task 2: Store above data into the fields

                    Task 3: Calculate the motor output power using the method created in part 1 task 3

                    Task 4: Print the result of task 3 in the terminal
 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_6;

public class Ps6Ex2 {

    // Part 1

    // Task 1: Creating class

    public static class MyDcMotor2
    {
        // Task 2: Creating fields

        public double torque = 0.0;
        public double angularVelocity = 0.0;
        public double outputPower = 0.0;

        // Task 3: Creating method

        public double calculateMotorOutputPower(double torque, double angularVelocity)
        {
            outputPower = torque * angularVelocity;

            return outputPower;
        }

    }




    public static void main(String[] args) {

        // Part 2

        // Task 1: Creating 4 objects for 4 wheels

        MyDcMotor2 leftFrontWheel = new MyDcMotor2();
        MyDcMotor2 leftRearWheel = new MyDcMotor2();
        MyDcMotor2 rightFrontWheel = new MyDcMotor2();
        MyDcMotor2 rightRearWheel = new MyDcMotor2();

        // Task 2: Storing data

        // Storing torque data

        leftFrontWheel.torque = 10;
        leftRearWheel.torque = 4;
        rightFrontWheel.torque = 6;
        rightRearWheel.torque = 15;

        // Storing angular velocity data

        leftFrontWheel.angularVelocity = 4;
        leftRearWheel.angularVelocity = 1.5;
        rightFrontWheel.angularVelocity = 5;
        rightRearWheel.angularVelocity = 3;

        // Task 3: Calculate motor output for 4 wheel

        leftFrontWheel.calculateMotorOutputPower(leftFrontWheel.torque, leftFrontWheel.angularVelocity);
        leftRearWheel.calculateMotorOutputPower(leftRearWheel.torque, leftRearWheel.angularVelocity);
        rightFrontWheel.calculateMotorOutputPower(rightFrontWheel.torque, rightFrontWheel.angularVelocity);
        rightRearWheel.calculateMotorOutputPower(rightRearWheel.torque, rightRearWheel.angularVelocity);

        // Task 4: Print the result in the terminal

        System.out.println(leftFrontWheel.outputPower);
        System.out.println(leftRearWheel.outputPower);
        System.out.println(rightFrontWheel.outputPower);
        System.out.println(rightRearWheel.outputPower);
    }
}
