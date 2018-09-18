import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

  public static void main(String[] args) {
    new Main();
  }

  public Main() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    frame.setAlwaysOnTop(true);
    frame.setUndecorated(true);
    frame.setBackground(new Color(1.0f, 1.0f, 1.0f, 0f));
    final JLabel label = new JLabel("MEGA");
    label.setFont(new Font("Serif", Font.BOLD, 33));
    label.setForeground(Color.BLUE);
    frame.add(label, BorderLayout.NORTH);
    final int[] count = {31};
    Timer timer = new Timer(1000, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        count[0]--;
        if (count[0] > 0) {
          label.setText(Integer.toString(count[0]));
        } else {
          ((Timer) (e.getSource())).stop();
        }
      }
    });
    timer.setInitialDelay(0);
    timer.start();

    final JLabel label1 = new JLabel("HEAVY");
    label1.setFont(new Font("Serif", Font.BOLD, 33));
    label1.setForeground(Color.RED);
    frame.add(label1, BorderLayout.SOUTH);
    final int[] count1 = {31};
    Timer timer1 = new Timer(1000, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        count1[0]--;
        if (count1[0] > 0) {
          label1.setText(Integer.toString(count1[0]));
        } else {
          ((Timer) (e.getSource())).stop();
        }
      }
    });
    timer1.setInitialDelay(0);
    timer1.start();

    frame.pack();
    frame.setVisible(true);
  }
}

class TestPane extends JPanel {
  JLabel label;
  Timer timer;
  int count;

  public TestPane() {
    setBackground(new Color(1.0f, 1.0f, 1.0f, 0.2f));
    label = new JLabel("MEGA");
    label.setFont(new Font("Serif", Font.PLAIN, 33));
    label.setForeground(Color.BLUE);
    setLayout(new GridBagLayout());
    add(label);
    count = 31;
    timer = new Timer(1000, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        count--;
        if (count > 0) {
          label.setText(Integer.toString(count));
        } else {
          ((Timer) (e.getSource())).stop();
        }
      }
    });
    timer.setInitialDelay(0);
    timer.start();
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(200, 200);
  }
}