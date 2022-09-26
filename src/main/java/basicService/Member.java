package basicService;

import java.time.LocalDateTime;

public class Member {
	
	private String Id;
	private String Password;
	private String Name;
	private String Emaul;
	private String Address;
	private String ResMumber;
	private LocalDateTime RegDate;
	private String Gender;
	private String[] Preference;
	static String[] resMovie;
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmaul() {
		return Emaul;
	}

	public void setEmaul(String emaul) {
		Emaul = emaul;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getResMumber() {
		return ResMumber;
	}

	public void setResMumber(String resMumber) {
		ResMumber = resMumber;
	}

	public LocalDateTime getRegDate() {
		return RegDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		RegDate = regDate;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String[] getPreference() {
		return Preference;
	}

	public void setPreference(String[] preference) {
		Preference = preference;
	}

	public static String[] getResMovie() {
		return resMovie;
	}

	public static void setResMovie(String[] resMovie) {
		Member.resMovie = resMovie;
	}
}
