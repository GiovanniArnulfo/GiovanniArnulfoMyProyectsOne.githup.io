import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Firstwind extends JFrame implements ActionListener, ChangeListener{

  private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7;
  private JTextArea boxtext1; 
  private JButton bouton1, bouton2, bouton3;
  private JRadioButton blank1, blank2 , blank3;
  private ButtonGroup team;
  private JCheckBox check1, check2, check3, check4, check5, check6 ;
 
  public Firstwind (){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE); 
  setTitle("Program Givanni´s Family");
  getContentPane().setBackground(new Color(255,0,0));
  
  ImageIcon imagefund = new ImageIcon("firstimage/walum.jpg");
  etiqueta1 = new JLabel(imagefund);
  etiqueta1.setBounds(20,40,500,70);
  add(etiqueta1);   

   etiqueta2 = new JLabel("Lets Learn Playing");
   etiqueta2.setBounds(10,15,300,30);
   add(etiqueta2);   
  
   etiqueta3 = new JLabel("All copy right reserver.");
   etiqueta3.setBounds(25,125,200,30);
   add(etiqueta3);   
  
   etiqueta4 = new JLabel("Can you choice the lingo that you like please");
   etiqueta4.setBounds(25,155,200,30);
   add(etiqueta4);   

   etiqueta5 = new JLabel("By beguin, would you choice the theme that you like please");
   etiqueta5.setBounds(25,315,300,30);
   add(etiqueta5);   

   etiqueta6 = new JLabel("Would you choice the Game´s level  that you like please");
   etiqueta6.setBounds(25,435,300,30);
   add(etiqueta6);   

   etiqueta7 = new JLabel("Push the button by start the game");
   etiqueta7.setBounds(330,315,300,30);
   add(etiqueta7);   



   team = new ButtonGroup();
   blank1 = new JRadioButton("English");
   blank1.setBounds(25,190,150,30);
   blank1.addChangeListener(this);
   add(blank1); 
   team.add(blank1);

   blank2 = new JRadioButton("French");
   blank2.setBounds(180,190,150,30);
   blank2.addChangeListener(this);
   add(blank2); 
   team.add(blank2);
 
   blank3 = new JRadioButton("Italien");
   blank3.setBounds(340,190,150,30);
   blank3.addChangeListener(this);
   add(blank3); 
   team.add(blank3);

   boxtext1 = new JTextArea("summarize");
   boxtext1.setBounds(25,230,200,70);
   boxtext1.setEditable(false);
   add(boxtext1);   
 
   check1 = new JCheckBox("History");
   check1.setBounds(25,345,150,30);
   check1.addChangeListener(this);
   add(check1); 

   check2 = new JCheckBox("Byology");
   check2.setBounds(25,375,150,30);
   check2.addChangeListener(this);
   add(check2); 

   check3 = new JCheckBox("Programmation");
   check3.setBounds(25,400,150,30);
   check3.addChangeListener(this);
   add(check3); 

   check4 = new JCheckBox("Ease");
   check4.setBounds(25,460,150,30);
   check4.addChangeListener(this);
   add(check4); 

   check5 = new JCheckBox("Medium");
   check5.setBounds(25,490,150,30);
   check5.addChangeListener(this);
   add(check5); 

   check6 = new JCheckBox("High");
   check6.setBounds(25,520,150,30);
   check6.addChangeListener(this);
   add(check6); 

   bouton1 = new JButton("Play");
   bouton1.setBounds(330,345,90,90);
   bouton1.addActionListener(this);
   add(bouton1);

   bouton2 = new JButton("Option");
   bouton2.setBounds(330,520,100,30);
   bouton2.addActionListener(this);
   add(bouton2);

   bouton3 = new JButton("Exit");
   bouton3.setBounds(440,520,100,30);
   bouton3.addActionListener(this);
   add(bouton3);

  }
  public void stateChanged(ChangeEvent box){ }
 
  public void actionPerformed(ActionEvent box){ }

  public static void main (String args[]){
  Firstwind window = new Firstwind();
  window.setBounds(0,0,600,600);
  window.setVisible(true);
  window.setResizable(false);
  window.setLocationRelativeTo(null);
 } 
}