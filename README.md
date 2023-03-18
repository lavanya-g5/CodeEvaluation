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



