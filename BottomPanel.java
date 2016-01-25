import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import CardCollection.CardDetailsClass;

class BottomPanel extends JFrame implements ActionListener{
	RoomConstants roomConstants=new RoomConstants();
	static JPanel bottomPanel=new JPanel();

	static JPanel cardImagePanel= new JPanel();
	static JPanel cardDeletionPanel=new JPanel();
	static JPanel playerPanel= new JPanel();
	static JPanel cardPlayedPanel=new JPanel();
	static JScrollPane scrollPane=new JScrollPane();
	static JSplitPane splitPane=new JSplitPane();

	JButton drawCardButton=new JButton("Draw Card");  //Iteration 2
	JButton moveButton=new JButton("Move");
	JButton playCardButton=new JButton("PlayCard");  //Iteration 2
	static JTextArea log=new JTextArea();
	static JTextArea deckInfo=new JTextArea();
	static Player player;

	static CardDetailsClass cardDetailsClass=new CardDetailsClass();

	static int cardIndex=0;
	static JLabel image=new JLabel();
	static JLabel deleteimage=new JLabel();

	String currentRoom=new String();
	static int moveCount=1;
	static HashMap<String,String> currentRoomTracking=new HashMap<String,String>();
	static int pointexceeded=0;
	


	String[] listRoom;
	DefaultListModel model = new DefaultListModel();
/*//Trying for Point Update
	String[] columns = new String[] {
			"Name", "Learning", "Craft","Integrity","Quality Points"
	};

	//actual data for the table in a 2d array
	Object[][] data = new Object[][] {
		
		{player.Player1,2,2,2,0 },
		{player.Player2,3,1,2,0},
		{player.Player3,0,3,3,0},
	};
	//Trying for Point Update
*/
	JTable playerTable=new JTable();
	DefaultTableModel tableModel;
	static ImageIcon icon;
	ImageIcon icon1;


	static BufferedImage card;
	JList listBox=new JList();

	BoxLayout boxLayout=new BoxLayout(bottomPanel, BoxLayout.PAGE_AXIS);
	static HashMap<String,ArrayList> initialCardinPlayersHand=new HashMap<String,ArrayList>();
	static ArrayList<String> initialCardsHumanPlayer=new ArrayList<String>();  
	static ArrayList<String> initialCardsAIPlayer1=new ArrayList<String>();  
	static ArrayList<String> initialCardsAIPlayer2=new ArrayList<String>();
	
	public static void addCards(){
		ArrayList temp=cardDetailsClass.initial15Cards();
		
		System.out.println("gggggggggggggggggggggggggg");
		System.out.println("initialCardsHumanPlayer Size:"+initialCardsHumanPlayer.size());
		
		System.out.println("initialCardsAIPlayer1 Size:"+initialCardsAIPlayer1.size());
		
		System.out.println("initialCardsAIPlayer2 Size:"+initialCardsAIPlayer2.size());
		
		
		for(int i=1;i<=5;i++){
			/*if(i==3){
				addCardFromHand("51.png",1,"i");	
			}
			if(i==1){
				addCardFromHand("48.png",2,"j");
			}*/
			addCardFromHand();
			//initialCardsHumanPlayer.add((String) temp.get(i-1));
		}
		
		for(int i=6;i<=10;i++){
			addCardFromHand(Player.aiPlayer1);
			
			//addCard();
			//initialCardsAIPlayer1.add((String) temp.get(i-1));
		}
		
		for(int i=11;i<=15;i++){
			addCardFromHand(Player.aiPlayer2,0);
			//initialCardsAIPlayer2.add((String) temp.get(i-1));
		}

	}
	
	public static void addCardFromHand(){
		String addCard=cardDetailsClass.drawCard2();
		
		
		initialCardsHumanPlayer.add(addCard);
		showLastAddedCard(initialCardsHumanPlayer.size());
	}
	
	public static void addCardFromHand(String arun,int i,String a){
		//String addCard=cardDetailsClass.drawCard2();
		
		
		initialCardsHumanPlayer.add(arun);
		showLastAddedCard(initialCardsHumanPlayer.size());
	}
	
