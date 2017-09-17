import java.util.Scanner;

public class Matrix {

    public static void main(String[] args){

        System.out.println("Введіть розмір матриці:");
        Scanner vvid = new Scanner(System.in);
        int countM = vvid.nextInt();

        int[][] matrix = new int[countM][countM];

        for(int i = 0; i<countM;i++){
            for(int k = 0; k<countM;k++){
                matrix[i][k] = (int)(Math.random()*100);
            }
        }

        int sum = 0;

        for(int r = 0, t = countM-1; r<countM; r++, t--){
            sum = sum + (matrix[r][r]*matrix[r][t]);
        }

        //========================================================================



    }
}
