# CodeEvaluation
# Basic Code Evaluation programs

1. SumOf2Numbers - Pass 2 ints as parameter and return the sum of numbers.

2. OddOrEvenNumbers - Check the given number is odd or even, the definitionof an "even" number is that the number is divisible by "2" without a remainder. Mathematicians would write an even number E=(2xN).Then E is always divisible by "2".The definition applies to all integers, +ve and -ve including 0.

3. Pass an int as parameter, test whether the number is divisible by 7 or not.

4. Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use % operator.

5. Given 2 Strings, append them together and return the result.

6. Pass a String as parameter, find out how many vowels present in it?

7. Accept String as parameter, find out how many consonants present in it?

8. Given an array of 'N' elements, return the sum of all array elements.

9. Pass an int array & an int & do a search of the 2nd parameter in the 1st and return true or false?

10. Given a String, return a new String where the 1st & last chars have been changed. input - code, ouput - eodc

11. write a program to generate fibonacci series of limit numbers of elements.

12. Given an array of ints, return true if one of the 1st 4 elements in the array is a 9. The array length will be greater than 4.
arrayFront9{1,2,9,3,4} --> true, arrayFront9{1,2,3,4,9} --> false

13. Given a String of even length return the first half, so the String "WooHoo" --> Woo

14. Pass an int as parameter. FInd the sum of the digits in the number and return it. input - 123, output - 6.

15. Return true if the array contains somewhere 3 increasing adjacent numbers like 4,5,6 or 23,24,25, input - {1,4,5,6,9}, output - true 
input - {1,2,5}, output - false

16. Return true if the given String contains 1 or 3 'e' chars, otherwise return false. input - StringE("Hello"), output - true.

17. Given an "out" String length 4. Such as "<<>>" and a word, return a new String where the word is in the middle of the out String.
ex: "<<word>>" not:- use str.string(i,j) to extract the string starting at index i and going upto but not including index j.
input - ("<<>>","word"), output - "<<word>>"

18. Given a String and an int n, return a String made of first and last 'n' chars from the String. The String length will be at least n.
input - nTwice("Hello",2), output - Helo

19. Given an array of ints, return true if the sum of the 2's in the array is exactly 8.
input - {2,3,2,2,4,2}, output - true.
input - {2,3,2,2,4,2,2}, output - false.

20. Given an array of ints, return true if the values 3 appears in the array exactly 3 times and number 3's are next to each other.
haveThree(3,1,3,1), output - true
haveThree(3,1,3,3), output - false.

21. Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other. input - modThree{2,1,2,5}, output - false
input - modThree{2,4,2,5}, output - true.

22. The Web is built with HTML String like "<i>Yay</i>" which draws Yay a italic text.in this example the "i" tag makes <i> and </i> which surround the word "Yay".Given tag and word Strings. Create the HTMLString with tags around the word, input - makeTags("i","Yay"), output - <i> Yay </i>
input - makeTags("i","Hello"), output - <i> Hello </i>

23. Given an array of ints, return true if every element is a 1 or 4. input - only4(1,4,1,4), output - true, input - only4(1,4,2,4), output - false,
input - only4(1,1,1,1), output - true.

24. Given a String, return a new STring made of every other char starting with first, so Hello yields "Hlo", input - stringBits("Hello"), output - "Hlo",input - stringBits("Hi"), output - "H".

25. Given an array of ints, return true if the number of 1's is greater than the number of 4's.
input - more14(1,4,1), output - true, input - more14(1,4,1,4), output - false, input - more14(1,1), output - true.

26. Given an array og ints, swap the 1st and last elements in the array, Return the modified array. The array length will be at least 1.
input - swapEnds(1,2,3,4), output - 4,2,3,1
input - swapEnds(1,2,3), output - 3,2,1

27. Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually 
a 7.
input - array667(6,6,2) - 1
input - array667(6,6,2,6) - 1
input - array667(6,7,2,6) - 1

28. Given 3 ints a,b,c return true if it is possible to add 2 of the ints to get the 3rd.
input - twoAsOne(1,2,3), output - true
input - twoAsOne(3,1,2), output - true

29. Count the number of "XX" in the given String.we will say that overlapping is allowed so "XXX" contains 2 "XX".
input - countXX("abcxx"), output - 1
input - countXX("xxx"), output - 2

