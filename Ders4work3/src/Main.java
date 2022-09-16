
public class Main {

	public static void main(String[] args) {
		
		
		Player player1=new Player();
		player1.name="Burak";
		player1.userName="brk123";
		player1.password="123qwe";
		
		Kampanya kampanya1=new Kampanya();
		kampanya1.kampanyaName="İlk Gün %50 İndirim !";
		
		
		
		PlayerManager pm=new PlayerManager(new PlayerCheckManager());
		pm.add(player1);
		
		KampanyaManager km=new KampanyaManager();
		km.add(kampanya1);
		
		
		
		Player[]players=new Player[650];
		Satış satis=new Satış();
		satis.sale(players);
		
		KampanyaEtkisi ke=new KampanyaEtkisi();
		ke.kampanyalıGünSatışı=400;
		ke.kampanyasızGünSatışı=250;
	
		ke.kampanyaEtkisi();
		
		
		

	}

}
