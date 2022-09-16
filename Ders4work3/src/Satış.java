
public class Satış {

	Player[]players;
	
	public void sale(Player[]players) {
	
		this.players=players;
		int i=450;
		if(i<players.length) {
			System.out.println("Kampanya Kârlı Satış Yaptı.");
		}else if (i==players.length) {
			System.out.println("Kampanya Kâr/Zarar Ettirmedi.");
		}else {
			System.out.println("Kampanya Kârlı Satış Yapamadı.");
		}		
	}		
}
