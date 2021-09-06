package com.company;

public class Main {

    public static void main(String[] args) {
	    homework_1();
	    homework_3();
	    homework_4();
	    homework_5();
	    homework_6();
    }
    public static void homework_1(){
        int sum = 0;
        final int array[] = {2, 5,-3, 11, 193};
        for (int i : array) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
    public static void homework_3(){
        int[] array = {-3, 2, 5, 4, 7};
        int count = 0;
        int s = 0;
        for (int i = 0; i <= 4; i++) {
            if(array[i] != 0){
                s += array[i];
                count ++;
            }
        }
        System.out.print("The fukking pseudocode exercise. Output: ");
        if (count == 0)
            System.out.println(0);
        else
            System.out.println(s/count);
    }
    public static void homework_4(){
        int array[] = {5, 4, -7, -2, -1};
        System.out.print("original: ");
        for(int i : array)
            System.out.print(i + " ");
        System.out.println("");
        System.out.print("reversed: ");
        for(int k = array.length-1; k >= 0; k--)
            System.out.print(array[k] + " ");

    }
    public static int[] cum(int[] array){
        int [] cumulative = new int [array.length];
        int sum = 0;
        for( int i = 0; i <= array.length-1; i++){
            sum += array[i];
            cumulative[i] = sum;
        }
        return cumulative;

    }
    public static void homework_5(){
        final int[] array = {-3, 2, 6, -11};
        System.out.println("");
        System.out.print("original array: ");
        for (int i:array)
            System.out.print(i + " ");
        System.out.println("");
        System.out.print("cumulative sum: ");
        for (int k:cum(array))
            System.out.print(k + " ");
    }
    public static int[] larger(int[] array, int m){
        int[] larger = new int[array.length];
        int larger_counter = 0;
        for(int i: array) {
            if (i > m) {
                larger[larger_counter] = i;
                larger_counter++;
            }
        }
        int[] return_list = new int[larger_counter];
        for(int i = 0; i <= return_list.length-1; i++)
            return_list[i] = larger[i];
        return return_list;
    }
    public static int[] smaller(int[] array, int m){
        int[] smaller = new int[array.length];
        int smaller_counter = 0;
        for(int i: array) {
            if (i < m) {
                smaller[smaller_counter] = i;
                smaller_counter++;
            }
        }
        int[] return_list = new int[smaller_counter];
        for(int i = 0; i <= return_list.length-1; i++)
            return_list[i] = smaller[i];
        return return_list;
    }
    public static void homework_6(){
        final int[] array = {4, -3, -5, 9, 1, 11};
        final int m = 1;
        System.out.println("");
        System.out.print("array: ");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.print("m: " + m);
        System.out.println("");
        System.out.print("smaller: ");
        for(int i: smaller(array, m)){
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.print("larger: ");
        for(int i: larger(array, m)){
            System.out.print(i + " ");
        }
    }
}