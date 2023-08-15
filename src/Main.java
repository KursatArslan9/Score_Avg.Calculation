import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte sS = 60;    // Success Score / Geçme notu

        // 1. class
        System.out.println("Maths first score: ");
        float m1 = input.nextFloat();
        System.out.println("Maths second score: ");
        float m2 = input.nextFloat();
        float mResult = (m1 + m2)/2f;

        // 2. class
        System.out.println("Physics first score: ");
        float p1 = input.nextFloat();
        System.out.println("Physics second score: ");
        float p2 = input.nextFloat();
        float pResult = (p1 + p2)/2f;

        // 3. class
        System.out.println("Chemistry first score: ");
        float c1 = input.nextFloat();
        System.out.println("Chemistry second score: ");
        float c2 = input.nextFloat();
        float cResult = (c1 + c2)/2f;

        // 4. class
        System.out.println("Turkish first score: ");
        float t1 = input.nextFloat();
        System.out.println("Turkish second score: ");
        float t2 = input.nextFloat();
        float tResult = (t1 + t2)/2f;

        // 5. class
        System.out.println("History first score: ");
        float h1 = input.nextFloat();
        System.out.println("History second score: ");
        float h2 = input.nextFloat();
        float hResult = (h1 + h2)/2f;

        // 6. class
        System.out.println("Music first score: ");
        float mu1 = input.nextFloat();
        System.out.println("Music second score: ");
        float mu2 = input.nextFloat();
        float muResult = (mu1 + mu2)/2f;

        float gAvg = (mResult + pResult + cResult + tResult + hResult + muResult)/6f;

        boolean result1 = (mResult >= sS);
        boolean result2 = (pResult >= sS);
        boolean result3 = (cResult >= sS);
        boolean result4 = (tResult >= sS);
        boolean result5 = (hResult >= sS);
        boolean result6 = (muResult >= sS);
        boolean result7 = (gAvg >= sS);

        String str1 = (result1) ? "  ---> pass the class / Sınıfı Geçti < " : "  ---> failed the class / Sınıfta Kaldı < ";
        String str2 = (result2) ? "  ---> pass the class / Sınıfı Geçti < " : "  ---> failed the class / Sınıfta Kaldı < ";
        String str3 = (result3) ? "  ---> pass the class / Sınıfı Geçti < " : "  ---> failed the class / Sınıfta Kaldı < ";
        String str4 = (result4) ? "  ---> pass the class / Sınıfı Geçti < " : "  ---> failed the class / Sınıfta Kaldı < ";
        String str5 = (result5) ? "  ---> pass the class / Sınıfı Geçti < " : "  ---> failed the class / Sınıfta Kaldı < ";
        String str6 = (result6) ? "  ---> pass the class / Sınıfı Geçti < " : "  ---> failed the class / Sınıfta Kaldı < ";
        String str7 = (result7) ? "  ---> pass the class / Sınıfı Geçti < " : "  ---> failed the class / Sınıfta Kaldı < ";

        System.out.println(" Maths average score " + mResult + str1);
        System.out.println(" Physics average score " + pResult + str2);
        System.out.println(" Chemistry average score " + cResult + str3);
        System.out.println(" Turkish average score " + tResult + str4);
        System.out.println(" History average score " + hResult + str5);
        System.out.println(" Music average score " + muResult + str6);
        System.out.println(" | General Average | ---> " + gAvg + str7);

    }
}