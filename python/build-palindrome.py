"""
Task
Given a string, add the fewest number of characters possible from the front or back to make it a palindrome.

Example
For the input cdcab, the output should be bacdcab

Input/Output
Input is a string consisting of lowercase latin letters with length 3 <= str.length <= 10

The output is a palindrome string satisfying the task.

For s = ab either solution (aba or bab) will be accepted.
"""

def build_palindrome(word: str) -> str:
    index = 1
    attempt1, attempt2 = word, word
    while attempt1 != attempt1[::-1]:
        attempt1 = f'{word}{word[0:index][::-1]}'
        index += 1

    index = 1

    while attempt2 != attempt2[::-1]:
        attempt2 = f'{word[::-1][0:index]}{word}'
        index += 1

    return attempt1 if len(attempt1) < len(attempt2) else attempt2
