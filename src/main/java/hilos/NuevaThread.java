
package hilos;

/**
 *
 * @author dordonez@ute.edu.ec
 */
public class NuevaThread extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 5; i++) {
            System.out.println(name + " paso: " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
