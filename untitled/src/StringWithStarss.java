public class StringWithStarss {
    public static void main(String[] args) {
        String kanakMetin = "I love Java, a lot";

        /*
        System.out.print("Metininizi Giriniz");
        Scanner scanner=new Scanner(System.in);
        kanakMetin=scanner.nextLine();
        */

        convertToStringWithStars(kanakMetin);


        System.out.println(" debug bekleme satırı");
    }


    static String convertToStringWithStars(String text) {
        String hedefMetin = "";
        //" ", nokta "." ve virgül "," yanında olamaz.
        char[] yasaklilar = {' ', '.', ','};//

        for (int i = 0; i < text.length(); i++) {
            /*
            iç içe döngü ile ve operatoru sayısını kriter olduka
            arırmaktansa dongu sayısını artıayı tercih ettim.
            */

            int denetim = 0;
            for (int j = 0; j < yasaklilar.length; j++) {
                if (text.charAt(i) != yasaklilar[j]
                        && text.charAt(i + 1) != yasaklilar[j]) {
                    denetim++;
                }
                //else {                   // hedefMetin=hedefMetin+(String)text[i];             }

            }
            if (denetim == yasaklilar.length) {


            } else {

            }
            //System.out.println(text.charAt(i));
        }

        return hedefMetin;
    }
}