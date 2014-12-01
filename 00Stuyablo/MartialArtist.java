import java.util.Random;
public class MartialArtist extends Adventurer{
    private int Qi;
    public MartialArtist(int s, int i, int d, String name){
	setName(name);
	setHP(30);
	setSTR(s);
	setINT(i);
	setDEX(d);
    }
    public MartialArtist(){
    	this("Bruce Lee");
    }
    public MartialArtist(String name){
	setName(name);
	setSTR(15);
        setINT(15);
	setDEX(15);
	setQi(0);
    }
    public void setQi(int Qi){
	this.Qi=Qi;
    }
    public int getQi(){
	return Qi;
    }
    public String getStats(){
	return super.getStats()+"\t"+getQi()+" Qi";
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
	System.out.println(this.getName()+" unleashes his Qi "+other.getName());
	if (hit(other)) {
	    if (this.getQi()==0){
		System.out.println(this.getName()+" did not have enough qi for that, "+this.getName()+" will use your regular attack");
		this.attack(other);
	    } else {
		int x=other.getHP();
		int damage=this.getQi();
		other.setHP(x-damage);
		System.out.println(this.getName()+" did "+damage+" damage");
		this.setQi(0);
	    }
	} else {
	    System.out.println(this.getName()+" missed");
	}
    }
    public void recharge(){
	super.recharge();
	Random QiBoost = new Random();
	int i = QiBoost.nextInt(7)+1;
	this.setQi(this.getQi()+i);
    }

}
    
