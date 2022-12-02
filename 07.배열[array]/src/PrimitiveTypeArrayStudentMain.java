

public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("----- 학생 10명 성적 데이터를 저장하기 위한 배열객체 생성 초기화 -----");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "JANG", "MIN", "CHOI", "SUNG", "AHN", "LIM", "SIM" };
		int[] korArray = { 53, 89, 99, 78, 98, 41, 83, 48, 89, 98 };
		int[] engArray = { 91, 41, 87, 100, 46, 54, 67, 98, 88, 18 };
		int[] mathArray = { 86, 74, 89, 48, 89, 71, 45, 21, 68, 97 };
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgArray = { 0.0, .0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		/*
		 * 총점, 평균, 평점계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			avgArray[i] = totArray[i] / 3.0;

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
		 * 총점으로 석차계산
		 */
		for (int i = 0; i < noArray.length; i++)
			for (int j = 0; j < totArray.length; j++) {
				if (totArray[i] < totArray[j])
					rankArray[i]++;
			}
		
		/*
		 * 학생검색(번호,국어,영어,수학,학점,석차)
		 */
		
		/*
		 * 번호3번인학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)
		 */
		System.out.println(">>번호3번인학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)");
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
		System.out.println(">>국어 점수 80점인 학생들 여러명 찾아서 여러명 정보 출력");
		for (int i = 0; i < korArray.length; i++) {
			if (korArray[i] >= 80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}

		/*
		 * 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>영어 점수 50점 이하인 학생들 여러명 찾아서 여러명 정보 출력");
		for (int i = 0; i < engArray.length; i++) {
			if (engArray[i] <= 50) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}

		/*
		 * 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>수학 점수 70점 이상인 학생들 여러명 찾아서 여러명 정보 출력");
		for (int i = 0; i < mathArray.length; i++) {
			if (mathArray[i] >= 70) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}

		/*
		 * 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		 */
		System.out.println(">>학점이 D학점 이하인 학생 모두 찾아서 여러명 정보 출력");
		for (int i = 0; i < gradeArray.length; i++) {
			if (gradeArray[i] == 'D' || gradeArray[i] == 'F') {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}

		/*
		 * 정렬 1.오름차순 ex> 1,2,3,4,5.... a,b,c,d,e....,가 ... 힣 2.내림차순 ex> 5,4,3,2,1
		 * z,y,x.... , 힣 ... 가
		 */

		/*
		 * 학생총점순으로 오름차순(내림차순)정렬
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬전  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}

		/*
		 * 학생총점순으로 오름차순정렬 https://www.youtube.com/watch?v=ebI54DXYQG8
		 */
		int a = 10;
		int b = 3;
		// swap a,b
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("--swap---");
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length - 1; j++) {
				if (totArray[j] > totArray[j + 1]) {
					// swap
					// tot
					int tempTot = totArray[j];
					totArray[j] = totArray[j + 1];
					totArray[j + 1] = tempTot;
					// no
					int tempNo = noArray[j];
					noArray[j] = noArray[j + 1];
					noArray[j + 1] = tempNo;
					// name
					String tempName = nameArray[j];
					nameArray[j] = nameArray[j + 1];
					nameArray[j + 1] = tempName;
					// kor
					int tempKor = korArray[j];
					korArray[j] = korArray[j + 1];
					korArray[j + 1] = tempKor;
					// eng
					int tempEng = engArray[j];
					engArray[j] = engArray[j + 1];
					engArray[j + 1] = tempEng;
					// math
					int tempMath = mathArray[j];
					mathArray[j] = mathArray[j + 1];
					mathArray[j + 1] = tempMath;
					// avg
					double tempAvg = avgArray[j];
					avgArray[j] = avgArray[j + 1];
					avgArray[j + 1] = tempAvg;
					// grade
					char tempGrade = gradeArray[j];
					gradeArray[j] = gradeArray[j + 1];
					gradeArray[j + 1] = tempGrade;
					// rank
					int tempRank = rankArray[j];
					rankArray[j] = rankArray[j + 1];
					rankArray[j + 1] = tempRank;
				}
			}
		}

			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬후 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.printf("---------------학생 성적출력-------------------\n");
			System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
			System.out.printf("-----------------------------------------------\n");
			for (int i = 0; i < noArray.length; i++) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
			
		}
	}
