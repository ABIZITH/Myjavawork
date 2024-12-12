// in reduce we can initalize the value of the starting value 
// if we dont pass a inital value it take 0 as default 
//but while using reduce funtion we can set the intial value by our self
const arr=[1,2,3,4,5];

let initvalue = 0;

const sum =arr.reduce((perviousvalue,curentvalue)=>{
    return perviousvalue + curentvalue;
},initvalue);


/*
(perviousvalue = 0,intialvalue =0, currentvalue =1)
(perviousvalue = 1,intialvalue =0, currentvalue =2)
(perviousvalue = 3,intialvalue =0, currentvalue =3)
(perviousvalue = 6,intialvalue =0, currentvalue =4)
(perviousvalue = 10,intialvalue =0, currentvalue =5)
*/
console.log(sum);