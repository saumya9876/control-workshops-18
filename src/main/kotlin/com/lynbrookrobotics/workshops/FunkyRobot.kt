package com.lynbrookrobotics.workshops

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.RobotBase
import edu.wpi.first.wpilibj.Solenoid
import edu.wpi.first.wpilibj.hal.HAL

// WEEK ONE
class FunkyRobot : RobotBase() {

    override fun startCompetition() {

        // initialization code:

        val pivot = Solenoid(1)
        val clamp = Solenoid(2)

        val joystick = Joystick(0)
        val frontTriggerRawButtonId = 1
        val thumbTriggerRawButtonId = 2

        HAL.observeUserProgramStarting()

        while (true) {

            // write control code here!

            // use the `set` method to open or close a solenoid valve
            // use the `getRawButton` method to check if a joystick button is pressed

            m_ds.waitForData()
        }
    }
}