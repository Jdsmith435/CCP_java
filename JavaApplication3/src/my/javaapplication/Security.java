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
private int delay = 900000; //15 minutes in miliseconds
public static  Security single_instance;

private ActionListener logoutListener = new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          LogoutTest loginTestForm = new LogoutTest();
        }
    };
    
    private Security()
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
      logoutTimer.restart();
    }
    private class LogoutTest
    {
     LogoutTest() 
     {
        JFrame f = new JFrame();
        JButton loginButton =new JButton("login");
        loginButton.setBounds(130,100,100, 40);

        f.add(loginButton);
        f.setVisible(true);
     }
    }
    { 
    // static block to initialize instance 
    single_instance = new Security();
    }
}

