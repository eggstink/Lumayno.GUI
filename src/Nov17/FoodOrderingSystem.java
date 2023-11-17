package Nov17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel foodPanel;
    private JLabel food;
    private JLabel discount;
    private JLabel php1;
    private JLabel php2;
    private JLabel php3;
    private JLabel php4;
    private JLabel php;
    private JLabel php5;

    public FoodOrderingSystem(){
       btnOrder.addActionListener(new ActionListener() {
           @Override

           public void actionPerformed(ActionEvent e) {
               double sum = 0;

               if(cPizza.isSelected()){
                   sum += 100;
               }
              if(cBurger.isSelected()){
                   sum+= 80;
               }
               if(cFries.isSelected()){
                   sum+=65;
               }
               if(cSoftDrinks.isSelected()){
                   sum+=55;
               }
               if (cTea.isSelected()) {
                   sum+=50;
               }
               if (cSundae.isSelected()) {
                   sum+=40;
               }

               if(rb5.isSelected()) {
                   sum = sum - sum*0.05;
               } else if (rb10.isSelected()) {

                   sum = sum - sum*0.1;
               } else if (rb15.isSelected()) {

                   sum = sum - sum*0.15;
               }
               String sumTotal = String.format("%.2f",sum);
               JOptionPane.showMessageDialog(null, "The total price is Php " + sumTotal);
           }
       });
   }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.foodPanel);
        app.setSize(1000,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
