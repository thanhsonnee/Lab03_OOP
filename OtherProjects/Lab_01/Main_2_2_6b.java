// import javax.swing.JOptionPane; 

// public class Main_2_2_6b{
//     public static void main(){
//         String x = JOptionPane.showInputDialog("Enter a1:");
//         double a1 = Double.parseDouble(x); // Chuyển chuỗi sang double
//         String y = JOptionPane.showInputDialog("Enter b1:"); 
//         double b1 = Double.parseDouble(y); 
//         String z = JOptionPane.showInputDialog("Enter c1:");
//         double c1 = Double.parseDouble(z); 
//         String t = JOptionPane.showInputDialog("Enter a2:"); 
//         double a2 = Double.parseDouble(t); 
//         String u = JOptionPane.showInputDialog("Enter b2:"); 
//         double b2 = Double.parseDouble(u); 
//         String v = JOptionPane.showInputDialog("Enter c2:"); 
//         double c2 = Double.parseDouble(v); 

//         if ()

//     }
// }

import javax.swing.JOptionPane;

public class Main_2_2_6b {
    public static void main(String[] args) {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));
        
        // Tính định thức của ma trận hệ số
        double D = a11 * a22 - a12 * a21;

        if (D != 0) {
            double x1 = (b1 * a22 - b2 * a12) / D;
            double x2 = (a11 * b2 - a21 * b1) / D;
            JOptionPane.showMessageDialog(null, "system of equations has a unique solution:\n" + "x1 = " + x1 + "\nx2 = " + x2);
        } else {
            // Kiểm tra định thức của ma trận con
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system of equations has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system of equations has no solution.");
            }
        }
    }
}
