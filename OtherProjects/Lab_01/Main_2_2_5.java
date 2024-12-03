import javax.swing.JOptionPane;

public class Main_2_2_5 {
  public static void main(String[] args) { 
        String x = JOptionPane.showInputDialog("Enter the first number:");
        double fi_num = Double.parseDouble(x); // Chuyển chuỗi sang double

        String y = JOptionPane.showInputDialog("Enter the second number:");
        double se_num = Double.parseDouble(y);

        // Tính toán
        double sum = fi_num + se_num;
        double difference = fi_num - se_num;
        double product = fi_num * se_num;
        double quotient = (se_num != 0) ? fi_num / se_num : Double.NaN;

        // Hiển thị kết quả qua hộp thoại
        JOptionPane.showMessageDialog(null, "Sum: " + sum);
        JOptionPane.showMessageDialog(null, "Difference: " + difference);
        JOptionPane.showMessageDialog(null, "Product: " + product);
        if (se_num != 0) {
            JOptionPane.showMessageDialog(null, "Quotient: " + quotient);
        } else {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
        }
    }
}

    
 