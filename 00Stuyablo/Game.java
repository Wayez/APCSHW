import java.util.Scanner;
import java.util.Random;
public class Game{
    public static String chooseName(){
	String name="";
	for (int i=0; i>-1;i++){
	    System.out.println("Enter Name (Max 16 Characters):");
	    Scanner Choice=new Scanner(System.in);
	    String nameChoice=Choice.nextLine();
	    if (nameChoice.length()<=16 && nameChoice.length()>=0 ){
		name=nameChoice;
		break;
	    } else {
		System.out.println("Invalid Name.");
	    }
	}
	return name;
    }
		    
    public static Adventurer setPlayer(){
	Adventurer Player;
	Player = new Adventurer();
	String name=chooseName();
	for (int a=1;a>-1;a++){
	    System.out.println("Choose a class :\nA : Warrior\nB : Wizard\nC : Rogue\nD : Martial Artist\nE : Random");
	    Scanner choice=new Scanner(System.in);
	    String cho=choice.nextLine();
	    if (cho.equalsIgnoreCase("A")){
		Player = new Warrior(name);
		break;
	    } else if (cho.equalsIgnoreCase("B")){
		Player = new Wizard(name);
		break;
	    } else if (cho.equalsIgnoreCase("C")){
		Player = new Rogue(name);
		break;
	    } else if (cho.equalsIgnoreCase("D")){
		Player = new MartialArtist(name);
		break;
	    } else if (cho.equalsIgnoreCase("E")){
		Random role=new Random();
		int w=role.nextInt(4);
		if (w==0){
		    Player=new Warrior(name);
		    System.out.println("You will be a warrior");
		} else if (w==1){
		    Player=new Wizard(name);
		    System.out.println("You will be a wizard");
		} else if (w==2){
		    Player=new Rogue(name);
		    System.out.println("You will be a rogue");
		} else if (w==3){
		    Player=new MartialArtist(name);
		    System.out.println("You will be a martial artist");
		}
	    } else if (cho.equalsIgnoreCase("F")){
		for (int s=0;s>=0;s++){
		    int st,in,de;
		    System.out.println("Chose how many points to put between Strength, Dexterity, and Intelligence (total 45");
		    System.out.println("Type Dexterity (Integer)");
		    Scanner stats = new Scanner(System.in);
		    de=stats.nextInt();	
		    System.out.println("Type Strength (Integer)");
		    st=stats.nextInt();	
		    System.out.println("Type Intelligence (Integer)");
		    in=stats.nextInt();	
		    if (st + in + de <= 45){
			 Player = new Adventurer(st, in, de);
			 break;
		    } else {
	       	System.out.println("Stats do not add up to 45, you fail at math. Try Again");
		    }
		}
		break;
	    } else {
		System.out.println("You Fail. Try Again");
	    }
	}
	return Player;
    }
    
