<!-- Don't remove -->
<a name="top"/>

# Modified Binary Search

***Problems and solutions for Modified Binary Search session on October 23, 2020.***

### Table of Contents

* [Problems](#problems)
  * [1](Sqrtx)
  * [2](#p2)
  * [3](#p3)
* [Solutions](#solutions)
  * [1](#s1)
  * [2](#s2)
  * [3](#s3)

<!-- Don't remove -->
<a name="problems"/>

## Problems

<a name="p1"/>

### 1. Sqrtx

Source: [LeetCode](https://leetcode.com/problems/sqrtx/)

#### Scenario

Implement `int sqrt(int x)`.

Compute and return the square root of `x`, where `x` is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

#### Example Input 1

**Input:** `4`

**Output:** 2

#### Example Input 2

**Input:** `8`

**Output:** 2

**Explanation:** 
The square root of 8 is 2.8284.... Since we are returning an integer, the decimal part is trimmed, and only 2 is returned

The maximum number of consecutive 1s is 3.
#### Function Signature

**C++:** ` int mySqrt(int x)`

**Java:** `public int mySqrt(int x)`

<!-- Don't remove -->
Go to [Solution](#s1)   [Top](#top)

<!-- Don't remove -->
<a name="p2"/>

### 2. PROBLEM 2 TODO :bug:

Source: TODO :bug:

#### Scenario

Problem Statement TODO :bug:

#### Example Input

If the problem is simple enough, remove this section. TODO :bug:

#### Function Signature

TODO :bug:

<!-- Don't remove -->
Go to [Solution](#s2)   [Top](#top)

<!-- Don't remove -->
<a name="p3"/>

### 3. PROBLEM 3 TODO :bug:

Source: TODO :bug:

#### Scenario

Problem Statement TODO :bug:

#### Example Input

If the problem is simple enough, remove this section. TODO :bug:

#### Function Signature

TODO :bug:

<!-- Don't remove -->
Go to [Solution](#s3)   [Top](#top)

<!-- Don't remove -->
<a name="solutions"/>

## Solutions

<!-- Don't remove -->
<a name="s1"/>

### 1. Sqrtx

Source: [LeetCode]((https://leetcode.com/problems/sqrtx/)

#### Binary Search Solution

For `x > = 2`, the square root is smaller than `x/2` and greater than `0`. 

We can take advantage of this knowledge and iterate over the sorted set of integer numbers from `2` to `x`, dividing the problem in half in each iteration, until we find the square root.

The steps are:

1. If `x < 2`, then return `x`
2. Set a left boundary `left` which is equals to 2
3. Set a right boundary `right` which is equals to `x/2`
4. Create a return int `res`. It will keep track of the closest integer representation of a square root that has decimal numbers (like the case where `x = 8`)
5. While `left <= right`
	5.1. Set a mid point `mid` to be the number in the middle of `left` and `right`
	5.2. If `mid * mid == x` then return `mid`, we have found the exact square root
	5.3. If `mid * mid > x`, then we need to reduce the right boundary because our `mid` is too big, so we update `right` to `right = mid - 1`
	5.4. If `mid * mid < x`, then we need to increase the left boundary because our `mid` is too small, so we update `left` to `left = mid + 1`. We also update `res` to `res = mid`, keeping track of the closes integer representation of the square root of `x`
6. If we go out of the while loop, it means we couldn't find an exact square root for `x`, so we return `res`

Example code of this implementation:

```
int mySqrt(int x) {
        // if x is less than 2, then return x
        if (x < 2) {
            return x;
        }
    
        int left = 2;           //left boundary
        int right = x /2;       //right boundary
        int res = 1;            // result to return if not exact square root is found
        
        
        while (left <= right) {
            //The mid point between left and right boundary
            long mid = (left + right) /2;
            
            // if mid ^ 2 = x then we have found the exact square root
            if (mid * mid == x) {
                return mid;                
            } else if (mid * mid > x) {     //Else if mid ^ 2 is greater than x, we reduce the right boundary by one
                right = mid - 1;
            } else {                        //Else if mid ^ 2 is less than x, we need to increase the left boundary by one
                left = mid + 1; 
                res = mid;                  //Res is mid
            }            
        }
        //if we were not able to find an exact square root, we return the closes estimate (int representation) 
        return res;
    }
```

The time complexity of this solution is O(N log N). Since we are dividing our problem by half on each iteration.
The space complexity is O(1), because we are not using any extra space to store information. 

#### Testing The Solutions OR Driver For Solution

[Click here for the C++ driver](./QuestionOne/driver.cpp)

<!-- Don't remove -->
Go to [Top](#top)

<!-- Don't remove -->
<a name="s2"/>

### 2. SOLUTION 2 TODO :bug:

Source: TODO :bug:

#### Naive/Simple Solution

TODO :bug:

#### Optimal Solution

TODO :bug:

#### Testing The Solutions OR Driver For Solution

TODO :bug:

<!-- Don't remove -->
Go to [Top](#top)

<!-- Don't remove -->
<a name="s3"/>

### 3. SOLUTION 3 TODO :bug:

Source: TODO :bug:

#### Naive/Simple Solution 

TODO :bug:

#### Optimal Solution

TODO :bug:

#### Testing The Solutions OR Driver For Solution

TODO :bug:

<!-- Don't remove -->
Go to [Top](#top)
