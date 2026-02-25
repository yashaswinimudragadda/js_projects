/*program to input electricity unit charge and calculate the total of electricity bill according to the given conditions
for first 50 units rs.0.50/unit
for next 100 units rs.0.75/unit
for next 100 units rs.1.20/unit
for unit above 250 rs.1.50/unit
an additional subcharge  of 20%is added to the bill.*/

unit=parseInt(prompt("enter the unit "))
surcharge = 0;
final_bill = 0;
if (unit <= 50) {
    total_bill = unit * 0.50;
} 
else if (unit <= 150) {
    // 50 units at 0.50 + remaining units at 0.75
    total_bill = (50 * 0.50) + ((unit - 50) * 0.75);
} 
else if (unit <= 250) {
    // 50 at 0.50 + 100 at 0.75 + remaining at 1.20
    total_bill = (50 * 0.50) + (100 * 0.75) + ((unit - 150) * 1.20);
} 
else {
    // 50 at 0.50 + 100 at 0.75 + 100 at 1.20 + remaining above 250 at 1.50
    total_bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((unit - 250) * 1.50);
}


surcharge = total_bill * 0.20;
final_bill = total_bill + surcharge;

console.log("Base Bill: Rs. " + total_bill);
console.log("Surcharge: Rs. " + surcharge);
console.log("Total Electricity Bill: Rs. " + final_bill);
