# Allocate Minimum Pages

## Problem Description
You are given an array `arr[]` of integers, where each element `arr[i]` represents the number of pages in the i-th book.  
You also have an integer `k` representing the **number of students**.  

The task is to **allocate books** to each student such that:

1. Each student receives **at least one book**.  
2. Each student is assigned a **contiguous sequence** of books.  
3. No book is assigned to more than one student.  

The **objective** is to minimize the maximum number of pages assigned to any student.  
In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.

If it is **not possible** to allocate books to all students, return **-1**.

---

## Examples

### Example 1
Input: arr = [12, 34, 67, 90], k = 2  
Output: 113  

**Explanation:**  
Allocation can be done in the following ways:  
- [12] and [34, 67, 90] → Maximum pages = 191  
- [12, 34] and [67, 90] → Maximum pages = 157  
- [12, 34, 67] and [90] → Maximum pages = **113** ✅  

Thus, the minimum possible maximum pages is **113**.

---

### Example 2
Input: arr = [15, 17, 20], k = 5  
Output: -1  

**Explanation:**  
There are more students than books, so it is **impossible** to allocate books.

---

## Constraints
- 1 ≤ arr.length ≤ 10⁶  
- 1 ≤ arr[i], k ≤ 10³  

---
