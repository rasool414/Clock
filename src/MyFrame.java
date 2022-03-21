import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;


public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String day;

    String time;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MY Clock Programme");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        //this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss: a");
        dayFormat = new SimpleDateFormat("E");


        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00C4FF));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,45));


        this.add(timeLabel);
        this.add(dayLabel);

        this.setVisible(true);

        setTime();
    }

    public void setTime(){
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
