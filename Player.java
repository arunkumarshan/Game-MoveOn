import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JFrame;

import CardCollection.CardDetailsClass;

class Player{
	static String Player1="Arun";
	static String Player2="Avneet";
	static String Player3="Gagan";
	static String humanPlayer;
	static String aiPlayer1;
	static String aiPlayer2;
	static String pointUpdatePlayer;
	String Players[]= {"Arun","Avneet","Gagan"};
	Boolean firstTime=true;
	static Boolean Eligibility=false;
	RoomConstants rc=new RoomConstants();
	static Map<String,String> roomDetails=new HashMap<String,String>();
	Dimension d=new Dimension();
	MainClass mainObject=new MainClass();
	private static String currentPlayer=new String();
	private static String previousPlayer=new String();
	
	static Map<String,Map> tableValue=new HashMap<String,Map>();
	static Map<String,Integer> player1Points=new HashMap<String,Integer>();
	static Map<String,Integer> player2Points=new HashMap<String,Integer>();
	static Map<String,Integer> player3Points=new HashMap<String,Integer>();
	
	static int i=0;
	
	public static void pointCheck(){
		
	//if(i==0){	
		
		if(player1Points.get(columns[4]).intValue()>=60&&player2Points.get(columns[4]).intValue()>=60&&player3Points.get(columns[4]).intValue()>=60){
			System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWInside Point Check");
			
			
			//code Goes Here
			
			removeGameCard1();
			
			CardConstants.removeCard();
			CardDetailsClass.removeCard();
			
			
			CardConstants.addCard();
			
			BottomPanel.addCards();
			
			
			
			BottomPanel.pointexceeded=1;
			
			
		/*	MainClass.splitPane.remove(MainClass.pane2);
			BottomPanel bp=new BottomPanel();
			MainClass.splitPane.add(MainClass.pane2);*/
			
	i++;		
	//	}
	}
		
	}
	
	//Trying for Point Update
	static String[] columns = new String[] {
			"Name", "Learning", "Craft","Integrity","QualityPoints"
	};

	//actual data for the table in a 2d array
/*	static Object[][] data = new Object[][] {
		
		{Player1,2,2,2,0 },
		{Player2,3,1,2,0},
		{Player3,0,3,3,0},
	};
*/	
	static Object[][] data;
	//Trying for Point Update
	public  void updatePlayer(String playCard){
/*	Commented for Trial Purpose
 * 	int i=0,j=1;
		if(pointUpdatePlayer==Player1){
			i=0;
			data[0][1]=Integer.valueOf(data[0][1].toString()).intValue()+1;
			
		}
		if(pointUpdatePlayer==Player2){
			i=1;
			data[1][1]=Integer.valueOf(data[1][1].toString()).intValue()+1;
		}
		if(pointUpdatePlayer==Player3){
			i=2;
			data[2][1]=Integer.valueOf(data[2][1].toString()).intValue()+1;
		}
		System.out.println("Data Changed: "+data[i][j]);
*/	
		
		CardConstants CC=new CardConstants();
		Card playCardClass=CardConstants.cardClassMap.get(playCard);
		System.out.println("PlayCardClass: "+playCardClass);
		String tempCard=CC.cardValueMap.get(playCard);
		
		if(Player.Eligibility.equals(true)){
			BottomPanel.log.append(Player.pointUpdatePlayer+" played "+tempCard+" for");
			}
			else{
				BottomPanel.log.append(Player.pointUpdatePlayer+" played "+tempCard+" for");
			
			}
		
		playCardClass.play();
		
		
		
		
		
		
		
		
/*		//Sample Value change code in JTable
		Integer ar=0;
		
		
		
		HashMap t=(HashMap) tableValue.get(pointUpdatePlayer);
		
		//if()
		//if(pointUpdatePlayer.equals(Player1)){
			//player1Points.
		
			ar=(Integer) t.get(columns[1]);
			System.out.println("Ar: "+ar);
			ar=ar+1;
			t.put("Learning",ar);
			ar=(Integer) t.get(columns[2]);
			ar=ar+1;
			t.put(columns[2],ar);
			ar=(Integer) t.get(columns[3]);
			ar=ar+1;
			t.put(columns[3],ar);
			
			initializeTable();
			
			//System.out.println("Current Selected Card: "+BottomPanel.initialCards.get(BottomPanel.cardIndex));
			
			
		//	}
		System.out.println("Ar: "+ar);
		System.out.println("Data Changed: "+data[0][1]);
		//Sample Value change code in JTable
			*/
		
		}
	
