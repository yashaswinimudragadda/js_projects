// calculateing the largest the number from the given 5 numbers

no1=parseInt(prompt("enter the first number "))
no2=parseInt(prompt("enter the second number "))
no3=parseInt(prompt("enter the third number "))
no4=parseInt(prompt("enter the forth number "))
no5=parseInt(prompt("enter the fifth number "))
max = no1;
if (no2 > max) max = no2;
if (no3 > max) max = no3;
if (no4 > max) max = no4;
if (no5 > max) max = no5;

console.log(max, "is the biggest number.");
