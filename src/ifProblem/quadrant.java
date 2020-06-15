package ifProblem;
import java.util.*;

public class quadrant {

	public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("x좌표 입력: ");
        x = sc.nextInt();
        System.out.print("y좌표 입력: ");
        y = sc.nextInt();
        sc.close();
        
        if(x > 0){
        	if(y > 0){
            System.out.println("제1 사분면 입니다.");
            } else {
            System.out.println("제4 사분면 입니다.");
            }
        }
        else if (x < 0){
            if(y > 0){
                System.out.println("제2 사분면 입니다.");
            } else {
                System.out.println("제3 사분면 입니다.");
            }
        } 
	}
}