	public static Boolean removeGameCard(int total,Boolean Eligibility){
		Boolean done=false;
		if(Player.pointUpdatePlayer.equals(humanPlayer)){

			if(Eligibility.equals(true)){

				int i=0;
				while(i<total){
					CardRemoveDialog.action();
					done=true;
					i++;
				}

			}

			else{
				if(Eligibility.equals(true)){


					int i=0;
					while(i<total){

						ArrayList arrTemp=BottomPanel.initialCardinPlayersHand.get(pointUpdatePlayer);
						Random random=new Random();
						int select= random.nextInt(arrTemp.size());
						String removeCard=(String) arrTemp.get(select);
						String playCard=removeCard;
						System.out.println("Discard Deck Card:"+removeCard);
						arrTemp.remove(select);
						done=true;
						i++;
					}
				}



			}
		}
		return done;
	}
	

	public static void removeGameCard1(){
		//Boolean done=false;
	//	if(true){

			//if(Eligibility.equals(true)){

			int i=0;
			int total;
			total=BottomPanel.initialCardsHumanPlayer.size();
			while(i<total){
System.out.println("DELETING DELETING");
				BottomPanel.deleteImage();
				//done=true;
				i++;
			}
	//	}

		//}


		//if(Eligibility.equals(true)){

		//if(true){

			int j=0;


			ArrayList arrTemp=BottomPanel.initialCardinPlayersHand.get(pointUpdatePlayer);
			int size=arrTemp.size();
			while(j<size){
				Random random=new Random();
				int select= random.nextInt(arrTemp.size());
				String removeCard=(String) arrTemp.get(select);
				String playCard=removeCard;
				System.out.println("Discard Deck Card:"+removeCard);
				arrTemp.remove(select);
				//done=true;
				j++;
			}
			//}





		}
	//}



	
		
	
	