	public static void addCardFromHand(String AIPlayer){
		String addCard=cardDetailsClass.drawCard2();
		initialCardsAIPlayer1.add(addCard);
	}
	public static void addCardFromHand(String AIPlayer2, int i){
		String addCard=cardDetailsClass.drawCard2();
		initialCardsAIPlayer2.add(addCard);
	}
	
/*	public static void removeCards(){
		
		initialCardsHumanPlayer.remove("6.png");
		
		initialCardsHumanPlayer.remove("3.png");
		initialCardsHumanPlayer.remove("4.png");
		initialCardsHumanPlayer.remove("1.png");


		initialCardsHumanPlayer.remove("17.png");
		initialCardsHumanPlayer.remove("14.png");
		initialCardsHumanPlayer.remove("16.png");
		initialCardsHumanPlayer.remove("20.png");
		initialCardsHumanPlayer.remove("31.png");
		initialCardsHumanPlayer.remove("32.png");
		initialCardsHumanPlayer.remove("34.png");
		
		initialCardsAIPlayer1.remove("6.png");
		initialCardsAIPlayer1.remove("3.png");
		initialCardsAIPlayer1.remove("4.png");
		initialCardsAIPlayer1.remove("1.png");


		initialCardsAIPlayer1.remove("17.png");
		initialCardsAIPlayer1.remove("14.png");
		initialCardsAIPlayer1.remove("16.png");
		initialCardsAIPlayer1.remove("20.png");
		initialCardsAIPlayer1.remove("31.png");
		initialCardsAIPlayer1.remove("32.png");
		initialCardsAIPlayer1.remove("34.png");
		
		initialCardsAIPlayer2.remove("6.png");
		initialCardsAIPlayer2.remove("3.png");
		initialCardsAIPlayer2.remove("4.png");
		initialCardsAIPlayer2.remove("1.png");


		initialCardsAIPlayer2.remove("17.png");
		initialCardsAIPlayer2.remove("14.png");
		initialCardsAIPlayer2.remove("16.png");
		initialCardsAIPlayer2.remove("20.png");
		initialCardsAIPlayer2.remove("31.png");
		initialCardsAIPlayer2.remove("32.png");
		initialCardsAIPlayer2.remove("34.png");
		
		
		for(int i=0;i<initialCardsHumanPlayer.size();i++){
			//initialCardsHumanPlayer.remove(i);	
			deleteImage();
			//cardIndex--;
		}
		
		for(int i=0;i<initialCardsAIPlayer1.size();i++){
			initialCardsAIPlayer1.remove(i);	
		}
		
		for(int i=0;i<initialCardsAIPlayer2.size();i++){
			initialCardsAIPlayer2.remove(i);	
		}
		
		

		
	}*/
	
	
	
