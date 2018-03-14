/* Diamond Strokers (Addison Huang, Simon Tsui, Maxwell Vale)
 * APCS2 pd02
 * Lab #01 - What Does the Data Say?
 * 2018-03-14w
 */

public class QuickSortTester{
  public static void main(String[] args){
  for(int j = 100000; j <= 20000000; j+=100000){
      int[] arrMatey = new int[j];
      for( int i = 0; i < arrMatey.length; i++ ){
        arrMatey[i] = (int)( j* 2 * Math.random() );
      }
      long start = System.currentTimeMillis();
      QuickSort.qsort( arrMatey );
      long end = System.currentTimeMillis();
      System.out.println(end-start + ", " + j);

  }
  }
}
