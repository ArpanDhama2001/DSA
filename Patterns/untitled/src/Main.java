public class Main {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern5(int n) {
        int i = 0;
        int col = i+1;
        while(i < 2*n) {
            int j = 0;
            while(j < col) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
            if(i < n) {
                col++;
            }else {
                col--;
            }
        }
    }

    static void pattern28(int n) {
        int i = 0;
        int col = i+1;

        int noOfSpaces = 0;

        while(i < 2*n) {
            int j = 0;
            int k = 0;
            noOfSpaces =  n - col;

            while(k < noOfSpaces) {
                System.out.print(" ");
                k++;
            }

            while(j < col) {
                System.out.print("X ");
                j++;
            }
            System.out.println();
            if(i < n-1) {
                col++;
            } else {
                col--;
            }
            i++;
        }
    }

    static void pattern31(int n) {
        int row = 2*n;
        for(int i = 0; i < row; i++ ) {
            for (int j = 0; j < row; j++) {
                if(i < n) {
                    if(j>=i && j <= row - i) {
                        System.out.print(i + " ");
                    } else if(i >= row - j) {
                        System.out.print(row - j + " ");
                    }
                } else {
                    if(j>i) {
                        System.out.print(j-1 + " ");
                    } else {
                        System.out.print(j-i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}