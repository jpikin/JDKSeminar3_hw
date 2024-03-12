package task2;

/*
Напишите обобщенный метод compareArrays(),
который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны
иметь одинаковую длину и содержать элементы одного
типа по парно по индексам.
 */
public class App {
    public static <T, K> boolean compareArrays(T[] arr1, K[] arr2){
        if (arr1.length != arr2.length)
            return false;
        for(int i = 0; i < arr1.length; i++){
            if(!arr1[i].getClass().isInstance(arr2[i]))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Integer [] array1 = {1,2,3,4,5};
        Integer [] array2 = {5,4,3,1,2};
        Integer [] array3 = {19,7,6};
        String [] array4 = {"1", "2", "3"};
        Boolean [] array5 = {true, true, false};
        Boolean [] array6 = {false, false, true};

        System.out.println(compareArrays(array1,array2));
        System.out.println(compareArrays(array1, array3));
        System.out.println(compareArrays(array3, array4));
        System.out.println(compareArrays(array5, array6));
    }
}
