public class Bubble {
    public static void main(String[] args) {
int array[]={-112,-115,11,6,9};
int temp;
int size=5;
//for(int i=0;i<size;i++)
//System.out.println( " "   +array[i]);
for( int i=0;i<size;i++){
        for(int j=size-1;j>i;j--){
              if(array[j-1]>array[j]){
                  temp=array[j-1];
                     array[j-1]=array[j];
                         array[j]=temp;
                          }
                              }
                                  }
              for(int i=0;i<size;i++)
                  System.out.println(" "+array[i]); 

}
}