//// function to check if the character is binary or not 
function isBinary (str){
    let flag=1;
    for ( let i =0 ; i <str.length ; i++){
        if (parseInt(str.charAt(i))!=0 && parseInt(str.charAt(i))!=1){
            flag=0;
        }
    }
    console.log(flag);
    return flag;
    
}

isBinary("0111100110101100");