import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guione extends JFrame implements ActionListener{

  private JLabel         rotulo1, rotulo2, rotulo3, rotulo4, rotulo10;
  private JTextField  campo1, campo2, campo3;
  private JButton       bouton1; 
  public static String vc="", vt="Welcome.  System Vacation Control for Employees ", vm= ("Company Entertaiment©");
  String   va = "";
   
    public Guione(){
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);

     setTitle(vt);
     setIconImage(new ImageIcon(getClass().getResource("pimage/je.jpg")).getImage());  
     getContentPane().setBackground(new Color (150,0,0));
     
     ImageIcon va = new ImageIcon("pimage/ravin.jpg"); 
     
     rotulo1= new JLabel(va);
     rotulo1.setBounds(20,80,660,190);
     add(rotulo1);

    rotulo2 = new JLabel("Control of vacation ");
    rotulo2.setBounds(185,5,650,60);
    rotulo2.setFont(new Font ("Time New Romane",1,30));
    rotulo2.setForeground(new Color(225,225,225));   
    add(rotulo2);

    campo1= new JTextField();
    campo1.setBounds(250,300,100,30);
    campo1.setFont(new Font ("Arial",1,15));
    campo1.setForeground(new Color(0,0,0));
    add(campo1);


    bouton1 = new JButton("Submit.");
    bouton1.setBounds(380,300,120,30);
    bouton1.setFont(new Font ("Time New Romane",3,15));
    bouton1.setForeground(new Color(225,225,225));
    bouton1.setBackground(new Color(0,0,225));
    bouton1.addActionListener(this);
    add(bouton1);
    


    rotulo3= new JLabel("Name of worker:");
    rotulo3.setBounds(20,300,250,30);
    rotulo3.setFont(new Font ("Time New Romane",1,20)); 
    rotulo3.setForeground(new Color(225,225,225));
    add(rotulo3);   

    rotulo4= new JLabel(vm);
    rotulo4.setBounds(250,400,200,30);
    rotulo4.setFont(new Font ("Time New Romane",1,15)); 
    rotulo4.setForeground(new Color(225,225,225));
    add(rotulo4);   

    rotulo10=new JLabel ("All right are reserved. In case of copy send to mail to jesuisarnulfo51@gmail.com");
    rotulo10.setBounds(50,380,600,30);
    rotulo10.setFont(new Font("Time New Roman",1,15 ));
    rotulo10.setForeground(new Color(225,225,225));
    add(rotulo10);





    }
   
     public void actionPerformed(ActionEvent box){

       if(box.getSource() == bouton1){
       vc = campo1.getText().trim();
          
       if (vc.equals("")){
        JOptionPane.showMessageDialog(null,"YOU MUST FILL THE FIELD, IF YOU WISH TO PASS.", "Stop", JOptionPane.ERROR_MESSAGE); 
         }
          else {
         Statement window= new Statement();
         window.setBounds(0,0,700,500);  
         window.setVisible(true);
         window.setResizable(false);
         window.setLocationRelativeTo(null);     
         this.setVisible(false);
        }
      }       
     }
     public static void main (String args[]){
      Guione window = new Guione();
      window.setBounds(0,0,700,500);
      window.setVisible(true);
      window.setResizable(false);
      window.setLocationRelativeTo(null);   
   }
  }     