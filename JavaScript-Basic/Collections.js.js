/*var guestList;
var guestName;

guestList = ["ali", "veli", "deli", "selim"];
guestName = prompt("What is your name?");
if(guestList.includes(guestName))
{
    alert("Welcome!");
}
else
{
    alert("Sorry");
}*/



//fizzbuzz
/*
function fizzBuzz() {
var output = [];
var count;

count = 0;
while(count <= 100)
{
     count++;
    if(count % 3 === 0 && count % 5 === 0)
    {
        output.push("fizzbuzz");
    }
    else if(count % 3 === 0)
    {
        output.push("fizz");
    }
    else if(count % 5 === 0)
    {
        output.push("buzz");
    }
    else
    {
        output.push(count);
    }
    console.log(output);
}
}
*/

//Who's Buying Lunch?
/*
function whosPaying(names) {
    
    var c;
    
    c = Math.floor(Math.random() * names.length);
    return names[c] + " is going to buy lunch today!"
}
*/

/*
//99 Bottles
function BottlesW()
{
    var count;

    count = 99;
    while(count > 0)
    {
        console.log(count +" bottles of beer on the wall");
        console.log(count +" bottles of beer,");
        console.log("Take one down, pass it around,");
        count--;
        console.log(count + " bottles of beer on the wall.");
    }
    console.log(count +" bottle of beer on the wall");
    console.log(count +" bottle of beer,");
    console.log("Take one down, pass it around,");
    console.log(count + " bottle of beer on the wall.");
}
function BottlesF()
{
    for (let count = 100; count > 0; count--) 
    {
        console.log(count +" bottles of beer on the wall");
        console.log(count +" bottles of beer,");
        console.log("Take one down, pass it around,");
        console.log(count + " bottles of beer on the wall.");
    }
    console.log(0 +" bottle of beer on the wall");
    console.log(0 +" bottle of beer,");
    console.log("Take one down, pass it around,");
    console.log(0 + " bottle of beer on the wall.");
}
*/

/*
//The Fibonacci
function fibonacciGenerator (n) {

    var arr = [];
    
   for (var i = 0; i < n; i++) {
       if(i < 2)
       {
           arr[i] = i;
       }
       else
       {
           arr[i] = arr[i - 2] + arr[i - 1];
       }
   }
   return arr;
}
*/

//
