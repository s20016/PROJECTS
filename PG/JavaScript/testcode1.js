/*  Notes:
    let             create a variable. use camelCase ($ _)
    const           declare a constant (unchangable). use capital letters (_)
    `${}`           backtick.  extended functionality

    Interaction:
    alert()         modal window usr can't interact with window w/o pressing "OK"
    prompt(a, b)    modal window with a text msg and input field (b = string)
    confirm()       modal window with a question and two bottons: OK and Cancel

    Type Conversion
    String(value)   converts value to string
    Number(value)   converts value to number
    Boolean(value)  returns true or false
        true  = "0", " ", etc.
        false = 0, "", undefined, NaN

    Basic Operators, Math
    unary           1 operand, unary negation (-) reverses a sign of a number
    binary          2 operands
    A = B - C       2 operators, subtract operator and unary negation for C
    () ** * / + -   PEMDAS
    = > ,           lowest precedence. Therefore, last in all operators
*/

// Review 12-08-2020
let msg = "Hello!",
    usr = "JC",
    age,
    isUsr;

function interactionTest() {
    //* alert
    [msg, `${usr}!`].forEach(alert);    // .forEach() = loops element in list

    //* prompt
    age = prompt("how old are you?", 20);
    alert(`You are ${age} years old!`);

    //* confirm
    isUsr = confirm(`Are you ${usr}?`);
    alert(isUsr);
}

// Review 12-09-2020
let l1 = [0, 1, 2, "0", "5", "10", "", " ", "AAA"];
const e3_1 = [];

function typeConversion() {
    e1 = l1[5] / "2";                  // 5, numeric expressions convert automatically
    e2 = Number(l1[l1.length - 1]);    // NaN, converiosn failed

    e3 = l1.forEach(value => e3_1.push(Boolean(value)));     // .push() = .append() in Python
    console.log(l1, "\n", e3_1);

    // [0, 1, 2, '0', '5', '10', '', ' ', 'AAA'] 
    // [false, true, true, true, true, true, false, true, true]
}

function intWithString() {
    let e1 = [
        10 + 10 + " String",    // 20 String, works similar to Java. 
        "String " + 10 + 10,    // String 1010
        "10" + "10",            // 1010
        +"10" + +"10",          // 20, to add string, use unary (+)
        "" - 1 + 0,             // -1, "" empty strings are comverted to 0
        "  -9  " + 5,           // "  -9   5"
        "  -9  " - 5,           // -14, minus operator converts string to num
        null + 1,               // 1, null = 0
        undefined + 1,          // NaN, undefined = NaN
        " \t \n" + 1            // 1, \t, \n = same as empty string = 0
        ]
    
    e1.forEach(value => console.log(value));
}

//TODO call function
// interactionTest();
// typeConversion();
intWithString();