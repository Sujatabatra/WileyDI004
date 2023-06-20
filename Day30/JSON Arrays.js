var persons=[
  {
    "firstname":"Sujata",  //string
    "lastname":"Batra",   //string
    "Hobbies":["Cooking","Reading","Travelling"]  //array:objects
  },
  {
    "firstname":"Ellie",
  	"lastname":"Maitland",
    "Hobbies":["Cooking","Reading","Travelling"]
  },
  {
    "firstname":"Catalina",
   "lastname":"Kalman",
     "Hobbies":["Cooking","Reading","Travelling"]
 
  },
  {
    "firstname":"Chiara",
  	"lastname":"Pigoni",
    "Hobbies":["Cooking","Chiara Reading","Travelling"]
  }
]
console.log(persons[2].firstname);

for(index in persons){
  console.log(persons[index]);
}

console.log(persons[3].Hobbies[1]);