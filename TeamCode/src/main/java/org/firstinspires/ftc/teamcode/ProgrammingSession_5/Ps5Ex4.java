package org.firstinspires.ftc.teamcode.ProgrammingSession_5;

import org.firstinspires.ftc.teamcode.ProgrammingSession_5.MyDcMotor;

public class Ps5Ex4 {
    public static void main(String[] args) {

        MyDcMotor leftFront = new MyDcMotor();

        leftFront.voltage = 12.3;
        leftFront.current = 0.85;
        leftFront.angularVelocity = 20.1;

        leftFront.efficiency = leftFront.calculateEfficiency(
                leftFront.voltage, leftFront.current, leftFront.angularVelocity);


        System.out.println(leftFront.efficiency);

    }
}
