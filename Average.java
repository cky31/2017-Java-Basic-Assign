import java.util.Scanner;

public class chap01 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();    
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
        System.out.print("실수 " + size + "개를 입력하세요. >> ");    
        
        double[] array = new double[size];
        double sum = 0;
        for(int i=0; i<array.length; i++){
        	array[i] = input.nextDouble();
        	sum += array[i];
        	if(array[i]==0){
        		size = i;
        		break;
        	}
        }
      
        System.out.println("합: " + sum + ", 평균: " + sum/size);
	}
}
