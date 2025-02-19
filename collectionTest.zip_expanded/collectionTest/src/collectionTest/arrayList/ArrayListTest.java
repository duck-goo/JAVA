package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest<T extends Number> {
//		<?> : 제네릭 - 포괄적인, 이름이 없는
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.
	
	T data;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(40);
		datas.add(20);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		System.out.println(datas.size());
		
		try {
			datas.get(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 입력!");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		모든 데이터 확인
//		for 반복문
//		for(int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		System.out.println(datas);
		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입

		Collections.shuffle(datas);
		System.out.println(datas);
		
		if(datas.contains(50)) {
			try {
				datas.add(datas.indexOf(50) + 1, 500);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 똑바로!!");
				e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
			}
		};

//		수정 (90 -> 9) 수정
		if(datas.contains(90)) {
			int prev = 0;
			try {
				prev = datas.set(datas.indexOf(90), 9);
				System.out.println("이전 값: " + prev);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 처리 오류!");
				e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		
//		삭제 
//		80을 인덱스로 삭제
//		if(datas.contains(80)) {
//			int prev = 0;
//			try {
//				prev = datas.remove(datas.indexOf(80));
//				System.out.println("삭제된 값 :" + prev);
//			} catch (IndexOutOfBoundsException e) {
//				System.out.println("인덱스 오류!");
//				e.printStackTrace();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		
//		80을 값으로 삭제
		if(datas.contains(80)) {
			boolean isRemove = false;
			try {
//				WrapperClass 랩퍼 클래스
//				작은 것을 큰 것으로 감싸는 것
				isRemove = datas.remove(Integer.valueOf(80)); 
				System.out.println("삭제 여부: " + isRemove);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 오류!");
				e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(datas);
	}
}



















