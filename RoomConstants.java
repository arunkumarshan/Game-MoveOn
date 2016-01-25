import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

class RoomConstants{
	
	
	HashMap<String, Dimension> roomDimension= new HashMap<String, Dimension>();
	HashMap<String, ArrayList> adjacentRooms=  new HashMap<String, ArrayList>();
	ArrayList<String> room0Adjacent=new ArrayList<String>();
	ArrayList<String> room1Adjacent=new ArrayList<String>();
	ArrayList<String> room2Adjacent=new ArrayList<String>();
	ArrayList<String> room3Adjacent=new ArrayList<String>();
	ArrayList<String> room4Adjacent=new ArrayList<String>();
	ArrayList<String> room5Adjacent=new ArrayList<String>();
	ArrayList<String> room6Adjacent=new ArrayList<String>();
	ArrayList<String> room7Adjacent=new ArrayList<String>();
	ArrayList<String> room8Adjacent=new ArrayList<String>();
	ArrayList<String> room9Adjacent=new ArrayList<String>();
	ArrayList<String> room10Adjacent=new ArrayList<String>();
	ArrayList<String> room11Adjacent=new ArrayList<String>();
	ArrayList<String> room12Adjacent=new ArrayList<String>();
	ArrayList<String> room13Adjacent=new ArrayList<String>();
	ArrayList<String> room14Adjacent=new ArrayList<String>();
	ArrayList<String> room15Adjacent=new ArrayList<String>();
	ArrayList<String> room16Adjacent=new ArrayList<String>();
	ArrayList<String> room17Adjacent=new ArrayList<String>();
	ArrayList<String> room18Adjacent=new ArrayList<String>();
	ArrayList<String> room19Adjacent=new ArrayList<String>();
	ArrayList<String> room20Adjacent=new ArrayList<String>();
	
	String room0="GEORGE ALLEN FIELD";
	String room1="JAPANESE GARDEN";
	String room2="STUDENT PARKING";
	String room3="WALTER PYRAMID";
	String room4="WEST WALKWAY";
	String room5="REC CENTER";
	String room6="FORBIDDEN PARKING";
	String room7="LIBRARY";
	String room8="LAS";
	String room9="BRADMAN HALL";
	String room10="EAST WALKWAY";
	String room11="COMPUTER LAB";
	String room12="NORTH HALL";
	String room13="ROOM OF RETIREMENT";
	String room14="ECS302";
	String room15="SOUTH HALL";
	String room16="ELEVATORS";
	String room17="ECS308";
	String room18="EAT CLUB";
	String room19="CECS CONFERENCE ROOM";
	String room20="LACTATION LOUNGE";
	
	String[] room={"GEORGE ALLEN FIELD","JAPANESE GARDEN","STUDENT PARKING","WALTER PYRAMID","WEST WALKWAY","REC CENTER","FORBIDDEN PARKING",
					"LIBRARY","LAS","BRADMAN HALL","EAST WALKWAY","COMPUTER LAB","NORTH HALL","ROOM OF RETIREMENT","ECS302","SOUTH HALL","ELEVATORS",
					"ECS308","EAT CLUB","CECS CONFERENCE ROOM","LACTATION LOUNGE"};
	
