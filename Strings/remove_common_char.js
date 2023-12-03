//to remove common character from a given two strings and prints the uncommon character 

function concatenatedString(s1, s2)
{
    // code here
   
    let res=""
    let flag =0;
    for (i of s1 ){
        if (!s2.includes(i)){
            res=res.concat(i);
            flag++;
        }
    }
    for (i of s2 ){
        if (!s1.includes(i)){
            res=res.concat(i);
            flag++;
        }
    }
    if (flag==0){
        res="-1";
    }
    
    return res;

}

console.log(concatenatedString("aacdb","gafd"));