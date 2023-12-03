//retrun the minimum number of character that must be removed from s1 and s2 to make it a anagram 

function remAnagram(str1, str2){
    // code here
    let l1=str1.length;
    let l2=str2.length;
    let count=0;
    if (l1<=l2){
        for (let i of str1){
            if(!(str2.includes(i))){
                count++;
            } 
        }
    }
    else{
        for (let i of str2){
            if(!(str1.includes(i))){
                count++;
            } 
        }
    }
    return count;
}




console.log(remAnagram("cddgk","gcd"))