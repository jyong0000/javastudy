package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		//점수 저장 (데이터 추가)
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//모든 데이터 출력 => 기본 오름차순
		for(Integer s : scores) {
			System.out.println(s);
		}
		
		 System.out.println("=========================");
		
		System.out.println("가장 낮은 점수 : "  + scores.first());
		System.out.println("가장 높은 점수 : "  + scores.last());
		
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위의 점수 : " + scores.higher(95));
		
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수 : " + scores.ceiling(85));
		
		 System.out.println("=========================");
		
		//내림차순 정렬
		 NavigableSet<Integer>decendingScores =  scores.descendingSet(); // 내림차순 정렬
		 for(Integer s : decendingScores) {
			 System.out.println(s);
		 }
		 System.out.println("=========================");
		 
		 //범위검색 (80 <=) 80이상
		 NavigableSet<Integer> rangeSet = scores.tailSet(80, true); //어떤값보다 큰 값을 구하고 싶을때
		 NavigableSet<Integer> rangeSet2 = scores.headSet(80, true); //어떤값보다 작은 값을 구하고 싶을때
		 for(Integer s : rangeSet) {
			 System.out.println(s);
		 }
		 System.out.println("=========================");
		 for(Integer s : rangeSet2) {
			 System.out.println(s);
		 }
		 System.out.println("=========================");
		 
		 //범위검색 (80 <= score <= 95)
		 NavigableSet<Integer> rangeSet3 = scores.subSet(80, true, 95, true); //어떤값보다 작은 값을 구하고 싶을때
		 for(Integer s : rangeSet3) {
			 System.out.println(s);
		 }
		 System.out.println("=========================");
		 
	}
}
