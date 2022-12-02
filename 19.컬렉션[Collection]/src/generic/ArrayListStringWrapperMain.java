package generic;

import java.util.ArrayList;

public class ArrayListStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("--------------- String -----------------");
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println("------1.add------");
		nameList.add("KIM");
		nameList.add("JIM");
		nameList.add("HIM");
		nameList.add("AIM");
		nameList.add("TIM");
		nameList.add("BIM");
		nameList.add("CIM");
		nameList.add(new String("KIM"));
		System.out.println(nameList);

		System.out.println("------2.get(index)------");
		System.out.println(nameList.get(1));
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(5));

		System.out.println("------3.remove(index)------");
		// nameList.remove(nameList.size()-1); 제일 마지막 순서 없애준다
		nameList.remove(1);
		System.out.println(nameList);

		System.out.println("------3.remove(element)------");
		// nameList.remove("TIM");
		// remove(element) : 주소와 관련없이 같은 값을 찾아서 삭제함
		nameList.remove(new String("TIM"));
		System.out.println(nameList);
		// remove toolTip : Removes the first occurrence of the specified element from this list
		// 모든 KIM을 찾아서 지우는게 아니라 첫번째로 찾은 KIM을 삭제해 줌
		/*
		<< boolean java.util.ArrayList.remove(Object o) >>
		Removes the first occurrence of the specified element from this
		 */
		nameList.remove("KIM");
		System.out.println(nameList);

		System.out.println("----------Wrapper------------");
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(78);
		scoreList.add(89);
		scoreList.add(12);
		scoreList.add(new Integer(90));
		scoreList.add(new Integer(100));
		System.out.println(scoreList);
		System.out.println("-----------1.get----------");
		int score1 = scoreList.get(2);
		System.out.println(score1);
		int score2 = scoreList.get(scoreList.size() - 1);
		System.out.println(score2);
		System.out.println("-----------2.set----------");
		scoreList.set(2, 90);
		System.out.println(scoreList);
		System.out.println("-----------3.remove----------");
		// 객체 직접 삭제 -> 일반 객체는 괜찮지만.........       반드시 객체 형태로 넣어주기
		/*
		 << Integer java.util.ArrayList.remove(int index) >>
		 */
		scoreList.remove(5);
		/*
		 << Integer java.util.ArrayList.remove(Object element) >>
		 Removes the first occurrence of the specified element from this list
	 	 scoreList.remove(new Integer(90));
		 */
		System.out.println(scoreList);
		
		

	}

}
