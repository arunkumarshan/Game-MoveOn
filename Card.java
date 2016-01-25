import java.util.ArrayList;
import java.util.HashMap;

abstract class Card{
	 int Learning=0;
	 int Craft=0;
	 int Integrity=0;
	// int QP;
	 
	 int rewardLearning=0;
	 int rewardIntegrity=0;
	 int rewardCraft=0;
	 int rewardQP=0;
	 
	 int chipCount=0;
	 int getGameCard=0;
	 int rewardDiscardGameCard=0;
	 //String PlayerMovementRoom=new String();
	 Boolean ChipsOption=false;
	 Boolean getGameCardOption=false;
	 
	 String teleportRoom=new String();
	 ArrayList chipOptionList=new ArrayList();
	 
	 
	
	 int failLearning=0;
	 int failCraft=0;
	 int failIntegrity=0;
	 int failQP=0;
	 int failedCardDiscardCount=0;
	 String movement=new String();
	 Boolean failPenality=false;
	 Boolean failCardDeletion=false;
	 Boolean failPlayerMovement=false;
	 
	 
	 

	 
	 
	 
	ArrayList requiredRoom=new ArrayList();
	
	HashMap<String,Integer> rewards=new HashMap<String,Integer>();
	public abstract void play();
	//preReq boolean Values

	Boolean preReqPointsReq=false;
	Boolean preReqRoomReq=false;
	Boolean preReqRoomNotReq=false;


	
	RoomConstants rc=new RoomConstants();
}
/*
	class CECS105 extends Card {
		//int id=1;
		preReqPointsReq=false;
		preReqRoomReq=true;
		failPenality=false;
		requiredRoom=new ArrayList();
		public void play(){
	requiredRoom.add(14);
	requiredRoom.add(17);
	rewards.put(Player.columns[1],2);
	//rewards.put(key, value)
	//rewards.put(key, value)


}
}
*/
class CardPlay{
	public static Boolean checkEligibility(Boolean preReqPointsReq,Boolean preReqRoomReq,Boolean FailPenality,ArrayList reqRoom,int Learning,int Craft,int Integrity ){
		System.out.println("YYYYYYYYYYYYYYYYYY");
		System.out.println();
		Boolean Eligibility=false;
		
	
		if(preReqRoomReq.equals(true)){
			String temp=BottomPanel.currentRoomTracking.get(Player.pointUpdatePlayer);
			System.out.println("reqRoom.contains(temp): "+reqRoom.contains(temp));
			if(reqRoom.contains(temp)){
				System.out.println("Room Requirement Completed");
				if(preReqPointsReq.equals(false)){
					Eligibility=true;
					System.out.println("No PreRequsite Required");
					BottomPanel.log.append(" reward"+"\n");
					return Eligibility;
				}
				else{
					Eligibility=checkEligibility(Learning,Craft,Integrity);
					
				}
				
			}
			else{
				BottomPanel.log.append(" failed"+"\n");
			}
			
			
			//System.out.println("Room Required:"+true);
		}
		System.out.println("YYYYYYYYYYYYYYYYYY");
		System.out.println();
		return Eligibility;
	
	}
	public static Boolean checkEligibility(int Learning,int Craft,int Integrity ){
		Boolean Eligibility=false;
		HashMap checkValueMap=(HashMap) Player.tableValue.get(Player.pointUpdatePlayer);
		int playerLearningValue=(int) checkValueMap.get(Player.columns[1]);
		int playerCraftValue=(int) checkValueMap.get(Player.columns[2]);
		int playerIntegrityValue=(int) checkValueMap.get(Player.columns[3]);
		System.out.println("playerLearningValue: "+playerLearningValue);
		System.out.println("Learning: "+Learning);
		
		if((Learning==0|| playerLearningValue>=Learning)&&(Craft==0||playerCraftValue>=Craft)){
			BottomPanel.log.append(" reward"+"\n");
			
			
			System.out.println("Points Verified");
			Eligibility=true;
			return Eligibility;
			
		}else{
			BottomPanel.log.append(" failed"+"\n");
		}
		Player.Eligibility=Eligibility;
		return Eligibility;
		
	}
}

class CECS105 extends Card {
	String id="1.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		
		 int rewardLearning=1;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		 

		 requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room17);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		
	}
	
}
class ResearchCompilers extends Card{
	String id="2.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;
	@Override
	public void play() {
		
		 int rewardLearning=1;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room7);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);
		
		
		 
		


		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility); 
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class Math122 extends Card{
	
	String id="3.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add("Integrity");
		 
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room7);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		
		
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class CECS174 extends Card{
	
	String id="4.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		
		 int rewardLearning=1;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room14);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}

