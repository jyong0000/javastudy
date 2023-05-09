package ch02.sec01;

public class Test {

		public static void main(String[] args) {
		      char ch = 'z';
		      boolean b =  ( 'a' <= ch && ch <= 'z'  ) ||('A' <= ch && ch <= 'Z') ||  ('0' <= ch && ch <= '9');
		      System.out.println(b);


		      }
		


	}


//*힌트: ('a' <= ch && ch <= 'z') || ? || ? 에서 물음표를 채우면 정답
