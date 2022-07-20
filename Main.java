class Main {
  public static void main(String[] args) {
    int[] myList = createRandomArray(10, 100);
    double average = getAverage(myList);
    int[] aboveAverage = getValuesAbove(myList, average);

    System.out.println("The list of values: ");
    printList(myList);

    System.out.println("The average of values: " + average);

    System.out.println("The list of values above average: ");
    printList(aboveAverage);
    LabTester.runTests(); 
    
  }

  public static int[] createRandomArray(int size, int maxValue) {
    int[] newList = new int[size];
    for(int i = 0; i < newList.length; i++){
      newList[i] = (int)(Math.random() * maxValue + 1);
    }
    return newList;
  }

  public static int numValuesAbove(int[] list, double value) {
    int numVals = 0;
    for(int items: list)
      {if (items > value)
        numVals++;}
    return numVals;
  }

  public static int[] getValuesAbove(int[] list, double value) {
    int[] newList = new int[numValuesAbove(list, value)];
    int j = 0;
    for(int i = 0; i < list.length; i++)
      {
        if (list[i] > value)
        {
          newList[j]= list[i];
          j++;
        }
      }
    return newList;
  }

  public static double getAverage(int[] list) {
    int sum = 0; 
    double average = 0.0;
    for(int item : list)
      {sum = sum + item;}
    average = (double)sum/list.length-1;
    return average;
  }

  public static void printList(int[] list) {
    System.out.print("[");
    for(int i=0; i<list.length - 1; i++)
      System.out.print(list[i] + ", ");
    if(list.length > 0)
      System.out.print(list[list.length - 1]);
    System.out.println("]");
  }
  
 
}