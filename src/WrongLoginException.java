public class WrongLoginException extends Exception {
        private String descriptionOfCE;
        private int numOfCustomException;

        public WrongLoginException(String descriptionOfCE, int numOfCustomException){
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


