public class Main {
    public static void main(String[] args) {
//    1. while ციკლის გამოყენებით გამოიტანეთ ეკრანზე 3 -ზე გამრავლების ტაბულა (1 - 10 ჩათვლით).
//    "3*7=21" ასეთი სახით - 2 ქულა
        int i = 1;
        while (i <= 10) {
            int multiplyNum = 3 * i;
            System.out.println("3" + "*" + i + "=" + multiplyNum);
            i++;
        }

//     2. შექმენით ცვლადი და გადაეცით თქვენთვის სასურველი ნებისმიერი წინადადება და შეამოწმეთ,
//     თუ ამ წინადადების სიგრძე იქნება ლუწი რიცხვი, დაბეჭდეთ :"ლუწი", თუ კენტი მაშინ: "კენტი" - 2 ქულა
        String stringText = "Hello World!";
        String textLength = (stringText.length() % 2 == 0) ? "ლუწი" : "კენტი";
        System.out.println(textLength);

//      3. for -ით დაბეჭდეთ მასივში არსებულ ყოველი ელემენტი, გარდა მეხუთე პოზიციაზე მდგომისა - 2 ქულა
        String[] arr = {"Irma", "Vera", "Gvantsa", "Nunu", "Lola", "Irakli", "Nancy"};
        for (int j = 0; j < arr.length; j++) {
            while (j == 5) {
                j++;
            }
            System.out.println(arr[j]);
        }


//      4. შემოიტანე ნებისმიერი სტრინგი და for -ით დათვალე ამ სტრინგში რამდენი ხმოვანი არის - 2 ქულა
        String lastName = "Kikvadze";


//      5. შემოიტანე ნებისმიერი სტრინგი და while -ით დათვალე ამ სტრინგში რამდენი თანხმოვანი არის - 2 ქულა


    }
}