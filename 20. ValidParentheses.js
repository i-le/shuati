20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:


Example 1:

Input: "()"
Output: true
An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


js solution:

/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var stack = [];
    var len = s.length;
    var map = {
      '(': ')',
      '[': ']',
      '{': '}'
    };
    for (var i = 0; i < len; i++) {
      if (stack.length > 0 && map[stack[stack.length - 1]] === s[i]) {
        stack.pop();
      } else {
        stack.push(s[i]);
      }
    }
    return stack.length === 0;
  };
