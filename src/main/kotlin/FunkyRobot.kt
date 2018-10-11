import edu.wpi.first.wpilibj.RobotBase
import edu.wpi.first.wpilibj.hal.HAL

// BASE TEMPLATE
class FunkyRobot : RobotBase() {

    override fun startCompetition() {

        // write initialization code here!

        HAL.observeUserProgramStarting()

        while (true) {

            // write control code here!

            m_ds.waitForData()
        }
    }
}