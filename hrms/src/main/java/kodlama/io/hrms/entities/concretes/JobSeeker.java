package kodlama.io.hrms.entities.concretes;


public class JobSeeker extends User {

	private String name;
	private String lastName;
	private String tc;
	private String date;
	
	public JobSeeker()	{
		
	}	
	public JobSeeker(String name, String lastName, String tc, String date) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.tc = tc;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
