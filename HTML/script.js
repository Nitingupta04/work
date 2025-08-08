function topper_student() {
  let marks = [88, 99, 95, 67, 90, 92];

  let toppers = marks.filter((val) => {
    return val > 90;
  });
  console.log(toppers);
}

function vowel_Cal(strin) {
  let str = strin.toLowerCase();

  str_length = str.length;
  vowel_count = 0;

  for (let i = 0; i < str_length; i++) {
    if (
      str[i] === "a" ||
      str[i] === "e" ||
      str[i] === "i" ||
      str[i] === "o" ||
      str[i] === "u"
    )
      vowel_count = vowel_count + 1;
  }

  console.log(`Total Vowel found in ${str} = ${vowel_count}`);
  return vowel_count;
}

function Splice_eg() {
  let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  numbers.splice(0, 3, 101, 202, 303);

  for (let i = 0; i < numbers.length; i++) {
    console.log(`Updated value for array index ${i} = ${numbers[i]}`);
  }
}

function discountn_Apply() {
  let items = [250, 645, 300, 900, 50];
  let value;
  let i = 0;
  let offer;
  let cupon_value = 10;
  let checkout_price = 0;
  let total_price = 0;

  for (value of items) {
    console.log(`price = ${items[i]}`);
    total_price = total_price + items[i];
    offer = value / cupon_value;
    items[i] = items[i] - offer;
    console.log(`value after discount = ${items[i]}`);
    checkout_price = checkout_price + items[i];
    i++;
  }

  console.log(`Total Price = ${total_price}`);
  console.log(`Total Price after discount = ${checkout_price}`);
}

function average_cal() {
  let numbers = [];
  let sum = 0;

  let given_value = parseInt(prompt("Provide any value"), 10);

  if (!isNaN(given_value)) {
    for (let i = 1; i <= given_value; i++) {
      numbers.push(i);
    }

    let size = numbers.length;

    for (let i = 0; i < size; i++) {
      sum = sum + numbers[i];
    }

    console.log("Total sum = ", sum);
    console.log("Average for given array = ", sum / size);
  } else {
    console.log("Invalid input. Please provide a valid number.");
  }
}

function dynamic_string() {
  let Student = {
    Name: "Nitin",
    RollNo: 12345,
    Marks: 85,
    Mobile_Number: 7999238919,
  };

  let numbers = [1, 2, 3, 4, 5, 303, 456, 6786, 98, 76, 78];
  let sorted_numbers = numbers.sort((a, b) => a - b);

  let Title = `${Student.Name} Introducation`;
  console.log(Title);

  let studentDetails = `My name is ${Student.Name} and my RollNo is ${Student.RollNo}. \n
    I got ${Student.Marks} and my mobile number is ${Student.Mobile_Number}.`;

  console.log(studentDetails);

  console.log(sorted_numbers);
}

function mul(a, b) {
  return a * b;
}

const mutidemo = (a, b) => {
  let c = a * b;
  console.log(c);
};

function dom_mani() {
  let doc = window.document;
  console.log(doc);
  console.log(document.body);
  console.log(document.head);
  console.log(document.documentElement);
  console.log(document.scripts);
  console.log(document.forms);
  console.log(document.title);

  let store_var = document.querySelector("body");
  console.log("-- Here is message start --");
  console.log(store_var);

  console.dir(document.head);

  let inner_child_info = document.getElementsByClassName("heading_class1");
}

function bdy() {
  let bdy = document.body;
  console.log(`Value of bdy ${bdy}`);
  console.log(bdy.childElementCount);
  console.log(bdy.childNodes);
  console.log(bdy.children);
  bdy.style.backgroundColor = "green";
  bdy.style.border = "5px solid";
  bdy.style.height = "100vh";
}

function document_create_element() {
  let img = document.createElement("img")
  img.src = "https://picsum.photos/id/237/200/300"
  img.alt = "A cute dog";
  document.body.appendChild(img);
}

/*let a = prompt(console.log("A"))
console.log(a)
let b = prompt(console.log("B"));
console.log(b)

setTimeout(function(){
  console.log("setTimeout ()")
},5000)

let c = a+b;
console.log(`Total Sum ${a} and ${b} = ${c}`)

let count = 1;
setInterval(function(){
  console.log(`Total count ${count}`)
  count ++
},500)*/

let obj = {
  name : "Nitin",
  id : 101,
  city : "Noida",
  about : function(){
    console.log("Inside Obj About");
  },
  subject : ["Java","Javascript","Python"],
  parenst : {fathername : "XYZ", mothername : "ABC"}
}
console.log(obj);
obj.name = "ABC";
console.log(obj.name);