	public static void updatePlayerSucessPoints(int Learning,int Craft,int Integrity,int QualityPoints){
		//if(Eligibility.equals(true)){
Integer ar=0;
		
		
		
		HashMap t=(HashMap) tableValue.get(pointUpdatePlayer);
		
		//if()
		//if(pointUpdatePlayer.equals(Player1)){
			//player1Points.
		
			ar=(Integer) t.get(columns[1]);
			System.out.println("Ar: "+ar);
			ar=ar+Learning;
			t.put(columns[1],ar);
			ar=(Integer) t.get(columns[2]);
			ar=ar+Craft;
			t.put(columns[2],ar);
			ar=(Integer) t.get(columns[3]);
			ar=ar+Integrity;
			t.put(columns[3],ar);
			ar=(Integer) t.get(columns[4]);
			ar=ar+QualityPoints;
			t.put(columns[4],ar);
			
			initializeTable();
		//}
	}
	

	
	public static void updatePlayerSuccessCondn(int Learning,int Craft,int Integrity,int QualityPoints,int getGameCardCount,int chipCount,String newRoom,ArrayList ChipOptions, Boolean GameCard,Boolean Chips,Boolean playerMovement,Boolean Eligibility){

		//Sample Value change code in JTable
		if(Eligibility.equals(true)){
		 updatePlayerSucessPoints(Learning,Craft,Integrity,QualityPoints);
		
		
		HashMap t=(HashMap) tableValue.get(pointUpdatePlayer);
		
		//if()
		//if(pointUpdatePlayer.equals(Player1)){
			//player1Points.
		
			/*ar=(Integer) t.get(columns[1]);
			System.out.println("Ar: "+ar);
			ar=ar+Learning;
			t.put(columns[1],ar);
			ar=(Integer) t.get(columns[2]);
			ar=ar+Craft;
			t.put(columns[2],ar);
			ar=(Integer) t.get(columns[3]);
			ar=ar+Integrity;
			t.put(columns[3],ar);
			ar=(Integer) t.get(columns[4]);
			ar=ar+QualityPoints;
			t.put(columns[4],ar);
			
			initializeTable();*/
			
			if(GameCard.equals(true)){
				int i=0;
				while(i<getGameCardCount){
					BottomPanel.addCard();
					//BottomPanel.deckInfo();
					i++;
				}
			}
			if(playerMovement.equals(true)){
				BottomPanel.player.modifyPlayerPosition(newRoom);
				
				
			}
			if(Chips.equals(true)){
				int i=0;
				while(i<chipCount){
					if(pointUpdatePlayer.equals(humanPlayer)){
						ChipsOptionDialog.action(ChipOptions);
					}
					else{
						Random random=new Random();
						int select=random.nextInt(3)+1;
						if(select==1){
							Player.updatePlayerSucessPoints(1,0,0,0);

						}
						else if(select==2){
							Player.updatePlayerSucessPoints(0,1,0,0);
						}
						else{
							Player.updatePlayerSucessPoints(0,0,1,0);
						}

					}
					i++;
				}

			}
			//MainClass.temp2Add();
			//MainClass.refresh();
			//MainClass.createFrame();
			
			//initializeTable();
			
			//System.out.println("Current Selected Card: "+BottomPanel.initialCards.get(BottomPanel.cardIndex));
			
			
		//	}
		//System.out.println("Ar: "+ar);
		System.out.println("Data Changed: "+data[0][1]);
		//Sample Value change code in JTable
		}
			
	}
	
	public static void removeGameCardFailCondn(int total,Boolean Eligibility){
		//Boolean done=false;
		if(Eligibility.equals(false)){
			
			int i=0;
			while(i<total){
				
				//while(i<chipCount){
					if(pointUpdatePlayer.equals(humanPlayer)){
						CardRemoveDialog.action();
					}
					else{
						
						/*initialCardinPlayersHand=new HashMap<String,ArrayList>();
						static ArrayList<String> initialCardsHumanPlayer=new ArrayList<String>();  
						static ArrayList<String> initialCardsAIPlayer1=new ArrayList<String>();  
						static ArrayList<String> initialCardsAIPlayer2=new*/
						
						
						
						ArrayList arrTemp=BottomPanel.initialCardinPlayersHand.get(pointUpdatePlayer);
						Random random=new Random();
						int select= random.nextInt(arrTemp.size());
						String removeCard=(String) arrTemp.get(select);
						String playCard=removeCard;
						System.out.println("Discard Deck Card:"+removeCard);
						arrTemp.remove(select);
					
						


					}
					i++;
				//}
				
				
				
				
				i++;
			}
			
		}
	
		
	}
	
