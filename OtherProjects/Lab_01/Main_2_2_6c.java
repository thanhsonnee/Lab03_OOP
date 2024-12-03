import javax.swing.JOptionPane;

public class Main_2_2_6c{
    public static void main(String[] args){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        if (a==0){
            double x = -c/b; 
            JOptionPane.showMessageDialog(null, "a must be different to 0"); 
            return; 
        }
        else if (a!=0){
            double delta = b*b - 4*a*c; 
            if (delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The system of equations has two distinct solutions:\n" + "x1 = " + x1 + "\nx2 = " + x2);
            } 
            else if (delta == 0){
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "system of equations with dual solutions:\n" + "x = " + x); 
            }
            else if (delta < 0){
                JOptionPane.showMessageDialog(null, "The system of equations has no solution."); 
            }
            
        }

    }
}

















