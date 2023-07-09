import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sub = sc.nextInt();  
        int sNum[] = new int[sub]; 

        for(int i =0; i < sub; i++ ){
            sNum[i] = sc.nextInt();  
        }


        double max = 0; //평균값과 최대값 초기화
        double subsum = 0;
        for (int i = 0; i < sub ; i++) {
            if(sNum[i] > max){ //배열에
                max = sNum[i];
            }
            subsum += sNum[i];
        }

        System.out.println(subsum * 100 / max / sub);
    }
}
