package Chapter2.CodeMagnets;

/**
 * A Java program is all scrambled up on
 * the fridge. Can you reconstruct the
 * code snippets to make a working Java
 * program that produces the output listed
 * below? Some of the curly braces fell on
 * the floor and they were too small to pick
 * up, so feel free to add as many of those
 * as you need.
 */
public class DrumkitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if(d.snare){
            d.playSnare();
        }



    }
}
