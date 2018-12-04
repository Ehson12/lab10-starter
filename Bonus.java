class Bonus {
    public static void main(String[] args) {
        // call printInvertedPyramid here
    }

    public static void printInvertedPyramid(int n) {
        // n/2 + n%2 is equal to n/2 rounded up to the nearest integer
        //           this is the number of lines that should be printed
        for (int i = 0; i < n/2 + n%2; i += 1) {
            for (int j = 0; j < i; j += 1) {            // A
            // for (int j = 0; j < n; j += 1) {         // A
                // System.out.print(" ");               // B
                // System.out.print("*");               // B
            }

            for (int k = 0; k < n - i; k += 1) {        // C
            // for (int k = 0; k < n - 2*i; k += 1) {   // C
                // System.out.print(" ");               // D
                // System.out.print("*");               // D
            }
            System.out.println("");
        }
    }
}