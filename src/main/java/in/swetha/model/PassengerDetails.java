package in.swetha.model;

public class PassengerDetails {
	private Integer passengerId;
	private String passangerName;
	private String gender;
	private Long mobileNumber;
	private String password;

	public PassengerDetails(Integer id, String passangerName, String gender, Long mobileNumber, String password) {
		super();
		this.passengerId = id;
		this.passangerName = passangerName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	public PassengerDetails() {
		super();
	}

	public PassengerDetails(String string, String string2) {

	}

	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer id) {
		this.passengerId = id;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "PassengerDetails [passengerId=" + passengerId + ", passangerName=" + passangerName + ", gender="
				+ gender + ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}

}
