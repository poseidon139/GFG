//find the substring that starts and ends with 1 in the given string 

function binarySubstring(n, a)
{   
    let count_1=0;
    // code here
    for ( let i=0 ; i < n ; i++){
        if ( a.charAt(i)=='1'){
            
            count_1++;
        }
    }
    return (((count_1-1)*count_1)/2);

}

console.log(binarySubstring(5,"01101"))