	public static void updatePlayerFailPoints(int Learning,int Craft,int Integrity,int QualityPoints){
Integer ar=0;
		
		
		
		HashMap t=(HashMap) tableValue.get(pointUpdatePlayer);
		
		//if()
		//if(pointUpdatePlayer.equals(Player1)){
			//player1Points.
		
			ar=(Integer) t.get(columns[1]);
			System.out.println("Ar: "+ar);
			ar=ar-Learning;
			t.put(columns[1],ar);
			ar=(Integer) t.get(columns[2]);
			ar=ar-Craft;
			t.put(columns[2],ar);
			ar=(Integer) t.get(columns[3]);
			ar=ar-Integrity;
			t.put(columns[3],ar);
			ar=(Integer) t.get(columns[4]);
			ar=ar-QualityPoints;
			t.put(columns[4],ar);
			
			initializeTable();
	}

	
	public static void updatePlayerFailCondn(int Learning,int Craft,int Integrity,int QualityPoints,int getGameCardCount,String newRoom, Boolean failPenality,Boolean GameCard,Boolean playerMovement,Boolean Eligibility){

		//Sample Value change code in JTable
		if(failPenality.equals(true)){
		if(Eligibility.equals(false)){
		 updatePlayerFailPoints(Learning,Craft,Integrity,QualityPoints);
		
		
		HashMap t=(HashMap) tableValue.get(pointUpdatePlayer);
		
		
			
			if(GameCard.equals(true)){
				int i=0;
				while(i<getGameCardCount){
					Player.removeGameCardFailCondn(getGameCardCount,Eligibility);
					//BottomPanel.deckInfo();
					i++;
				}
			}
			if(playerMovement.equals(true)){
				BottomPanel.player.modifyPlayerPosition(newRoom);
				
				
			}
			
				
			
			//MainClass.temp2Add();
			//MainClass.refresh();
			//MainClass.createFrame();
			
			//initializeTable();
			
			//System.out.println("Current Selected Card: "+BottomPanel.initialCards.get(BottomPanel.cardIndex));
			
			
		//	}
		//System.out.println("Ar: "+ar);
		System.out.println("Data Changed: "+data[0][1]);
		//Sample Value change code in JTable
		}
		}
			
	}

	
	public static String getPreviousPlayer() {
		return previousPlayer;
	}

	public static void setPreviousPlayer(String previousPlayer) {
		Player.previousPlayer = previousPlayer;
	}

	static Boolean firstPlay=true;
	
