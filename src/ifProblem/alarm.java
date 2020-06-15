package ifProblem;

import java.util.*;

public class alarm {

	public static void main(String[] args) {
		int H, M;
		Scanner sc = new Scanner(System.in);
		System.out.print("Hour 입력: ");
		H = sc.nextInt();
		System.out.print("Minute 입력: ");
		M = sc.nextInt();
		
		sc.close();
		
		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0) {
				H = 23;
			}
			System.out.println("알람이 " + H + "시 " + M + "분으로 45분 빨리 설정되었습니다.");
		} else {
			System.out.println("알람이 " + H + "시 " + (M - 45) + "분으로 45분 빨리 설정되었습니다");
		}
	}
}