class LunBratwurstHall extends Card{

	String id="5.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;
	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room9);

		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility); 
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class CECS100 extends Card{
	
	
	
	String id="6.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room17);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class ExcercisingMindBody extends Card{
	
	String id="7.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;
	 

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=1;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room5);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}


}
class ParkingViolation extends Card{
	
	String id="8.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=1;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=1;
		 int rewardDiscardGameCard=1;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 //Both Together
		 Boolean getGameCardOption=true;
		 rewardLearning=rewardLearning+1;
		//Both Together
		 
		 Boolean PlayerMovement=false;
		 
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room6);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;

		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		
		Boolean done=Player.removeGameCard(rewardDiscardGameCard,Eligibility);
		if(done.equals(true) && Eligibility.equals(true)){
			
			Player.updatePlayerSucessPoints(1,0,0,0);
			
		}
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class FindingLab extends Card{
	
	String id="9.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=1;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room16);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility); 
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class GoodbyeProfessor extends Card{
	
	String id="10.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=10;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room13);
		int Learning=6;
		int Craft=6;
		int Integrity=6;
		//int rewardQP=10;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=rc.room13;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class EnjoyingPeace extends Card{
	
	
	
	String id="11.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add("Integrity");
		 
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room1);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility); 
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class BuddyUp extends Card{
	
	String id="12.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room18);
		 
		requiredRoom.add(rc.room0);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class LateForClass extends Card{
	
	String id="13.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 //Boolean preReqRoomNotReq=true;
	 Boolean failPenality=false;
	 

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=true;
		 
		String teleportRoom=rc.room20;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room0);
		requiredRoom.add(rc.room1);
		//requiredRoom.add(rc.room2);
		//requiredRoom.add(rc.room3);
		requiredRoom.add(rc.room4);
		//requiredRoom.add(rc.room5);

		//requiredRoom.add(rc.room7);
		//requiredRoom.add(rc.room8);
		//requiredRoom.add(rc.room9);
		requiredRoom.add(rc.room10);
		
		//int rewardCraft=1;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class Physics151 extends Card{
	
	String id="14.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 int Learning=0;
			int Craft=3;
			int Integrity=0;
			//int rewardQP=10;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room17);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class BigGame extends Card{
	
	String id="15.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=true;
		 
		 String teleportRoom=rc.room20;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room3);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}

}
class Kin253 extends Card{

	String id="16.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=2;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room0);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=rc.room13;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class Math123 extends Card{
	
	String id="17.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room17);
		
		int Learning=5;
		
