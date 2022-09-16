
import Business.abstracts.MemberService;
import Business.concretes.MemberManager;
import Entities.concretes.Member;
import core.YetkilendirmeManager;
import dataAccess.concretes.HibernateMemberDao;

public class Main {

	public static void main(String[] args) {

		Member a1=new Member("burak","mustafa","abc@hotmail.com","123qwe");
		
		MemberService memberService= new MemberManager(new HibernateMemberDao(),new YetkilendirmeManager());
		
		memberService.register(a1);
		
		System.out.println("---------------");
		
		memberService.memberLogin(a1);
		
		
		
		
		
	
	
		
	}

}
