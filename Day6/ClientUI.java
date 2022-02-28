import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
public class ClientUI extends JFrame implements Runnable{

Socket mySocket;
DataInputStream dis;
PrintStream ps;
JTextArea ta;
JScrollPane scroll;
JTextField tf;
JButton okButton;
Thread th;
  String name = "";


public ClientUI(){
    System.out.println("Client started");
    try {
        mySocket = new Socket("127.0.0.1", 5005);
        dis = new DataInputStream(mySocket.getInputStream());
        ps = new PrintStream(mySocket.getOutputStream());

    } catch (IOException e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "ERROR"); 
      System.exit(0);
    }

    th = new Thread(this);
    th.start();
    
    name=JOptionPane.showInputDialog(this,"Enter Name");          
this.setLayout(new FlowLayout());
this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
ta = new JTextArea(20,50);
scroll = new JScrollPane(ta);
JTextField tf = new JTextField(40);
okButton = new JButton("Send");
okButton.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){

        if(!tf.getText().equals("")){
          
            ps.println(name+": "+tf.getText());
            tf.setText("");  
          
        }
}
});
 tf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
        if(!tf.getText().equals("")){
          
            ps.println(name+": "+tf.getText());
            tf.setText("");  
          
        }
                   
            }
        });
add(scroll);
add(tf);
add(okButton);
}
public static void main(String args[])
{
ClientUI ui=new ClientUI();
ui.setSize(600, 400);
ui.setResizable(false);
ui.setVisible(true);


}
   
public void run(){
while(true){
String replyMsg;
 try {
        replyMsg = dis.readLine();
ta.append("\n"+replyMsg);
    } catch (IOException e) {
     e.printStackTrace();
        JOptionPane.showMessageDialog(this, "ERROR"); 
        System.exit(0);

    }
}

}







}












