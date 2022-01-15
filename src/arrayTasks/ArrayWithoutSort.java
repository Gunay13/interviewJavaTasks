package arrayTasks;

import java.util.Arrays;

public class ArrayWithoutSort {
    public static void main(String[] args) {

        int[]num={1,2,0,3,8,9};
        int[]num1={6,4,10,7};
        int[]numNew=new int[num.length+num1.length];
        int n=0;
        for (int i = 0; i < num.length; i++) {
            numNew[n++]=num[i];
        }
        for (int i = 0; i < num1.length; i++) {
            numNew[n++]=num1[i];
        }

        System.out.println(Arrays.toString(numNew));

        for (int i = 0; i < numNew.length; i++) {
            for (int j = 0; j < numNew.length; j++) {
                int temp=0;
                if(numNew[i]<numNew[j]){
                    temp=numNew[i];
                    numNew[i]=numNew[j];
                    numNew[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(numNew));

    }
}
