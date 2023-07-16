
package za.ac.tut.ui;


import java.awt.Color;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame
{

    public MyFirstFrame() 
    {
        setTitle("Frame");
        setSize(200, 250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.red);
        setVisible(true);
    }
    
}
