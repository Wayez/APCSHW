import java.util.Random;
public class Wizard extends Adventurer{
    private int mana;
    public Wizard(int s, int i, int d){
	setName("Harry");
	setHP(75);
	setSTR(s);
	setINT(i);
	setDEX(d);
    }
    public Wizard(int s, int i, int d, String name){
	setName(name);
	setHP(30);
	setSTR(s);
	setINT(i);
	setDEX(d);
    }
    public Wizard(){
   	this("Harry");
    }
    public Wizard(String name){
	setName(name);
	setSTR(15);
        setINT(20);
	setDEX(10);
	setMana(30);
    }
    public void setMana(int mana){
	this.mana=mana;
    }
    public int getMana(){
	return mana;
    }
    public String getStats(){
	return super.getStats()+"\t"+getMana()+" Mana";
    }
    public void attack(Adventurer other){
	System.out.println(this.getName()+" smacks "+other.getName()+ " with his big stick");
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
	System.out.println(this.getName()+" blasts "+other.getName());
	if (hit(other)) {
	    if (this.getMana()<15){
		System.out.println(this.getName()+" did not have enough mana for that ," +this.getName()+ " will use your regular attack");
		this.attack(other);
	    } else {
		Random sAtk = new Random();
		int x=other.getHP();
		int damage=sAtk.nextInt(11) + 6;
		other.setHP(x-damage);
		System.out.println(this.getName()+" did "+damage+" damage");
		this.setMana(this.getMana()-15);
	    }
	} else {
	    System.out.println(this.getName()+" missed");
	}
    }
    public void recharge(){
	super.recharge();
	this.setINT(this.getINT()+1);
	this.setMana(this.getMana()+5);
    }
}
