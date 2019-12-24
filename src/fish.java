import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class fish extends JLabel implements Runnable{
    private ImageIcon img[] = new ImageIcon[3];
    private ImageIcon icon= new ImageIcon("圖片1.png");
    private ImageIcon icon1= new ImageIcon("圖片2.png");
    private Timer t1;
    private Random rand = new Random();
    private int x,y;
    private boolean flag=true;

    public fish() {
        x=rand.nextInt(300);
        y=rand.nextInt(300);

        img[0] = new ImageIcon("LDNgGzXU7n_burned.png");
        Image img1 = img[0].getImage();
        Image image2 = img1.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        img[0].setImage(image2);
        Image img7 = icon1.getImage();
        Image image8 = img7.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        icon1.setImage(image8);
        img[1] = new ImageIcon("6276745494b3742e_burned.png");
        Image img3 = img[1].getImage();
        Image image4 = img3.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        img[1].setImage(image4);
        icon = new ImageIcon("圖片1.png");
        Image img5 = icon.getImage();
        Image image6 = img5.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        icon.setImage(image6);
        img[2] = new ImageIcon("鯨鯊.png");
        this.setIcon(img[rand.nextInt(3)]);
        this.setBounds(x,y, 500, 200);


        t1 = new Timer(50, new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               if(flag) {
                   if (x + 5 >= 600) {
                       flag = false;
                       img[1].setImage(icon.getImage());
                       img[0].setImage(icon1.getImage());
                   } else {
                       x += 5;
                   }
               }else {
                   if(x-5<0){
                       flag=true;
                       img[1].setImage(image4);
                       img[0].setImage(image2);
                   }else {
                       x-=5;
                   }
               }
             fish.this.setLocation(x,y);
           }
        });
     }
     public void run(){
       t1.start();
     }
}

