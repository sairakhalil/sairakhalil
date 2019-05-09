public class Queue{
char q[];
int putloc ,getloc;
Queue(int size){
q=new char [size];
put=get=0;
}
void put(char ch){
if(putloc==q.length){
System.out.print(" - Queue is full");
return;
}
q[putloc++]=ch;
}


char get(){
if(getloc==putloc){
System.out.print(" - Queue is Empty");
return(char) 0;
}
return=q[getloc++];
}

public class QDemo{
public static void main(String [] args){
Queue bigQ=new Queue(100);
Queue smallQ=new Queue(4);
char ch;
int i;
System.out.println("Using BigQ To stroe the alphabet");
for(i=0;i<26;i++)
 bigQ.put((char) ('A' +i));
System.out.println("Content of bigQ: ");
for(i=0;i<26;i++)
ch = bigQ.get();
if(ch !=(char) 0) System.out.println(ch);
}
System.out.println("\n ");
System.out.println("Using smallQ to generate errors ");
for(i=0;i<5;i++){
    System.out.println("Attempting to store " + (char) ('Z'-i));
 smallQ.put((char) ('Z' -i));
System.out.println();
}
System.out.println();

System.out.println("Content of smallQ: ");
  for(i=0;i<5;i++)
     ch=smallQ.get();
if(ch != ( char) 0) System.out.print(ch);
}
}
}