	BottomPanel() {
		player=new Player();
		
		drawCardButton.setSize(10, 10);
		drawCardButton.setVisible(true);
		moveButton.setSize(10, 10);
		moveButton.setLocation(100, 130);
		playCardButton.setSize(10, 10);

		drawCardButton.setEnabled(true);
		moveButton.setEnabled(false);
		playCardButton.setEnabled(false);

		drawCardButton.addActionListener(this);
		moveButton.addActionListener(this);
		playCardButton.addActionListener(this);
		


		try {
			//initialCardsHumanPlayer=cardDetailsClass.initial5Cards();
			
		
			ArrayList temp=cardDetailsClass.initial5Cards();
			for(int i=1;i<=5;i++){
				initialCardsHumanPlayer.add((String) temp.get(i-1));
			}
			
			for(int i=6;i<=10;i++){
				initialCardsAIPlayer1.add((String) temp.get(i-1));
			}
			
			for(int i=11;i<=15;i++){
				initialCardsAIPlayer2.add((String) temp.get(i-1));
			}
			System.out.println();
			System.out.println("Card0: "+initialCardsHumanPlayer.get(0));
			System.out.println("Card1: "+initialCardsHumanPlayer.get(1));
			System.out.println("Card2: "+initialCardsHumanPlayer.get(2));
			System.out.println("Card3: "+initialCardsHumanPlayer.get(3));
			System.out.println("Card4: "+initialCardsHumanPlayer.get(4));
			
			System.out.println("AI Player1 Card0: "+initialCardsAIPlayer1.get(0));
			System.out.println("AI Player1 Card1: "+initialCardsAIPlayer1.get(1));
			System.out.println("AI Player1 Card2: "+initialCardsAIPlayer1.get(2));
			System.out.println("AI Player1 Card3: "+initialCardsAIPlayer1.get(3));
			System.out.println("AI Player1 Card4: "+initialCardsAIPlayer1.get(4));
			

			System.out.println("AI Player2 Card0: "+initialCardsAIPlayer2.get(0));
			System.out.println("AI Player2 Card1: "+initialCardsAIPlayer2.get(1));
			System.out.println("AI Player2 Card2: "+initialCardsAIPlayer2.get(2));
			System.out.println("AI Player2 Card3: "+initialCardsAIPlayer2.get(3));
			System.out.println("AI Player2 Card4: "+initialCardsAIPlayer2.get(4));
			
			
			initialCardinPlayersHand.put(Player.humanPlayer, initialCardsHumanPlayer);
			initialCardinPlayersHand.put(Player.aiPlayer1, initialCardsAIPlayer1);
			initialCardinPlayersHand.put(Player.aiPlayer2, initialCardsAIPlayer2);
			
			

			card=ImageIO.read(new File("C://Users/Arunkumar/Eclipse-workspace/MoveOn/src/CardCollection/images/"+initialCardsHumanPlayer.get(cardIndex)));


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		icon=new ImageIcon(card);
		image=new JLabel(icon);
		deleteimage=new JLabel(icon);
		cardImage();   	
		bottomPanel.setOpaque(false);
		bottomPanel.setLayout(boxLayout);

		bottomPanel.add(drawCardButton);
		//bottomPanel.add(boxLayout.createRigidArea(new Dimension(5,0)));
		bottomPanel.add(moveButton);
		bottomPanel.add(playCardButton);

		Iterator itr;
		ArrayList temp=new ArrayList();
		if(Player.firstPlay==true){
			currentRoomTracking.put(Player.humanPlayer, roomConstants.room17);
			currentRoomTracking.put(Player.aiPlayer1, roomConstants.room17);
			currentRoomTracking.put(Player.aiPlayer2, roomConstants.room17);
			Player.firstPlay=false;
			player.setCurrentPlayer(Player.humanPlayer);
		}
		String currentRoom=new String();
		String playerPlaying=new String();
		Iterator currentRoomIterator= currentRoomTracking.entrySet().iterator();
		while(currentRoomIterator.hasNext()){
			Map.Entry pair = (Map.Entry)currentRoomIterator.next();
			playerPlaying=(String) pair.getKey();
			if(playerPlaying.equals(player.getCurrentPlayer())){

				currentRoom=(String) pair.getValue();
				System.out.println("The Current Player is "+playerPlaying);
				System.out.println("The Current Room is: "+currentRoom);

			}

		}

		//temp=roomConstants.room0Adjacent;

		itr=temp.iterator();
		HashMap b=(roomConstants.adjacentRooms);
		Iterator itr1=b.entrySet().iterator();
		//Iterator itr=roomConstants.room0Adjacent.iterator();

		//Iterator itr;
		ArrayList<String> as=new ArrayList<String>();
		while(itr1.hasNext()){
			Map.Entry pair = (Map.Entry)itr1.next();
			String tempString=(String) pair.getKey();
			if(tempString.equals(currentRoom)){
				as=(ArrayList) (pair.getValue());

				//System.out.println("Inside While: The Current Player is "+playerPlaying);
				//System.out.println("InsideWhile: The Current Room is: "+currentRoom);


			}
		}
		itr= as.iterator();
		int i=0;
		/*    	int lengthList=roomConstants.room0Adjacent.size();
    	listRoom=new String[lengthList];
		 */    	//System.out.println("Iterator: "+itr);

		int lengthList=as.size();
		listRoom=new String[lengthList];


		while(itr.hasNext()){
			//System.out.println("listRoom["+i+"]");
			listRoom[i]= itr.next().toString();
			model.addElement(listRoom[i]);
			i++;
		}
		//String[] listRoom1={"arun","kumar"};

		listBox=new JList(model);
		
		JScrollPane add = new JScrollPane(listBox); 
		bottomPanel.add(add);
		//cardImagePanel.setBounds(10, 10, 50, 50);
		cardImagePanel.add(image);
		cardDeletionPanel.add(deleteimage);
		


		tableModel=new DefaultTableModel(Player.data, Player.columns);
		
		//tableModel.fireTableDataChanged();
	

	playerTable.setModel(tableModel);
/*		playerTable= new JTable(data, columns);
		playerTable.getColumnModel();
		playerTable.getAutoResizeMode();
*/		
		//playerPanel.add(new JScrollPane(playerTable));
		scrollPane=new JScrollPane(playerTable);
		scrollPane.setSize(200, 200);
		
		Dimension d = playerTable.getPreferredSize();
		scrollPane.setPreferredSize(
		    new Dimension(d.width,playerTable.getRowHeight()*5+1));
		
		
		playerPanel.setVisible(true);
		//playerTable.setEnabled(true);
		
		cardPlayedPanel= new JPanel();
		
		
		
		log = new JTextArea(5, 30);
		log.setCaretPosition(log.getDocument()
				.getLength());
		log.setEditable(false);
		JScrollPane sp = new JScrollPane(log); 
		//cardPlayedPanel.setLocation(800, 800);
		
		cardPlayedPanel.add(sp);
		cardPlayedPanel.setVisible(true);

		deckInfo = new JTextArea(2, 20);
		deckInfo.setCaretPosition(deckInfo.getDocument()
				.getLength());
		deckInfo.setEditable(false);
		deckInfo();
		
		/*JScrollPane scrollPane = new JScrollPane(log,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);*/
				splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
						scrollPane, deckInfo);
				splitPane.setDividerLocation(.1f);

		//playerPanel.add(scrollPane);
		playerPanel.add(splitPane);

	}
	
