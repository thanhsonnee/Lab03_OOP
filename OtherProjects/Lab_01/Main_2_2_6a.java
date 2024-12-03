import javax.swing.JOptionPane;

public class Main_2_2_6a{
    public static void main(String[] args){
        String input1 = JOptionPane.showInputDialog("Enter a:");
        double a = Double.parseDouble(input1); 
        String input2 = JOptionPane.showInputDialog("Enter b:"); 
        double b = Double.parseDouble(input2); 
        
        double x = -b/a;

        if (a == 0 && b ==0){
            JOptionPane.showMessageDialog(null, "system of equations with infinite solutions");
        }
        else if (a==0 && b != 0){
            JOptionPane.showMessageDialog(null, "system of equations with no solutions");
        }
        else if (a!= 0){
            JOptionPane.showMessageDialog(null, "system of equations has a unique solution: x = " + x);
        }
    }
}


















