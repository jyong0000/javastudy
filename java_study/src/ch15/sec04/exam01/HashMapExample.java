package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;
public class HashMapExample {

	public static void main(String[] args) {
		//Map<key의 타입, 저장할 값의 타입 > 을 명시한다.
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size()); //map은 key값이 같은 데이터를 중복저장 할 수없다.
		
		//키로 값을 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println();
		
		//전체 데이터 출력하는 방법 1
		//키를 전부 가져온다
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator =  keySet.iterator();
		
		while(keyIterator.hasNext()) {	//키의 갯수만큼 반복해준다.
			String k = keyIterator.next(); //키를 하나씩 가져온다
			int v = map.get(k);
			System.out.println(k + ":" + v);
		}
		//전체 데이터 출력하는 방법 2
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		
		
	}

}
