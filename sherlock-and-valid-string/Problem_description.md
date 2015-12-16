Problem link-  https://www.hackerrank.com/challenges/sherlock-and-valid-string


##Problem Statement

You know my powers, my dear Watson, and yet at the end of three months I was forced to confess that I had at last met an antagonist who was my intellectual equal.

A "valid" string is a string __S__ such that for all distinct characters in __S__ each such character occurs the same number of times in __S__.

For example, __aabb__ is a valid string because the frequency of both characters a and b is 2, whereas __aabbc__ is not a valid string because the frequency of characters a, b, and c is not the same.

Watson gives a string __S__ to Sherlock and asks him to remove some characters from the string such that the new string is a "valid" string.

Sherlock wants to know from you if it's possible to be done with less than or equal to one removal.

__Input__ __Format__

The first and only line contains __S__, the string Watson gives to Sherlock.

__Output__ __Format__

Output __YES__ if string __S__ can be converted to a "valid" string by removing less than or equal to one character. 
Else, output NO.

__Constraints:__

__1=size__ __of__ __stringS=10^5__ 
String __S__ contains lowercase letters (a-z) only.

__Sample__ __Input__

aabbcd

__Sample__ __Output__

NO


Explanation

2 is the minimum number of removals required to make it a valid string. It can be done in following two ways:

Remove c and d to get aabb. 
Or remove a and b to get abcd.
