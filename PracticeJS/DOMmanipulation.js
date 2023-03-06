/// DOM manipulation

 console.log(document.getElementById(1));
 console.log(document.getElementsByClassName('hh'))
 console.log(document.getElementsByTagName('input'))
 console.log(document.querySelector('input'))
 console.log(document.querySelectorAll('input'))

 var h1 = document.querySelector('h1');
 h1.innerText = "Hello!";
0
//  h1.removeAttribute('id');
// h1.setAttribute('id',"html");
// console.log(h1.getAttribute('id'));

// var ul = document.querySelector('ul')
// var li = document.createElement('li')
// ul.append(li);

// li.classList.add('week-names')
// li.innerText = 'saturday';

// var div = document.querySelector('div')
// var h2 = document.createElement('h2')
// div.append(h2)
// h2.innerText = "welcome!!!"
// h2.textContent = "Hola!!!"
// h2.remove()
// console.log(div.firstElementChild);

// let ul = document.querySelector('ul')
// console.log(ul.childNodes);
// console.log(ul.firstChild);
// console.log(ul.lastChild);
// console.log(ul.firstElementChild);
// console.log(ul.lastElementChild);
 
// let ul = document.querySelector('ul');
// console.log(ul);
// console.log(ul.previousSibling);
// console.log(ul.nextSibling);
// console.log(ul.previousElementSibling);
// console.log(ul.nextElementSibling)

// let button = document.querySelector('.button');
// let alertt = ()=>{ alert('success youre fine')};
// button.addEventListener("click",alertt);

// let heading = document.querySelector('h1')
// let hoverit = ()=>{
//     heading.style.color = 'red'}
//     let hoverit1 = ()=>{
//         heading.style.color = 'black'}

// heading.addEventListener("mouseover", hoverit)
// heading.addEventListener("mouseout", hoverit1)

// let buton = document.querySelector('.button');
// let contents = document.querySelector('.hidden')
// console.log(contents);

// let show =  ()=>{
//     if(contents.classList.contains('button'))
//     {
//         contents.classList.remove('button')
//     }else{
//         contents.classList.add('button')
//     }
// }

// buton.addEventListener('click',show)


// var checkbox = document.forms.namedItem("numberform")
// function checking(){
//   for(let i=0;i<checkbox.length;i++){
//       var selected = document.querySelectorAll('.success')
//     if(checkbox[i].checked==true)
//     {  
//       if(selected[i].classList.contains('success-color'))
//       {
//         console.log(i)
//         if(checkbox[i]==false){
//           console.log(i);
//         }
//       }else{
//         selected[i].classList.add('success-color')
//         console.log(selected[i]);
//       }
        
//     }        
//   }
// }
// // checkbox.addEventListener('click', checking)
// window.addEventListener('onclick',checking)

document.querySelector('#week').addEventListener('click',
  function (e){
    e.preventDefault()
    const targe = e.target;
    if(targe.matches('li')){targe.style.color = 'red'
  targe.style.backgroundColor = "cyan"
  targe.style.textDecoration = 'none'}
  }
  )

  const bill = (products,tax)=>
  {
    let total = 0;
    products.forEach((product) => {
      total += product+product*tax
    });
    return total
  }
  console.log(bill([10,15,30],0.2));

  const mugesh = {
    name:'mugesh',
    empId:'46244160',
    role:'Developer'
  };
  const subu = {
    name:'subu',
    empId:'46244161',
    role:'Developer'
  };
  console.log(mugesh.name)

  let x = [mugesh,subu]
console.log(x);
x.forEach(y=>console.log(y.name));

var string = 'hello';
console.log(string.replace(string.charAt(0),string.charAt(0).toUpperCase()));

console.log(string.slice(1,string.length))
 let array  = [1,2,3,4,5]
 console.log(array)

 string==="hello" ? true:false

console.log(string==="hello" ? true:false)





