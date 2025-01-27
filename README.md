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

**9. No_Twos_Or_Fives:** The no14 method contains a for loop and nested if statements making this an *O(n)* and an *O(1)*. The main method contains input statements and a for loop; so, the output of that is *O(1)* and *O(n)*. Therefore, *O(1)* + *O(1)* + *O(n)* + *O(n)* = ***O(n)*** 

**10. Remove_Duplicates:** The removeDuplicates method has a for loop with a nested if statement: *O(n)* and *O(1)*. The main method has declarations, print messages and a for loop: *O(1)*, *O(1)*, *O(n)*. Understanding the rules of Big O notation, the overall complexity is ***O(n)***.

# What it does

# Challenges I ran into

# Accomplishments that I am proud of


# What I learned
