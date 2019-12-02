package ngon_ngu_lap_trinh_java;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class HienThiSoNguyenTo {
    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100 la");
        for (int i=0;i<100;i++){
            if (songuyento(i)){
                System.out.print(i+" ");
            }
        }
    }

    /**
     *
     * @param n
     * @return
     */
    public static boolean songuyento(int n){
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    }

