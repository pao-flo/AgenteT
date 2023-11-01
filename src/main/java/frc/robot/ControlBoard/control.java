package frc.robot.ControlBoard;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants;

public class control {
    //hardware
    XboxController driver;
    XboxController mecanisms;
    double tolerance;


    public control(){
        driver = new XboxController(Constants.kChassisPort);
        mecanisms = new XboxController(Constants.kMecanism);
        tolerance = Constants.kStickTolerance;
    }
    //--------------funciones-----------//
    public double left_x_stick_driver(){
        double xValue = driver.getRawAxis(1);
        if (Math.abs(xValue)<tolerance){
            xValue = 0;
        }
        return xValue;
    }
    public double left_y_stick_driver(){
        double yValue = driver.getRawAxis(0);
        if (Math.abs(yValue)<tolerance){
            yValue = 0;
        }
        return yValue;
    }
    
    public double right_x_stick_driver(){
        double xValue = driver.getRawAxis(3);
        if (Math.abs(xValue)<tolerance){
            xValue = 0;
        }
        return xValue;
    }
    public boolean driver_A_button(){
        return driver.getAButton();
    }
    public boolean driver_B_button(){
        return driver.getBButton();
    }
}
