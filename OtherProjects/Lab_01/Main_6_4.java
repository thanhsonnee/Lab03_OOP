import javax.swing.JOptionPane;

public class Main_6_4 {
  public static void main(String[] args) {
    int k;

    do{
      JOptionPane.showMessageDialog(null, "Chon pt: \n 1. Pt bac 2 \n 2. Pt bac 1 \n 3. Pt bac 1 2 an \n 0. Out");

      String option = JOptionPane.showInputDialog(null, "Hay nhap lua chon:", "Lua chon cua ban", JOptionPane.INFORMATION_MESSAGE);
      int take = Integer.parseInt(option);
      k = take;

      switch (take) {
        case 1:
            pt_bac_2();
            break;
        case 2:
            pt_bac_1();
            break;
        case 3:
            pt_bac_1_2_an();
            break;
        case 0:
            System.out.println("OK!");
            break;
        default:
            System.out.println("Please try again");
    }
    }
    while(k != 0 );
    
  }
  
public static void pt_bac_2() {
  String num_a, num_b, num_c;
  JOptionPane.showMessageDialog(null, "Giai pt bac hai ax^2 + bx + c = 0");

  num_a = JOptionPane.showInputDialog(null, " Please input number a: ", "Input number a", JOptionPane.INFORMATION_MESSAGE);
  double a = Double.parseDouble(num_a);

  num_b = JOptionPane.showInputDialog(null, " Please input number b: ", "Input number b", JOptionPane.INFORMATION_MESSAGE);
  double b = Double.parseDouble(num_b);

  num_c = JOptionPane.showInputDialog(null, " Please input number b: ", "Input number c", JOptionPane.INFORMATION_MESSAGE);
  double c = Double.parseDouble(num_c);
  
  String res;

  double delta = b * b - 4 * a * c;
  if (delta > 0) {
      double x1 = (-b + Math.sqrt(delta)) / (2 * a);
      double x2 = (-b - Math.sqrt(delta)) / (2 * a);
      res = String.format("Pt co hai nghiem phan biet:\nx1 = %.2f\nx2 = %.2f", x1, x2);
  } else if (delta == 0) {
      double x = -b / (2 * a);
      res = String.format("Pt co nghiem kep: x = %.2f", x);
  } else {
      res = "Pt vo nghiem trong tap so thuc.";
  }
  
  JOptionPane.showMessageDialog(null, res, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
}

public static void pt_bac_1_2_an() {
  String a11_inp, a12_inp, b1_inp, a21_inp, a22_inp, b2_inp;
  JOptionPane.showMessageDialog(null, "Giai he pt bac 1 hai an:\na11x1 + a12x2 = b1\na21x1 + a22x2 = b2");

  a11_inp = JOptionPane.showInputDialog(null, "Enter a11:", "Nhap a11", JOptionPane.INFORMATION_MESSAGE);
  double a11 = Double.parseDouble(a11_inp);

  a12_inp = JOptionPane.showInputDialog(null, "Enter a12:", "Nhap a12", JOptionPane.INFORMATION_MESSAGE);
  double a12 = Double.parseDouble(a12_inp);

  b1_inp = JOptionPane.showInputDialog(null, "Enter b1:", "Nhap b1", JOptionPane.INFORMATION_MESSAGE);
  double b1 = Double.parseDouble(b1_inp);

  a21_inp = JOptionPane.showInputDialog(null, "Enter a21:", "Nhap a21", JOptionPane.INFORMATION_MESSAGE);
  double a21 = Double.parseDouble(a21_inp);

  a22_inp = JOptionPane.showInputDialog(null, "Enter a22:", "Nhap a22", JOptionPane.INFORMATION_MESSAGE);
  double a22 = Double.parseDouble(a22_inp);

  b2_inp = JOptionPane.showInputDialog(null, "Enter b2:", "Nhap b2", JOptionPane.INFORMATION_MESSAGE);
  double b2 = Double.parseDouble(b2_inp);

  double D = a11 * a22 - a21 * a12;
  double D1 = b1 * a22 - b2 * a12;
  double D2 = a11 * b2 - a21 * b1;

  String res;

  if (D == 0) {
      if (D1 == 0 && D2 == 0) {
          res = "He pt co vo so nghiem.";
      } else {
          res = "He pt vo nghiem.";
      }
  } else {
      double x1 = D1 / D;
      double x2 = D2 / D;
      res = String.format("Nghiem cua he pt la:\nx1 = %.2f\nx2 = %.2f", x1, x2);
  }

  JOptionPane.showMessageDialog(null, res, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
}


 public static void pt_bac_1() {
    String num_a, num_b;
    JOptionPane.showMessageDialog(null, "Giai phuong Trinh bac 1: ax + b = 0");

    num_a = JOptionPane.showInputDialog(null, "Enter a:", "Input", JOptionPane.INFORMATION_MESSAGE);
    double a = Double.parseDouble(num_a);

    num_b = JOptionPane.showInputDialog(null, "Enter b:", "Input", JOptionPane.INFORMATION_MESSAGE);
    double b = Double.parseDouble(num_b);
    
    String res;

    if (a == 0) {
        if (b == 0) {
            res = "Pt vo so nghiem.";
        } else {
            res = "Pt vo nghiem.";
        }
    } else {
        double x = -b / a;
        res = String.format("Nghiem pt: x = %.2f", x);
    }
    
    JOptionPane.showMessageDialog(null, res, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
}

}