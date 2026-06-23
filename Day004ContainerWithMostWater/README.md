# 11. Container With Most Water

## Problem Description
You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the i-th line are `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container that can hold the most water.

Return the **maximum amount of water** a container can store.

**Note:** You may not slant the container.

---

## Examples

### Example 1
Input: height = [1,8,6,2,5,4,8,3,7]  
Output: 49  
Explanation: The vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

### Example 2
Input: height = [1,1]  
Output: 1

---

## Constraints
- n == height.length  
- 2 <= n <= 10⁵  
- 0 <= height[i] <= 10⁴  

---

## Approach
We can solve this efficiently using the **two-pointer technique**.

### Intuition
- The area formed between two lines depends on the **shorter** of the two heights and the **distance** between them.
- The formula for area:  
  `area = min(height[left], height[right]) * (right - left)`
- To maximize the area:
  - Start with two pointers, one at the beginning and one at the end.
  - Move the pointer pointing to the shorter line inward, since moving the taller one won’t help increase the area.

This ensures we find the maximum area in **O(n)** time.
