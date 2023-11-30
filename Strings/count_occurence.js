///count the occurence of character that occur maximum time in a string and if they both are equal print the lexcographically earlier 

function getMaxOccuringChar(str)
{
    let max_charc=str.charAt(0);
    const map1= new Map();
    let max_count=0;
     for (const e of str){
       if (map1.has(e)){
        let count = map1.get(e);
        count++;
        map1.set(e,count);
        if (count > max_count){
            max_charc=e;
            max_count=count;

        }
        else if (count == max_count) {
            max_charc=(e.charCodeAt(0)<max_charc.charCodeAt(0)?e:max_charc)
        }

       }
       else{
        map1.set(e,1);
        if (max_count==0){
        max_charc=(e.charCodeAt(0)<max_charc.charCodeAt(0)?e:max_charc)
        }
       }
     }
    return max_charc;
}
getMaxOccuringChar("vhqvoi")
