// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class Shooter{
        public static final int s_Leftmoter = 15;
        public static final int s_Rightmoter = 16;
        public static final double s_RotationalSpeed = .5;
    }
    public static final class Drivetrain{
        public static final int d_rfmotor = 13;
        public static final int d_lfmotor = 11;
        public static final int d_rbmotor = 14;
        public static final int d_lbmotor= 12;
        
    }
}
