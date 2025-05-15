# Arrays

# Big O Notation


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
**Bubble Sorting:** I wasn't familiar with bubble sorting when I started, and it took some time to understand how the algorithm works. Once I got the hang of it, I realized its simplicity, but initially, it felt a bit complex.

**Tic-Tac-Toe Exercise:** This exercise involved a lot of steps, making it prone to errors. There were many moving parts, which required attention to detail and careful tracking to make sure the game logic worked correctly.

**Matrix Multiplication:** Incorporating equations into the matrix multiplication was a challenge at first. The math involved was tricky, but as I continued working through the code, the process became clearer, and I was able to grasp the logic more effectively.

# Accomplishments that I am proud of

I’m proud of mastering bubble sorting, even though I was initially unfamiliar with the algorithm. Through practice, I was able to understand its logic and successfully implement it. Another accomplishment was building a functional tic-tac-toe game, where I navigated the complexity of multiple steps and ensured all game mechanics worked seamlessly. Additionally, understanding matrix multiplication was challenging at first due to the equations involved, but by persevering through the process, I gained a deeper understanding and was able to implement the operations effectively in code. Overall, I am just glad that I have garnered a deeper and fuller understanding of Arrays.


# What I learned

Throughout this project, I learned how to multiply and add matrices, forging an understanding of matrix operations and their applications in coding. I also learned the bubble sort method, which helped me grasp sorting algorithms and their implementation in code. Additionally, I learned how to build a fully functioning tic-tac-toe game.
