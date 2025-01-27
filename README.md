# Arrays

# Big O Notation

***Note: Big-O primarily focuses on the worst-case complexity or the biggest value. Therefore, the answer will always be the biggest value in the expression.***

**1. Basic_Array_Initialization:** 

The array initialization is *O(1)*, the for loop is *O(n)*, and the enchanced for loop is also *O(n)*; therefore, the complexity is *O(n)* + *O(n)* + *O(1)* = ***O(n)***.

**2. Array_Sum_Average:** 

The if-else statement is *O(1)*, the for loop is *O(n)*, and the sum/average calculation is *O(1)*; therefore, *O(n)* + *O(1)* + *O(1)* = ***O(n)***.

**3. LinearSearch_IndexRetrieval:** 

Initializing the array as well as creating the input statement is *O(1)*, the for loop is *O(n)*; therefore, *O(1)* + *O(n)* = ***O(n)***.

**4. Sorting_Array:** 

declared values are *O(1)*. The nested for-loop in the *bubbleSort* methos is *O(n²)* and the for loop in the printArray method is *O(n)* ;therefore, *O(1)* + *O(n)* + *O(n²)* = ***O(n²)***.

**5. Matrix_Sum:** 

The input statements are *O(1)* , the matrix declaration is *O(1)*, the nested for-loop to enter the elements of the array is *O(rows × cols)*, the nested for-loop to print the array is *O(rows x cols)*, and printing the sum is *O(1)*. Therefore, *O(1)* + *O(1)* + *O(1)* + *O(rows × cols)* + *O(rows × cols)* = ***O(rows × cols)***. This can be simplified to ***O(n)***.

**6. Matrix_Multiplication:** 

Printing Matrices A (*O(m x n)*) , B (*O(n x p)*), and C (*O(m x p)*) will give the output: ***O(m × n + n × p + m × p)*** or ***O(m × n × p)***. This can be simplified to ***O(n)***.

**7. TicTacToe:** 

The initializeBoard method is *O(BOARD_SIZE²)*, the printBoard method is *O(BOARD_SIZE²)*, and the checkWin is *O(BOARD_SIZE)*. In other words, *O(n²)* + *O(n²)* + *O(n)*; therefore, the program has a Big O notation of ***O(n²)***.

**8. Two_Sum:** 

The twoSum method has nested for-loop as its largest component, therefore it is *O(n²)*. The main method has input statements and if-else statement making this *O(1)*. As a result: *O(n²)* + *O(1)* = ***O(n²)***. 

**9. No_Twos_Or_Fives:** 

The no14 method contains a for loop and nested if statements making this an *O(n)* and an *O(1)*. The main method contains input statements and a for loop; so, the output of that is *O(1)* and *O(n)*. Therefore, *O(1)* + *O(1)* + *O(n)* + *O(n)* = ***O(n)*** 

**10. Remove_Duplicates:** 

The removeDuplicates method has a for loop with a nested if statement: *O(n)* and *O(1)*. The main method has declarations, print messages and a for loop: *O(1)*, *O(1)*, *O(n)*. Understanding the rules of Big O notation, the overall complexity is ***O(n)***.

# What it does

**1. Basic_Array_Initialization:** 

a Java program that stores five integer values in an array. Then prints out each value using both a traditional for loop and an enhanced for loop.

**2. Array_Sum_Average:** 

Creates a program that prompts the user to enter n integers and stores them in an array.
Then calculates and displays the sum of all elements and their average.

**3. LinearSearch_IndexRetrieval:** 

A program that searches for a specific value in an integer array.
If the value is found, it prints the index. If not found, it prints a message saying “Not
found.”

**4. Sorting_Array:**

Bubble Sort algorithm sorts an integer array in ascending order.
Prints the array before and after sorting.

**5. Matrix_Sum:** 

Creates a program that asks the user for the dimensions of a 2D array.
Prompts the user to input each value for the 2D array.
Calculates and prints the sum of all elements in the 2D array.

**6. Matrix_Multiplication:** 

Writes a program to multiply two matrices, A (of size m×n) and B (of size n×p), resulting in C (of size m×p). The user first inputs dimensions m, n, p. Then inputs the entries of A and B. The program computes the following equation: **Cᵢⱼ = ₖ ₌ ₀Σ ⁿ ⁻ ¹ Aᵢₖ x Bₖⱼ**

**7. TicTacToe:**

Implements a Tic-Tac-Toe board using a char[][] of size 3×3.
Allows two players (“X” and “O”) to alternate turns, entering a row and column to place their mark.
After each turn, it prints the board.
Checks if someone has won (three in a row, column, or diagonal).

**8. Two_Sum:** 

Creates a Java program that takes an integer array nums and a target value target,
prints the indices of the two numbers in nums that, when added, equal the target value.

**9. No_Twos_Or_Fives:** 

Creates a Java program that takes an array of integers as input and returns true if the array
contains no 2's or contains no 5's. If the array contains both 2's and 5's, it returns false.

**10. Remove_Duplicates:** 

Creates a Java program that takes an integer array nums sorted in non-decreasing order, removes the
duplicates in-place, and returns the number of unique elements in the array.
The relative order of the unique elements should remain unchanged, and the first k elements in the array should contain the unique values. The remaining elements are not important.

# Challenges I ran into

# Accomplishments that I am proud of


# What I learned
