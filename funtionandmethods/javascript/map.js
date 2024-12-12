const arr=[1,1,2,3,4,4,5,5];
// give value one by one //
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

user.map((item) => { // call back function if we use " => "
    console.log(item.age);
});