    public static void combat(Adventurer Player, Adventurer Opp){
	//System.out.println("Beginning Fight with " + Opp.getName());
	boolean G=false;
	for(int round=1;round!=-2;round++){
	    if (Player.getHP()>0 && Opp.getHP()>0){
		if (G){
		    System.out.println("You have forfeited");
		    break;
		}
		System.out.println("Round "+round);
		System.out.println(Player.getStats());
		System.out.println(Opp.getStats());
		System.out.println();
		System.out.println("Choose an action:\nA : Attack\nS : Special Attack\nR : Recharge\nG : Give Up");
		Scanner battle = new Scanner(System.in);
		String bat=battle.nextLine();
		if (bat.equalsIgnoreCase("A")){
		    Player.combat(Player, Opp, false, false);
		} else if (bat.equalsIgnoreCase("S")){
		    Player.combat(Player, Opp, true, false);
		} else if (bat.equalsIgnoreCase("G")){
		    G=true;
		} else if (bat.equalsIgnoreCase("R")){
		    Player.combat(Player, Opp, false, true);
		} else {
		    System.out.println("Wrong key, try again");
		    round-=1;
		}
	    } else if (Player.getHP()<=0){
		System.out.println(Player.getName()+" has been defeated by "+ Opp.getName());
		break;
	    } else {
		System.out.println(Player.getName()+" has defeated " + Opp.getName());
		break;
	    }
	}
    }
    public static Adventurer setPlayerParty(){
	String name=chooseName();
	Adventurer Player=new Adventurer();
	for (int a=1;a>-1;a++){
	    System.out.println("Choose a class :\nA : Warrior\nB : Wizard\nC : Rogue\nD : Martial Artist\nE : Random");
	    Scanner choice=new Scanner(System.in);
	    String cho=choice.nextLine();
	    if (cho.equalsIgnoreCase("A")){
		Player = new Warrior(name);
		break;
	    } else if (cho.equalsIgnoreCase("B")){
		Player = new Wizard(name);
		break;
	    } else if (cho.equalsIgnoreCase("C")){
		Player = new Rogue(name);
		break;
	    } else if (cho.equalsIgnoreCase("D")){
		Player = new MartialArtist(name);
		break;
	    } else if (cho.equalsIgnoreCase("E")){
		Random role=new Random();
		int w=role.nextInt(4);
		if (w==0){
		    Player=new Warrior(name);
		    System.out.println("You will be a warrior");
		} else if (w==1){
		    Player=new Wizard(name);
		    System.out.println("You will be a wizard");
		} else if (w==2){
		    Player=new Rogue(name);
		    System.out.println("You will be a rogue");
		} else if (w==3){
		    Player=new MartialArtist(name);
		    System.out.println("You will be a martial artist");
		}
		break;
	    } else{
		System.out.println("Invalid Response, please retry");
	    }
	}
	for (int s=0;s>=0;s++){
	    int st,in,de;
       	    System.out.println("Chose how many points to put between Strength, Dexterity, and Intelligence (total 45");
	    System.out.println("Type Dexterity (45 left)");
       	    Scanner stats = new Scanner(System.in);
       	    de=stats.nextInt();	
	    int de2=45-de;
	    System.out.println("Type Strength ("+de2+" left)");
       	    st=stats.nextInt();	
	    int de3=de2-st;
       	    System.out.println("Type Intelligence ("+de3+" left)");
       	    in=stats.nextInt();	
       	    if (st + in + de <= 45){
		Player.setSTR(st);
		Player.setINT(in);
		Player.setDEX(de);
       		break;
       	    } else {
	       	System.out.println("Stats do not add up to 45, you fail at math. Try Again");
	    }
	}
	return Player;
    }
    public static Adventurer[] setParty(){
	Adventurer[] party=new Adventurer[5];
	party[0]=setPlayer();
	System.out.println("Do you want to create your own party? (y or n)");
	for (int x=0; x>-1; x++){
	    Scanner def=new Scanner(System.in);
	    String def2=def.nextLine();
	    if (def2.equals("y")){
		for (int y=1; y<party.length; y++){
		    party[y]=setPlayerParty();
		}
		break;
	    } else if (def2.equals("n")){
		party[1]=new Warrior("Shrek");
		party[2]=new Wizard("Donkey");
		party[3]=new Rogue("Puss in Boots");
		party[4]=new MartialArtist("Fiona");
		break;
	    } else {
		System.out.println("Invalid Response");
	    }
	}
	return party;
    }
    public static Adventurer setOpp(){
	Adventurer Opp=new Adventurer();
	System.out.println("Choose Difficulty:\n1: Beginner\n2: Novice\n3: Expert");
	for (int x=0; x>-1; x++){
	    Scanner difficult=new Scanner(System.in);
	    int diff=difficult.nextInt();
	    if (diff==1){
		Opp=new Warrior(20, 20, 20);
		break;
	    } else if (diff==2){
		Opp=new Wizard(40, 40, 20);
		break;
	    } else if (diff==3){
		Opp=new Dragon();
		break;
	    } else {
		System.out.println("Invalid Response. Please retry");
	    }
	}
	return Opp;
    }
    public static void combat(Adventurer[] Party, Adventurer Opp){
	System.out.println("Beginning battle with "+Opp.getName());
	boolean G=false;
	for(int round=1;round!=-2;round++){
	    boolean alive=true;
	    int dead=0;
	    for (int al=0; al<Party.length; al++){
		if(Party[al].getHP()<=0){
		    dead+=1;
		}
		alive=dead!=5;
	    }
	    if (alive && Opp.getHP()>0){
		if (G){
		    System.out.println("You have forfeited");
		    break;
		}
		System.out.println("Round "+round);
		for (int y=0; y<Party.length; y++){
		    System.out.println(Party[y].getStats());
		}
		System.out.println("Opponent's stats:");
		System.out.println(Opp.getStats());
		System.out.println();
		for (int z=0; z<Party.length; z++){
		    Adventurer Player=Party[z];
		    System.out.println("What will "+Player.getName()+" do next?\nA : Attack\nS : Special Attack\nR : Recharge\nG : Give Up");
		    Scanner battle = new Scanner(System.in);
		    String bat=battle.nextLine();
		    if (bat.equalsIgnoreCase("A")){
			Player.combat(Player, Opp, false, false);
		    } else if (bat.equalsIgnoreCase("S")){
			Player.combat(Player, Opp, true, false);
		    } else if (bat.equalsIgnoreCase("G")){
			G=true;
		    } else if (bat.equalsIgnoreCase("R")){
		        Player.combat(Player, Opp, false, true);
		    } else {
			System.out.println("Wrong key, try again");
			round-=1;
		    }
		}
		Opp.combat(Opp, Party);
	    } else if (alive==false){
		System.out.println("Your team has been defeated by "+ Opp.getName());
		break;
	    } else {
		System.out.println("Your team has defeated " + Opp.getName());
		break;
	    }
	}
			   
			   
		    
    }   
    public static boolean rematch(){
	boolean s=true;
	System.out.println("Do you want to have a rematch? (y or n)");
	for (int x=0; x>-1; x++){
	    Scanner def=new Scanner(System.in);
	    String def2=def.nextLine();
	    if (def2.equals("y")){
		return 1==1;
	    } else if (def2.equals("n")){
		return 1==2;
	    } else {
		System.out.println("Invalid Response");
	    }
	}
	return s;
    }
	
	    
	
    public static void main(String[]args){
	Adventurer Player, Opp; 
	String[] n=new String[5];
	int[] s=new int[5];
	int[] i=new int[5];
	int[] d=new int[5];
	Adventurer[] PlayerParty=setParty();
	for (int x=0;x<PlayerParty.length;x++){
	    n[x]=PlayerParty[x].getName();
	    s[x]=PlayerParty[x].getSTR();
	    i[x]=PlayerParty[x].getINT();
	    d[x]=PlayerParty[x].getDEX();
	}
	//Player = setPlayer();
	//combat(Player, Opp);
	boolean rem=true;
	while (rem){
	    Opp=setOpp();
	    combat(PlayerParty, Opp);
	    for (int y=0; y<n.length;y++){
		PlayerParty[y].setHP(30); 
	    }     
	    rem=rematch();
	}
	
    }
		    
		    
		
		  
		    
	    
	    
    
 
	    
	
	    
	    
	    
	//Scanner in = new Scanner(System.in);
	//System.out.println("Type something:");
	//String line = in.nextLine();
	//System.out.println("You typed: <"+line+"> without the <>");
	
	  	    
}
	

