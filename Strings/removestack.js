let cities = ["Madrid", "New York", "Kathmandu", "Paris"];

// remove the last element
for (let i =0 ; i < cities.length/2 ; i++){
    let removedCity = cities.pop();
    console.log(removedCity);

}
cities.push(cities[cities.length-1])


console.log(cities)         // ["Madrid", "New York", "Kathmandu"]
   // Paris
