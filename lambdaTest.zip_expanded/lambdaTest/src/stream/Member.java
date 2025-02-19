package stream;

import java.util.Objects;

public class Member {
	private String name;
	private String hobby;
	private String introduce;
	
	public Member() {;}

	public Member(String name, String hobby, String introduce) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hobby, introduce, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(hobby, other.hobby) && Objects.equals(introduce, other.introduce)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}

	public Object contains(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
