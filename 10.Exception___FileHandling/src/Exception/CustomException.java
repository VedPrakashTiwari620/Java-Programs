package Exception;

import java.lang.Exception;

public class CustomException extends Exception {

    private double degree;

    public CustomException(double degree){
        this.degree=degree;
    }

    @Override
    public String getMessage(){
        return "The temperature ("+ degree +" C) isn't normal range.";
    }




    public static void mathh() throws CustomException{
        throw new CustomException(12.34);
    }

    public static void main(String[] args) throws CustomException {
            CustomException ax= new CustomException(12.3);


            mathh();



    }
}
