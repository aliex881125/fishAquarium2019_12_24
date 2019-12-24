import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;

public class mainFrame extends JFrame {
    private Container cp;
    private JPanel jpn;
    private JPanel jpn1 = new JPanel(new GridLayout(1,3,1,1));
    private JButton add = new JButton("Add");
    private JButton aaa= new JButton("Aaa");
    private JButton exit= new JButton("Exit");
    private Image img =Toolkit.getDefaultToolkit().getImage("2f3236b28740657f0401ff2f550df6cf.jpg");
    private ArrayList<fish> fishList=new ArrayList<fish>();

    public mainFrame(){
        init();
    }
    public void init(){
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(1,1));
        jpn=new JPanel(){
            @Override
            public void paintComponent (Graphics g){
                super.paintComponents(g);
                g.drawImage(img, 0, 0, null);
                this.repaint();
            }
        };
        jpn.setLayout(null);
        cp.add(jpn, BorderLayout.CENTER);
        pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,693,476);
        this.setResizable(false);
        jpn1.add(add);
        jpn1.add(aaa);
        jpn1.add(exit);
        cp.add(jpn1, BorderLayout.SOUTH);



        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fish tmpFish =new fish();
                fishList.add(tmpFish);
                jpn.add(tmpFish);
                tmpFish.run();
            }
        });
         exit.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });


    }
}
