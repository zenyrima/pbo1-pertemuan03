package Percabangan;

public class Switch_char {
    public static void main(String[] args) {
        char nilai ='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs    : \"terima kasih pak\"");
                System.out.println("Dosen  : \"selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs    : \"kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen  : \"!@#$!%\"");
                break;
            case 'C':
                System.out.println("Mhs    : \"ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen  : \"tapi bisa lah menjawan ujian?\"");
                System.out.println("Mhs    : \"hihihi..\"");
                break;
            default:
                System.out.println("Mhs    : \"ulun turun pul pak ai,tugas pul jua\"");
                System.out.println("Dosen  : \"bujur jua kah?\"");
                System.out.println("Dosen  : \"*memeriksa berkas\"");
                System.out.println("Dosen  : \"*menceleng\"");
                System.out.println("Mhs    : \"*kabur...\"");
                break;

        }

    }
}
