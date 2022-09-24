package kodlama.io.hrms.entities.concretes;



public class Employers extends User{

	
	private String companyName;
	private String webSite;
	private String phone;
	
	public Employers() {
		
	}
	
	public Employers(String companyName, String webSite, String phone) {
		super();
		this.companyName = companyName;
		this.webSite = webSite;
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
