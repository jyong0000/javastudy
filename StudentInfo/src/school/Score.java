package school;

public class Score {
	private int studentId; //학번
	private Subject subjcet; //과목
	private int point; //점수
	
	//생성자
	public Score(int studentId, Subject subjcet, int point) {
		this.studentId = studentId;
		this.subjcet = subjcet;
		this.point = point;
	}

	@Override
	public String toString() { //toString : 클래스의 정보를 출력할때 사용 
		return "학번" + this.studentId + ", " + subjcet.getSubjectName() + ": " + point;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getSubjcet() {
		return subjcet;
	}

	public void setSubjcet(Subject subjcet) {
		this.subjcet = subjcet;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
