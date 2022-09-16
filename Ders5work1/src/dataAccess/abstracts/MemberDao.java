package dataAccess.abstracts;

import Entities.concretes.Member;

public interface MemberDao {

	void register(Member member);
	void memberLogin(Member member); 
	boolean existsByEmail(String email);
	boolean controlEmail(String email);
}
