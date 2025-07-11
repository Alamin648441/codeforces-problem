
import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] array = new int[3];
            for (int j = 0; j < 3; j++) {
                array[j] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[1]);
        }

    }
}



/*A. Medium Number
time limit per test1 second
memory limit per test256 megabytes
Given three distinct integers a
, b
, and c
, find the medium number between all of them.

The medium number is the number that is neither the minimum nor the maximum of the given three numbers.

        For example, the median of 5,2,6
is 5
        , since the minimum is 2
and the maximum is 6
        .

Input
The first line contains a single integer t
        (1≤t≤6840
        ) — the number of test cases.

The description of each test case consists of three distinct integers a
        , b
        , c
 (1≤a,b,c≤20
        ).

Output
For each test case, output a single integer — the medium number of the three numbers.*/
