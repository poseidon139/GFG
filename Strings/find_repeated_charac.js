//to find out  first character which is repeated in the given string and if no character is repeated tthen return -1 

function firstRep(s){
    //code here
    const map = new Map();
    for ( let i of s){
        if (map.has(i)){
            let count=map.get(i);
            count++;
            map.set(i,count);
        }
        else{
            map.set(i,1);
        }
    }
    let res='-1';
    for (let i of s){
        if (map.get(i)>1){
            res=i;
            break;
        }
    }
    return res;
 }


 console.log(firstRep("ge"))