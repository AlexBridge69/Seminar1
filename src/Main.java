//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.

public class Main {
    public static int ArrayLength(int[] arr, int length){
        if (arr.length<length){
            return -1;
        }
        else return arr.length;
    }
    public static void main(String[] args) {
        int array[]={1, 2, 4, 6};
        int LengthArray = 4;
        System.out.println(ArrayLength(array,LengthArray));
    }
}