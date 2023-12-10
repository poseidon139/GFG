//check if the given string is isogram or not, a string is isogram if all the charcters occurs only  once 

    //Function to check if a string is Isogram or not.
    function isIsogram(s)
    {
        // code here
        const set =new Set();
        let flag=1;
        for(i of s){
            if(set.has(i)){
                flag =0;
            }
            else{
                set.add(i);
            }
        }
        return flag;
    }
    console.log(isIsogram("ds"))