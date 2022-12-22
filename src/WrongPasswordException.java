public class WrongPasswordException extends Exception{
    private String descriptionOfCE;
    private int numOfCustomException;

     public WrongPasswordException(String descriptionOfCE, int numOfCustomException){
         super(descriptionOfCE);
         this.descriptionOfCE=descriptionOfCE;
         this.numOfCustomException=numOfCustomException;
     }


    public String getDescriptionOfCE() {
        return descriptionOfCE;
    }

    public int getNumOfCustomException() {
        return numOfCustomException;
    }
}
