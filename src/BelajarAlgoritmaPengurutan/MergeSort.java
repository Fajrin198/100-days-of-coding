package BelajarAlgoritmaPengurutan;

import java.util.Vector;

public class MergeSort {
    
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(45);
        vector.add(8);
        vector.add(20);
        vector.add(4);
        vector.add(5);
        vector.add(89);
        vector.add(11);
        vector.add(12);
        vector.add(45);
        vector.add(30);
        System.out.println("Data sebelum di sorting :");
        System.out.println(vector);
        System.out.println("Data setelah di sorting :");
        mergeSort(vector);
        System.out.println(vector);
    }
    
    static void merge(Vector<Integer> vector, Vector<Integer> vectorKiri, Vector<Integer> vectorKanan) {
        int i = 0, j = 0, k = 0;
        int sKiri = vectorKiri.size();
        int sKanan = vectorKanan.size();

        while (i < sKiri && j < sKanan) {
            if (vectorKiri.get(i) < vectorKanan.get(j)) {
                vector.set(k, vectorKiri.get(i));
                i++;
                k++;
            } else {
                vector.set(k, vectorKanan.get(j));
                j++;
                k++;
            }
        }

        while (i < sKiri) {
            vector.set(k, vectorKiri.get(i));
            i++;
            k++;
        }

        while (j < sKanan) {
            vector.set(k, vectorKanan.get(j));
            j++;
            k++;
        }
    }

    static void mergeSort(Vector<Integer> vector) {
        int n = vector.size();

        if (n < 2) {
            return;
        }

        int tengah = n / 2;

        Vector<Integer> vectorKiri = new Vector<>();
        Vector<Integer> vectorKanan = new Vector<>();

        for (int i = 0; i < tengah; i++) {
            vectorKiri.add(vector.get(i));
        }

        for (int i = tengah; i < n; i++) {
            vectorKanan.add(vector.get(i));
        }

        mergeSort(vectorKiri);
        mergeSort(vectorKanan);

        merge(vector, vectorKiri, vectorKanan);

    }
}
