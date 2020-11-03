package sk.kosickaakademia.onofrej.school;

public class Faktorial {


    public static void main(String[] args) {
         int result = fakt(11);
        System.out.println("Faktorial: "+result);
    }

    private static int fakt(int v) {
        // rekurzivna metoda - metoda ktora v svojom tele spusta seba samu
        if(v==1)
            return 1;
        else
            return v*fakt(v-1);
    }


}
