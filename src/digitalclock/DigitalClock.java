package digitalclock;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {

    JLabel jlabClock;
    ClockThread ct;

    public DigitalClock(){
        jlabClock = new JLabel("Digital Clock");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jlabClock);
        setSize(1200, 1200);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);

    }

    public static void main(String[] args) {
        new DigitalClock();

    }



}
