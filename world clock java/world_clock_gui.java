import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import java.util.*;


class MouseListenerDemo
{
    static public void main(String [] rk)
    {
        JFrame f = new JFrame();
        f.setSize(1150, 760);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Location of Mouse", JLabel.CENTER);
        f.add(l, BorderLayout.NORTH);
        l.setFont(new Font("Comic Sans MS",   3, 36));

        JLabel jl = new JLabel(new ImageIcon("wm.jpg"));
        f.add(jl);
        f.getContentPane().setBackground(new Color(255,230,204));
        f.setResizable(false);
        class MyListener extends MouseAdapter
        {
            int x;
            int y;
            public void mouseMoved(MouseEvent m)
            {
                x = m.getX();
                y = m.getY();
                l.setText(x +", "+ y);
                if((x>= 750 && x <=810) && (y<=480 && y >= 400))   //India
                {
                    ZoneId z = ZoneId.of("Asia/Calcutta");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to India. Time is: "+ t);
                }
                else if((x>= 150 && x<=300)&&(y<=400 && y>=350)) // usa
                {

                    ZoneId z = ZoneId.of("US/Pacific");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to us. Time is: "+ t);

                }
                else if((x>= 900 && x<=1000)&&(y>=550 && y<=600)) //  Aus
                {

                    ZoneId z = ZoneId.of("Australia/Lindeman");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Australia. Time is: "+ t);
                }
                else if((x>= 800 && x<=900)&&(y>=370 && y<=420)) // China 800-900, 370-420
                {

                    ZoneId z = ZoneId.of("Asia/Shanghai");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to China. Time is: "+ t);
                }
                else if((x>= 100 && x<=240)&&(y>=230 && y<=330)) //  Canada
                {

                    ZoneId z = ZoneId.of("Canada/Pacific");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Canada. Time is: "+ t);
                }
                else if((x>= 310 && x<=430)&&(y>=510 && y<=620)) //  Brazil
                {

                    ZoneId z = ZoneId.of("Brazil/West");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Brazil. Time is: "+ t);
                }
                else if((x>= 350 && x<=460)&&(y>=80 && y<=270)) //  GreenLand
                {

                    ZoneId z = ZoneId.of("Atlantic/Jan_Mayen");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to GreenLand. Time is: "+ t);
                }
                else if((x>= 630 && x<=1100)&&(y>=200 && y<=335)) //  Russia
                {

                    ZoneId z = ZoneId.of("Asia/Irkutsk");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Russia. Time is: "+ t);
                }
                else if((x>= 490 && x<=680)&&(y>=420 && y<=620)) //  Africa
                {

                    ZoneId z = ZoneId.of("Africa/Luanda");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Africa. Time is: "+ t);
                }
                else if((x>= 190 && x<=230)&&(y>=420 && y<=460)) //  Mexico
                {

                    ZoneId z = ZoneId.of("Mexico/BajaNorte");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Mexico. Time is: "+ t);
                }
                else if((x>= 960 && x<=980)&&(y>=360 && y<=415)) //  Japan
                {

                    ZoneId z = ZoneId.of("Asia/Tokyo");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to Japan. Time is: "+ t);
                }



                else if((x>= 814 && x<=904)&&(y>=320 && y<=365)) //  mongolia
                {

                    ZoneId z = ZoneId.of("Asia/Hovd");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to mongolia. Time is: "+ t);
                }



                else if((x>= 684 && x<=806)&&(y>=320 && y<=370)) //  kazakhstan
                {

                    ZoneId z = ZoneId.of("Pacific/Auckland");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to kazakhstan. Time is: "+ t);
                }


                else if((x>=576  && x<= 606 )&&(y>=82 && y<=113)) //  norway
                {

                    ZoneId z = ZoneId.of("Arctic/Longyearbyen");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to norway. Time is: "+ t);
                }


                else if((x>=1018  && x<= 1134 )&&(y>= 390 && y<= 500)) //  pacific east
                {

                    ZoneId z = ZoneId.of("Pacific/Pitcairn");
                    LocalTime t = LocalTime.now(z);
                    l.setText("Welcome to pacific east. Time is: "+ t);
                }
            }
        }

        MyListener ml = new MyListener();
        f.addMouseMotionListener(ml);
        f.setVisible(true);
    }
}