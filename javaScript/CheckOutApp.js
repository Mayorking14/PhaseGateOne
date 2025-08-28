const prompt = require("prompt-sync")();

let products = [];
let quantities = [];
let prices = [];
let totals = [];


let cashierName = "";
let discount = 0;
let vat = 0;
let billTotal = 0;
let payment = 0;

let customerName = prompt("Please input your name: ");

let decision = true;
while (decision) {
let item = prompt("Enter item to include to cart: ");
products.push(item);

let quantity = parseInt(prompt("How many piece are you buying: "));
quantities.push(quantity);

let price = parseInt(prompt("Please input item price per unit: "));
prices.push(price);

let total = quantity * price;
totals.push(total);

let addItem = prompt("Do you want to add more item ?: ").toUpperCase();
if (addItem !== "YES") {
decision = false;
    }
}


let subTotal = 0;
for (let i = 0; i < totals.length; i++) {
    subTotal += totals[i];
}


console.log("SEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
console.log("TEL: 03293828343");
console.log("Date : " + new Date().toLocaleString());

cashierName = prompt("Cashiers' name: ");
console.log("Customer Name: " + customerName);

console.log("================================================================");
console.log("ITEM\t QTY\t PRICE\t TOTAL(NGN)");
console.log("------------------------------------------------------------------------");

for (let i = 0; i < products.length; i++) {
    console.log(products[i] + "\t" + quantities[i] + "\t" + prices[i] + "\t" + totals[i]);
}

console.log("--------------------------------------------------------------------");
console.log("Sub Total: " + subTotal);

discount = parseFloat(prompt("Enter Discount: "));
vat = (17.50 / 100) * subTotal;
console.log("VAT @ 7.50%: " + vat);

billTotal = subTotal + vat - discount;
console.log("================================================================");
console.log("Bill Total: " + billTotal);
console.log("================================================================");
console.log("THIS IS NOT A RECEIPT KINDLY PAY: " + billTotal);
console.log("================================================================");

payment = prompt("How much did the customer give to you?: ");


console.log("SEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
console.log("TEL: 03293828343");
console.log("Date : " + new Date().toLocaleString());

console.log("Cashiers' name: " + cashierName);
console.log("Customer Name: " + customerName);
console.log("================================================================");
console.log("ITEM\t QTY\t PRICE\t TOTAL(NGN)");
console.log("--------------------------------------------------------------------");

for (let i = 0; i < products.length; i++) {
    console.log(products[i] + "\t" + quantities[i] + "\t" + prices[i] + "\t" + totals[i]);
}

console.log("---------------------------------------------------------------");
console.log("Sub Total: " + subTotal);
console.log("Discount: " + discount);
console.log("VAT @ 17.50%: " + vat);
console.log("Bill Total: " + billTotal);
console.log("================================================================");
console.log("Amount paid: " + payment);
console.log("Balance: " + (payment - billTotal));
console.log("================================================================");
console.log("THANK YOU FOR YOUR PATRONAGE");
console.log("================================================================");