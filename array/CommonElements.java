package leet.code.array;

import java.util.ArrayList;

public class CommonElements {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                lst.add(A[i]);
            } else {
                while (A[i] > B[j] && A[i] > C[k]) {
                    if (A[i] > B[j]) {
                        j++;
                    } else {
                        k++;
                    }
                }
                while (B[j] > A[i] && B[j] > C[k]) {
                    if (B[j] > A[i]) {
                        i++;
                    } else {
                        k++;
                    }
                }
                while (C[k] > A[i] && C[k] > B[j]) {
                    if (C[k] > A[i]) {
                        i++;
                    } else {
                        j++;
                    }
                }
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElements(A, B, C, A.length, B.length, C.length));
    }
}
