package com.softncon.ACM_BasicMath;

public class basicMath {
    public static void main(String[] args) {
        /* Pi Number */
        System.out.println(Math.PI);
        /* Euler Number */
        System.out.println(Math.E);
        /* TAU = 2*PI */
        System.out.println(Math.TAU);

        /* Square Root of 13 */
        System.out.println(Math.sqrt(13));
        /* Square of 13 */
        System.out.println(Math.pow(13,2 ));
        /* Floor 12.4 */
        System.out.println(Math.floor(12.4));
        /* Floor 12.4 */
        System.out.println(Math.ceil(12.4));
        /* Round 13.2 */
        System.out.println(Math.round(13.2));
        /* Round 13.9 */
        System.out.println(Math.round(13.5));
        /* Trigonometric operations:
        * Problem Statement: ABC is a right triangle as length AB = 12 BC = 5
        * What is the angle A and angle C in degrees? */
        double AB = 12;
        double BC = 5;
        /* Hypotenus of two number */
        double AC = Math.hypot(AB,BC);
        System.out.println("Hypotenuse AC is: " + AC);
        /* Calculate Sine value of Angle A*/
        double sinA = BC/AC;
        //Calculate Radian Value of angle A
        double radA = Math.asin(sinA);
        //Calculate Degree Value of angle A
        double degA = Math.toDegrees(radA);
        System.out.println("The sine value of angle A is: "+ sinA);
        System.out.println("The radian value of angle A is: "+ radA);
        System.out.println("The degree value of angle A is: "+ degA);
        //Tangent Value of angle C is
        double tanC = AB/BC;
        //Calculate Radian Value of Angle C
        double radC = Math.atan(tanC);
        //Calculate Degree Value of Angle C
        double degC = Math.toDegrees(radC);
        System.out.println("The tan value of angle A is: "+ tanC);
        System.out.println("The radian value of angle A is: "+ radC);
        System.out.println("The degree value of angle A is: "+ degC);
        double sumOfAngles = degC + degA;
        System.out.println(sumOfAngles);
        // A cube has 24756 mm3 volume, what is the lenght of one side
        float vol = 24756;
        double side = Math.cbrt(vol);
        System.out.println("The length of the side of "+vol+"mm3 cube is "+side);
        // pH value of 0.002M HCI is
        // [H+] ions concentration is 2x10^-3
        double concenH = 0.002;
        double pH = Math.log10(concenH) *-1;
        System.out.println("The pH Value of "+ concenH +" Molar HCl is " + pH);
        //More appropriate formating is
        System.out.format("The pH Value of %.3f Molar HCl is %.2f%n", concenH, pH);

    }
}
