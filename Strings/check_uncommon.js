// print all the character that are not common in both the strings



function UncommonChars(A, B){
    //code here
    let setA= new Set();
    let setB= new Set();
    for ( e of A){
        setA.add(e);
    }
    for (f of B){
        setB.add(f);
    }
    if (setA.size <= setB.size ){
        for (e of setA){
            if (setB.has(e)){
                setA.delete(e);
                setB.delete(e);
            }
        }
    }
    else {
        for (e of setB){
            if (setA.has(e)){
                setA.delete(e);
                setB.delete(e);
            }
        }
    }
    let strA=Array.from(setA).join('');
    let strB=Array.from(setB).join('');
    let strC=strA.concat(strB);
    const characters = strC.split('');
    characters.sort();
    strC=characters.join('');
    if (strC==''){
        return -1;
    }

   return strC;
}

console.log(UncommonChars("geeksforgeeks","geeksforgeeks"));

// const odds = new Set([1, 3, 5, 7, 9]);
// const squares = new Set([1, 4, 9]);
// console.log(odds.difference(squares)); // Set(3) { 3, 5, 7 }