	public static void reshuffle60(){
		ArrayList temp=cardDetailsClass.initial5Cards();
		for(int i=1;i<=5;i++){
			initialCardsHumanPlayer.add((String) temp.get(i-1));
		}
		
		for(int i=6;i<=10;i++){
			initialCardsAIPlayer1.add((String) temp.get(i-1));
		}
		
		for(int i=11;i<=15;i++){
			initialCardsAIPlayer2.add((String) temp.get(i-1));
		}
		System.out.println();
		System.out.println("Card0: "+initialCardsHumanPlayer.get(0));
		System.out.println("Card1: "+initialCardsHumanPlayer.get(1));
		System.out.println("Card2: "+initialCardsHumanPlayer.get(2));
		System.out.println("Card3: "+initialCardsHumanPlayer.get(3));
		System.out.println("Card4: "+initialCardsHumanPlayer.get(4));
		
		System.out.println("AI Player1 Card0: "+initialCardsAIPlayer1.get(0));
		System.out.println("AI Player1 Card1: "+initialCardsAIPlayer1.get(1));
		System.out.println("AI Player1 Card2: "+initialCardsAIPlayer1.get(2));
		System.out.println("AI Player1 Card3: "+initialCardsAIPlayer1.get(3));
		System.out.println("AI Player1 Card4: "+initialCardsAIPlayer1.get(4));
		

		System.out.println("AI Player2 Card0: "+initialCardsAIPlayer2.get(0));
		System.out.println("AI Player2 Card1: "+initialCardsAIPlayer2.get(1));
		System.out.println("AI Player2 Card2: "+initialCardsAIPlayer2.get(2));
		System.out.println("AI Player2 Card3: "+initialCardsAIPlayer2.get(3));
		System.out.println("AI Player2 Card4: "+initialCardsAIPlayer2.get(4));
		
		
		initialCardinPlayersHand.put(Player.humanPlayer, initialCardsHumanPlayer);
		initialCardinPlayersHand.put(Player.aiPlayer1, initialCardsAIPlayer1);
		initialCardinPlayersHand.put(Player.aiPlayer2, initialCardsAIPlayer2);

	}
	public static void deckInfo(){
		int deckTotal;
		int discardTotal;
		/*Deck Info*/
		deckTotal=CardDetailsClass.deckSize();
		discardTotal=CardDetailsClass.discardDeckSize();
		
		BottomPanel.deckInfo.setText("Cards in Deck: "+deckTotal+"\t"+"Discards out of play:"+discardTotal+"\n"+"You are "+Player.getCurrentPlayer()+
				" and you are in "+player.roomDetails.get(Player.getCurrentPlayer())
				+"\n"+"\n"+"Human Player is "+Player.humanPlayer);
		
		if(discardTotal==0){
			CardDetailsClass.reShuffle();
		}
		/*Deck Info*/
		
	}

