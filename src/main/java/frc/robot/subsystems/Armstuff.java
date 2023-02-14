// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Armstuff extends SubsystemBase {
  /** Creates a new Armstuff. */
  private final VictorSP M_TiltArm =  new VictorSP(Constants.ArmConstants.KTilt);
  Encoder tiltEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k2X);
  private final VictorSP M_ExstendArm = new VictorSP(Constants.ArmConstants.KExstend);
  Encoder extendEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k2X);
  public Armstuff() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}