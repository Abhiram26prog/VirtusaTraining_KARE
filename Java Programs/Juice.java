import java.awt.*;  
import java.awt.event.*;  
public class Juice  
{  
     Juice(){  
        Frame f= new Frame();  
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(500,100);  
        Button b=new Button("Show");  
        b.setBounds(200,150,70,30);  
        final List l1=new List(4, false);  
        l1.setBounds(100,100, 80,80);  
        l1.add("Mazza");  
        l1.add("Bindu");  
        l1.add("Sprite");  
        l1.add("Cococola");  
        final List l2=new List(4, true);  
        l2.setBounds(200,200, 90,90);  
        l2.add("Maa");  
        l2.add("karnataka");  
        l2.add("sprite");  
        l2.add("Cococola");  
        f.add(l1); f.add(l2); f.add(label); f.add(b);  
        f.setSize(450,450);  
        f.setLayout(null);  
        f.setVisible(true);  
        b.addActionListener(new ActionListener() {  
         public void actionPerformed(ActionEvent e) {       
          String data = "Juice Selected: "+l1.getItem(l1.getSelectedIndex());  
          data += ", Brand Selected:";  
          for(String frame:l2.getSelectedItems()){  
                   data += frame + " ";  
          }  
          label.setText(data);  
          }  
         });          
}  
public static void main(String args[])  
{  
   new Juice();  
}  
}