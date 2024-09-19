/*
    Ps6Ex3: This exercise shows how to create and use a method to store data

            This exercise will use data from Ps6Ex2

            We will create the method to store data as Task 4 of the exercise Ps6Ex2 part 1

            We will use the method to store data in task 2 of the exercise Ps6Ex2 part 2
 */

package org.firstinspires.ftc.teamcode.ProgrammingSession_6;

public class Ps6Ex3 {

    // Part 1

    // Task 1: Creating class

    public static class MyDcMotor2
    {
        // Task 2: Creating fields

        public double torque = 0.0;
        public double angularVelocity = 0.0;
        public double outputPower = 0.0;

        // Task 3: Creating method

        public double calculateMotorOutputPower()
        {
            outputPower = torque * angularVelocity;

            return outputPower;
        }

        // Task 4: Creating a method to store data

        public void storeData(double torqueData, double angularVelocityData)
        {
            torque = torqueData;
            angularVelocity = angularVelocityData;
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

        leftFrontWheel.storeData(10, 4);
        leftRearWheel.storeData(4, 1.5);
        rightFrontWheel.storeData(6, 5);
        rightRearWheel.storeData(15, 3);

        // Task 3: Calculate motor output for 4 wheel

        leftFrontWheel.calculateMotorOutputPower();
        leftRearWheel.calculateMotorOutputPower();
        rightFrontWheel.calculateMotorOutputPower();
        rightRearWheel.calculateMotorOutputPower();

        // Task 4: Print the result in the terminal

        System.out.println(leftFrontWheel.outputPower);
        System.out.println(leftRearWheel.outputPower);
        System.out.println(rightFrontWheel.outputPower);
        System.out.println(rightRearWheel.outputPower);
    }
}