function arrRotation(s1,s2){
    let res=0 
    let str=""
    if (s1==s2){
        res=1
    }
    else{

  for ( let i=0 ; i < (s1.length)+1 ; i++){
      s1=s1.concat(s1.charAt(0));
      s1=s1.slice(1,s1.length)
      
      if (s1==s2){
          res=1;
      }
  
    }
    
  }
  console.log(res)

}
const startTime = performance.now();

arrRotation("geeksforgeeks","forgeeksgeeks")

const endTime = performance.now();

console.log(endTime-startTime)