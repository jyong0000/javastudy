package modeling_ch01_asso03;

import java.util.ArrayList;

public class Course {
	//필드
	private String name;
	private ArrayList<Transcript> transcripts;
	
	//생성자
	public Course(String name) {
		this.name = name;
		transcripts = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	//수강신청 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

}
