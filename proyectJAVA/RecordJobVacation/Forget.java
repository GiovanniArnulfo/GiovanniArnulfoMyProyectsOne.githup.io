import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Forget extends JFrame implements ActionListener{

  private JLabel     rotulo001, rotulo01, rotulo1,rotulo2 ,rotulo3 ,rotulo4 ,rotulo5 ,rotulo6 ,rotulo7 ,rotulo8 ,rotulo9 ,rotulo10;
  private JTextField campo1,campo2,campo3,campo4, campo5;
  private JMenuBar sbara;
  private JMenu optiona1,subma1,optionb2; 
  private JMenuItem optsuba1,optsuba2,submb1,submb2,subma2,optsuba3;
  private JTextArea space1; 
  private JComboBox casa1,casa2; 
  private JButton bouton1; 
       
  String vet="", ven="", vemarque="",vr="";
  

   public Forget(){  
   setLayout (null);

    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    Guione nobjet2 =new Guione();
    vet  = nobjet2.vt;    
    ven = nobjet2.vc;
    vemarque = nobjet2.vm;
    setIconImage(new ImageIcon(getClass().getResource("pimage/je.jpg")).getImage());
    setTitle(vet);
    ImageIcon vi =new ImageIcon("pimage/ravin.jpg");
    getContentPane().setBackground(new Color (150,0,0));





    sbara = new JMenuBar();		
    setJMenuBar(sbara);
    
    optiona1 = new JMenu("Setting of page.");
    sbara.add(optiona1);
    
    subma1 = new JMenu("Measure and Back");
    optiona1.add(subma1);
    
    optsuba1 = new JMenuItem("800*600");   
    subma1.add(optsuba1);
    optsuba1.addActionListener(this);

    optsuba3 = new JMenuItem("Changed of Color");   
    optiona1.add(optsuba3);
    optsuba3.addActionListener(this);


    optsuba2 = new JMenuItem("Return");
    subma1.add(optsuba2);
    optsuba2.addActionListener(this);

    subma2 = new JMenuItem("Delete Field");
    optiona1.add(subma2);
    subma2.addActionListener(this);

    optionb2 = new JMenu("See more.");
    sbara.add(optionb2);
    
    submb1 = new JMenuItem("Exit");
    optionb2.add(submb1);
    submb1.addActionListener(this);

    submb2 = new JMenuItem("Date of begin.");
    optionb2.add(submb2);
    submb2.addActionListener(this);

    rotulo001 = new JLabel("Control of vacation ");
    rotulo001.setBounds(185,5,650,60);
    rotulo001.setFont(new Font ("Time New Romane",1,30));
    rotulo001.setForeground(new Color(225,225,225));   
    add(rotulo001);


    rotulo01 = new JLabel("Data of employee ");
    rotulo01.setBounds(5,40,200,30);
    rotulo01.setFont(new Font ("Time New Romane",1,15));
    rotulo01.setForeground(new Color(225,225,225));   
    add(rotulo01);


    rotulo1 = new JLabel (vi);
    rotulo1.setBounds(480,10,200,180);
    add(rotulo1);

    rotulo2 = new JLabel (ven);
    rotulo2.setBounds(5,10,250,40);
    rotulo2.setFont(new Font("Time New Roman",1,20 ));
    rotulo2.setForeground(new Color(225,225,225));
    add(rotulo2);

    rotulo8=new JLabel (" May  you choice the years of stand in the Company?");
    rotulo8.setBounds(5 ,225,370,30);
    rotulo8.setFont(new Font("Time New Roman",1,15 ));
    rotulo8.setForeground(new Color(225,225,225));
    add(rotulo8);
 
    casa1=new JComboBox(); 
    casa1.setBounds(375,225,150,30);
    add(casa1); 
    casa1.addItem("");
    casa1.addItem("3");
    casa1.addItem("6"); 
    casa1.addItem("9");
 
 

    rotulo9=new JLabel (" May  you choice your department of work?");
    rotulo9.setBounds(5,265,350,30);
    rotulo9.setFont(new Font("Time New Roman",1,15 ));
    rotulo9.setForeground(new Color(225,225,225));
    add(rotulo9);

    casa2=new JComboBox(); 
    casa2.setBounds(375,265,150,30);
    add(casa2);
    casa2.addItem("");
    casa2.addItem("Healding");
    casa2.addItem("Teacher"); 
    casa2.addItem("Programmator");
    

    rotulo3=new JLabel ("First name.");
    rotulo3.setBounds(10,80,150,30);
    rotulo3.setFont(new Font("Time New Roman",1,15 ));
    rotulo3.setForeground(new Color(255,255,255));
    add(rotulo3);

    campo1 =new JTextField();
    campo1.setBounds(190,80,150,30);
    campo1.setFont(new Font("Time New Roman",1,16 ));
    campo1.setForeground(new Color(124,0,0)); 
    add(campo1);

    rotulo4=new JLabel ("Second name.");
    rotulo4.setBounds(10,120,150,30);
    rotulo4.setFont(new Font("Time New Roman",1,15 ));
    rotulo4.setForeground(new Color(255,255,255));
    add(rotulo4);
    
    campo2 =new JTextField();
    campo2.setBounds(190,120,150,30);
    campo2.setFont(new Font("Time New Roman",1,16));
    campo2.setForeground(new Color(124,0,0));
    add(campo2);

    rotulo5=new JLabel ("First name Family.");
    rotulo5.setBounds(10,160,150,30);
    rotulo5.setFont(new Font("Time New Roman",1,15 ));
    rotulo5.setForeground(new Color(225,225,225));
    add(rotulo5);

    campo3 =new JTextField();
    campo3.setBounds(190,160,150,30);
    campo3.setFont(new Font("Time New Roman",1,16));
    campo3.setForeground(new Color(124,0,0));
    add(campo3);

    rotulo6=new JLabel ("Second name Family.");
    rotulo6.setBounds(10,195,150,30);
    rotulo6.setFont(new Font("Time New Roman",1,15 ));
    rotulo6.setForeground(new Color(225,225,225));
    add(rotulo6);
 
    campo4 =new JTextField();
    campo4.setBounds(190,195,150,30);
    campo4.setFont(new Font("Time New Roman",1,16 ));
    campo4.setForeground(new Color(124,0,0));
     
    add(campo4);


    rotulo10=new JLabel ("All right are reserved. In case of copy send to mail to jesuisarnulfo51@gmail.com");
    rotulo10.setBounds(50,400,600,30);
    rotulo10.setFont(new Font("Time New Roman",1,15 ));
    rotulo10.setForeground(new Color(225,225,225));
    add(rotulo10);


    space1 =new JTextArea();
    space1.setBounds(190,310,250,70);
    space1.setFont(new Font("Time New Roman",1,15));
    space1.setForeground(new Color(0,0,0));
    space1.setBackground(new Color(0,139,0)); 
    space1.setEnabled(false);
                                                   
    add(space1);


    rotulo7=new JLabel (vemarque);
    rotulo7.setBounds(240,415,200,30);
    rotulo7.setFont(new Font("Time New Roman",1,15 ));
    rotulo7.setForeground(new Color(225,225,225));
    add(rotulo7);

       bouton1 =new JButton("Calculate");
       bouton1.setBounds(10,320,150,30);
       bouton1.setFont(new Font("Time New Roman",3,15));
       bouton1.setForeground(new Color(225,225,225)); 
       bouton1.setBackground(new Color(0,0,225));
       bouton1.addActionListener(this);     
       add(bouton1);    

     
 
      }
     public void actionPerformed(ActionEvent box){ 
    
        if(box.getSource()==bouton1){
             
             String vva= campo1.getText();
             String vvb= campo2.getText();
             String vvc= campo3.getText();
             String vvd= campo4.getText();

            String vz = casa1.getSelectedItem().toString();
  

            String vx = casa2.getSelectedItem().toString();     
 

        if(vva.equals("") || vvb.equals("") ||vvc.equals("") ||vvd.equals("") || vx.equals("") || vz == ("") ){
            JOptionPane.showMessageDialog(null,"You must fint the field, if you Wish to pass.", "Stop", JOptionPane.ERROR_MESSAGE);   
               
        }
        else{
        
        int  v1 = Integer.parseInt(vz);          
 
         if (vx.equals("Healding")){
         if (v1 == 3){
         space1.setText(" "  +   ven + "Your Vacation are:  " +
                              "\n Days:   10                        "      +     
                              "\n Monts:   1 " );  
             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0));
        }
        if  (v1 == 6){
        space1.setText(" "  +   ven + "Your Vacation are:  " +
                              "\n Days:   20                        "      +     
                              "\n Monts:   1 ");  
             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0));
  
          
        }
        if (v1 == 9){
        space1.setText(" "  +   ven + "Your Vacation are:  " +
                              "\n Days:   30                        "      +     
                              "\n Monts:   1 " );  
             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0)); 

         }
        }
          if ( vx.equals("Teacher")){
          if (v1 == 3 ){
          space1.setText(" "  +   ven + "Your Holly day  are:  " +
                              "\n Days:   15                        "      +     
                              "\n Monts:   2"  );  
             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0)); 

          }
          if (v1 == 6){   
          space1.setText(" "  +   ven + "Your Holly day  are:  " +
                              "\n Days:   25                        "      +     
                              "\n Monts:   2"   );  
             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0)); 
           
         }
        if (v1 == 9){  
         space1.setText(" "  +   ven + "Your Holly day  are:  " +
                              "\n Days:   35                        "      +     
                              "\n Monts:   2" );  
             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0));      
             rotulo2.setForeground(new Color(0,255,0));
           } 
         }
          if (vx.equals("Programmator")){
          if(v1 == 3){
          space1.setText(" "  +   ven + "Your Holly day  are:  " +
                              "\n Days:   20                        "      +     
                              "\n Monts:   3"  );  

             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0)); 
        }
       if (v1 == 6){
           space1.setText(" "  +   ven + "Your Holly day  are:  " +
	             "\n Days:   40                        "      +     
                              "\n Monts:   3" );  

             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0)); 
        }
       if (v1 == 9){
           space1.setText(" "  +   ven + "Your Holly day  are: " +
	             "\n Days:   60                        "      +     
                              "\n Monts:   3" );  
             rotulo001.setForeground(new Color(0,255,0));
             space1.setBackground(new Color(150,0,0)); 
             rotulo2.setForeground(new Color(0,255,0));
          }    
         } 
       }
     }
   
           if (box.getSource()==subma2){  
             campo1.setText("");
             campo2.setText("");
             campo3.setText("");
             campo4.setText("");
             casa1.setSelectedIndex(0);
             casa2.setSelectedIndex(0); 
             space1.setText("");
         
        }
        if (box.getSource()==submb2 ){ 
          JOptionPane.showMessageDialog(null, "\n Nome of make up the Programme: Giovanni�s Family."+
                                                                         "\n  Pag Web: www.Let`sLerning join.co"+
                                                                         "\n  Mobile phone: 3105075647.       "+
                                                                         "\n  Message electronic: jesuisgiovanniarnulfo51@gmail.com       "+
                                                                         "\n  Date of Creation: Twesday Oct the 7th  Two thousend twenty-one.", "Date of programmator", JOptionPane.INFORMATION_MESSAGE);
           }
           if (box.getSource()==optsuba3){
           getContentPane().setBackground(new Color(65,0,65));
          }
         if (box.getSource()==optsuba1){
             setSize(800,600);

           }
           if (box.getSource()==submb1){
            System.exit(0);
          }

         if(box.getSource()== optsuba2){
                Guione window = new Guione();
                 window.setBounds(0,0,700,500);
                 window.setVisible(true);
                 window.setResizable(false);
                 window.setLocationRelativeTo(null);
                 this.setVisible(false); 
        }
       }
       public static void main(String args[]){
       Forget window =new Forget();
       window.setBounds(0,0,700,500);     
       window.setVisible(true);
       window.setResizable(false);
       window.setLocationRelativeTo(null);   
 }
}