	public static String getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(String currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public void initializePlayerPoints(){
		tableValue.put(Player1,player1Points);
		tableValue.put(Player2,player2Points);
		tableValue.put(Player3,player3Points);
		
		//playerPoints.put(Player1, value);
		
	}
	
	public void initializePlayerValues(){
		player1Points.put(columns[1],6);
		player1Points.put(columns[2],6);
		player1Points.put(columns[3],6);
		player1Points.put(columns[4],60);
		
		player2Points.put(columns[1],6);
		player2Points.put(columns[2], 6);
		player2Points.put(columns[3],6);
		player2Points.put(columns[4],65);
		
		
		player3Points.put(columns[1],6);
		player3Points.put(columns[2], 6);
		player3Points.put(columns[3],8);
		player3Points.put(columns[4],80);
		
		
		
		
	}
	
	public static void initializeTable(){
		data= new Object[tableValue.keySet().size()][5];
		tableValue.put(Player1, player1Points);
		tableValue.put(Player2, player2Points);
		tableValue.put(Player3, player3Points);
		
		player1Points.get(Player1);
		
		data[0][0]=Player1;
		data[0][1]=player1Points.get("Learning");
		data[0][2]=player1Points.get("Craft");
		data[0][3]=player1Points.get("Integrity");
		data[0][4]=player1Points.get("QualityPoints");
		
		data[1][0]=Player2;
		data[1][1]=player2Points.get("Learning");
		data[1][2]=player2Points.get("Craft");
		data[1][3]=player2Points.get("Integrity");
		data[1][4]=player2Points.get("QualityPoints");
		
		data[2][0]=Player3;
		data[2][1]=player3Points.get("Learning");
		data[2][2]=player3Points.get("Craft");
		data[2][3]=player3Points.get("Integrity");
		data[2][4]=player3Points.get("QualityPoints");
		}
		
	
	public Player(){
		initializePlayerPoints();
		initializePlayerValues();
		initializeTable();
		
		
		Random random = new Random();
		
		int select1 = random.nextInt(Players.length);
		int select2 = random.nextInt(Players.length);
		int select3 = random.nextInt(Players.length);
		
		while(select2==select1){
			select2= random.nextInt(Players.length);
		}
		for(int i=0;i<=2;i++){
			if(i!=select1 && i!=select2){
				select3=i;
			}
		}
		humanPlayer=Players[select1];
		aiPlayer1=Players[select2];
		aiPlayer2=Players[select3];
		pointUpdatePlayer=humanPlayer;
		
		System.out.println();
		System.out.println("Random selected Human Player is "+humanPlayer);
		
		System.out.println("Random selected AI1 Player is "+aiPlayer1);

		System.out.println("Random selected AI2 Player is "+aiPlayer2);
		roomDetails.put(humanPlayer, "ECS 308");
		roomDetails.put(aiPlayer1, "ECS 308");
		roomDetails.put(aiPlayer2, "ECS 308");
		System.out.println();
		//System.out.println();
		//controlPlayerOrder(Players[select]);
	}
	
	public static void updateRoomDetails(String newRoom){
		roomDetails.put(currentPlayer, newRoom);
	}
	
	public static void log(String removeCard){
		BottomPanel.log.append(Player.pointUpdatePlayer+" Played "+removeCard);
	}
	
	public void modifyPlayerPosition(String newRoom){
		
		
			//System.out.println("The new Dimension is: "+d);
			//System.out.println("Current Player: ");
			controlPlayerOrder();
			
			//BottomPanel.log.
			
			
			
			if(currentPlayer==humanPlayer && BottomPanel.moveCount<=3){
				pointUpdatePlayer=currentPlayer;
				
				Player.updateRoomDetails(newRoom);
				
				d=rc.roomDimension.get(newRoom);
				
				BottomPanel.deckInfo();

					mainObject.reDrawPlayerPosition(d,humanPlayer);	
					BottomPanel.modifyPlayerData(newRoom);
					/*//Commenting logs
					BottomPanel.log.append(currentPlayer+" Moved to "+newRoom+"\n");
					//Commenting logs
*/				if(BottomPanel.moveCount==3){
				currentPlayer=aiPlayer1;
				previousPlayer=humanPlayer;
				}
			}
			else if(currentPlayer==aiPlayer1  || (BottomPanel.moveCount<=6 && BottomPanel.moveCount>3)){
				
				if(BottomPanel.moveCount==4){
					currentPlayer=aiPlayer1;
					previousPlayer=humanPlayer;
					}
				Player.updateRoomDetails(newRoom);
				
				d=rc.roomDimension.get(newRoom);
				BottomPanel.deckInfo();
				BottomPanel.modifyPlayerData(newRoom);
				
				/*Commenting logs
				BottomPanel.log.append(currentPlayer+" Moved to "+newRoom+"\n");
				*/ //Commenting logs
				
				pointUpdatePlayer=currentPlayer;
					mainObject.reDrawPlayerPosition(d,aiPlayer1);
					if(BottomPanel.moveCount==6){
				currentPlayer=aiPlayer2;
				previousPlayer=aiPlayer1;
					}
			}
			else{
				if(BottomPanel.moveCount==7){
			currentPlayer=aiPlayer2;
			previousPlayer=aiPlayer1;
				}
				Player.updateRoomDetails(newRoom);
				
				d=rc.roomDimension.get(newRoom);
				BottomPanel.deckInfo();
				BottomPanel.modifyPlayerData(newRoom);
				/*Commenting logs
				BottomPanel.log.append(currentPlayer+" Moved to "+newRoom+"\n");
				*///Commenting logs
				pointUpdatePlayer=currentPlayer;
					mainObject.reDrawPlayerPosition(d,aiPlayer2);	
					if(BottomPanel.moveCount==9){

				currentPlayer=humanPlayer;
				previousPlayer=aiPlayer2;
					}
				
			}
			System.out.println("PointUpdatePlayer: "+pointUpdatePlayer);
			//BottomPanel.deckInfo();
		
	}
	
	public void controlPlayerOrder(){
		
		if(firstTime==true){
			currentPlayer=humanPlayer;
			previousPlayer=humanPlayer;
			firstTime=false;
			
			
		}
	}
}