30. Given a non(-ve) number n where (n>0), create and return a new string array of length n, containing the strings "0","1","2" thtough n-1.
Note: stringValueOf(XXX) will make the string form of most types. The syntax to make a new string array is : new String[desired_length0].
input - fizzArray(4) , output {"0","1","2","3"}.

31. Given a String return true if it ends in "ly".
input - endsLy("oddly"), output - true
input - endsLy("y"), output - false
input - endsLy("oddy"), output - false
input - endsLy("lilly"), output - true

32. Given an array of ints, return true if the array contains 2 next to a 2 or 4 next to a 4, but not both.
input - either2Or4(1,2,2), output - true
input - either2Or4(4,4,1), output - true
input - either2Or4(4,4,1,2,2), output - false

33. Given a String, return a String made of the chars at indexes 0,1,4,5,8,9......so on. "Kittens" yields "kien"
input - altPairs("Kitten"), output - kien
input - altPairs("chocolate"), output - chole
input - altPairs("codingHorror"), output - congrr

34. Given a String of any length, return a new string where the last 2 chars, if present are swapped so coding yields "codign".
input - last2Swap("coding"), output - codign
input - last2Swap("cat"), output - cta
input - last2Swap("ab"), output - ba

35. Given a string, if the 1st or last chars are 'x', return the string without those 'x'chars and otherwise return the string unchanged.
input - withoutX("xHix"), output - Hi
input - withoutX("xHi"), output - Hi
input - withoutX("Hxix"), output - Hxi

36. Return the sum od numbers in the array except ignore sections of numbers with a 6 & extending to the next 7 (every 6 will be followed by atleast one 7) return 0 for no numbers.
input - sum67(1,2,2), output - 5
input - sum67(1,2,2,6,99,99,7), output - 5
input - sum67(1,1,6,7,2), output - 5

37. Given 2 strings return their concatenation except omit the first char of each, The strings will be atleast length 2.
input - nonStart("Hello","There"), output - ellohere
input - nonStart("java","code"), output - avaode
input - nonStart("shotl","java"), output - hotlava

38. Given 2 int values, return true if they are both in the range 30..40.inclusive or they are both in the range of 40..50 inclusive
input - inRange3050(30,31), output - true
input - inRange3050(30,41), output - false
input - inRange3050(40,50), output - true

39. Given an array of 'n' ints, return the sum of the first 2 elements in the array, if the array length is les than 2, just sum up the elements that exist.
input - sum2(1,2,3), output - 3
input - sum2(1,1), output - 2
input - sum2(1,1,1,1), output - 2

40. Given a String of even length, return a string made of middle 2 chars, so the string "String" yields "ri".the String length will be atleast 4.
input - middleTwoLetter("String"), output - ri
input - middleTwoLetter("code"), output - od
input - middleTwoLetter("practice"), output - ct

41. Given a string return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
input - frontAgain("edited"), output - true
input - frontAgain("edit"), output - false
input - frontAgain("ed"), output - false

42. Given 2 int arrays , a & b each length 3, return a new array length 2 containing their middle elements.
input - middleWay(1,2,3)(4,5,6), output - (2,5)
input - middleWay(7,7,7)(3,8,0), output - (7,8)
input - middleWay(5,2,9)(1,4,5), output - (2,4)

43. Given an array of +ve ints, return a new array of length "count" containing the 1st even numbers from the original array. The original array will containing
atleast "count" even numebers.
input - copyEvens(3,2,4,5,8),2 output - (2,4)
input - copyEvens(3,2,4,5,8),3 output - (2,4,8)
input - copyEvens(1,2,4,5,8,6),3 output - (6,2,4)

44. Given 2 int values, return whichever value is nearest to the value 10 or return 0 in te event of a tie.
Note that Math.abs(n) returns the absolute value of a number.
input - close10(8,13), output - 8
input - close10(13,8), output - 8
input - close10(7,13), output - 0 or tie

45. Given a String, return a new string where the last 3 chars are now in uppercase. If the string has less than 3 chars uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.
input - endUp("Hello"), output - Hello
input - endUp("hiThere"), output - hithERE
input - endUp("hi"), output - HI

46. Given a string, return a version without both first and last char of the string. The strings will be at least length 3.
input - withoutEnd2("Hello"), output - ell
input - withoutEnd2("abc"), output - b
input - withoutEnd2("abcd"), output - bc

47. Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length
2,use the first 2 chars,The string length will be atleast 2.
input - twoChar("java",0), output - ja
input - twoChar("java",2), output - va
input - twoChar("java",3), output - java

48. Return a version of the given array where each 0 value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value
to the right of the zero, leave the zero as a zero.
input - zeroMax(0,5,0,3), output - (5,5,3,3)
input - zeroMax(0,4,0,3), output - (3,4,3,3)
input - zeroMax(0,1,0), output - (1,1,0)

49. Given 2 strings a & b, return the result of putting them together  in the order 'abba', "Hi" and "bye" returns "HiByeByeHi".
input - makeAbba("Hi","Bye"), output - "HiByeByeHi"
input - makeAbba("Yo","Alice"), output - YoAliceAliceYo
input - makeAbba("what","up"), output - whatUpupwhat

50. Given a string and a second "word" string , we will say that the word matches the string if it appears at the front of the string, except its first char 
doesnot need to match exactly, On a match, return the front of the string or otherwise return the original string so with the string "hippo" the word "hi"
returns "hi" and "xip" return "hip". The word will be atleast length 1.
input - startWord("Hippo","hi"), output - hi
input - startWord("Hippo","xip"), output - hip
input - startWord("Hippo","i"), output - h

51. We will say that an element in an array is "notalone" if there are values before and after it and those values are different from it. Return a version of the given array
where every instance of the given value which is not alone is replaced by which ever value of its left or right is larger.
input - notAlone((1,2,3),2), output - (1,3,3)
input - notAlone((1,2,3,2,5,2),2), output - (1,3,3,5,5,2)
input - notAlone((3,4),3), output - (3,4)

52. Given the "centered" average of an array of ints, which we will say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the samllest value, ignore just one copy and like wise for the largest value. Use int division to produce the final average. You may assume that the array is length is 3 or more.
input - centeredAverage(1,2,3,4,100), output - 3
input - centeredAverage(1,1,5,5,10,8,7), output - 5
input - centeredAverage(10,4,2,4,2,0), output - 3

53. Given an array of ints return true if there is a 1 in the array with a 2 somwhere later in the array.
input - has12(1,3,2), output - true
input - has12(3,1,4,5,2), output - true
input - has12(3,1,2), output - true

54. Return an array that contains the exact same numbers as the given array, But rearranged so that all the even numbers come before all the odd numbers. You can make a new array and return it. Note: Retain the order of other elements.
input - evenOdd(1,0,1,0,0,1,1), output - (0,0,0,1,1,1,1)
input - evenOdd(2,2,2), output - (2,2,2)
input - evenOdd(3,3,2), output - (2,3,3)

55. Given a String return a string length 1 from its front unless front is false, in which case return a string length 1 fro, its back. The string will be on-empty.
input - theEnd("hello","true"), output - H
input - theEnd("hello","false"), output - O
input - theEnd("Oh","true"), output - O

56. Given a string if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise return the string unchanged.
input - deleted("adelbc), output - abc
input - deleted("adelhello), output - ahello
input - deleted("adedbc), output - adedbc

57. Given a String of odd length return the string length 3 from its middle, so "candy" yields "and", The String length will be at least 3.
input - middleThree("candy"), output - "and"
input - middleThree("and"), output - "and"
input - middleThree("solving"), output - "lvi"

58. We will say that a 1 immdeiately followed by a 3 in an array is an "unlucky". Return true if the given array contains an unlucky 1 any where in the array.
input - unlucky(1,3,4,5), output - true
input - unlucky(2,1,3,4,5), output - true
input - unlucky(1,1,1), output - false

59. Given an int array length 3, If there is a 2 in the array immdeiatelyfollowed by a 3, Set the 3 element to 0. Return the changes array, otherwise returned
the same array.
input - fix23(1,2,3), output - (1,2,0)
input - fix23(2,3,5), output - (2,0,5)
input - fix23(1,2,1), output - (1,2,1)

60. Return an array that contains the exact same numbers as the given array, but rearaanged so that all the 0's are grouped at the start of the array. So (1,0,0,1) becomes (0,0,1,1) you can return a new array, Please preserve the order of other elements as it is.
input - zeroFront(1,0,0,1), output - (0,0,1,1)
input - zeroFront(0,1,2,0,1), output - (0,0,1,2,1)
input - zeroFront(1,0), output - (0,1)

