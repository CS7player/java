package core_level_programs.reusable_code;
public class CommonUtils {

 //Bubble Sorting
 public static int[] bubbleSort(int[] original) {
  int[] arr = original.clone();
  int arrLength = arr.length;
  for (int i = arrLength - 1; i > 0; i--) {
   for (int j = 0; j < i; j++) {
    if (arr[j] > arr[j + 1]) {
     int temp = arr[j];
     arr[j] = arr[j + 1];
     arr[j + 1] = temp;
    }
   }
  }
  return arr;
 }

 //mergeTwoArrays
 public static int[] mergeArrays(int[] orgArr1,int[] orgArr2){
  int[] arr1 = orgArr1.clone();
  int[] arr2 = orgArr2.clone();
  int[] mergedArray = new int[arr1.length + arr2.length];
  System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
  System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
  return mergedArray;
 }

 //Largest Element
 public static int largestElement(int[] orginal){
  if(orginal.length == 0){
   return -1;
  }
  int[] arr = orginal.clone();
  int largestElement = arr[0];
  for(int i=1;i<arr.length;i++){
   if(arr[i]>largestElement){
    largestElement = arr[i];
   }
  }
  return largestElement;
 }

 //Smallest Element
 public static int smallestElement(int[] orginal){
  if(orginal.length == 0){
   return -1;
  }
  int[] arr = orginal.clone();
  int smallestElement = arr[0];
  for(int i=1;i<arr.length;i++){
   if(arr[i]<smallestElement){
    smallestElement = arr[i];
   }
  }
  return smallestElement;
 }
 
}
