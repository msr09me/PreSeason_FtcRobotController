//Write a function to calculate the speed of an object when the distance and time in seconds is given
//You can name your function appropriatley 
//Call the function from the main 2 times with d=10, t=2 and d=100, t=3.2

package org.firstinspires.ftc.teamcode.ProgrammingSession_4;

public class PS4_Ex5 {

    // Create the function below
    static double calculateSpeed(double distance, double time)
    {
        double speed = distance / time;

        return speed;
    }


    public static void main(String[] args)
    {
        /*
        double d1 = 10;
        double t1 = 2;

        double d2 = 100;
        double t2 = 3;

        double speed1 = calculateSpeed(d1, t1);
        double speed2 = calculateSpeed(d2, t2);

        System.out.println("Speed 1: " + speed1);
        System.out.println("Speed 2: " + speed2);

         */

        /*

        double[] d = {10, 100};
        double[] t = {2, 3};

        double[] speeds = new double[2];
        speeds[0] = calculateSpeed(d[0],t[0]);
        speeds[1] = calculateSpeed(d[1],t[1]);

        System.out.println("Speed 1: " + speeds[0]);
        System.out.println("Speed 2: " + speeds[1]);

         */
    }
}