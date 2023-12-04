//remove all the spaces from the given string 

function modify(s){
    //code here
    let string="";
    for (i of s ){
        if (i==" "){
            string=string.concat("");
        }
        else{
            string=string.concat(i);
        }
    }
    return string;
}

console.log(modify("jkahhf jAF   kfjLDJKLJKJ"))