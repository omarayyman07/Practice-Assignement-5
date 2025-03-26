public class P59 {
    public static int Count(String n,char c){
        int count=0;
        for(int i=0;i<n.length();i++){
            if (c==n.charAt(i)){
              count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
    System.out.println(Count("Jon Bones Jones",'o'));
}}
