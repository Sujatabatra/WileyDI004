var ar=[];
// console.log(ar);
// console.log(typeof ar);

ar=[10,20,"Sujata",true];
console.log(ar);
console.log(ar[0]);
// for(var index=0;index<ar.length;index++){
for(var index=0;index<ar["length"];index++){
  console.log(ar[index]);
}

console.log(ar[6]);

ar[1]="Batra";
console.log(ar);

ar[6]="Roda";
console.log(ar)

ar["first"]=false;

console.log(ar);
for(var index=0;index<ar["length"];index++){
  console.log(ar[index]);
}

console.log("=================")
for(i in ar){
  console.log(i+" : "+ar[i]);
}
console.log("===================")
for(element of ar){
  console.log(element);
}
