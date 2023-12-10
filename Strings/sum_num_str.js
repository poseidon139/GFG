//find the sum of all the digits that appears in a string 
   //Function to calculate sum of all numbers present in a string.
   function findSum(str)
   {    
       const re = "[0-9]";
        let sum=0;
        for ( let i=0 ; i < str.length ; i++){
            let number=0;
            while ( (str.charAt(i)).match(re)){
                number=number*10+Number.parseInt(str.charAt(i));
                i++;
            }
            sum = sum + number;


        }
        return sum;
   }
console.log(findSum("dk1jff1234"))