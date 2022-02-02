import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

public class ExerciseTwo extends JFrame implements ActionListener {


    Rectangle rec = new Rectangle(90,100,200,100);
    AffineTransform transform = new AffineTransform();
   
    public ExerciseTwo(){
        JPanel topBoard = new JPanel(new BorderLayout());
        JButton rotates = new JButton("Rotates 15 Degree");



        rotates.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                paintComponent(getGraphics());
            }
        });
        add(topBoard,BorderLayout.NORTH);
        topBoard.add(rotates,BorderLayout.WEST);


        setTitle("Exercise Two");
        setSize(400,400);
        setVisible(true);
        setResizable(false);
        repaint();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics graphics){
        super.paintComponents(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.rotate((Math.toDegrees(15)), rec.getX() +
                rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2);
        transform.rotate(Math.toDegrees(15), rec.getX() +
                rec.getWidth() / 2, rec.getY() + rec.getHeight() / 2);
        Shape newRect = transform.createTransformedShape(rec);
        g2d.draw(newRect);


    }

    public static void main(String[] args) {
        new ExerciseTwo();
    }
   
}