/*  Notes:
    let         create a variable. use camelCase ($ _)
    const       declare a constant (unchangable). use capital letters (_)
    `${}`       backtick.  extended functionality

    Interaction:
    alert()         modal window usr can't interact with window w/o pressing "OK"
    prompt(a, b)    modal window with a text msg and input field
    confirm()       modal window with a question and two bottons: OK and Cancel
*/

let msg = "Hello!",
    usr = "John",
    age = prompt("how old are you?", 20),
    isBoss = confirm("Are you the boss?");


// alert(msg);
// [msg, age, usr].forEach(alert);
// alert(`Hi! I'm ${usr}, ${age + 1}.`);

alert(`You are ${age} years old!`);
alert(isBoss);