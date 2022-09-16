
public class PlayerManager implements Operation {

	PlayerCheckService pcs;
	
	public PlayerManager(PlayerCheckService pcs) {
		this.pcs=pcs;		
	}		
	@Override
	public void add(Player player) {
		
		if(pcs.checkIfRealPlayer(player)) {
	
		System.out.println("Oyuncu Girişi Başarılı:"+player.getUserName());
	
		}else {
			System.out.println("Oyuncu Girişi Başarısız");
		}
	}

	@Override
	public void remove(Player player) {
		System.out.println("Oyuncu Sistemden Kaldırıldı:"+player.getUserName());
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu Başarıyla Güncellendi:"+player.getUserName());
	}

	

}
