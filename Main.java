import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.TextArea;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

class MainClass{
	public static JSplitPane splitPane;
    private static JPanel player1Panel= new JPanel();
    private static  JPanel player2Panel= new JPanel();
    private static  JPanel player3Panel= new JPanel();
	 
    private static  JLabel player1= new JLabel("Arun");
    private static  JLabel player2= new JLabel("Avneet");
    private static  JLabel player3= new JLabel("Gagan");
    
	static BufferedImage gameBoard;
	static JPanel topPanel=new JPanel();
	static JScrollPane scrollPane=null;
	
	public static JPanel pane2;
	
	
	static HashMap<String,JPanel> playerList=new HashMap<String,JPanel>();
	
	public MainClass(){
		try {
			gameBoard=ImageIO.read(new File("C://CSULBMap3.PNG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void createFrame(){
		
		try{		
					
	        JFrame frame=new JFrame();
	        frame.setLayout(new FlowLayout());
	        //frame.setSize(1670,2000);
	        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	 	        
	        //adding Top and Bottom Panel
	        JScrollPane pane1=create_Top_Panel(frame);
	       // JPanel pane2=create_Bottom_Panel();
	        pane2=create_Bottom_Panel();
	        pane1.setVisible(true);
	        pane2.setVisible(true);
	        
	        
	        
	        //pane1.setViewportView(new JLabel("Connecting to the database. Please wait..."));
	        /*frame.add(pane1,BorderLayout.CENTER);
	        frame.setContentPane(pane1);*/
	        
	        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                    pane1, pane2);
	        splitPane.setDividerLocation(700);
	        splitPane.setOneTouchExpandable(true);
	        splitPane.updateUI();
	        frame.setContentPane(splitPane);
	        frame.validate();
	        frame.pack();
	        /*System.out.println("Frame Size: "+frame.getSize());
	        System.out.println("Pane1 Size: "+pane1.getSize());
	        System.out.println("Pane2 Size: "+pane2.getSize());*/
	    
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        frame.setVisible(true);
	
		}
		catch(Exception e){
			e.printStackTrace(); //removearun
		}
		
	}
	
	public static HashMap playerList(){
		playerList.put(Player.Player1,player1Panel);
		playerList.put(Player.Player2,player2Panel);
		playerList.put(Player.Player3,player3Panel);
		return playerList;
	}
	
	
	private static JScrollPane create_Top_Panel(JFrame frame) throws Exception{

		try{		
			//System.out.println("Inside create_Top_Panel");
			
			
			playerList=playerList();
			
			Iterator iter=playerList.entrySet().iterator();
			
			/* Graphics g = gameBoard.getGraphics();
*//*			    g.setFont(g.getFont().deriveFont(30f));
			    
			    g.drawString("Kumar1", 473, 318);
			    g.dispose();

			    ImageIO.write(gameBoard, "png", new File("C://Users/Arunkumar/Pictures.PNG"));
			
			    gameBoard1=ImageIO.read(new File("C://Users/Arunkumar/Pictures.PNG"));*/

			 //Old Trial Sarts
/*			 while(iter.hasNext()){
				// String arun=
				 
				 String Player=iter.next().toString();
			 
				 System.out.println("Inside While: "+Player);
				 gameBoard1=drawPlayerPosition(g,Player,gameBoard);
			 }*/
			 
			 //Old Trial Ends
			 
			 
			 
			
			ImageIcon icon=new ImageIcon(gameBoard);
			
			//ImageIcon icon=new ImageIcon(gameBoard);
	        
	        //adding image directly into the JFrame through JLabel
	      // JLabel lbl=new JLabel("lasjdlsjdlklksajdjl alksdjlsajdlkjsaldjlj",icon,SwingConstants.TOP);
			JLabel lbl=new JLabel();
	        lbl.setIcon(icon);
	        lbl.setAutoscrolls(true);
	//new Trial starts
	        
	        while(iter.hasNext()){
	        	Map.Entry pair = (Map.Entry)iter.next();

	        	JPanel temp=(JPanel)pair.getValue();
				 
				 lbl.add(temp);
			 }

			 
	        /*lbl.add(player1Panel);
			lbl.add(player2Panel);
			lbl.add(player3Panel);*/
			
			player1Panel.setOpaque(false);
			player1Panel.setBounds(200, 1370, 1750, 1450);
			player1Panel.add(player1);
			
			player1.setFont(player1.getFont().deriveFont(18.0f));
			player1.setForeground(Color.red);
			
			player2Panel.setOpaque(false);
			player2Panel.setBounds(200, 1420, 1750, 1450);
			player2Panel.add(player2);
			
			player2.setFont(player1.getFont().deriveFont(18.0f));
			player2.setForeground(Color.yellow);
			
			player3Panel.setOpaque(false);
			player3Panel.setBounds(200,1470, 1750, 1450);
			//player3Panel.setBou
			player3Panel.add(player3);
			
			player3.setFont(player1.getFont().deriveFont(18.0f));
			player3.setForeground(Color.blue);
			
			//new Trial Ends

	        
	        
	        topPanel.add(lbl);
	        //System.out.println("cteate to pane: pane 1 - " +topPanel);
	       //Different style of adding Scroll bar 
	        scrollPane = new JScrollPane(topPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        
	        return scrollPane;
		}
		catch(Exception E){
			
		}
		return scrollPane;
				
	}
	
	public static JPanel create_Bottom_Panel() throws Exception{
		BottomPanel bottompanel=new BottomPanel();
		 JPanel bgPanel = new JPanel();
	        bgPanel.setLayout(new BorderLayout());
	        //bgPanel.setMaximumSize(arg0);
	        //bgPanel.setMaximumSize(new Dimension(1500,1500));
	        JPanel temp1=BottomPanel.bottomPanel;
	        temp1.setBounds(0,0, 200, 500);
	        temp1.setVisible(true);
	        bgPanel.add(temp1);
	        
	        
	        
	        JPanel temp2 = BottomPanel.cardImagePanel;
	        temp2.setBounds(210,0, 196, 290);
	        temp2.setVisible(true);
	        bgPanel.add(temp2);
	        
	        JPanel temp3 = BottomPanel.playerPanel;
	    	//temp3.setBounds(-300,0, 1500, 1000);
	        temp3.setBounds(400,50, 490,490);
	    	temp3.setVisible(true);
	    	bgPanel.add(temp3); 
	    	
	    	JPanel temp4 = BottomPanel.cardPlayedPanel;
	    	//temp3.setBounds(-300,0, 1500, 1000);50,30, 350,250
	        temp4.setBounds(450,50, 650,500);
	    	temp4.setVisible(true);
	    	bgPanel.add(temp4);
	    	
	    	
	    	bgPanel.setVisible(true);
	    	
	    	System.out.println("Temp1: "+temp1.getSize());
	    	System.out.println("Temp2: "+temp2.getSize());
	    	System.out.println("Temp3: "+temp3.getSize());
	        return bgPanel;
	}
		
	public void reDrawPlayerPosition(Dimension d,String player){
		
		
		int x= (int) d.getWidth();
		int y=(int) d.getHeight();
		//playerList.get(player).setBounds(-680, 1320, 1750, 1450);
		//System.out.println("Player: "+player);
		
		
		Iterator iter=playerList.entrySet().iterator();
		//System.out.println("Inside redraw");
        while(iter.hasNext()){
        	//System.out.println("Inside While");
        	Map.Entry pair = (Map.Entry)iter.next();
            String tempString=(String) pair.getKey();
        	if(tempString.equals(player)){
        		//System.out.println("Inside true Case");

        		if(BottomPanel.player.getCurrentPlayer()==Player.humanPlayer){
        			((Component) pair.getValue()).setBounds(x, y, 1750, 1450);
        		}else if(BottomPanel.player.getCurrentPlayer()==Player.aiPlayer1){
        			((Component) pair.getValue()).setBounds(x, y+50, 1750, 1450);
        		}
        		else{
        			((Component) pair.getValue()).setBounds(x, y+100, 1750, 1450);
        		}
			 
        	}
		 }
		
		
		
	}

	public static void main(String args[]){
		MainClass C=new MainClass();
		
		  javax.swing.SwingUtilities.invokeLater(new Runnable() {
			  public void run() {
				  createFrame();
			  }
			    });

			
		//System.out.println("Arun");
	}
}
