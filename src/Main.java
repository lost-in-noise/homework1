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
            if (j == 4) {  // "მეხუთე პოზიციაში" მეხუთე ელემენტს თუ გილისხმობდი მასივში ანუ მეოთხე ინდექსს, მაშინ j == 4;
//                თუ გულისმობდი ინდექს 5-ს, მაშინ j == 5;
                continue;
            }
            System.out.println(arr[j]);
        }


//      4. შემოიტანე ნებისმიერი სტრინგი და for -ით დათვალე ამ სტრინგში რამდენი ხმოვანი არის - 2 ქულა
        String lastName = "კიკვაძე";
        String vowels = "აეიოუ";

        int countVowels = 0;
        for (int k = 0; k < lastName.length(); k++) {
            char ch = lastName.charAt(k);
            if (vowels.indexOf(ch) != -1) {
                countVowels++;
            }
        }
        System.out.println("სულ ხმოვნების რაოდენობაა: " + countVowels);


//      5. შემოიტანე ნებისმიერი სტრინგი და while -ით დათვალე ამ სტრინგში რამდენი თანხმოვანი არის - 2 ქულა
        int index = 0;
        int countConsonant = 0;
        while (index < lastName.length()) {
            char charConsonant = lastName.charAt(index);
            if (vowels.indexOf(charConsonant) == -1) {
                countConsonant++;
            }
            index++;
        }
        System.out.println("სულ თანხმოვნების რაოდენობაა: " + countConsonant);


    }
}