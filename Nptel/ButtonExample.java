import java.awt .*;
import java. awt.event. *;
public class ButtonExample extends Frame {
public static void main (String[] args) {
ButtonExample frame = new ButtonExample () ;
Button b = new Button ("Programming in Java - 2024") ;
b. setBounds (30, 50, 80, 30) ;
frame. add (b) ;
frame.setSize (300, 200) ;
frame.setLayout (null) ;
frame. setVisible (true) ;
}
}