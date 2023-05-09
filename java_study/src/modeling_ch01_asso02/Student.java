package modeling_ch01_asso02;

import java.util.ArrayList;

public class Student {
	//필드
	private String name;
	//Course courses : 1개 일때
	private ArrayList<Course> courses; //n개 일때 ,양방향관계 => 서로가 서로의 객체를 필드로 가지고있다.
	
	//생성자
	public Student(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}
	
	//수강신청
	public void registerCourse(Course course) {
		courses.add(course);
	}
	//수강취소
	public void dropCourse(Course course) {
		courses.remove(course);
	}
}
