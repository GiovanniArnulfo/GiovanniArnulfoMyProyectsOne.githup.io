import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Secondwind extends JFrame implements ActionListener, ChangeListener{
  
  private JLabel etiqueta1, etiqueta2, etiqueta3,etiqueta4, etiqueta5, etiqueta6, etiqueta7;
  private JTextArea boxtext1, boxtext2, boxtext3; 
  private JButton bouton1, bouton2, bouton3;
  private JRadioButton blank1, blank2 , blank3, blank4, blank5, blank6, blank7, blank8, blank9;
  private ButtonGroup team;

  public Secondwind(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Program Givanni´s Family");
  getContentPane().setBackground(new Color(0,255,0));

   etiqueta1 = new JLabel("One question with three posible answers");
   etiqueta1.setBounds(10,15,300,30);
   add(etiqueta1);   
  
   etiqueta2 = new JLabel("Question 1");
   etiqueta2.setBounds(10,45,300,30);
   add(etiqueta2);
   
   boxtext1 = new JTextArea("How often was the man traveled toward  the moon?");
   boxtext1.setBounds(10,75,300,30);
   add(boxtext1);  
   
   etiqueta3 = new JLabel("Answer");
   etiqueta3.setBounds(10,105,300,30);
   add(etiqueta3);

   etiqueta4 = new JLabel("Question 2");
   etiqueta4.setBounds(10,255,300,30);
   add(etiqueta4); 
   
   boxtext2 = new JTextArea("When were built the bridge in honor to the battle"+
                                              "\n from Boyaca?");
   boxtext2.setBounds(10,285,300,30);
   add(boxtext2);   

   etiqueta5 = new JLabel("Answer");
   etiqueta5.setBounds(10,315,300,30);
   add(etiqueta5);

   etiqueta6= new JLabel("Question 3");
   etiqueta6.setBounds(330,45,300,30);
   add(etiqueta6); 

   boxtext3 = new JTextArea("How often is held the government republican in Colombia?");

   boxtext3.setBounds(330,85,350,30);
   add(boxtext3);   

   etiqueta7 = new JLabel("Answer");
   etiqueta7.setBounds(330,125,300,30);
   add(etiqueta7);

   team = new ButtonGroup();
   blank1 = new JRadioButton("1961");
   blank1.setBounds(10,145,150,30);
   blank1.addChangeListener(this);
   add(blank1); 
   team.add(blank1);

   blank2 = new JRadioButton("1691");
   blank2.setBounds(10,185,150,30);
   blank2.addChangeListener(this);
   add(blank2); 
   team.add(blank2);
 
   blank3 = new JRadioButton("1971");
   blank3.setBounds(10,225,150,30);
   blank3.addChangeListener(this);
   add(blank3); 
   team.add(blank3);

   team = new ButtonGroup();
   blank4 = new JRadioButton("93");
   blank4.setBounds(10,345,150,30);
   blank4.addChangeListener(this);
   add(blank4); 
   team.add(blank4);

   blank5 = new JRadioButton("91");
   blank5.setBounds(10,385,150,30);
   blank5.addChangeListener(this);
   add(blank5); 
   team.add(blank5);
 
   blank6 = new JRadioButton("71");
   blank6.setBounds(10,425,150,30);
   blank6.addChangeListener(this);
   add(blank6); 
   team.add(blank6);

   team = new ButtonGroup();
   blank7 = new JRadioButton("93");
   blank7.setBounds(330,165,150,30);
   blank7.addChangeListener(this);
   add(blank7); 
   team.add(blank7);

   blank8 = new JRadioButton("91");
   blank8.setBounds(330,205,150,30);
   blank8.addChangeListener(this);
   add(blank8); 
   team.add(blank8);
 
   blank9 = new JRadioButton("71");
   blank9.setBounds(330,245,150,30);
   blank9.addChangeListener(this);
   add(blank9); 
   team.add(blank9);

   bouton1 = new JButton("Back");
   bouton1.setBounds(150,480,100,30);
   bouton1.addActionListener(this);
   add(bouton1);

   bouton2 = new JButton("Next");
   bouton2.setBounds(260,480,100,30);
   bouton2.addActionListener(this);
   add(bouton2);

   bouton3 = new JButton("Exit");
   bouton3.setBounds(370,480,100,30);
   bouton3.addActionListener(this);
   add(bouton3);
  }

  public void stateChanged(ChangeEvent box){}
  
  public void actionPerformed(ActionEvent box){}

  public static void main(String args[]){
  Secondwind window = new Secondwind();
  window.setBounds(0,0,700,550);
  window.setVisible(true);
  window.setResizable(false);
  window.setLocationRelativeTo(null);
  }
 }