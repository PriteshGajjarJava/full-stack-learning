1) Derive sum of all numbrs in array
var arr = [3,4,5,6,14,6,16,9];
var sum  = 0;
// We have to derive one result wihtout chaning array
arr.map((e) => sum = sum + e);
console.log(sum);

2) Create two array a) odd b) even
var arr = [1,2,3,4,5,6,7,8,9,10];
var even = arr.filter((e) => e % 2 == 0);
var odd = arr.filter((e) => e % 2 != 0);

3) Given an array, convert all array elements into value which is equal to square of that Number
e.g. [1,2,3,4] => [1,4,9,16]
arr.map((e) => e *  e);

Traverse array using forEach loop
var a = [1,3,4,6,7,8];
a.forEach((e) => console.log(e));

To reverse array
var a = [1,3,4,6,7,8];
a.reverse()

Stack using array:
push - arr.push()
pop  - arr.pop()
to refer last element : arr.unshift() // It won't delete

Queue using array
push() to add
shift() to remove from beginning 

How to search element in array?
var arr = [1,2,4,5];
arr.indexOf(2);// ans will be 1 (1st index)
arr.indexOf(10);// -1 NOT found

a.unshift(10)// insert element 10 at the beginning

a.sort((a,b)=>b-a); // Sort in descending order
a.sort((a,b)=>a-b); // Sort in ascending order OR a.sort()

// Sort
var a = 10;
var b = 20;
[a,b] = [b,a];

var a = [1,2,3,4,5,6,7,8,9,10];
a.splice(2,5)// new array 3,4,5,6,7
original array => [1,2,8,9,10]