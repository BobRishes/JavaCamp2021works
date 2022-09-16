package Business.abstracts;

import Entities.concretes.Member;

public interface MemberService {

	void register(Member member);
	void memberLogin(Member member);
}
