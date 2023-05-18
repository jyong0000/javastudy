package Q11_03;

public class Member {

	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format(id + " : " + name);
	}
}