	public static void cardImage(){

		//	image=new JLabel(icon1);
		System.out.println("Inside CardImage");
		image.addMouseListener(new java.awt.event.MouseAdapter()
		{

			public void mousePressed(java.awt.event.MouseEvent evt)
			{
				try {
					System.out.println("Old Image MouseListener: "+image.getMouseListeners());
					cardImagePanel.remove(image);
					
					cardDeletionPanel.remove(deleteimage);
					


					cardIndex++;
					
					System.out.println("Card Index: "+cardIndex);
					
					if(cardIndex>=initialCardsHumanPlayer.size())
						cardIndex=0;
					
					System.out.println("Old Image: "+image);
					card=ImageIO.read(new File("C://Users/Arunkumar/Eclipse-workspace/MoveOn/src/CardCollection/images/"+initialCardsHumanPlayer.get(cardIndex)));
					icon=new ImageIcon(card);
					image=new JLabel(icon);
					deleteimage=new JLabel(icon);

					System.out.println("New Image MouseListener: "+image.getMouseListeners());
					cardImagePanel.add(image);
					cardDeletionPanel.add(deleteimage);
					//cardImagePanel.imageUpdate(image.createImage(196, 290), 1,210,0, 196, 290);
					//cardImagePanel.setVisible(true);
					System.out.println("New Image: "+image);
					//cardImagePanel.setBounds(210,0, 196, 290);
					//cardImagePanel.requestFocus();
					cardImagePanel.revalidate();
					cardImagePanel.repaint();
					cardImagePanel.requestFocus();
					cardDeletionPanel.revalidate();
					cardDeletionPanel.repaint();
					cardDeletionPanel.requestFocus();
					
					cardImage();
					//new BottomPanel();



				} catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Catch");
				}

				System.out.println("Mouse Clicked on Image");
				double x = evt.getX();
				double y = evt.getY();
				//newCube.setCube(x,y);
			}
		});
		
		
		deleteimage.addMouseListener(new java.awt.event.MouseAdapter()
		{

			public void mousePressed(java.awt.event.MouseEvent evt)
			{
				try {
					System.out.println("Old Image MouseListener: "+image.getMouseListeners());
					cardImagePanel.remove(image);
					cardDeletionPanel.remove(deleteimage);
					


					cardIndex++;
					
					System.out.println("Card Index: "+cardIndex);
					
					if(cardIndex>=initialCardsHumanPlayer.size())
						cardIndex=0;
					
					System.out.println("Old Image: "+image);
					card=ImageIO.read(new File("C://Users/Arunkumar/Eclipse-workspace/MoveOn/src/CardCollection/images/"+initialCardsHumanPlayer.get(cardIndex)));
					icon=new ImageIcon(card);
					image=new JLabel(icon);
					deleteimage=new JLabel(icon);

					System.out.println("New Image MouseListener: "+image.getMouseListeners());
					cardImagePanel.add(image);
					cardDeletionPanel.add(deleteimage);
					//cardImagePanel.imageUpdate(image.createImage(196, 290), 1,210,0, 196, 290);
					//cardImagePanel.setVisible(true);
					System.out.println("New Image: "+image);
					//cardImagePanel.setBounds(210,0, 196, 290);
					//cardImagePanel.requestFocus();
					cardImagePanel.revalidate();
					cardImagePanel.repaint();
					cardImagePanel.requestFocus();
					cardDeletionPanel.revalidate();
					cardDeletionPanel.repaint();
					cardDeletionPanel.requestFocus();
					
					cardImage();
					//new BottomPanel();



				} catch ( Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Catch");
				}

				System.out.println("Mouse Clicked on Image");
				double x = evt.getX();
				double y = evt.getY();
				//newCube.setCube(x,y);
			}
		});
		//return new JLabel(icon1);

	}
	

	public  void track(){

		System.out.println("");

		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("");
		DefaultListModel model = new DefaultListModel();
		//bottomPanel.remove(listBox);
		String currentRoom=new String();
		String playerPlaying=new String();
		Iterator currentRoomIterator= currentRoomTracking.entrySet().iterator();
		while(currentRoomIterator.hasNext()){
			Map.Entry pair = (Map.Entry)currentRoomIterator.next();
			playerPlaying=(String) pair.getKey();
			if(playerPlaying.equals(player.getCurrentPlayer())){

				currentRoom=(String) pair.getValue();
				System.out.println("The Current Player is "+playerPlaying);
				System.out.println("The Current Room is: "+currentRoom);

			}

		}

		//temp=roomConstants.room0Adjacent;
		Iterator itr;
		ArrayList temp=new ArrayList();

		itr=temp.iterator();
		 HashMap b=(roomConstants.adjacentRooms);
		Iterator itr1=b.entrySet().iterator();
		//Iterator itr=roomConstants.room0Adjacent.iterator();

		//Iterator itr;
		ArrayList<String> as=new ArrayList<String>();
		while(itr1.hasNext()){
			Map.Entry pair = (Map.Entry)itr1.next();
			String tempString=(String) pair.getKey();
			if(tempString.equals(currentRoom)){
				as=(ArrayList) (pair.getValue());

				//System.out.println("Inside While: The Current Player is "+playerPlaying);
				//System.out.println("InsideWhile: The Current Room is: "+currentRoom);


			}
		}
		itr= as.iterator();
		int i=0;
		/*    	int lengthList=roomConstants.room0Adjacent.size();
    	listRoom=new String[lengthList];
		 */    	//System.out.println("Iterator: "+itr);

		int lengthList=as.size();
		listRoom=new String[lengthList];


		while(itr.hasNext()){
			//System.out.println("listRoom["+i+"]");
			listRoom[i]= itr.next().toString();
			model.addElement(listRoom[i]);
			System.out.println("Listroom: "+listRoom[i]);
			i++;
		}
		//String[] listRoom1={"arun","kumar"};

		//listBox=new JList(model);
		listBox.setModel(model);
		//bottomPanel.add(listBox);
		//bottomPanel.setVisible(true);

		System.out.println("");

		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("");

	}
	public static void modifyPlayerData(String room){
		//if(player.getCurrentPlayer().equals(Player.humanPlayer)){
		currentRoomTracking.put(player.getCurrentPlayer(), room);
		//}
		//System.out.println();
		//System.out.println("Human Player: "+Player.humanPlayer+" "+currentRoomTracking.get(player.getCurrentPlayer()));
		//System.out.println();
	}


	public static void addCard(){
		String addCard=cardDetailsClass.drawCard();
		initialCardsHumanPlayer.add(addCard);
		showLastAddedCard(initialCardsHumanPlayer.size());
	}
	
	public static void addCard(String AIPlayer){
		String addCard=cardDetailsClass.drawCard();
		initialCardsAIPlayer1.add(addCard);
	}
	public static void addCard(String AIPlayer2, int i){
		String addCard=cardDetailsClass.drawCard();
		initialCardsAIPlayer2.add(addCard);
	}
	
