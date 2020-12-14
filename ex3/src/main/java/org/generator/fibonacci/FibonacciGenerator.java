package org.generator.fibonacci;

public class FibonacciGenerator {
    public int getFibNumber(int position) {

        if (position == 0 || position == 1){
            return position;
        }

        int fibNumber = 1;
        int fibNumberN_2 = 0;
        int fibNumberN_1 = 1;

        for (int i = 1; i < position; i++) {
            fibNumber = fibNumberN_2 + fibNumberN_1;
            fibNumberN_2 = fibNumberN_1;
            fibNumberN_1 = fibNumber;
        }

        return fibNumber;
    }
}
