#Team Diamond Strokers -- Simon, Maxwell, Addison </h6> 
##APCS pd2 </br>
##L #01: What Does the Data Say? </h4> </br>

###Hypothesis
Best Case: The best case is when the pivot point is the median. The runtime of the best case is O(nlogn) because partition runs in O(n) time and quick sort is a divide and conquer algorithm. Both of these combined results in a runtime O(nlogn). 
Worst Case: The worst case is when the pivot point is the minimum or the maximum. Since quicksort is a divide and conquer algorithm which iterates through the values less than and greater than the pivot point at the same time, it will only be able to iterate through one side at at time. The worst case it will have to iterate through each value in the array seperately which results in a runtime of O(n^2).
Average Case: The average case is when the pivot point is not the median, maximum, or minimum. The average runtime will be O(nlogn). 

###Background

###Experiment Methodology

###Measurements and Analysis 

###Pivot Selection/Data Arangement
If the pivot is the minimum or maximum or close to the minimum/maximum, the runtime of QuickSort will be O(n^2) or near it. 
If the pivot is close to the median or is the median, the runtime of QuickSort will be O(nlogn)


