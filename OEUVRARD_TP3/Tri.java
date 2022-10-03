class public Tri {

  public static void swap(int[] array, int index1, int index2){

    var int1 = array[index1];
    array[index1] = array[index2];
    array[index2] = int1;

  }

  public static boolean indexOfMin(int[] array, int first, int last){
    
    var min = 0;
    var i = 0;

    for(i = first; i < last; i++){

      if (array[min] > elem){
        min = i;  
      }
      i++;
    }
    return i;
  }

  public static void sort(int[] array, int first, int last){

    var i = 0;
    var j = 0;

    for(var elem : array){
      j = indexOfMin(array, i, last);
      swap(array, i, j);
      i ++;
    }
  }


}