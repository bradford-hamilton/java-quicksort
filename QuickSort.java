public static int[] quicksort(int[] array) {
    if (array.length < 2 ) {
      return array;
    }
    int pivot = 0;
    ArrayList<int> left = new ArrayList<int>();
    ArrayList<int> right = new ArrayList<int>();
    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[pivot]) {
        left.add(array[i]);
      } else {
        right.add(array[i]);
      }
    }
    int[] leftSorted = quicksort(left);
    int[] rightSorted = quicksort(right);
    int[] sorted = ArrayUtils.fromArray(leftSorted, array[i], rightSorted);
    return sorted;
  }
