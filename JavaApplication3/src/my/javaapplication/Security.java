package my.javaapplication;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*****************************************************
 * created by: Jo Phillips
 * email: joxphillips@gmail.com
 *  
 *
 ****************************************************/
public class Security 
{
private Timer logoutTimer;
private int delay = 900000; //15 minutes in miliseconds
private ActionListener logoutListener = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

        }


    };
    
    public Security()
    {
        logoutTimer = new Timer(delay, logoutListener);
        logoutTimer.start();
    
    }
    
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
    }
    public static void resetTimer()
    {

    }
}

