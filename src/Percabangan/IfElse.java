package Percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 53000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else if (uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, angsul : "+ angsul);
        }else {
            System.out.println("Uang pas..Uwuw..");
        }
    }
}

