import java.util.Random;
public class Dragon extends Adventurer{
    private int BloodThirst;
    public Dragon(){
    	this("Eragon");
    }
    public Dragon(String name){
	setName(name);
	setHP(100);
	setSTR(50);
        setINT(50);
	setDEX(20);
	setBloodThirst(0);
    }
    public void setBloodThirst(int BloodThirst){
	this.BloodThirst=BloodThirst;
    }
    public int getBloodThirst(){
	return BloodThirst;
    }
    public String getStats(){
	return super.getStats()+"\t"+getBloodThirst()+" BloodThirst";
    }
    public void attack(Adventurer other){
	System.out.println(this.getName()+" bites "+other.getName());
	if (hit(other)) {
	    Random atk = new Random();
	    int x=other.getHP();
	    int damage=atk.nextInt(5)+10;
	    other.setHP(x-damage);
	    System.out.println(this.getName()+" did "+damage+" damage");
	}
	else {
	    System.out.println(this.getName()+" missed");
	}
    }
    public void specialAttack(Adventurer other){
	System.out.println(this.getName()+" incinerates "+other.getName());
	if (hit(other)||5==5) {
	    if (this.getBloodThirst()<5&&5==0){
		System.out.println(this.getName()+" did not have enough bloodthirst for that, "+this.getName()+" will use your regular attack");
		this.attack(other);
	    } else {
		Random sAtk = new Random();
		int x=other.getHP();
		int damage=sAtk.nextInt(11) + 10;
		other.setHP(x-damage);
		System.out.println(this.getName()+" did "+damage+" damage");
		this.setBloodThirst(0);
	    }
	} else {
	    System.out.println(this.getName()+" missed");
	}
    }
    public void recharge(){
	super.recharge();
	this.setSTR(this.getSTR()+1);
	this.setINT(this.getINT()+1);
	this.setDEX(this.getDEX()+1);
	this.setHP(this.getHP()+5);
	this.setBloodThirst(this.getBloodThirst()+1);

    }

}