		//int rewardQP=5;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;

		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class LearningNetbeans extends Card{
	
	String id="18.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		int Learning=3;
		//int rewardQP=5;
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room20);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class ChoosingMajor extends Card{
	
	String id="19.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		int Integrity=3;
		//int rewardQP=5;
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room19);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class PassSoccerClass extends Card{
	
	String id="20.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room0);
		int Craft=5;
		//int rewardQP=5;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class ScoreGoal extends Card{
	
	String id="21.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=1;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room0);
		int Craft=3;
		//int rewardQP=5;
		//int rewardIntegrity=1;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility); 
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=rc.room2;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class FallInPond extends Card{
	
	String id="22.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=1;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room1);
		int Learning=3;
		//int rewardIntegrity=1;
		//int rewardCraft=1;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=rc.room20;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class MakeTheDeanList extends Card{
	
	String id="23.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room12);
		
		requiredRoom.add(rc.room15);
		int Learning=6;
		//int rewardQP=5;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=rc.room2;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class ANewLaptop extends Card{
	
	String id="24.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=3;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add("Integrity");
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		int Integrity=4;
		//int rewardQP=3;
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room11);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class MeetTheDean extends Card{
	
	String id="25.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=1;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=true;
		 Boolean PlayerMovement=false;
		 
		int Learning=3;
		int Craft=3;
		int Integrity=3;
		
		//int rewardQP=5;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}

class LoudBuzzing extends Card{
	
	String id="26.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add("Integrity");
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		int Craft=3;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room18);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=2;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class ProgramCrashes extends Card{
	
	String id="27.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add("Integrity");
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room20);
		int Learning=2;
		//int rewardQP=5;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class ProfessorEnglert extends Card{
	
	String id="28.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add("Integrity");
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room19);
		int Integrity=3;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class PressRightFloor extends Card{
	
	String id="29.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=2;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room16);
		int Learning=4;
		//int rewardCraft=2;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility); 
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=2;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class SoccerGoalie extends Card{
	
	String id="30.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=1;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=true;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room0);
		int Learning=3;
		int Craft=3;
		//int rewardQP=5;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=rc.room2;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class ElectiveClass extends Card{
	
	String id="31.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		 int rewardLearning=1;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=1;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=true;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room7);
		int Learning=2;
		//int rewardLearning=1;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=2;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class OralCommunication extends Card{
	
	String id="32.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 //Boolean preReqRoomNotReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=4;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add("Integrity");
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		//requiredRoom.add(rc.room20);
		
		requiredRoom.add(rc.room2);
		requiredRoom.add(rc.room3);
		//requiredRoom.add(rc.room4);
		requiredRoom.add(rc.room5);

		requiredRoom.add(rc.room7);
		requiredRoom.add(rc.room8);
		requiredRoom.add(rc.room9);
		int Integrity=4;
		//int rewardQP=4;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class ProfessorHoffman extends Card{
	
	 int rewardLearning=0;
	 int rewardIntegrity=0;
	 int rewardCraft=0;
	 int rewardQP=5;
	 int chipCount=0;
	 int getGameCard=2;
	 //String PlayerMovementRoom=new String();
	 Boolean ChipsOption=false;
	 Boolean getGameCardOption=true;
	 Boolean PlayerMovement=false;
	
	String id="33.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 //Boolean preReqRoomNotReq=true;
	 Boolean failPenality=true;

	@Override
	public void play() {
		int Learning=3;
		//int rewardQP=5;
		
		requiredRoom=new ArrayList();
		//requiredRoom.add(rc.room20);
		
		requiredRoom.add(rc.room11);
		requiredRoom.add(rc.room12);
		//requiredRoom.add(rc.room4);
		requiredRoom.add(rc.room13);

		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room15);
		requiredRoom.add(rc.room16);
		requiredRoom.add(rc.room17);
		requiredRoom.add(rc.room18);
		requiredRoom.add(rc.room19);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=5;
		 int failedCardDiscardCount=0;
		 String movement=rc.room20;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class Chem111 extends Card{
	
	String id="34.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 //Boolean preReqRoomNotReq=true;
	 Boolean failPenality=false;
	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 

		requiredRoom=new ArrayList();
		//requiredRoom.add(rc.room20);
		
		requiredRoom.add(rc.room2);
		requiredRoom.add(rc.room3);
		//requiredRoom.add(rc.room4);
		requiredRoom.add(rc.room5);

		requiredRoom.add(rc.room7);
		requiredRoom.add(rc.room8);
		requiredRoom.add(rc.room9);
		int Craft=6;
		//int rewardQP=5;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=rc.room2;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class TheOutPost extends Card{
	
	String id="35.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 //Boolean preReqRoomNotReq=true;
	 Boolean failPenality=false;
	 
	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add("Integrity");
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room0);
		requiredRoom.add(rc.room1);
		//requiredRoom.add(rc.room2);
		//requiredRoom.add(rc.room3);
		requiredRoom.add(rc.room4);
		//requiredRoom.add(rc.room5);

		//requiredRoom.add(rc.room7);
		//requiredRoom.add(rc.room8);
		//requiredRoom.add(rc.room9);
		requiredRoom.add(rc.room10);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class LearningLinux extends Card{
	
	String id="36.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=3;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add("Integrity");
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room11);
		
		int Craft=2;
		int Integrity=3;
		
		//int rewardQP=3;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=1;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class MakeFriend extends Card{
	
	String id="37.png";
	Boolean preReqPointsReq=true;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=true;


	@Override
	public void play() {
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=3;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 ArrayList chipOptionList=new ArrayList();
		 chipOptionList.add(Player.columns[1]);
		 chipOptionList.add(Player.columns[2]);
		 chipOptionList.add(Player.columns[3]);
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room12);
		requiredRoom.add(rc.room15);
		int Integrity=2;
		//int rewardQP=3;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class EnjoyNature extends Card{

	String id="38.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 //Boolean preReqNotReq=true;
	 Boolean failPenality=false;
	 
	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=true;
		 String teleportRoom=rc.room20;
		
		requiredRoom.add(rc.room0);
		requiredRoom.add(rc.room1);
		//requiredRoom.add(rc.room2);
		//requiredRoom.add(rc.room3);
		requiredRoom.add(rc.room4);
		requiredRoom.add(rc.room5);

		//requiredRoom.add(rc.room7);
		//requiredRoom.add(rc.room8);
		//requiredRoom.add(rc.room9);
		requiredRoom.add(rc.room10);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
}
class StudentParking extends Card{

	String id="39.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=true;
		 String teleportRoom=rc.room20;
		
		requiredRoom=new ArrayList();
		requiredRoom.add(rc.room2);
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility); 
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);

	}
	
}


class LBSU extends Card{

