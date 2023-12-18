if(percentage >= 90){
    grade="O";
}
else if(percentage >= 80 ) {
    grade="A";
}
else if(percentage >= 70) {
    grade="B";
}
else if(percentage >= 60) {
    grade="C";
}
else if(percentage >= 50) {
    grade=D;
}
else {
    grade="F";
}
System.out.println("Total marks obtained are"+Totalmarks);
System.out.println("Average percentage is"+percentage);
System.out.println("Grade obtained:"+grade);
sc.close();
}
}
