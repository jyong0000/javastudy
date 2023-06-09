package grade;

public class MajorEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		String grade; //학점
		
		if(point >= 95 && point <= 100) { //90~100점
			grade = "S";
		}else if (point >= 90 && point <= 94) { //80~89점
			grade = "A";
		}else if (point >= 80 && point <= 89) { //70~79점
			grade = "B";
		}else if (point >= 70 && point <= 79) { //55~69점
			grade = "C";
		}else if (point >= 60 && point <= 69) { //55~69점
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	}

}