/*public static void deleteCard(){
	Player.pointUpdatePlayer=Player.getCurrentPlayer();
	//TempFix for play without Clicking on Move
	System.out.println("ZZZZZZZZZZZZZZZZZZZZ");
	System.out.println();
	System.out.println("PointUpdatePlayer:" +Player.pointUpdatePlayer);
	System.out.println();
	System.out.println("ZZZZZZZZZZZZZZZZZZZZ");
	moveButton.setEnabled(false);
	playCardButton.setEnabled(false);
	drawCardButton.setEnabled(true);
	//Log that is needed for Play Card
	BottomPanel.playerMovement.append(Player.getCurrentPlayer()+" played "+"Card for Points"+"\n");
	
	//Discard Deck for selected Card
	String removeCard=initialCardsHumanPlayer.get(cardIndex);
	String playCard=removeCard;
	System.out.println("Discard Deck Card:"+removeCard);
	initialCardsHumanPlayer.remove(cardIndex);
	cardIndex--;
	cardImage();
	cardDetailsClass.discardDeck(removeCard);
	deckInfo();
//Sample Table Change Code. Make Use of it.
	
	Player.data[0][0]="Arun";

	tableModel=new DefaultTableModel(Player.data,Player.columns);
	tableModel.fireTableDataChanged();

	//player.updatePlayer(playCard);
	tableModel=new DefaultTableModel(Player.data,Player.columns);
playerTable.setModel(tableModel);

tableModel.fireTableDataChanged();
tableModel.fireTableDataChanged();
}
*/
	
	public static void deleteImage(){
		//TempFix for play without Clicking on Move
//		Player.pointUpdatePlayer=Player.getCurrentPlayer();
		//TempFix for play without Clicking on Move
		System.out.println("ZZZZZZZZZZZZZZZZZZZZ");
		System.out.println();
		System.out.println("PointUpdatePlayer:" +Player.pointUpdatePlayer);
		System.out.println();
		System.out.println("ZZZZZZZZZZZZZZZZZZZZ");
/*		moveButton.setEnabled(false);
		playCardButton.setEnabled(false);
		drawCardButton.setEnabled(true);
*/		//Log that is needed for Play Card
		/*BottomPanel.playerMovement.append(Player.getCurrentPlayer()+" played "+"Card for Points"+"\n");*/
		
		//Discard Deck for selected Card
		String removeCard=initialCardsHumanPlayer.get(cardIndex);
		String playCard=removeCard;
		System.out.println("Discard Deck Card:"+removeCard);
		initialCardsHumanPlayer.remove(cardIndex);
		cardIndex--;
		cardImage();
		cardDetailsClass.discardDeck(removeCard);
		deckInfo();
//Sample Table Change Code. Make Use of it.
		
		/*Player.data[0][0]="Arun";
	
		tableModel=new DefaultTableModel(Player.data,Player.columns);
		tableModel.fireTableDataChanged();*/

		//player.updatePlayer(playCard);
		/*tableModel=new DefaultTableModel(Player.data,Player.columns);
	playerTable.setModel(tableModel);
	
	tableModel.fireTableDataChanged();
	tableModel.fireTableDataChanged();
	
	//Sample Table Change Code. Make Use of it.
	moveCount=4;
	//Both Goes Along..
	aiPlayerMovement();
*/	deckInfo();
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Inside Action Performed");
		if(e.getActionCommand().equals("Draw Card")){
			deckInfo();
			System.out.println("INside Draw Card");
/*			String addCard=cardDetailsClass.drawCard();
			initialCardsHumanPlayer.add(addCard);
			showLastAddedCard(initialCardsHumanPlayer.size());
			
			
*/			
			addCard();
			moveButton.setEnabled(true);
			playCardButton.setEnabled(true);
			drawCardButton.setEnabled(false);
						
//Sample Table Change Code. Make Use of it.
			
		/*	Player.data[0][0]="Kumar";
		
			tableModel=new DefaultTableModel(Player.data,Player.columns);
			tableModel.fireTableDataChanged();

		playerTable.setModel(tableModel);
*/		//Sample Table Change Code. Make Use of it.

			
			
			deckInfo();
		}
		if(e.getActionCommand().equals("PlayCard")){
			//TempFix for play without Clicking on Move
			//Player.pointUpdatePlayer=Player.getCurrentPlayer();
			Player.pointUpdatePlayer=Player.getCurrentPlayer();
			//TempFix for play without Clicking on Move
			System.out.println("ZZZZZZZZZZZZZZZZZZZZHuman Player");
			System.out.println();
			System.out.println("PointUpdatePlayer:" +Player.pointUpdatePlayer);
			System.out.println();
			System.out.println("ZZZZZZZZZZZZZZZZZZZZ");
			moveButton.setEnabled(false);
			playCardButton.setEnabled(false);
			drawCardButton.setEnabled(true);
			//Log that is needed for Play Card
			/*BottomPanel.playerMovement.append(Player.getCurrentPlayer()+" played "+"Card for Points"+"\n");*/
			
			//Discard Deck for selected Card
			String removeCard=initialCardsHumanPlayer.get(cardIndex);
			//log(removeCard);
			String playCard=removeCard;
			System.out.println("Discard Deck Card:"+removeCard);
			initialCardsHumanPlayer.remove(cardIndex);
			cardIndex--;
			cardImage();
			cardDetailsClass.discardDeck(removeCard);
			deckInfo();
//Sample Table Change Code. Make Use of it.
			
			/*Player.data[0][0]="Arun";
		
			tableModel=new DefaultTableModel(Player.data,Player.columns);
			tableModel.fireTableDataChanged();*/

			player.updatePlayer(playCard);
			tableModel=new DefaultTableModel(Player.data,Player.columns);
		playerTable.setModel(tableModel);
		
		tableModel.fireTableDataChanged();
		tableModel.fireTableDataChanged();
		
		//Sample Table Change Code. Make Use of it.
		moveCount=4;
		//Both Goes Along..
		aiPlayerMovement();
		
		deckInfo();
		
		
		player.pointCheck();
	
		}
		if (e.getActionCommand().equals("Move")) {
			//System.out.println("You CLicked on Move");
			if(moveCount<=3){
				
				int selectedIndex=listBox.getSelectedIndex();
				//System.out.println("Selected Value: "+listRoom[selectedIndex]);
				
				
				player.modifyPlayerPosition(listRoom[selectedIndex]);
				//modifyPlayerData(listRoom[selectedIndex]);
				track();        	
				//modifyPlayerData(listRoom[selectedIndex]);
				moveCount++;
				if(moveCount==4){
					moveButton.setEnabled(false);
					playCardButton.setEnabled(true);
					drawCardButton.setEnabled(false);
					
				}
				//deckInfo();
			
			}
/*			if(moveCount>3){
				Random random = new Random();
				//AIplayer1
				while(moveCount<=6){
					int select1 = random.nextInt(listRoom.length);
					modifyPlayerData(listRoom[select1]);
					player.modifyPlayerPosition(listRoom[select1]);

					track();
					moveCount++;
				}
				//AIPlayer2
				while(moveCount<=9){
					int select2 = random.nextInt(listRoom.length);
					modifyPlayerData(listRoom[select2]);
					player.modifyPlayerPosition(listRoom[select2]);

					track();
					moveCount++;
				}
				if(moveCount>9)
					moveCount=1;

			}
*/			
			//Both Goes Along..
		//	aiPlayerMovement();
			//deckInfo();

		}    

	}
	
	public void aiPlayerMovement(){
		if(moveCount>3){
			Random random = new Random();
			//AIplayer1
			while(moveCount<=6){
				int select1 = random.nextInt(listRoom.length);
				
				
				player.modifyPlayerPosition(listRoom[select1]);
				//modifyPlayerData(listRoom[select1]);

				track();
				moveCount++;
			}
		addCard("AIPlayer");
			ai1PlayCard();
		//AIPlayer2
			while(moveCount<=9){
				int select2 = random.nextInt(listRoom.length);
				
				
				player.modifyPlayerPosition(listRoom[select2]);
				//modifyPlayerData(listRoom[select2]);
				track();
				moveCount++;
			}
			if(moveCount>9)
				moveCount=1;

		}
		addCard("AIPlayer",1);
		ai2PlayCard();
		//deckInfo();

	}
	
	public void ai1PlayCard(){
		//TempFix for play without Clicking on Move
		//Player.pointUpdatePlayer=Player.getCurrentPlayer();
		//TempFix for play without Clicking on Move
		System.out.println("ZZZZZZZZZZZZZZZZZZZZInside AIPlayer1");
		System.out.println();
		System.out.println();
		System.out.println("PointUpdatePlayer:" +Player.pointUpdatePlayer);
		System.out.println();
		System.out.println("ZZZZZZZZZZZZZZZZZZZZ Inside AIPlayer1");
		moveButton.setEnabled(false);
		playCardButton.setEnabled(false);
		drawCardButton.setEnabled(true);
		//Log that is needed for Play Card
		/*BottomPanel.playerMovement.append(Player.getCurrentPlayer()+" played "+"Card for Points"+"\n");*/
		
		//Discard Deck for selected Card
		int size=initialCardsAIPlayer1.size();
		Random random=new Random();
		int select=random.nextInt(size);
		String removeCard=initialCardsAIPlayer1.get(select);
		String playCard=removeCard;
		System.out.println("Discard Deck Card:"+removeCard);
		initialCardsAIPlayer1.remove(select);
		
		//cardImage();
		cardDetailsClass.discardDeck(removeCard);
		deckInfo();
//Sample Table Change Code. Make Use of it.
		
		/*Player.data[0][0]="Arun";
	
		tableModel=new DefaultTableModel(Player.data,Player.columns);
		tableModel.fireTableDataChanged();*/

		player.updatePlayer(playCard);
		tableModel=new DefaultTableModel(Player.data,Player.columns);
	playerTable.setModel(tableModel);
	
	tableModel.fireTableDataChanged();
	tableModel.fireTableDataChanged();
	
	//Sample Table Change Code. Make Use of it.
	//moveCount=4;
	//Both Goes Along..
	//aiPlayerMovement();
	deckInfo();

	}
	
	public void ai2PlayCard(){
		//TempFix for play without Clicking on Move
		//Player.pointUpdatePlayer=Player.getCurrentPlayer();
		
		//Player.pointUpdatePlayer=Player.getCurrentPlayer();
		//TempFix for play without Clicking on Move
		System.out.println("ZZZZZZZZZZZZZZZZZZZZInside AIPlayer2");
		System.out.println();
		System.out.println("PointUpdatePlayer:" +Player.pointUpdatePlayer);
		System.out.println();
		System.out.println("ZZZZZZZZZZZZZZZZZZZZ Inside AIPlayer2");
		moveButton.setEnabled(false);
		playCardButton.setEnabled(false);
		drawCardButton.setEnabled(true);
		//Log that is needed for Play Card
		/*BottomPanel.playerMovement.append(Player.getCurrentPlayer()+" played "+"Card for Points"+"\n");*/
		
		//Discard Deck for selected Card
		int size=initialCardsAIPlayer2.size();
		Random random=new Random();
		int select=random.nextInt(size);
		String removeCard=initialCardsAIPlayer2.get(select);
		String playCard=removeCard;
		System.out.println("Discard Deck Card:"+removeCard);
		initialCardsAIPlayer2.remove(select);
		
		//cardImage();
		cardDetailsClass.discardDeck(removeCard);
		deckInfo();
//Sample Table Change Code. Make Use of it.
		
		/*Player.data[0][0]="Arun";
	
		tableModel=new DefaultTableModel(Player.data,Player.columns);
		tableModel.fireTableDataChanged();*/

		player.updatePlayer(playCard);
		tableModel=new DefaultTableModel(Player.data,Player.columns);
	playerTable.setModel(tableModel);
	
	tableModel.fireTableDataChanged();
	tableModel.fireTableDataChanged();
	
	//Sample Table Change Code. Make Use of it.
	//moveCount=4;
	//Both Goes Along..
	//aiPlayerMovement();
	deckInfo();

	}

	
	
	public static void showLastAddedCard(int i){
		System.out.println();
		System.out.println("Size: "+i);
		System.out.println();
		System.out.println("Old Image MouseListener: "+image.getMouseListeners());
		cardImagePanel.remove(image);
		cardDeletionPanel.remove(deleteimage);


		i--;
		cardIndex=i;
		System.out.println("Old Image: "+image);
		
		
		try {
			
			card=ImageIO.read(new File("C://Users/Arunkumar/Eclipse-workspace/MoveOn/src/CardCollection/images/"+initialCardsHumanPlayer.get(cardIndex)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icon=new ImageIcon(card);
		image=new JLabel(icon);
		deleteimage=new JLabel(icon);

		System.out.println("New Image MouseListener: "+image.getMouseListeners());
		cardImagePanel.add(image);
		cardDeletionPanel.add(deleteimage);
		//cardImagePanel.imageUpdate(image.createImage(196, 290), 1,210,0, 196, 290);
		//cardImagePanel.setVisible(true);
		System.out.println("New Image: "+image);
		//cardImagePanel.setBounds(210,0, 196, 290);
		//cardImagePanel.requestFocus();
		
		cardImagePanel.revalidate();
		cardImagePanel.repaint();
		cardImagePanel.requestFocus();
		
		cardDeletionPanel.revalidate();
		cardDeletionPanel.repaint();
		cardDeletionPanel.requestFocus();
		cardImage();
		//new BottomPanel();

		
		
	}


}