package numbers;

public class BiggerAndSmaller {

    private int theSmallest;
    private int theLargest;
    private final int[] myArray;

    public BiggerAndSmaller(int[] myArray) {
        this.myArray = myArray;
        this.theSmallest = myArray[0];
        this.theLargest = myArray[0];
    }

    public int getSmallest() {
        for (int i = 1; i < myArray.length; i++) {
                if (theSmallest > myArray[i]) {
                    theSmallest = myArray[i];
            }
        }
        return theSmallest;
    }

    public int getLargest() {
        for (int i = 1; i < myArray.length; i++) {
                if (theLargest < myArray[i]){
                    theLargest = myArray[i];
            }
        }
        return theLargest;
    }
}