	RoomConstants(){
		roomDimension.put(room0, new Dimension(-840,0));
		roomDimension.put(room1, new Dimension(-420,0));
		roomDimension.put(room2, new Dimension(60,0));
		roomDimension.put(room3, new Dimension(-440,250));
		roomDimension.put(room4, new Dimension(-830,630));
		roomDimension.put(room5, new Dimension(-420,500));
		roomDimension.put(room6, new Dimension(145,490));	
		roomDimension.put(room7, new Dimension(-830,1660));
		roomDimension.put(room8, new Dimension(-400, 1620));
		roomDimension.put(room9, new Dimension(160, 1620));
		roomDimension.put(room10, new Dimension(600, 925));
		roomDimension.put(room11, new Dimension(-680, 865));
		roomDimension.put(room12, new Dimension(-680, 1150));
		roomDimension.put(room13, new Dimension(-680, 1320));
		roomDimension.put(room14, new Dimension(-265, 865));
		roomDimension.put(room15, new Dimension(-50, 1135));
		roomDimension.put(room16, new Dimension(-265, 1320));
		roomDimension.put(room17, new Dimension(-50, 1320));
		roomDimension.put(room18, new Dimension(170, 865));
		roomDimension.put(room19, new Dimension(385, 865));
		roomDimension.put(room20, new Dimension(350, 1320));
		
		adjacentRooms.put(room0, room0Adjacent);
		adjacentRooms.put(room1, room1Adjacent);
		adjacentRooms.put(room2, room2Adjacent);
		adjacentRooms.put(room3, room3Adjacent);
		adjacentRooms.put(room4, room4Adjacent);
		adjacentRooms.put(room5, room5Adjacent);
		adjacentRooms.put(room6, room6Adjacent);
		adjacentRooms.put(room7, room7Adjacent);
		adjacentRooms.put(room8, room8Adjacent);
		adjacentRooms.put(room9, room9Adjacent);
		adjacentRooms.put(room10, room10Adjacent);
		adjacentRooms.put(room11, room11Adjacent);
		adjacentRooms.put(room12, room12Adjacent);
		adjacentRooms.put(room13, room13Adjacent);
		adjacentRooms.put(room14, room14Adjacent);
		adjacentRooms.put(room15, room15Adjacent);
		adjacentRooms.put(room16, room16Adjacent);
		adjacentRooms.put(room17, room17Adjacent);
		adjacentRooms.put(room18, room18Adjacent);
		adjacentRooms.put(room19, room19Adjacent);
		adjacentRooms.put(room20, room20Adjacent);
		
		
		room0Adjacent.add(room1);
		room0Adjacent.add(room3);
		room0Adjacent.add(room5);
		room0Adjacent.add(room4);
		
		
		room1Adjacent.add(room0);
		room1Adjacent.add(room2);
		room1Adjacent.add(room3);
		
		
		room2Adjacent.add(room1);
		room2Adjacent.add(room3);
		room2Adjacent.add(room6);
		room2Adjacent.add(room5);
        
		
		room3Adjacent.add(room0);
		room3Adjacent.add(room1);
		room3Adjacent.add(room2);
		room3Adjacent.add(room4);
		room3Adjacent.add(room5);
		room3Adjacent.add(room6);
		
        
		room4Adjacent.add(room0);
		room4Adjacent.add(room5);
		room4Adjacent.add(room7);
		room4Adjacent.add(room12);
		
		
		room5Adjacent.add(room0);
		room5Adjacent.add(room3);
		room5Adjacent.add(room2);
		room5Adjacent.add(room6);
		room5Adjacent.add(room4);
		
		
		room6Adjacent.add(room2);
		room6Adjacent.add(room5);
		room6Adjacent.add(room10);
		
		
		room7Adjacent.add(room4);
		room7Adjacent.add(room8);
		
		
		room8Adjacent.add(room7);
		room8Adjacent.add(room9);
        room8Adjacent.add(room16);
		
		
		room9Adjacent.add(room8);
		room9Adjacent.add(room10);
		
		
		room10Adjacent.add(room6);
		room10Adjacent.add(room9);
		room10Adjacent.add(room15);
		
		
		room11Adjacent.add(room12);
		
    
		room12Adjacent.add(room4);
		room12Adjacent.add(room11);
		room12Adjacent.add(room13);
		room12Adjacent.add(room14);
		room12Adjacent.add(room15);
		room12Adjacent.add(room16);
		
		
		room13Adjacent.add(room12);
		
		
		room14Adjacent.add(room12);
		room14Adjacent.add(room15);
		
		
		room15Adjacent.add(room10);
		room15Adjacent.add(room12);
		room15Adjacent.add(room14);
		room15Adjacent.add(room17);
		room15Adjacent.add(room18);
		room15Adjacent.add(room19);
		room15Adjacent.add(room20);
		
    
		room16Adjacent.add(room12);
		room16Adjacent.add(room8);
		
		
		room17Adjacent.add(room15);
		
		
		room18Adjacent.add(room15);
		
		
		room19Adjacent.add(room15);
				
		
		room20Adjacent.add(room15);
        
	}
	
}