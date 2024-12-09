public class Main{
    public static void main(String args[]){
        int [] arr = {6,3,8,5,1,2};
        int item = 8;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==item){
                System.out.print("array parasent is:"+ i+ " index position ");
            }
        }
    }
}