/**
 * A short Java program is listed below. One block of the program
 * is missing. Your challenge is to match the candidate block of
 * code (on the left) with the output that you’d see if the block
 * were inserted. Not all the lines of output will be used, and some
 * of the lines of output might be used more than once. Draw lines
 * connecting the candidate blocks of code with their matching
 * command-line output.
 */
public class MixMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5){
            if ( y < 5 ) {
                x = x + 1;
                if ( y < 3 ) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.println(x + "" + y + " ");
            x = x +1;
        }
    }
}
