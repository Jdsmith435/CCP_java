/*****************************************************
 * created by: Jo Phillips
 * email: joxphillips@gmail.com
 *  
 *
 ****************************************************/
package my.javaapplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Security 
{
private static Timer logoutTimer;
private int delay = 15000; //15 seconds in miliseconds
public Security single_instance;

public ActionListener logoutListener = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          LogoutTest loginTestForm = new LogoutTest();
        }
    };
    
    public Security()
    {
      System.out.println("hi");
        logoutTimer = new Timer(delay, logoutListener);
        logoutTimer.start();
    
    }
    
    public void resetTimer()
    {
      logoutTimer.restart();
    }
}

