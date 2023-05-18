package application;

import java.io.*;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class StudentInfoApplicationWithFile {
	
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;

	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) throws FileNotFoundException {

		StudentInfoApplicationWithFile test = new StudentInfoApplicationWithFile();
		test.creatSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);		
		
	}
	
	public void creatSubject(){
		
		korean = new Subject("국어", Define.KOREA);
		math = new Subject("수학", Define.MATH);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
	}
	
	public void createStudent() throws FileNotFoundException {
		
		//File file = new File("studentinfo.txt");
		//Scanner scanner = new Scanner(file);
		
		FileInputStream is = new FileInputStream("studentinfo.txt");
		Scanner scanner = new Scanner(is);

		String name;
		int id;
		int koreanScore;
		int mathScore;
		int majorCode;
		Student student = null;
		
		try(is; scanner) {
			
			while(scanner.hasNextLine()) {
				
				name = scanner.next();
				id = scanner.nextInt();
				koreanScore = scanner.nextInt();
				mathScore = scanner.nextInt();
				majorCode = scanner.nextInt();
				
				if(majorCode == Define.KOREA) {
					student = new Student(id, name, korean );
				}
				else if(majorCode == Define.MATH) {
					student = new Student(id, name, math );
				}
				else {
					System.out.println("존재하지 않는 과목입니다.");
					return;
				}
				
				goodSchool.addStudent(student);
				korean.register(student);
				math.register(student);
				addScoreForStudent(student, korean, koreanScore);
				addScoreForStudent(student, math, mathScore);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//과목별 점수 추가 메소드
	public void addScoreForStudent(Student student, Subject subject, int point){
			
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
			
	}
}