//armstrong numbers calculation

n=parseInt(prompt("enter the value"))
s=0,r=0,t=0;
while(n>0){
    r=n%10
    s=s+(r*r*r)
    n=n/10
}
if(t==s){
    console.log("the given number is armstrong")
}
else{
    console.log("the given number is not armstrong")
}
