
public class MAİN {

	public static void main(String[] args) {
		
		Student a1=new Student();
		a1.name="Mustafa";
		a1.lastName="Burak";
		a1.ogrenciNumarası="333";
		a1.bolumu="Tıp";
		a1.girilenDersler="Anatomi"+"Fizyoloji";
		a1.haftadaKacSaat="20";
		a1.kacıncıSınıf="1";
						
		Instructor b1=new Instructor();
		b1.name="Engin";
		b1.lastName="Demiroğ";
		b1.ogretmenNumarası="222";
		b1.unvan="Profesör";
		b1.anaBrans="Dahiliye";
		b1.girilenDersler="Anatomi"+"Dahiliye";
		b1.haftadaKacSaat="10";
		
										
		UserManager userManager=new UserManager();
		userManager.add(a1);
		userManager.add(b1);
		userManager.remove(a1);
		
		System.out.println("-----------");
		
		User[] users= {a1,b1};
		userManager.addMultiple(users);
		
		IstructorManager abc=new IstructorManager();
		abc.unvan(b1);
		
		StudentManager bcd=new StudentManager();
		bcd.sınıf(a1);
		
		
		
	}

}
