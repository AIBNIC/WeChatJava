package entry;

public class UserInfo {
	String user_number;
	String user_password;
	String user_floor;
	String user_identity;
	String openid;
	String level;
	String user_name;
	String type;
	String time;
	String ip;
	String stuid;
	String state;
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public UserInfo(String user_number, String user_password, String user_floor, String user_identity,
			String openid ,String level,String user_name,String state) {
		this.user_number = user_number;
		this.user_password = user_password;
		this.user_floor = user_floor;
		this.user_identity = user_identity;
		this.openid = openid;
		this.level = level;
		this.user_name = user_name;
		this.state = state;
	}
	public UserInfo(String user_number, String user_name) {
		this.user_number = user_number;
		this.user_name = user_name;
	}
	public UserInfo(String user_name,String user_number ,String type,String ip,String stuid) {
		this.user_number = user_number;
		this.user_name = user_name;
		this.type = type;
		this.ip = ip;
		this.stuid = stuid;
	}
	public UserInfo() {

	}

	public String getUser_number() {
		return user_number;
	}

	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_floor() {
		return user_floor;
	}

	public void setUser_floor(String user_floor) {
		this.user_floor = user_floor;
	}

	public String getUser_identity() {
		return user_identity;
	}

	public void setUser_identity(String user_identity) {
		this.user_identity = user_identity;
	}
	
	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
