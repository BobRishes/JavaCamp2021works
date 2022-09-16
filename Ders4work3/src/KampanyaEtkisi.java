
public class KampanyaEtkisi {

	int kampanyalıGünSatışı;
	int kampanyasızGünSatışı;
	
	
	public void kampanyaEtkisi() {
		if(kampanyalıGünSatışı>kampanyasızGünSatışı) {
			System.out.println("Satışlarda Kampanyanın Etkisi Oldu.Net Kampanyalı Satış:"+ (kampanyalıGünSatışı-kampanyasızGünSatışı));
		}else {
			System.out.println("Satışlarda Kampanyanın Etkisi Olmadı.Önceki Günün Total Satışa Göre Eksik Satış:" +(kampanyasızGünSatışı-kampanyalıGünSatışı));
			
		}
	}
	
}
