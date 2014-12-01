import java.util.Random;
public class Adventurer{
    private String name;
    private int HP, XP, STR, INT, DEX;
    public Adventurer(){
   	this("Lester");
    }
    public Adventurer(String name){
	setName(name);
	setHP(30);
	setSTR(12);
	setDEX(12);
	setINT(12);
    }
    public Adventurer(int s, int i, int d){
	setName("Lester");
	setHP(30);
	setSTR(s);
	setINT(i);
	setDEX(d);
    }
    public void setName(String name){
	this.name=name;
    }
    public String getName(){
	return name;
    }
    public void setHP(int HP){
	this.HP=HP;
    }
    public int getHP(){
	return HP;
    }
    public void setSTR(int STR){
	this.STR=STR;
    }
    public int getSTR(){
	return STR;
    }
    public void setINT(int INT){
	this.INT=INT;
    }
    public int getINT(){
	return INT;
    }
    public void setDEX(int DEX){
	this.DEX=DEX;
    }
    public int getDEX(){
	return DEX;
    }
    
    public String getStats(){
	return getName()+"\t"+getHP()+" HP\t"+getSTR()+" STR\t"+getINT()+" INT\t"+getDEX()+" DEX";
    }
    public void attack(Adventurer other){
	System.out.println(this.getName()+" attacks "+other.getName());
	if (hit(other)) {
	    Random atk = new Random();
	    int x=other.getHP();
	    int damage=atk.nextInt(10)+1;
	    other.setHP(x-damage);
	    System.out.println(this.getName()+" did "+damage+" damage");
	}
	else {
	    System.out.println(this.getName()+" missed");
	}
    }
    public void specialAttack(Adventurer other){
	System.out.println(this.getName()+" furiously attacks "+other.getName());
	if (hit(other)) {
	    Random sAtk = new Random();
	    int x=other.getHP();
	    int damage=sAtk.nextInt(11) + 6;
	    other.setHP(x-damage);
	    System.out.println(this.getName()+" did "+damage+" damage");
	}
	else {
	    System.out.println(this.getName()+" missed");
	}
    }
    
    public boolean hit(Adventurer other){
	int a = this.getDEX();
	int b = other.getDEX();
	int c = a - b;
	Random hit= new Random();
	return hit.nextInt(50) + c > hit.nextInt(25);
    }
    public void combat(Adventurer a, Adventurer[] b){
	if (a.getHP()<=0){
	    System.out.println(a.getName()+" is dead");
	} else {
	    int alive=0;
	    for (int x=0; x<b.length; x++){
		if (b[x].getHP()>=0){
		    alive+=1;
		}
	    }
	    Adventurer[] B=new Adventurer[alive];
	    for (int y=0; y<B.length; y++){
		for (int z=0;z<b.length; z++){
		    if (b[z].getHP()>0){
			B[y]=b[z];
		    }
		}
	    }
	    if (a.getName().equals("Eragon")){
		a.choiceAttack(B);
	    } else {	    
		Random c=new Random();
		int d=c.nextInt(alive);
		a.choiceAttack(B[d]);
	    }
	}
    }
    public void choiceAttack(Adventurer[] other){
	Random oppAtk=new Random();
	int x=oppAtk.nextInt(7);
	if(x==0){
	    for (int y=0; y<other.length; y++){
		this.specialAttack(other[y]);
	    }
	} else if(x==1){
	    this.recharge();
	} else {
	    Random c=new Random();
	    int d=c.nextInt(other.length);
      	    this.attack(other[d]);
	}
    }
	
		
	    
    public void combat(Adventurer a, Adventurer b, boolean Special, boolean Recharge){
	if (a.getHP()<=0){
	    System.out.println(a.getName()+" is dead");
	} else {
	    a.getStats();
            b.getStats();
	    if (Recharge){
		a.recharge();
	    } else { 
		if (Special) {
		    a.specialAttack(b);
		} else {
		    a.attack(b);
		}
	    }
	    a.getStats();
	    b.getStats();
	}
    }
    public void choiceAttack(Adventurer other){
	Random oppAtk=new Random();
	int x=oppAtk.nextInt(7);
	if(x==0){
	    this.specialAttack(other);
	} else if(x==1){
	    this.recharge();
	} else {
      	    this.attack(other);
	}
    }
    public void recharge(){
	System.out.println(this.getName()+" is powering up");
    }
	
	

	
	
}

	
	
