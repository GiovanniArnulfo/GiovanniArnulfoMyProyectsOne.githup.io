import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
public class Grid extends JFrame implements ActionListener{
  private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
  private JLabel tag;
    
    public Grid( ){
      setLayout(null);  

      // before to create the button you must create a imageIcon objects whigh are used by JButton`s constructor


      ImageIcon imabutton1 = new ImageIcon("cat.jpg");
      ImageIcon imabutton2 = new ImageIcon("walum.jpg" , "sadf");
      ImageIcon imabutton4 = new ImageIcon("b1.gif");

     //  ImageIcon imabutton4 = new ImageIcon("b1.gif", "button"); 
         ImageIcon imabuttonx = new ImageIcon("cat.jpg", "df");
     //      ImageIcon imabuttonx = new ImageIcon("button");


      tag= new JLabel("Waiting boutton selected...");
      tag.setBounds(10,0,200,30);
      add(tag);
     
      
      b1= new JButton(imabutton1); 
      b1= new JButton(imabuttonx); 
      b1.setBounds(10,30,50,50); 
      add(b1);
      b1.addActionListener(this);
  
      b2= new JButton(imabutton2);
      b2.setBounds(60,30,50,50);
      add(b2);
      b2.addActionListener(this); 
          
      b3= new JButton();
      b3.setBounds(115,30,50,50);
      add(b3);
      b3.addActionListener(this);
    
      b4= new JButton(imabutton4);
      b4.setBounds(10,80,50,50);
      add(b4);
      b4.addActionListener(this);
 
 

      b5= new JButton("5");
      b5.setBounds(60,80,50,50);
      add(b5);
      b5.addActionListener(this);
        
      b6= new JButton("6");
      b6.setBounds(115,80,50,50);
      add(b6);
      b6.addActionListener(this);
      
      b7= new JButton("7");
      b7.setBounds(10,135,50,50);
      add(b7);
      b7.addActionListener(this);
    
      b8= new JButton("8");
      b8.setBounds(60,135,50,50);
      add(b8);
      b8.addActionListener(this);
 
      b9= new JButton();
      b9.setBounds(115,135,50,50);
      add(b9);
      b9.addActionListener(this);    
   ImageIcon warehouse = new ImageIcon("warehouse");
  //First we building a object by the image
 //put the image  after get the object of image, after modifie the wide of the image through three measure,Image.SCALE_DEFAULT

   b9.setIcon(new ImageIcon(warehouse.getImage() .getScaledInstance(b9.getWidth() , b9.getHeight() , 0))); 
   
      //ImageIcon warehouse = new ImageIcon("warehouse.jpg");
      //b9= new JButton(warehouse);
 }    
 public void actionPerformed(ActionEvent box){
   if(box.getSource() == b1  ){
   tag.setText("The button selected was N: 1" ); 
 }
   if (box.getSource() == b2){
   tag.setText("The button selected was N: 2");
    } 
 if (box.getSource() == b3){
   tag.setText("The button selected was N: 3");
    } 
 if (box.getSource() == b4){
   tag.setText("The button selected was N: 4");
    } 
 if (box.getSource() == b5){
   tag.setText("The button selected was N: 5");
    } 

 if (box.getSource() == b6){
   tag.setText("The button selected was N: 6");
    } 
 if (box.getSource() == b7){
   tag.setText("The button selected was N: 7");
    } 
 if (box.getSource() == b8){
   tag.setText("The button selected was N: 8");
    } 
 if (box.getSource() == b9){
    tag.setText("The button selected was N: 9");
   } 
 }
  public static void main (String args[]){
   Grid window = new Grid (); 
     window.setBounds(0,0,400,400);   
     window.setVisible(true);
     window.setResizable(false);
     window.setLocationRelativeTo(null);
  }
}