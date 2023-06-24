package Activities;

public class Activity2 {

    public static void main(String[] args){
        int[] test={10, 77, 10, 54, -11, 10};

        verifyNo(test,10);
    }
    public static void verifyNo(int[] inputArray,int searchNum){
        int result=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]==searchNum){
                result=result+inputArray[i];

            }

        }
        if (result==30){
            System.out.println("Result is "+result);
        }else{
            System.out.println("Result is "+result);
        }
    }
}
