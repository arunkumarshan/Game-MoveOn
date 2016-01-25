import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class CardRemoveDialog extends JDialog implements ActionListener {
	static CardRemoveDialog dlg;
  public CardRemoveDialog(JFrame parent, String title, String message) {
    super(parent, title, true);
    if (parent != null) {
      Dimension parentSize = parent.getSize(); 
      Point p = parent.getLocation(); 
      setLocation(p.x + parentSize.width / 4, p.y + parentSize.height / 4);
    }
    JPanel messagePane = new JPanel();
    messagePane.add(new JLabel(message));
    getContentPane().add(messagePane);
    
    JPanel temp2 = BottomPanel.cardDeletionPanel;
    
    
    getContentPane().add(temp2);
   
    
    
    JPanel buttonPane = new JPanel();
    JButton button = new JButton("Delete"); 
    buttonPane.add(button); 
    button.addActionListener(this);
    getContentPane().add(buttonPane, BorderLayout.SOUTH);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    pack(); 
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
	  if(e.getActionCommand().equals("Delete")){
		  BottomPanel.deleteImage();
		  System.out.println("Inside Delete");
	  }
    setVisible(false); 
    dispose(); 
  }
  public static void action(){
	  dlg = new CardRemoveDialog(new JFrame(), "Card Deletion", "Select the Card to delete");
  }
}