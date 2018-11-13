/**
 * 
 */
package ch.hslu.oop.sw03;

/**
 * @author Wok
 *
 */
public class Erhoehenumforzahlauslassen {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }

}
