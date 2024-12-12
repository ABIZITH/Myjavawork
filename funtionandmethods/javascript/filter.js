// based on the condition it return a array 
// filter funtion is used to remove a component from a array or retrun it.
// and we can store it in a new array in a new variable 
const arr=[1,1,2,3,4,4,5,5];

const user=[
    {
        name:"jdjdjf",
        age:23
    },
    {
        name:"aaaaf",
        age:24
    }, {
        name:"bbbbb",
        age:25
    },
    ];
const use = user.filter((item,index) => {

    return item.name !== "bbbbb";
// Return the expected "bbbbb" data and print the other 
});

console.log(use);