import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ChipsOptionDialog extends JDialog implements ActionListener {
	static ChipsOptionDialog dlg;
  public ChipsOptionDialog(JFrame parent, String title, String message,ArrayList ChipOptions) {
    super(parent, title, true);
    if (parent != null) {
    	int x=1000;
    	int y=1000;
      Dimension parentSize = new Dimension(x,y); 
      Point p = parent.getLocation(); 
      setLocation(p.x + parentSize.width / 4, p.y + parentSize.height / 4);
      
    }
    JPanel messagePane = new JPanel();
    messagePane.add(new JLabel(message));
    getContentPane().add(messagePane);
    JPanel buttonPane = new JPanel();
    
    Iterator itr= ChipOptions.iterator();
    
    while(itr.hasNext()){
    JButton button = new JButton(itr.next().toString()); 
    //JButton button1=new JButton("Cancel");
    
    buttonPane.add(button); 
    //buttonPane.add(button1);
    button.addActionListener(this);
    //button1.addActionListener(this);
    }
    
    getContentPane().add(buttonPane, BorderLayout.SOUTH);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    pack(); 
    setVisible(true);
  }
  public void actionPerformed1(ActionEvent e) {
    setVisible(false); 
    dispose(); 
  }
/*  public static void main(String[] a) {
	  ChipsOptionDialog dlg = new ChipsOptionDialog(new JFrame(), "title", "message");
  }
*/  
  public static void action(ArrayList ChipOptions){
	  dlg = new ChipsOptionDialog(new JFrame(), "Chips", "Select the Chips to be added",ChipOptions);
  }
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	//ChipsOptionDialog dlg = new ChipsOptionDialog(new JFrame(), "title", "message");
	if(arg0.getActionCommand().equals(Player.columns[1])){
		Player.updatePlayerSucessPoints(1,0,0,0);
		setVisible(false); 
	    dispose(); 
		
		
	}	
if(arg0.getActionCommand().equals(Player.columns[2])){
	Player.updatePlayerSucessPoints(0,1,0,0);
	setVisible(false); 
    dispose(); 
		
		
	}
if(arg0.getActionCommand().equals(Player.columns[3])){
	Player.updatePlayerSucessPoints(0,0,1,0);
	setVisible(false); 
    dispose(); 
	
	
}
	
}
}