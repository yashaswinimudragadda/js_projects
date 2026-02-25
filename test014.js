//student marks memo with average calculation
std1_maths=parseInt(prompt("enter the std1 maths marks out of 30: "))
std1_hindi=parseInt(prompt("enter the std1 hindi marks out of 30: "))
std1_english=parseInt(prompt("enter the std1 english marks out of 30: "))

std2_maths=parseInt(prompt("enter the std2 maths marks out of 30: "))
std2_hindi=parseInt(prompt("enter the std2 hindi marks out of 30: "))
std2_english=parseInt(prompt("enter the std2 english marks out of 30: "))

std3_maths=parseInt(prompt("enter the std3 maths marks out of 30: "))
std3_hindi=parseInt(prompt("enter the std3 hindi marks out of 30: "))
std3_english=parseInt(prompt("enter the std3 english marks out of 30: "))

avg1=(std1_maths+std1_hindi+std1_english)*(1/3)
avg2=(std2_maths+std2_hindi+std2_english)*(1/3)
avg3=(std3_maths+std3_hindi+std3_english)*(1/3)

console.log("average of std1 score in hindi,maths and english are ",+avg1)
console.log("average of std2 score in hindi,maths and english are ",+avg2)
console.log("average of std3 score in hindi,maths and english are ",+avg3)


    if(avg1>=60)
     console.log(" std1 grade is a")
    else if(avg1<60 && avg1>=45)
     console.log("std1 grade is b")
    else 
     console.log("std1  grade is c")
    
    if(avg2>=60)
     console.log("std2 grade is a")
    else if(avg2<60 && avg2>=45)
     console.log("std2 grade is b")
    else
     console.log("std2 grade is c") 
    
    if(avg3>=60)
     console.log("std3 grade is a")
    else if(avg3<60 && avg3>=45)
     console.log("std3 grade is b")
    else
     console.log("std3  grade is c") 
     
