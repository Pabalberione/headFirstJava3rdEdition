package Chapter4.mixedMessages;

/**
 * A short Java program is listed to your right. Two blocks of the program are missing.
 * Your challenge is to match the candidate blocks of code (below) with the output
 * that you’d see if the blocks were inserted. Not all the lines of output will be used, and
 * some of the lines of output might be used more than once. Draw lines connecting
 * the candidate blocks of code with their matching command-line output.
 *
 * Candidates
 * i < 9
 * index < 5
 *
 * i < 20
 * index < 5
 *
 * i < 7
 * index < 7
 *
 * i < 19
 * index < 1
 *
 * Possible outputs
 * 14 7
 * 9 5
 * 19 1
 * 14 1
 * 25 1
 * 7 7
 * 20 1
 * 20 5
 */
public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while (i < 9){//Candidate1
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " +
                mixes[1].counter);
    }
    public int maybeNew(int index) {
        if (index < 5) {//Candidate2
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}
