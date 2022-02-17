public class Loops {
    public static void main(String[] args) {


                int [][] marks = {
                        {45,39,49,40,42},
                        {30,38,40,41},
                        {45,30,49,49,45,40}
                };

                for(int[] a : marks){
                    int sum=0;
                    for(int i: a){
                        sum+=i;
                    }
                    System.out.println("sum ="+sum);
                    System.out.println("average ="+sum/a.length);
                }

                /* for(int i=0; i<marks.length;i++){
                    int sum=0;
                    for(int j=0;j<marks[i].length;j++){
                             sum+=marks[i][j];
                    }
                    System.out.println("sum= " + sum);
                    System.out.println("average = "+(float)sum/marks[i].length);
                } */


            }
        }


