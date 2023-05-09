package school;

import java.util.ArrayList;

	public class Main {
	private static ArrayList<Student> StudentList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		Student park = new Student("박지은", 181213, "국어국문과", "국어", 95 , 56);
		Student cha = new Student("차슬기", 181518, "컴퓨터공학과", "수학", 95 , 98);
		Student lee = new Student("이현욱", 171230, "국어국문과", "국어", 100 , 88);
		Student lim = new Student("임지연", 171255, "국어국문과", "국어", 89 , 95);
		Student kim = new Student("김재현", 171590, "컴퓨터공학과", "수학", 83 , 56);
		
		StudentList.add(park);
		StudentList.add(cha);
		StudentList.add(lee);
		StudentList.add(lim);
		StudentList.add(kim);
	}

}
