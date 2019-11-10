### Contest 162

####Problem 1

##### Cells with Odd Values in a Matrix

Given `n` and `m` which are the dimensions of a matrix initialized by zeros and given an array `indicies` where `indicies[i] = [ri,ci]`. For each pair of `[ri,ci]` you have to increment all cells in row `ri` and column `ci` by 1.

Return the number of cells with odd values in the matrix after applying the increment of all `indices`.

**Example 1:**

```
Input: n=2, m=3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
```

**Example 2:**

```
Input: n=2, m=2, indices = [[1,1],[0,0]]
Output: 0 
```

####Problem 2

##### Reconstruct a 2-Row Binary Matrix

Given the following details of amatrix with `n` columns and `2` rows: 
 
*  The matrix is a binary matrix, which means each element in the matrix can be `0` or `1`.
*  The sum of elements of the 0-th(upper) row is given as `upper`.
*  The sum of elements of the 1-st(lower) row is given as `lower`.
*  The sum of elements of the 1-the column(0-indexed) is `colsum[i]`, where `colsum` is given as an integer array with length `n`.

Your tast is to reconstruct the matrix with `upper`,`lower` and `colsum`.  
Return it as a 2-D onteger array.  
If there are more than one valid solution, any of them will be accepted.  
If no valid solution exists, return an empty 2-D array.

**Example 1:**

```
Input: upper=2, lower=3, colsum = [2,2,1,1]
Output: 0
```
      

####Problem 3
##### Number of Closed Islands

Given a 2D `grid` consists of `0s`(land) `1s`(water). An island is a maximal 4-directionally connected group of `0s` and a closed island is an island **totally** (all left, top, right, bottom) surrounded by `1s`.

Return the number of closed islands.

**Example 1:**

![](images/contest_1254.png)

```
Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
Output: 2
Explanation: 
Islands in gray are closed because they are completely surrounded by water (group of 1s).
```

**Example 2:**

![](images/contest_1254_2.png)

```
Input: grid = [[0,0,1,0,0],[0,1,0,1,0],[0,1,1,1,0]]
Output: 1
```


#### Problem 4:

##### Maximum Score Words Formed by Letters

Given a list of `words`, list of  single `letters` (might be repeating) and `score` of every character.

Return the maximum score of **any** valid set of words formed by using the given letters (`words[i]` cannot be used two or more times).

It is not necessary to use all characters in letters and each letter can only be used once. Score of letters `'a'`, `'b'`, `'c'`, ... ,`'z'` is given by `score[0]`, `score[1]`, ... , `score[25]` respectively.

**Example 1:**

```
Input: words = ["dog","cat","dad","good"], letters = ["a","a","c","d","d","d","g","o","o"], score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
Output: 23
Explanation:
Score  a=1, c=9, d=5, g=3, o=2
Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.
Words "dad" and "dog" only get a score of 21.
```

**Example 2:**

```
Input: words = ["xxxz","ax","bx","cx"], letters = ["z","a","b","c","x","x","x"], score = [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]
Output: 27
Explanation:
Score  a=4, b=4, c=4, x=5, z=10
Given letters, we can form the words "ax" (4+5), "bx" (4+5) and "cx" (4+5) with a score of 27.
Word "xxxz" only get a score of 25.
```

**Example 3:**

```
Input: words = ["leetcode"], letters = ["l","e","t","c","o","d"], score = [0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]
Output: 0
Explanation:
Letter "e" can only be used once.
```

**Constraints:**

* `1 <= words.length <= 14`
* `1 <= words[i].length <= 15`
* `1 <= letters.length <= 100`
* `letters[i].length == 1`
* `score.length == 26`
* `0 <= score[i] <= 10`
* `words[i], letters[i]` contains only lower case English letters.
