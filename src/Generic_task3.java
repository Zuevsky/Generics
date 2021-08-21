import java.util.*;


public class Generic_task3 {
    public static void main(String args[]) {
        System.out.println(Math.maxOfThree(15.4,58.8, 32.16));
        System.out.println(Math.minOfFive(15, 3, 55, 2, 84));
        Double[] array1 = {5.2, 121.0, 8.8, 24.6, 99.1};
        Integer[] array2 = {4, 8, 2, 99, 23, 11};
        System.out.println(Math.averageNumberInArray(array2));
        System.out.println(Math.maxInArray(array2));
        System.out.println(Math.minInArray(array2));
    }

    public static abstract class Math {
        // Статический обобщенный метод, который возвращает максимум из трёх переданных параметров
        public static <T extends Comparable<T>> T maxOfThree(T a, T b, T c) {
            List<T> params = new ArrayList<>(3);
            params.add(a);
            params.add(b);
            params.add(c);
            Collections.sort(params, Collections.reverseOrder());
            return params.get(0);
        }

        // Статический обобщенный метод, который возвращает минимум из пяти переданных параметров
        public static <T extends Comparable<T>> T minOfFive(T a, T b, T c, T d, T e) {
            List<T> params = new ArrayList<>(5);
            params.add(a);
            params.add(b);
            params.add(c);
            params.add(d);
            params.add(e);
            Collections.sort(params, Collections.reverseOrder());
            return params.get(params.size()-1);
        }

        // Статический обобщенный метод, который возвращает среднее арифметическое из переданного массива
        public static <T> double averageNumberInArray(T[] arr) {
            double sum = 0;
            if(arr[0].getClass().equals(Double.class)) {
                for(T item : arr) {
                    sum += (double) item;
                }
            } else if (arr[0].getClass().equals(Integer.class)) {
                for(T item : arr) {
                    sum += (int) item;
                }
            } else if (arr[0].getClass().equals(String.class)) {
                for(T item : arr) {
                    sum += Double.parseDouble(item.toString());
                }
            }
            return sum / arr.length;
        }

        // Статический обобщенный метод, который возвращает максимальное значение из переданного массива
        public static <T> T maxInArray(T[] arr) {
            Arrays.sort(arr);
            return arr[arr.length-1];
        }

        // Статический обобщенный метод, который возвращает минимальное значение из переданного массива
        public static <T> T minInArray(T[] arr) {
            Arrays.sort(arr);
            return arr[0];
        }
    }
}
