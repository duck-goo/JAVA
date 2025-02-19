package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		// <?>제네릭 : 포괄적인, 이름이 없는
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		datas.add(60);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		datas.add(100);
		System.out.println(datas.size());
		
		try {
		datas.get(0);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("인덱스 제대로 입력");
			e.printStackTrace();
		} catch (Exception e) {
		}
		
		System.out.println(datas);
		
		//실습
		//추가
		//50뒤에 500
		Collections.shuffle(datas);
		System.out.println(datas);
		
		if(datas.contains(50)) {
			try {
				datas.add(datas.indexOf(50) + 1, 500);
			} catch(IndexOutOfBoundsException e) {
				System.out.println("인덱스 범위 다시 입력");
				e.printStackTrace();
			} catch (Exception e) {
			}
		System.out.println(datas);
		}
		
	}
}
