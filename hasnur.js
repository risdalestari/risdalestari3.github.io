const nama = prompt ("nama");
const kelas = prompt ("kelas");
const nim = prompt ("nim");
var b= "*"; for (var i = 9;i>0; i--){
    for (var j=i;j>0;j--){ b+="*";}
    b+="\n";
}alert (b);

document.writeln("nama"+nama);
document.write("<br/>");
document.writeln("kelas"+kelas);
document.write("<br/>");
document.writeln("nim"+nim); const iterasi =prompt("banyak?");
document.write("<br/>");
for (var i=1;i<=iterasi;i++){
for (var j=1;j<=i;j++){
    document.write("*");
}
document.write("<br>");
}