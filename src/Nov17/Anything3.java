package Nov17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anything3 extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JPanel calcPanel;
    private JLabel lblResult;

    public Anything3(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = tfNumber1.getText();
                double numb1 = Double.parseDouble(num1);
                String num2 = tfNumber2.getText();
                double numb2 = Double.parseDouble(num2);
                double divide = numb1 / numb2;
                double minus = numb1 - numb2;
                double multi = numb1 * numb2;
                double add = numb1 + numb2;

                if(cbOperations.getSelectedItem()=="+"){
                    String formSum = String.format("%.2f",add);
                    lblResult.setText(formSum);
                }else if(cbOperations.getSelectedItem()=="-"){
                    String formMin = String.format("%.2f",minus);
                    lblResult.setText(formMin);
                }else if(cbOperations.getSelectedItem()=="*"){
                    String formMulti = String.format("%.2f",multi);
                    lblResult.setText(formMulti);
                }else{
                    String formDivide = String.format("%.2f",divide);
                    lblResult.setText(formDivide);
                }
            }
        });
    }

    public static void main(String[] args) {
        Anything3 app = new Anything3();
        app.setContentPane(app.calcPanel);
        app.setSize(1000,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
