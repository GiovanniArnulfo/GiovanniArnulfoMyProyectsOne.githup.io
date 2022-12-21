import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Statement extends JFrame implements ChangeListener, ActionListener{

  private JTextArea space1;
  private JScrollPane rollo1;
  private JCheckBox checkup1;
  private JButton bouton1, bouton2; 
  private JLabel rotulo01,rotulo1, rotulo2, rotulo3, rotulo4, rotulo10;
   
  String va="", vcase1="", vcase2="",vemarque="";
    
    public Statement(){
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Guione  nobjet =new Guione();
      vcase1=nobjet.vt;
      vcase2=nobjet.vc;
      vemarque=nobjet.vm;

      setTitle(vcase1);
      setIconImage(new ImageIcon(getClass().getResource("pimage/je.jpg")).getImage());
      getContentPane().setBackground(new Color(150,0,0));
      ImageIcon va = new ImageIcon("pimage/cow.jpg");   
                  
    rotulo01 = new JLabel("Control of vacation ");
    rotulo01.setBounds(185,5,650,60);
    rotulo01.setFont(new Font ("Time New Romane",1,30));
    rotulo01.setForeground(new Color(225,225,225));   
    add(rotulo01);




      rotulo1= new JLabel(va);     
      add(rotulo1);

      rotulo2= new JLabel("Tences and conditions");
      rotulo2.setBounds(220,80,300,30);
      rotulo2.setForeground(new Color(225,225,225));
      rotulo2.setFont(new Font ("Time New Romane",1,20));
      add(rotulo2);

      space1= new JTextArea();
      space1.setText(" \n        Statement and conditions."+
                                " \n        Can´t recopy this text without preview agreement."+
                                " \n        In all moment the company would modified the vacation's time."+             
                                " \n        The vacation are fire in accordance with your lavor."+
                                " \n\n        "  );

      space1.setFont(new Font("Time New Roman",3,15));
      space1.setEditable(false);
      rollo1=    new JScrollPane(space1);
      rotulo1.setFont(new Font("Time New Roman",3,15));
      rotulo1.setForeground(new Color(225,225,225));
      rollo1.setBounds(10,130,660,150);
      add(rollo1);
 

      checkup1= new JCheckBox(" I  "+ vcase2 + " . Shall acept all.");
      checkup1.setBounds(10,320,270,30);
      checkup1.setFont(new Font("Time New Roman",3,15));
      checkup1.addChangeListener(this);
      add(checkup1);


      bouton1= new JButton("Continued.");
      bouton1.setBounds(10,360,200,30);
      bouton1.setFont(new Font("Time New Roman",3,15));
      bouton1.setForeground(new Color(225,225,225)); 
      bouton1.setBackground(new Color(0,0,225));
      bouton1.addActionListener(this);
      bouton1.setEnabled(false);
      add(bouton1);

      bouton2=new JButton("Retret.");
      bouton2.setBounds(220,360,100,30);
      bouton1.setFont(new Font("Time New Roman",3,15));
      bouton2.setForeground(new Color(225,225,225));
      bouton2.setBackground(new Color(0,0,225)); 
      bouton2.addActionListener(this);
      bouton2.setEnabled(true);
      add(bouton2);

    rotulo10=new JLabel ("All right are reserved. In case of copy send to mail to jesuisarnulfo51@gmail.com");
    rotulo10.setBounds(50,400,600,30);
    rotulo10.setFont(new Font("Time New Roman",1,15 ));
    rotulo10.setForeground(new Color(225,225,225));
    add(rotulo10);

    rotulo4= new JLabel(vemarque);
    rotulo4.setBounds(250,415,200,30);
    rotulo4.setFont(new Font ("Time New Romane",1,15)); 
    rotulo4.setForeground(new Color(225,225,225));
    add(rotulo4);   





         }
        public void stateChanged(ChangeEvent box){
          if(checkup1.isSelected()==true){
          bouton1.setEnabled(true);
          bouton2.setEnabled(false);
          }else {
          bouton1.setEnabled(false);       
          bouton2.setEnabled(true);  
        }
      }
        public void actionPerformed(ActionEvent box){
           if(box.getSource()==bouton1){
           Forget window = new Forget();
           window.setBounds(0,0,700,500);
           window.setVisible(true);
           window.setResizable(false);
           window.setLocationRelativeTo(null);
           this.setVisible(false); 
  
        }else if(box.getSource()==bouton2){
         Guione window = new Guione();
         window.setBounds(0,0,700,500);
         window.setVisible(true);
         window.setResizable(false);
         window.setLocationRelativeTo(null);
         this.setVisible(false); 
  }   
}
        public static void main(String args[]){
          Statement window=new Statement();
          window.setBounds(0,0,700,500);  
          window.setVisible(true);
          window.setResizable(false);
          window.setLocationRelativeTo(null);
 }
}