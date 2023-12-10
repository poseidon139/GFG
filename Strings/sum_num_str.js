//find the sum of all the digits that appears in a string 
   //Function to calculate sum of all numbers present in a string.
   function findSum(str)
   {
       // code here
       let count=0;
       const reg=new RegExp("[0-9]") 
       for (i of str){
        if (reg.test(i)){
            let count_n=0;
            while(reg.test(i))
            count+=Number.parseInt(i);
        }
       }
       return count;
   }
console.log(findSum("dk1jff1234"))