import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton[] addButton, sButton,mulButton, divButton;
    JButton[] decButton, equButton, delButton, clrButtn;

    Font myFont = new Font("Ink Free", Font.BOLD,30);
    double num1=0, num2=0, result=0;
    char operator;


    Calculator(){
        
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

    }
}