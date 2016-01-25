import java.util.HashMap;




class CardConstants{
	static HashMap<String,Card> cardClassMap=new HashMap<String,Card>();
	static HashMap<String,String> cardValueMap=new HashMap<String,String>();
	
	CardConstants(){
		cardClassMap.put("1.png",new CECS105());
		cardClassMap.put("2.png",new ResearchCompilers());
		cardClassMap.put("3.png",new Math122());
		cardClassMap.put("4.png",new CECS174());
		cardClassMap.put("5.png",new LunBratwurstHall());
		cardClassMap.put("6.png",new CECS100());
		cardClassMap.put("7.png",new ExcercisingMindBody());
		cardClassMap.put("8.png",new ParkingViolation());
		cardClassMap.put("9.png",new FindingLab());
		cardClassMap.put("10.png",new GoodbyeProfessor());
		cardClassMap.put("11.png",new EnjoyingPeace());
		cardClassMap.put("12.png",new BuddyUp());
		cardClassMap.put("13.png",new LateForClass());
		cardClassMap.put("14.png",new Physics151());
		cardClassMap.put("15.png",new BigGame());
		cardClassMap.put("16.png",new Kin253());
		cardClassMap.put("17.png",new Math123());
		cardClassMap.put("18.png",new LearningNetbeans());
		cardClassMap.put("19.png",new ChoosingMajor());
		cardClassMap.put("20.png",new PassSoccerClass());
		cardClassMap.put("21.png",new ScoreGoal());
		cardClassMap.put("22.png",new FallInPond());
		cardClassMap.put("23.png",new MakeTheDeanList());
		cardClassMap.put("24.png",new ANewLaptop());
		cardClassMap.put("25.png",new MeetTheDean());
		cardClassMap.put("26.png",new LoudBuzzing());
		cardClassMap.put("27.png",new ProgramCrashes());
		cardClassMap.put("28.png",new ProfessorEnglert());
		cardClassMap.put("29.png",new PressRightFloor());
		cardClassMap.put("30.png",new SoccerGoalie());
		cardClassMap.put("31.png",new ElectiveClass());
		cardClassMap.put("32.png",new OralCommunication());
		cardClassMap.put("33.png",new ProfessorHoffman());
		cardClassMap.put("34.png",new Chem111());
		cardClassMap.put("35.png",new TheOutPost());
		cardClassMap.put("36.png",new LearningLinux());
		cardClassMap.put("37.png",new MakeFriend());
		cardClassMap.put("38.png",new EnjoyNature());
		cardClassMap.put("39.png",new StudentParking());
		
		
		
		cardValueMap.put("1.png","CECS105");
		cardValueMap.put("2.png","ResearchCompilers");
		cardValueMap.put("3.png","Math122");
		cardValueMap.put("4.png","CECS174");
		cardValueMap.put("5.png","LunBratwurstHall");
		cardValueMap.put("6.png","CECS100");
		cardValueMap.put("7.png","ExcercisingMindBody");
		cardValueMap.put("8.png","ParkingViolation");
		cardValueMap.put("9.png","FindingLab");
		cardValueMap.put("10.png","GoodbyeProfessor");
		cardValueMap.put("11.png","EnjoyingPeace");
		cardValueMap.put("12.png","BuddyUp");
		cardValueMap.put("13.png","LateForClass");
		cardValueMap.put("14.png","Physics151");
		cardValueMap.put("15.png","BigGame");
		cardValueMap.put("16.png","Kin253");
		cardValueMap.put("17.png","Math123");
		cardValueMap.put("18.png","LearningNetbeans");
		cardValueMap.put("19.png","ChoosingMajor");
		cardValueMap.put("20.png","PassSoccerClass");
		cardValueMap.put("21.png","ScoreGoal");
		cardValueMap.put("22.png","FallInPond");
		cardValueMap.put("23.png","MakeTheDeanList");
		cardValueMap.put("24.png","ANewLaptop");
		cardValueMap.put("25.png","MeetTheDean");
		cardValueMap.put("26.png","LoudBuzzing");
		cardValueMap.put("27.png","ProgramCrashes");
		cardValueMap.put("28.png","ProfessorEnglert");
		cardValueMap.put("29.png","PressRightFloor");
		cardValueMap.put("30.png","SoccerGoalie");
		cardValueMap.put("31.png","ElectiveClass");
		cardValueMap.put("32.png","OralCommunication");
		cardValueMap.put("33.png","ProfessorHoffman");
		cardValueMap.put("34.png","Chem111");
		cardValueMap.put("35.png","TheOutPost");
		cardValueMap.put("36.png","LearningLinux");
		cardValueMap.put("37.png","MakeFriend");
		cardValueMap.put("38.png","EnjoyNature");
		cardValueMap.put("39.png","StudentParking");
		
	}
	
	public static void removeCard(){  

		cardClassMap.remove("6.png");
		cardClassMap.remove("3.png");
		cardClassMap.remove("4.png");
		cardClassMap.remove("1.png");


		cardClassMap.remove("17.png");
		cardClassMap.remove("14.png");
		cardClassMap.remove("16.png");
		cardClassMap.remove("20.png");
		cardClassMap.remove("31.png");
		cardClassMap.remove("32.png");
		cardClassMap.remove("34.png");


		cardValueMap.remove("6.png");
		cardValueMap.remove("3.png");
		cardValueMap.remove("4.png");
		cardValueMap.remove("1.png");


		cardValueMap.remove("17.png");
		cardValueMap.remove("14.png");
		cardValueMap.remove("16.png");
		cardValueMap.remove("20.png");
		cardValueMap.remove("31.png");
		cardValueMap.remove("32.png");
		cardValueMap.remove("34.png");

		
	}
	
	
	public static void addCard(){
		cardClassMap.put("40.png",new LBSU());
		cardClassMap.put("41.png",new CarPool());
		cardClassMap.put("42.png",new CECS274());
		cardClassMap.put("43.png",new CECS201());
		cardClassMap.put("44.png",new ENGL317());
		cardClassMap.put("45.png",new PHYS152());
		cardClassMap.put("46.png",new PHIL270());
		cardClassMap.put("47.png",new CECS228());
		cardClassMap.put("48.png",new CECS277());
		cardClassMap.put("49.png",new CECS285());
		cardClassMap.put("50.png",new CECS282());
		cardClassMap.put("51.png",new HaveASwim());
		
		cardValueMap.put("40.png","LBSU");
		cardValueMap.put("41.png","CarPool");
		cardValueMap.put("42.png","CECS274");
		cardValueMap.put("43.png","CECS201");
		cardValueMap.put("44.png","ENGL317");
		cardValueMap.put("45.png","PHYS152");
		cardValueMap.put("46.png","PHIL270");
		cardValueMap.put("47.png","CECS228");
		cardValueMap.put("48.png","CECS277");
		cardValueMap.put("49.png","CECS285");
		cardValueMap.put("50.png","CECS282");
		cardValueMap.put("51.png","HaveASwim");
	
	}
	
}