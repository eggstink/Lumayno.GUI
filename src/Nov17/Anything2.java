package Nov17;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anything2 extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    Anything2(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String year = tfYear.getText();
                int year1 = Integer.parseInt(year);
                boolean isLeapYear;
                isLeapYear = (year1%4==0);
                isLeapYear = isLeapYear && (year1%100!=0||year1%400==0);
                if(isLeapYear){
                    JOptionPane.showMessageDialog(null, "Leap year");
                    return;
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                    return;
                }

            }
        });
    }

    public static void main(String[] args) {
        Anything2 app = new Anything2();
        app.setContentPane(app.panel1);
        app.setSize(1000,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
