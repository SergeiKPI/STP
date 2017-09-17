import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Введіть число:");
        Scanner vvid = new Scanner(System.in);
        int count = vvid.nextInt();
        int[] numbersArray = new int[count];
        int max = numbersArray[0],  min = numbersArray[0];
        for(int i = 0; i<count; i++){
            System.out.println("Введіть значення " + i + " елемента массива:");
            numbersArray[i] = vvid.nextInt();
        }
        //========================================================================
        for(int q = 0; q<numbersArray.length-1;q++){
            if(numbersArray[q] < min){
                min = numbersArray[q];
            }
            if(numbersArray[q] > max){
                max = numbersArray[q];
            }

        }
        if(min>0) {
            System.out.println("Середнє геометричне максимального і мінімального елементів масиву = " + Math.sqrt(min*max));
        }
        else{
            System.out.println("Неможливо знайти середнє геометричне значення, тому що присутнє від'ємне число.");
        }
        //========================================================================


        int countNeg = 0;
        int countPos = 0;

        for(int r = 0; r<numbersArray.length; r++){
            if(numbersArray[r]<0){
                countNeg+=1;
            }else{
                countPos+=1;
            }
        }
        int[] negative = new int[countNeg];
        int[] positive = new int[countPos];
        for(int e = 0, n = 0, p = 0; e<numbersArray.length; e++){
            if(numbersArray[e]<0){
                negative[n] = numbersArray[e];
                n++;
            }
            else{
                positive[p]= numbersArray[e];
                p++;
            }
        }

        int sumNeg  = 0;
        for(int l = 0; l<negative.length;l++){
            sumNeg = sumNeg + negative[l];
        }

        int sumPos = 0;
        for (int c = 0; c<positive.length; c++){
            sumPos = sumPos + positive[c];
        }
        int dif = sumPos - Math.abs(sumNeg);
        System.out.println("Різниця між позитивними та негативними елементами масиву = " + Math.abs(dif));

        //========================================================================

        System.out.println("Кількість позитивних елементів в масиві = " + countPos);

        //========================================================================

        System.out.println("Сума негативних елементів масиву = " + sumNeg);

        //========================================================================

        int sumMult = 0;
        for(int j = 0; j<numbersArray.length; j++){
            if(j%3 == 0 && j!=0){
                sumMult = sumMult + numbersArray[j];
            }
        }

        System.out.println("Сума елементів масиву, в яких індекс має кратне число 3 = " + sumMult);

        //========================================================================

        int prod = max * min;
        System.out.println("Добуток найбільшого і найменшого елементу масиву = " + prod);
    }
}
