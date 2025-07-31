import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class Error{
  public static void main(String[] args){
    Toolkit.getDefaultToolkit().beep;
    JOptionPane.showMessageDialog(null, "Critical security error", "Error", JOptionPane.ERROR_MESSAGE);
  }
}
