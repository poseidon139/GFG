//display the longest name from the given array of names 
function longest(names,n){
    //code here
    let max=names[0].length;
    let max_index=0;
    for ( let i=1 ;  i < n ; i++){
        if (names[i].length>max){
            max_index=i;
            max=names[i].length;
        }
    }
    return (names[max_index]);
}
const names= [ "Geek", "Geeks", "Geeksfor","GeeksforGeek", "GeeksforGeeks" ];

console.log(longest(names,5))