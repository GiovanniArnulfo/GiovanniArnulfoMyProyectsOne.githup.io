import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guione extends JFrame implements ActionListener{

  private JLabel         rotulo1, rotulo2, rotulo3, rotulo4;
  private JTextField  campo1, campo2, campo3;
  private JButton       bouton1; 
  public static String vc="", vt="Welcome to Gourmet pet.", vm= ("©Company Entertaiment©");
  String   va = "";
   
    public Guione(){
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);

     setTitle(vt);
     setIconImage(new ImageIcon(getClass().getResource("pimage/cow.jpg")).getImage());  
     getContentPane().setBackground(new Color (0,255,0));
     ImageIcon va = new ImageIcon("pimage/je.jpg"); 
     
     rotulo1= new JLabel(va);
     rotulo1.setBounds(220,100,150,150);
     add(rotulo1);


    rotulo2 = new JLabel("Program let´s learn to programming.");
    rotulo2.setBounds(5,5,350,30);
    rotulo2.setFont(new Font ("Time New Romane",3,20));
    rotulo2.setForeground(new Color(120,0,0));   
    add(rotulo2);

    campo1= new JTextField();
    campo1.setBounds(20,120,100,30);
    campo1.setFont(new Font ("Arial",2,15));
    campo1.setForeground(new Color(225,0,0));
    add(campo1);


    bouton1 = new JButton("Come on.");
    bouton1.setBounds(10,160,120,30);
    bouton1.setFont(new Font ("Time New Romane",3,15));
    bouton1.setForeground(new Color(125,125,0));
    bouton1.setBackground(new Color(0,0,0));
    bouton1.addActionListener(this);
    add(bouton1);
    


    rotulo3= new JLabel("Put yuor name in the next field.");
    rotulo3.setBounds(5,80,250,30);
    rotulo3.setFont(new Font ("Time New Romane",2,15)); 
    rotulo3.setForeground(new Color(120,0,0));
    add(rotulo3);   

    rotulo4= new JLabel(vm);
    rotulo4.setBounds(200,300,150,30);
    rotulo4.setFont(new Font ("Time New Romane",2,12)); 
    rotulo4.setForeground(new Color(120,0,0));
    add(rotulo4);   
    }
   
     public void actionPerformed(ActionEvent box){

       if(box.getSource() == bouton1){
       vc = campo1.getText().trim();
          
       if (vc.equals("")){
        JOptionPane.showMessageDialog(null,"You must fint the field, if you Wish to pass.", "Stop", JOptionPane.ERROR_MESSAGE); 
         }
          else {
         Statement window= new Statement();
         window.setBounds(0,0,400,400);  
         window.setVisible(true);
         window.setResizable(false);
         window.setLocationRelativeTo(null);     
         this.setVisible(false);
        }
      }       
     }
     public static void main (String args[]){
      Guione window = new Guione();
      window.setBounds(0,0,400,400);
      window.setVisible(true);
      window.setResizable(false);
      window.setLocationRelativeTo(null);   
   }
  }     