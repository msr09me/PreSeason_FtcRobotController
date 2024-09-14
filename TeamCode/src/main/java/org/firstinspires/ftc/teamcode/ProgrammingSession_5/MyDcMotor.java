package org.firstinspires.ftc.teamcode.ProgrammingSession_5;

public class MyDcMotor {

    private double torqueConstant = 0.19;

    public double voltage;
    public double current;
    public double angularVelocity;
    public double efficiency;

    public double calculateEfficiency(double voltage, double current, double angularVelocity)
    {
        double inputPower = voltage * current;
        double torque = torqueConstant * current;
        double outputPower = torque * angularVelocity;
        double efficiency = (outputPower / inputPower) * 100;

        return efficiency;
    }
}