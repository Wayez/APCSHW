import java.util.Random;
public class Rogue extends Adventurer{
    private int Stamina;
    public Rogue(int s, int i, int d, String name){
	setName(name);
	setHP(30);
	setSTR(s);
	setINT(i);
	setDEX(d);
    }
    public Rogue(){
    	this("Ninja");
    }
    public Rogue(String name){
	setName(name);
	setSTR(10);
        setINT(15);
	setDEX(20);
	setStamina(20);
    }
    public void setStamina(int Stamina){
	this.Stamina=Stamina;
    }
    public int getStamina(){
	return Stamina;
    }
    public String getStats(){
	return super.getStats()+"\t"+getStamina()+" Stamina";
    }
    public void attack(Adventurer other){
	System.out.println(this.getName()+" karate chops "+other.getName());
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
	System.out.println(this.getName()+" decapitates "+other.getName());
	if (hit(other)) {
	    if (this.getStamina()<15){
		System.out.println(this.getName()+ " did not have enough stamina for that, " +this.getName()+" will use your regular attack");
		this.attack(other);
	    } else {
		Random sAtk = new Random();
		int x=other.getHP();
		int damage=sAtk.nextInt(11) + 10;
		other.setHP(x-damage);
		System.out.println(this.getName()+" did "+damage+" damage");
		this.setStamina(this.getStamina()-15);
	    }
	} else {
	    System.out.println(this.getName()+" missed");
	}
    }
    public void recharge(){
	super.recharge();
	this.setDEX(this.getDEX()+3);
	this.setHP(this.getHP()+3);
    }

}
    

	
	
