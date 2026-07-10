package AnandSirPep;

public class PatternStarFull {
    static void main(String[] args) {
        for(int i=0;i<5;i++){
            //space
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }

            // star
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();


        }
    }

}
