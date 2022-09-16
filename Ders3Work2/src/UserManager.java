
public class UserManager {	

		public void add(User userrr) {
			System.out.println(userrr.name + userrr.lastName+" eklendi");
			
			userrr.user();
		
	}
		
		public void remove(User userr) {
			System.out.println(userr.name+ userr.lastName+ " kaldırıldı");
			
			userr.user();
		
	}
		public void addMultiple(User[] users) {
			for (User usersss:users ) {
				System.out.println(usersss.name+usersss.lastName+" eklendi");
			
			usersss.user();
			}
			
		}
		
	
}
