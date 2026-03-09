# PalindromeCheckerApp

## Use Case 1 – Welcome Page
- Displays a welcome message to the user
- Entry point of the application

## Use Case 2 – Hard Code Palindrome
- Hard coded string is checked for palindrome
- Uses string reversal logic

## Use Case 3 – User Input Palindrome Validation
- Allows the user to enter a string
- Checks whether it is a palindrome

## Use Case 4 – Character Array Based Palindrome Check
- Converts string to char[]
- Uses two-pointer technique (start & end)
- Compares characters efficiently
- Data Structure: char[]

## Use Case 5 – Stack Based Palindrome Checker
- Pushes all characters into a Stack (LIFO)
- Pops characters in reverse order
- Compares with original string
- Data Structure: Stack

## Use Case 6 – Queue + Stack Based Palindrome Check
- Inserts characters into both a Queue (FIFO) and Stack (LIFO)
- Compares dequeue output with pop output
- If all match, string is a palindrome
- Data Structures: Queue, Stack

## Use Case 7 – Deque Based Optimized Palindrome Checker
- Inserts characters into a Deque (Double Ended Queue)
- Removes from both front and rear using removeFirst() and removeLast()
- Compares until deque is empty
- Data Structure: Deque

## Use Case 8 – Linked List Based Palindrome Checker
- Adds characters into a LinkedList
- Removes from both ends using removeFirst() and removeLast()
- Compares until one or zero elements remain
- Data Structure: Singly LinkedList

## Use Case 9 – Recursive Palindrome Checker
- Uses recursion to compare characters from outer positions moving inward
- Base condition stops recursion when start crosses end
- If any mismatch found, returns false immediately
- Data Structure: Call Stack