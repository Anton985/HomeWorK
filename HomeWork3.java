import java.util.Arrays;

class HomeWork3 {
	
	public static void main(String[] args) {
	    int[] arr1 = {1, 0, 0, 0, 1, 1, 1, 0};	
	    System.out.println("Exercise1: ");
	    doExercise1(arr1);
		int[] arr2 = new int[100];
		System.out.println("\nExercise2: ");
		doExercise2(arr2);
		int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,1};
		System.out.println("\nExercise3: ");
		doExercise3(arr3);
		System.out.println("\nExercise4: ");
		doExercise4();
		System.out.println("\nExercise5: ");
		doExercise5(5, 1);
		
		
	}
	static void doExercise1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
			System.out.print(arr[i]);
		}
	}
	static void doExercise2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(" " + arr[i]);
		}
	}
	static void doExercise3(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] = arr[i] * 2;
			}
			System.out.print(" " + arr[i]);
	    }
    }
	static void doExercise4() {
		int[][] arr = {
			{1, 2, 3},
			{4, 5, 6},
		    {7, 8, 9}};
		for (int i = 0; i < 3; i++){
			for (int j =0; j < 3; j++) {
			if (i == j) {
				arr[i][j] = 1;
			}
			System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
    static void doExercise5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
		}
	}		
}

		