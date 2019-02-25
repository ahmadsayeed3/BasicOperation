# BasicOperation
This is project provide very basic operations like 
*) Array Sorting
*) Arrays Of Arrays Sorting
*) Get Max Value From Array
*) Get Max Value From Arrays Of Arrays
*) Get Min Value From Array
*) Get Min Value From Arrays of Arrays


How To Use?
    ArrayOperations basicSorting = new ArrayOperations();
		System.out.println("============ Sorting Arrays Of Arrays =========");
		int x[][] = basicSorting.sortArraysOfArrays(new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } });
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
		}
		System.out.println();
    
 All the methos are inside ArrayOperations class. gets his opbject and call useful methods.
 Method:
 getMinArraysOfArrays(int z[][])
 getMinValue(int z[])
 getMaxArraysOfArrays(int z[][])  
 getMaxValue(int z[]) 
 sortArraysOfArrays(int z[][])
 sortArray(int[] z)
