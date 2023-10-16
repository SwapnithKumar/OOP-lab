import java.util.*;

abstract class Monster{
	abstract void attack();
}

class FireMonster extends Monster{
	void attack(){
		System.out.println("FireMonster attacked");
	}
}
class WaterMonster extends Monster{
	void attack(){
		System.out.println("WaterMonster attacked");
	}
}
class StoneMonster extends Monster{
	void attack(){
		System.out.println("StoneMonster attacked");
	}
}

public class MonsterAttack{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which monster to be attack: ");
		System.out.println("1: FireMonster  " +"2: WaterMonster  " +"3: 	StoneMonster");
		int n = sc.nextInt();
		switch(n){
			case 1:
				Monster m = new FireMonster();
				m.attack();
				break;
			case 2:
				Monster w = new WaterMonster();
				w.attack();
				break;
			case 3:
				Monster s = new StoneMonster();
				s.attack();
				break;
			default:
				System.out.println("Enter the correct input to atack !");
		}
	}
}
