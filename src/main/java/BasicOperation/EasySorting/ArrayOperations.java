package BasicOperation.EasySorting;

public class ArrayOperations {

	public int[] sortArray(int[] z) {
		int temp = 0;
		for (int i = 0; i < z.length; i++) {
			for (int j = i + 1; j < z.length; j++) {

				if (z[i] < z[j]) { // find small number
					// swap number
					temp = z[i];
					z[i] = z[j];
					z[j] = temp;
				}
			}
		}
		return z;
	}

	public int[][] sortArraysOfArrays(int z[][]) {
		int temp = 0;
		for (int i = 0; i < z.length; i++) {

			// Get All Numbers One By One
			for (int j = 0; j < z[i].length; j++) {

				// One By One Compare with all numbers and Swap if found
				for (int k = 0; k < z.length; k++) {
					for (int m = 0; m < z[k].length; m++) {
						if (z[i][j] < z[k][m]) {
							temp = z[i][j];
							z[i][j] = z[k][m];
							z[k][m] = temp;
						}
					}
				}
			}
		}
		return z;
	}

	public int getMaxValue(int z[]) {
		int max = z[0];
		for (int i = 0; i < z.length; i++) {
			if (z[i] > max) { // Every time it finds greater value it overrides the last one
				max = z[i];
			}
		}
		return max;
	}

	public int getMaxArraysOfArrays(int z[][]) {
		int max = z[0][0];

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				if (z[i][j] > max) {
					max = z[i][j];
				}
			}
		}
		return max;
	}

	public int getMinValue(int z[]) {
		int min = z[0];
		for (int i = 0; i < z.length; i++) {
			if (z[i] < min) {
				min = z[i];
			}
		}
		return min;
	}

	public int getMinArraysOfArrays(int z[][]) {
		int min = z[0][0];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				if (z[i][j] < min) {
					min = z[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		ArrayOperations basicSorting = new ArrayOperations();

		System.out.println("============ Sorting Arrays Of Arrays =========");
		int x[][] = basicSorting.sortArraysOfArrays(new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } });
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
		}
		System.out.println();
	}
}
