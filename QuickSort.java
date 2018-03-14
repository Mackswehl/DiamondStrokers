//Diamond Strokers (Addison Huang, Simon Tsui, Maxwell Vale)
//APCS2 pd02
//Lab #1 -- What Does the Data Say?
//2018-03-14w

/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): QuickSort calls partition by breaking the array in half and then
 * for the right and left half of the array. The helper function calls itself
 * recursively until it reaches arrays of size 1 where vars left and right are
 * equal
 *
 * 2a. Worst pivot choice and associated runtime: The worst pivot choice would
 * be the largest number in the array. All other numbers will be smaller so the
 * maximum number of swaps will occur. O(n^3) since you're comparing and
 * swapping n elements twice.
 *
 * 2b. Best pivot choice and associated runtime: The best pivot would be the
 * samllest number in the array. All other numbers will be larger so no swaps
 * will occur. O(n) since its only comparing all elements to the pvtPos.
 *
 * 3. Approach to handling duplicate values in array: Duplicate values would be
 * identified when an array is of size 2. Left would be equal to right and it
 * would just return itself.
 *
 *****************************************************/

public class QuickSort
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------
    public static int partition( int arr[], int a, int b, int c)
    {
	int v = arr[c];

	swap( c, b, arr);
	int s = a;

	for( int i = a; i < b; i++ ) {
	    if ( arr[i] <= v) {
		swap( i, s, arr );
		s++;}
	}
	swap(s,b,arr);

	return s;
    }//end mysterion


    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d )
    {
	qsortHelper(d, 0, d.length-1);
    }

    //you may need a helper method...
    public static void qsortHelper( int[] d, int left, int right){
	if (left == right)
	    return;

	if (left < right) {
	    int pvtPos = partition(d, left, right, (left + right) / 2);
	    qsortHelper(d, left, pvtPos - 1);
	    qsortHelper(d, pvtPos + 1, right);
	}

    }

    //main method for testing
    public static void main( String[] args )
    {
	/*
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);
	qsort( arr1 );
	System.out.println("arr1 after qsort: " );
	printArr(arr1);
	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	arrN[i] = i;

	System.out.println("\narrN init'd to: " );
	printArr(arrN);
	shuffle(arrN);
	System.out.println("arrN post-shuffle: " );
	printArr(arrN);
	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



	//get-it-up-and-running, static test case w/ dupes:
	// int [] arr2 = {7,1,5,12,3,7};
	// System.out.println("\narr2 init'd to: " );
	// printArr(arr2);
	// qsort( arr2 );
	// System.out.println("arr2 after qsort: " );
	// printArr(arr2);
	// // arrays of randomly generated ints
	// System.out.println("\narrMatey init'd to: " );
	// printArr(arrMatey);
	// shuffle(arrMatey);
	// System.out.println("arrMatey post-shuffle: " );
	// printArr(arrMatey);

	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