	String id="40.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room3);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class CarPool extends Card{
	
	String id="41.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=3;
		 int chipCount=0;
		 int getGameCard=1;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=true;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room6);
		requiredRoom.add(rc.room2);
	
		int Integrity=5;
		//int rewardQP=10;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=2;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class CECS274 extends Card{
	
	String id="42.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=1;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=true;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room17);
		requiredRoom.add(rc.room11);
		int Learning=7;

		//int rewardQP=10;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class CECS201 extends Card{
	
	String id="43.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=1;
		 int rewardIntegrity=1;
		 int rewardCraft=1;
		 int rewardQP=0;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room17);
		requiredRoom.add(rc.room11);
		//int Learning=6;
		int Craft=8;
		//int Integrity=6;
		//int rewardQP=10;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class ENGL317 extends Card{
	
	String id="44.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room8);
		
		//int Learning=6;
		int Craft=6;
		//int Integrity=6;
		//int rewardQP=10;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=rc.room2;
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=true;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class PHYS152 extends Card{
	
	String id="45.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=5;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room8);
		requiredRoom.add(rc.room7);
	
		int Integrity=7;
		//int rewardQP=10;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class PHIL270 extends Card{
	
	String id="46.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=1;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=3;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room8);
		requiredRoom.add(rc.room7);
		
		int Integrity=7;
		//int rewardQP=10;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}
class CECS228 extends Card{
	
	String id="47.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		 int Learning=8;
			int Craft=8;
			int Integrity=8;
			//int rewardQP=10;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room17);
		requiredRoom.add(rc.room11);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}
class CECS277 extends Card{
	
	String id="48.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room11);
		requiredRoom.add(rc.room12);
		requiredRoom.add(rc.room13);
		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room15);
		requiredRoom.add(rc.room16);
		requiredRoom.add(rc.room17);
		requiredRoom.add(rc.room18);
		requiredRoom.add(rc.room19);
		requiredRoom.add(rc.room20);
		int Learning=8;
		int Craft=8;
		int Integrity=8;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=2;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class CECS285 extends Card{
	
	String id="49.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room1);
		requiredRoom.add(rc.room18);
		
		int Learning=6;
//		int Integrity=8;
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=3;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class CECS282 extends Card{
	
	String id="50.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=5;
		 int chipCount=0;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=false;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 

		requiredRoom.add(rc.room11);
		requiredRoom.add(rc.room12);
		requiredRoom.add(rc.room13);
		requiredRoom.add(rc.room14);
		requiredRoom.add(rc.room15);
		requiredRoom.add(rc.room16);
		requiredRoom.add(rc.room17);
		requiredRoom.add(rc.room18);
		requiredRoom.add(rc.room19);
		requiredRoom.add(rc.room20);
		int Learning=8;
		int Craft=8;
		int Integrity=8;
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=2;
		 int failedCardDiscardCount=1;
		 String movement=new String();
		 Boolean failPenality=true;
		 Boolean failCardDeletion=true;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}

class HaveASwim extends Card{
	
	String id="51.png";
	Boolean preReqPointsReq=false;
	 Boolean preReqRoomReq=true;
	 Boolean failPenality=false;


	@Override
	public void play() {
		// TODO Auto-generated method stub
		 int rewardLearning=0;
		 int rewardIntegrity=0;
		 int rewardCraft=0;
		 int rewardQP=0;
		 int chipCount=1;
		 int getGameCard=0;
		 //String PlayerMovementRoom=new String();
		 Boolean ChipsOption=true;
		 Boolean getGameCardOption=false;
		 Boolean PlayerMovement=false;
		
		requiredRoom=new ArrayList();
		 
		requiredRoom.add(rc.room5);
		
		Boolean Eligibility=CardPlay.checkEligibility(preReqPointsReq,preReqRoomReq,failPenality,requiredRoom,Learning,Craft,Integrity);;
		Player.updatePlayerSuccessCondn(rewardLearning,rewardCraft,rewardIntegrity,rewardQP,getGameCard,chipCount,teleportRoom,chipOptionList,getGameCardOption,ChipsOption,PlayerMovement,Eligibility);
		System.out.println("Inside Card Class Play ");
		 int failLearning=0;
		 int failCraft=0;
		 int failIntegrity=0;
		 int failQP=0;
		 int failedCardDiscardCount=0;
		 String movement=new String();
		 Boolean failPenality=false;
		 Boolean failCardDeletion=false;
		 Boolean failPlayerMovement=false;
		Player.updatePlayerFailCondn(failLearning,failCraft,failIntegrity,failQP,failedCardDiscardCount,movement,failPenality,failCardDeletion,failPlayerMovement,Eligibility);
		
	}
	
}
