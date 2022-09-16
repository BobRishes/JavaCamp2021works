package core;

import Yetkilendirme.Yetkilendirme;

public class YetkilendirmeManager implements YetkilendirmeService {

	@Override
	public void yetki(String message) {
		Yetkilendirme yetkilendirme=new Yetkilendirme();
		yetkilendirme.register2(message);
	
	}

}
