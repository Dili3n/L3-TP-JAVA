import java.util.*;

class Tri {

  public static void swap(int[] array, int index1, int index2){

    var int1 = array[index1];
    array[index1] = array[index2];
    array[index2] = int1;

  }

  public static int indexOfMin(int[] array, int first, int last){
    
    var min = 0;
    var i = 0;

    for(i = first; i < last; i++){

      if (array[min] > array[i]){
        min = i;  
      }
      i++;
    }
    return min;
  }

  public static void sort(int[] array) {

    for(var i = 0; i < array.length; i++){
      int res = indexOfMin(array, i, array.length - 1);
      swap(array, res, i);
    }
    System.out.println(Arrays.toString(array));
  }


}