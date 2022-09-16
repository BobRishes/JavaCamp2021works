
public class KampanyaManager implements Operation2{

	@Override
	public void add(Kampanya kampanya) {
		System.out.println("Kampanya Eklendi:"+kampanya.getKampanyaName());	
		
	}

	@Override
	public void remove(Kampanya kampanya) {
		System.out.println("Kampanya Kaldırıldı:"+kampanya.getKampanyaName());			
	}

	@Override
	public void update(Kampanya kampanya) {
		System.out.println("Kampanya Güncellendi:"+kampanya.getKampanyaName());	
	}

	
	
}
