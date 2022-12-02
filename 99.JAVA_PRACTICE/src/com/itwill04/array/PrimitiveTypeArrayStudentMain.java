package com.itwill04.array;

public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		/*
		 * 배열객체 생성 초기화
		 */
		System.out.println("----학생10명데이타를 저장하기위한 배열객체생성 초기화----");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM" };
		int[] korArray = { 12, 45, 34, 66, 98, 93, 82, 61, 72, 88 };
		int[] engArray = { 32, 46, 64, 96, 58, 98, 62, 81, 32, 99 };
		int[] mathArray = { 93, 89, 88, 46, 54, 23, 90, 85, 73, 34 };
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgArray = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		/*
		 * 총점,평균,평점계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			// 총점
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			// 평균
			avgArray[i] = totArray[i] / 3.0;
			// 평점
			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else {
				gradeArray[i] = 'F';
			}

		}
		/*
		 * 총점으로석차계산
		 */

		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < totArray.length; j++) {
				if (totArray[0] < totArray[j]) {
					rankArray[0] = rankArray[0] + 1;
				}
			}
		}

		/*
		 * 학생검색(번호,국어,영어,수학,학점)
		 */
		/*
		 * 번호3번인 학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)
		 */
		System.out.println(">>3번학생 찾아서 1명정보출력(학생번호는 중복되지않는다.)");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}
		/*
		 * 국어점수 80점인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>국어점수 80점인 학생들 여러명 찾아서 여러명정보출력");

		/*
		 * 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력");
		
		/*
		 * 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력");
		
		/*
		 * 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		 */
		System.out.println(">>학점이 D학점이하인 학생모두찾아서 여러명 정보출력");

		/*
		 * 정렬 1.오름차순 ex> 1,2,3,4,5.... a,b,c,d,e....,가 ... 힣 2.내림차순 ex> 5,4,3,2,1
		 * z,y,x.... , 힣 ... 가
		 */

		System.out.println();
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		/*
		 * 학생총점순으로 오름차순정렬
		 */
		System.out.println();
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
	}

}