import java.util.Arrays;

public class Sem1_1 {
    public static void main(String[] args) {
       System.out.println(TAsk04(2,-3));

    }

    static void Task01() {
        Integer[] integers = {1, 0, 0, 1, 1, 1,0,1,0,1,1,1,1,1,0,1,0};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == 1){
                count++;
            }else {
                count = 0;
            }
            if(count > maxOnes){
                maxOnes = count;
            }
        }
        System.out.println(maxOnes);
    }
    static  void Task02(){
        int[] arr = {3,2,2,2,5,4,5,2,0,1,2,4,5,6,3,3,3,5,4,5,7,3,3};
        int val = 3;
        int current = 0;
        int[] tempArray = new int[arr.length];
        Arrays.fill(tempArray, val);
        for (int i = 0; i < arr.length;i++){
            if (arr[i] != val){
                tempArray[current++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(tempArray));
    }
    static String Task03(String str){
        StringBuilder strBuild = new StringBuilder();
        str = str.toLowerCase();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++){
            strBuild.append(words[words.length - 1 - i]).append(" ");
        }
        return  strBuild.toString();
    }
    static double TAsk04(int a, int b){
        double temp = 1;
        for (int i = 1; i <= Math.abs(b); i++){
            temp*=a;
        }
return b > 0 ? temp : 1/temp;

        }
    }

