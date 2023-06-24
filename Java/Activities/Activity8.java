package Activities;

public class Activity8 {
    public static void main(String[] args){
        try {
            Activity8.exceptionTest("Testing custom exception");
            Activity8.exceptionTest("Custom exception defined");
            Activity8.exceptionTest(null);
        } catch (CustomException e) {
            System.out.println("Inside catch block, exception is "+e);
        }
    }


    public static void exceptionTest(String message) throws CustomException {
        if(message==null)
            throw new CustomException("Value in String is null");
        else
            System.out.println("String value is: "+message);
    }
}
