document.querySelector('#tasks').addEventListener('click',
function(e)
{
        var x = e.target.getAttribute('id');
        var y = document.getElementById(x);
        
        if(y.matches('.undone'))
        {
            y.classList.remove('undone')
            y.classList.add('done')
            y.style.textDecoration = 'line-through';
            y.style.color = 'red';
        }else if(y.matches('.done'))
         {
            y.classList.remove('done')
            y.classList.add('undone')
            y.style.removeProperty('color');
            y.style.removeProperty('text-decoration')
        }
})


document.querySelector('#complete').addEventListener('click',
function(e)
{
    var x = e.target.getAttribute('id');
    var y = document.getElementById(x);
    var task = document.querySelectorAll('.task')

    if(y.matches('.green'))
    {
        task.forEach((task)=>task.style.textDecoration = 'line-through')
        task.forEach((task)=>task.style.color = 'green')
        y.classList.remove('green')
        y.classList.add('red')
        y.innerText = 'reset'
       
    }else{

      task.forEach((task)=>task.style.removeProperty('text-decoration'))
      task.forEach((task)=>task.style.removeProperty('color'))
        y.classList.remove('red')
        y.classList.add('green')
        y.innerText = 'complete'
    }

})

document.querySelector('#add').addEventListener('click',
function(e)
{
    var y = document.getElementById('text-box');
    if(y.value !=''){
    var task = document.querySelector('#tasks');
    var taskCount = document.querySelectorAll('.task')
    var addTag = document.createElement('li')
    addTag.id = 'task'+taskCount.length
    addTag.className = 'task undone'
    addTag.innerText = y.value
    y.value = ""
    task.append(addTag)
    }else{
        alert('see with your eyes, there is no text typed😒 in text box👇')
    }
})


document.querySelector('#text-box').addEventListener('keypress',
function(e)
{
    if(e.key === 'Enter')
    {
        document.getElementById('add').click();
    }
})


// document.querySelector('#changeColor').addEventListener('click',
// function(e)
// {
//     console.log('inserted')
//     var task = document.querySelectorAll('.task')
//     console.log(task);
//     for(let i=0;i<task.length;i++){

//         task[i].style.background = 'red'
//     }
       
    
// })
document.querySelector('#tasks').addEventListener('dblclick',
function(e)
{
    let x = e.target.getAttribute('id')
    let y = document.getElementById(x)
    y.remove()
})



