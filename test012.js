// largest of the five numbers without using logical operators
a=parseInt(prompt("enter the a value"))
b=parseInt(prompt("enter the b value"))
c=parseInt(prompt("enter the c value"))

if(a>=0 || b>=0 ||c>=0)
 if(a>b && a>c)
  console.log("a is big among three")
 else if(b>c)
  console.log("b is big among three")
 else{
     console.log("c is big among three")
 }  
       
     
