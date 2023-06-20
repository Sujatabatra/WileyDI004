var person={
  "firstname":"Arnold",
  "lastname":"Smith",
  "age":45,
  "1":"Somevalue"
}

console.log(person);
console.log(person.firstname);
console.log(person.lastname);
console.log(person["age"]);
// console.log(person.1);
// objectname.propertyname or objectname[propertyname]
console.log(person[1]);

var key="lastname";

console.log(person.key);

console.log(person[key]);