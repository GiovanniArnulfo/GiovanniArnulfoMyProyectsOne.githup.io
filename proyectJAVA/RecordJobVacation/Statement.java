import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Statement extends JFrame implements ChangeListener, ActionListener{

  private JTextArea space1;
  private JScrollPane rollo1;
  private JCheckBox checkup1;
  private JButton bouton1, bouton2; 
  private JLabel rotulo1, rotulo2, rotulo3;
   
  String va="", vcase1="", vcase2="";
    
    public Statement(){
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Guione  nobjet =new Guione();
      vcase1=nobjet.vt;
      vcase2=nobjet.vc;

      setTitle(vcase1);
      setIconImage(new ImageIcon(getClass().getResource("pimage/je.jpg")).getImage());
      getContentPane().setBackground(new Color(150,0,0));
      ImageIcon va = new ImageIcon("pimage/cow.jpg");   
                  
      rotulo1= new JLabel(va);     
      add(rotulo1);

      rotulo2= new JLabel("Tences and conditions.");
      rotulo2.setBounds(95,5,200,30);
      rotulo2.setForeground(new Color(50,228,2));
      add(rotulo2);

      space1= new JTextArea();
      space1.setText(" \n        Statement and conditions."+
                                " \n         Can´t recopy this text without preview."+
                                " \n         Can´t let beliebe in we."+             
                                " \n\n       //www.rojitas.com.co."  );

      space1.setEditable(false);
      rollo1=    new JScrollPane(space1);
      rollo1.setBounds(10,30,400,150);
      add(rollo1);
 

      checkup1= new JCheckBox(" I  "+ vcase2 + " shall acept it.");
      checkup1.setBounds(10,210,200,30);
      checkup1.addChangeListener(this);
      add(checkup1);


      bouton1= new JButton("Continued.");
      bouton1.setBounds(10,250,100,30);
      bouton1.setFont(new Font("Time New Roman",3,13));
      bouton1.setForeground(new Color(0,20,0)); 
      bouton1.addActionListener(this);
      bouton1.setEnabled(false);
      add(bouton1);

      bouton2=new JButton("Retret.");
      bouton2.setBounds(200,250,100,30);
      bouton2.setFont(new Font("Arial", 0,13));
      bouton2.setForeground(new Color(0,0,20));
      bouton2.addActionListener(this);
      bouton2.setEnabled(true);
      add(bouton2);
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
           window.setBounds(0,0,700,550);
           window.setVisible(true);
           window.setResizable(false);
           window.setLocationRelativeTo(null);
           this.setVisible(false); 
  
        }else if(box.getSource()==bouton2){
         Guione window = new Guione();
         window.setBounds(0,0,400,400);
         window.setVisible(true);
         window.setResizable(false);
         window.setLocationRelativeTo(null);
         this.setVisible(false); 
  }   
}
        public static void main(String args[]){
          Statement window=new Statement();
          window.setBounds(0,0,400,400);  
          window.setVisible(true);
          window.setResizable(false);
          window.setLocationRelativeTo(null);
 }
}