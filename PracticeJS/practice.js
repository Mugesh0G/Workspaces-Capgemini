var name = "mugesh"; // scope for all
name = 10;

let ourname = "freecode"; // limited scope
const pi = 3.14; // constant

function wordblanks(noun,adjective,verb,adverb){
    let result;
    result = "the "+adjective+" "+noun+" "+verb+" to the store "+adverb;
    return result;
}
let result1 = 10;
function difference(res)
{
    result1 = res;
    return result1;
}
console.log(result1)
var objects = {
    "name":"mugesh",
    "empId":46244160,
    "location":"EPIP"
};
console.log(JSON.parse(JSON.stringify(objects))); // fancy way to take a copy of objects
console.log(wordblanks("dog","big","ran","quickly"));
console.log(difference(12))

function lookup(val){

var result = objects[val];
return result; 
}
objects["projects"] = "full stack";
console.log(objects)
console.log(lookup("location"))
console.log(objects.projects)



 var func = function()
{
  return new Date(); 
};
console.log(func())


var function1 = (function()
{ 
    return function sum(...args)
    {
    //const args = [a,b,c];
    return args.reduce((x,y)=>x+y)
    };
})();
console.log(function1(1, 2, 3))
console.log(`this is ${objects.name}`)

var simpleinitializeobjects = (name,age,mob) => ({name,age,mob})
console.log(simpleinitializeobjects("subu",23,"dec"))

function hello(){
class vegetable
{
    constructor(name)
    {
        this.name = name;
    }
}
return vegetable
}
let demo = hello();
let obj = new demo("beetroot");
console.log(obj);

class names
{
    constructor(name)
    {
        this.name = name;
    }
}

let setname = new names("buddy")
console.log(setname)

// export const capitalize = (string) =>{
// return string.charAt(0).toUpperCase()+string.slice(1);
// }
// console.log(capitalize("magesh"))

//  export var capitals = (s)=>s.toUpperCase()

// export default function capital(s) {return s.toUpperCase()}

// document.getElementById(1)


