var n = Math.random();
n = n * 6;
n = Math.floor(n) + 1;
console.log(n);

//love call example
var s1; 
var s2;
var p;

while(true)
{
    var n1 = prompt("Wahat's your name?");
    if(n1 === "close")
    {
        break;
    }
    var n2 = prompt("Wahat's your lover name?");
    if(n1 === s1 && n2 === s2)
    {
        alert(p);
    }
    else
    {
        p = Math.floor((Math.random() * 100) + 1);
        alert(p + "%");
    }
    s1 = n1;
    s2 = n2;
}
