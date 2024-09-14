// MyDcMotor.java
package org.firstinspires.ftc.teamcode.ProgrammingSession_5;

public class MyDcMotor {
    private int power;

    // Constructor
    public MyDcMotor() {
        this.power = 0;  // Initialize with default power level
    }

    // Method to set power level
    public void setPower(int power) {
        this.power = power;
    }

    // Method to get power level
    public int getPower() {
        return this.power;
    }
}
