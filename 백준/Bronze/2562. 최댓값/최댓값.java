import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
//    System.out.println("자연수를 입력하세요.");
//    int number = sc.nextInt();
    
    // 초기값 0
    int maxNumber = 0;
    
    // 몇번 째 수인가
    int index = 1;
    
    for (int i=1; i<=9; i++) {
    	int number = sc.nextInt();
//        System.out.println(i + "번 째 수 : " + number);
        

        if (number > maxNumber) {
        	maxNumber = number;
        	index = i;
        } 
    }

    System.out.println(maxNumber);
    System.out.println(index);
    
    
    
    
    
    
    
    
    
    }

}