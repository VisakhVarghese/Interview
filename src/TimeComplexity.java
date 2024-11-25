public class TimeComplexity {
}

/**
 * Time complexity
 * measures the amount of time an algorithm takes to process input data of a given size (n).
 * Notation: Big O notation (O) is commonly used to express time complexity.
 * It provides an upper bound on the time requirements, allowing for a worst-case scenario analysis.
 */

/**
 * Common Time Complexities
 * O(1) - Constant Time: The algorithm takes a constant time regardless of the input size.
 * Example: accessing an array element by index.
 * O(log n) - Logarithmic Time: The algorithm's time increases logarithmically as the input size increases. Example: binary search.
 * O(n) - Linear Time: The time grows linearly with the input size. Example: iterating through an array.
 * O(n log n) - Linearithmic Time: Combination of linear and logarithmic growth.
 * Example: efficient sorting algorithms like mergesort and heapsort.
 * O(n^2) - Quadratic Time: Time grows quadratically with the input size. Example: bubble sort, insertion sort.
 * O(2^n) - Exponential Time: Time doubles with each additional element in the input.
 * Example: solving the traveling salesman problem with brute force.
 * O(n!) - Factorial Time: Time grows factorially with the input size.
 * Example: solving the traveling salesman problem with dynamic programming.
 */

/**
 * Analyzing Time Complexity
 * Worst-case Analysis: Considers the maximum time an algorithm will take for any input of size n.
 * Best-case Analysis: Considers the minimum time an algorithm will take.
 * Average-case Analysis: Considers the expected time an algorithm will take, averaged over all possible inputs.
 */

/**
 * Complexity Classes
 * P (Polynomial Time): Problems that can be solved in polynomial time (e.g., O(n), O(n^2)).
 * NP (Nondeterministic Polynomial Time): Problems for which a given solution can be verified in polynomial time.
 * NP-Complete: Problems that are both in NP and as hard as any problem in NP.
 * NP-Hard: Problems as hard as NP problems but not necessarily in NP.
 */

/**
 * To calculate the time complexity of a program, you need to analyze the operations and loops within the code.
 *
 * Identify the Basic Operations:
 *
 * Basic operations include assignments, arithmetic operations, comparisons, and array accesses.
 * These operations are usually considered 𝑂(1) (constant time).
 *
 * Analyze Loops:
 *
 * Determine how many times each loop runs.
 * For a loop that runs from 0 to 𝑛 (or another linear function of 𝑛 ), the time complexity is O(n).
 * Nested loops multiply their complexities. For example, a loop inside another loop that both run
 * n times has a time complexity of 𝑂(𝑛2)
 *
 * Consider Conditional Statements:
 *
 * Conditional statements (like if-else) typically add a constant time operation,
 * but you need to analyze the code inside the condition to determine its contribution to time complexity.
 *
 * Summarize the Time Complexity:
 *
 * Combine the complexities of different parts of the code.
 * If multiple independent parts of the code have different complexities, you take the highest complexity (since it dominates).

 */
