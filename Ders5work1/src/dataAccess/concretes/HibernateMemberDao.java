package dataAccess.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.concretes.Member;
import dataAccess.abstracts.MemberDao;

public class HibernateMemberDao implements MemberDao {

	@Override
	public void register(Member member) {
		
		 if(controlEmail(member.getEmail()) == false) {
			 System.out.println("girilen mail formata uygun değil");
		 return;
		 }else {
		
		System.out.println("Kayıt Hibernate ile eklendi-->"+member.getName());
		 }
	}

	@Override
	public void memberLogin(Member member) {
		System.out.println("Giriş Hibernate ile yapıldı."+member.getName());
		
	}

	@Override
	public boolean existsByEmail(String email) {
		if(true) {
	
		}
		return false;
	}

	@Override
	public boolean controlEmail(String email) {
		Pattern pattern=Pattern.compile("@",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(email);
		
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Girilen email formata uygundur");
		}else {
			System.out.println("Girilen email formata uygun değildir");
		}
		
		return true;
	}

}
