package MiniProject;

public class JoinVO {
	//JoinVO가방에 넣은 데이터는 MP_CUS테이블에 들어갈 예정
	//각 컬럼과 일치시켜줌
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String tel;
	
	//하나의 변수당 set/get하나씩 만들어줌.
	//가방에 하나씩 값을 넣어주어야 함. ==> setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "JoinVO [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth + ", tel=" + tel + "]";
	}
	
	

}