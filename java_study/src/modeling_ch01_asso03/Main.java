package modeling_ch01_asso03;

public class Main {

	public static void main(String[] args) {
		//학생 두명 생성
		Student s1 = new Student("s1");
		Student s2 = new Student("s2");
		
		
		//과목 생성
		Course java = new Course("JAVA");
		Course dp = new Course("Design pattern");
		
		//성적객체생성 => 수강신청도 동시에 발생
		Transcript t1 = new Transcript(s1, java);	
		Transcript t2 = new Transcript(s1, dp);
		Transcript t3 = new Transcript(s2, dp);
		 
		t1.setDate("2023-05-04");
		t1.setGrade("B");
		
		t2.setDate("2023-05-04");
		t2.setGrade("D+");
		
		t1.setDate("2023-05-04");
		t1.setGrade("C+");
	}

}
