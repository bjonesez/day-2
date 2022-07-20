In this lab you will tie together your understanding of
Java's data primitive data types, conditionals, loops,
arrays, and methods, and the Math library to complete a
program that generates and manipulates lists of pseudo-
random numbers.

TASK 0: Inspect Starter Code

  First, fork this project so you can make changes.

  All of the methods in this program are found in the
  Main.java file. The main() method creates an array of
  integer values called myList, which is populated by
  the list returned by the createRandomArray() method.

  Main then creates a double variable called average
  and assigns it the result of calling getAverage().
  A second array of integers, aboveAverage, is defined,
  and it is populated by the list returned by calling the
  getValuesAbove() method.

  The program then prints out the myList list, the
  average value, and the aboveAverage list.

  Run the program and confirm that the code compiles
  and runs. As it is written, the starter code creates
  a list of exactly one random value and cannot correctly
  determine the average of this value.

TASK 1: Complete createRandomArray

  This method receives two integer parameters -- size and
  maxValue. The method should create a new array of integers
  of size size and populate it with randomly-selected integer
  values between 1 and maxValue.

  Calling createRandomArray(5, 5) should create an array of
  size 5 which contains values 1 - 5, like {3, 2, 5, 4, 2}.

  Line 17 of the starter code creates a new array of size 1.
  Update that line to create a new array of size size instead.

  Line 18 of the starter code correctly selects a random value
  in the desired range and stores it into the first slot of
  the array. Update the method to use a loop that visits each
  slot in the new array and uses the line of code to place a
  random value in each slot.

  Re-run your program to confirm that your code does not
  contain errors. Check to see if the list of values printed
  to the screen is of length 10 and that all values are between
  1 and 100, which is what the code in the main() method
  specifies.

TASK 2: Complete getAverage

  This method should return the arithmetic mean of the list
  of values. For instance, the average of the list {1, 2} is
  1.5. You get this value by adding up all the values and
  dividing by the number of values.

  Once you complete the code for this method, re-run the
  program to confirm that it compiles. Check your work by
  using a calculator to add up the random values chosen by
  the program and dividing by 10.

TASK 3: Complete numValuesAbove

  This method should return the number of values in the given
  integer array that are above the given double value.

  Given the list {8, 6, 7, 5, 3, 0, 9} and the value 3.14,
  numValuesAbove() should return 5.

  A simple strategy is to use a counting variable that is
  initialized to 0. Loop over each spot in the array and
  check to see if it is greater than the value specified,
  increasing the counter by one if it is.

  There is no way to know whether your method works correctly
  by running the given starter code, but you can add lines
  of code to the main() method to check your if desired.

TASK 4: Complete getValuesAbove

  This method should return a new integer array that contains
  only the values from the provided list that are greater than
  the specified double value. You should make use of the
  method you wrote in Task 3 to simplify your solution.

  This method should not modify the values in the input
  array. It is preferred, though not required, that the values
  in the output array be in the same order as those in the input
  array.

  Run your program several times and inspect the results 
  displayed on the screen. Does the second list contain only
  values that are greater than the average value?

TASK 5: Use The Tester

  We have provided a library to test your work for this lab.

  To use the tester, add the following line of code to the
  bottom of the main() method:

    LabTester.runTests();

  Re-run your program and confirm that your solution passes
  all of the tests checked by the testing library. If you have
  included any println() statements in your methods to aid in
  debugging your solution, you may find that the output is very
  hard to read, as the testing library makes many calls to your
  solution to test it for correctness.
