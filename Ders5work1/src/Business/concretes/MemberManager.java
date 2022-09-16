package Business.concretes;

import Business.abstracts.MemberService;
import Entities.concretes.Member;
import core.YetkilendirmeService;
import dataAccess.abstracts.MemberDao;

public class MemberManager implements MemberService{

	private MemberDao memberDao;
	private YetkilendirmeService yetkilendirmeService;
	
	

	public MemberManager(MemberDao memberDao,YetkilendirmeService yetkilendirmeService) {
		super();
		this.memberDao = memberDao;
		this.yetkilendirmeService=yetkilendirmeService;
	}

	@Override
	public void register(Member member) {
		if(member.getPassword().length()<6 && member.getName().length()<2 && member.getLastName().length()<2) {
			System.out.println("Şifrenin en az 6 haneli,isim ve soy ismin ise en az 2 haneli olması gerekmektedir!");
			return;					
		}
		if(memberDao.existsByEmail(member.getEmail())==true) {
			System.out.println("Bu email sistemde kayıtlı.Başka bir email deneyiniz!");
			return;	
		}
		
		this.yetkilendirmeService.yetki("Google");
		this.memberDao.register(member);
		System.out.println("Kayıt başarılı!Lütfen mailinize gelen doğrulama linkine girip kaydı tamamlayınız.");
		
	}

	@Override
	public void memberLogin(Member member) {
		
		System.out.println("Giriş Başarılı");
		
	}

}
