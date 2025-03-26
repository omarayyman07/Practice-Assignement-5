public class P510 {
    public static int SumOfDigits(String a){
        int sum=0;
        for(int i=0;i<a.length();i++){
            switch (a.charAt(i)) {
                case '0':
                    sum+=0;
                    break;
                case '1':
                    sum+=1;
                    break;
                case '2':
                    sum+=2;
                    break;
                case '3':
                    sum+=3;
                    break;
                case '4':
                    sum+=4;
                    break;
                case '5':
                    sum+=5;
                    break;
                case '6':
                    sum+=6;
                    break;
                case '7':
                    sum+=7;
                    break;
                case '8':
                    sum+=8;
                    break;
                case '9':
                    sum+=9;
                    break;
        }
    }
        return sum;}
        public static void main(String[] args){
            System.out.println(SumOfDigits("The year has 12 months, each month can vary between 28-31 days"));

}}
