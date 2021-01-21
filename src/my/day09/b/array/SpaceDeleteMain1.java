package my.day09.b.array;

public class SpaceDeleteMain1 {
    public static void main(String[] args) {

        // === 입사문제 : 문자열 중 공백 제거하기
        String str = "  korea   seou l 쌍용 강북 교육센터 ";

        // koreaseoul쌍용강북교육센터


        char[] chArr = str.toCharArray();
        /*
            ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            | ' ' | ' ' | 'k' | 'o' | 'r' | 'e' | 'a' | ' ' | ' ' | ' ' | 's' | 'e' | 'o' | 'u' | ' ' | 'l' | ' ' | '쌍' | '용' | ' ' | '강' | '북' | ' ' | '교' | '육' | '센' | '터' | ' ' | ' ' |
            ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

         */


        int len = 0;

        for (char c : chArr) {
            if (c != ' ') {
                len++;
            }
        }
        char[] resultchArr = new char[len];

        //  ------------------------------------------------------------------------------
        //  |'k'|'o'|'r'|'e'|'a'|'s'|'e'|'o'|'u'|'l'|'쌍'|'용'|'강'|'북'|'교'|'육'|'센'|'터'|
        //  ------------------------------------------------------------------------------




        for (int i = 0, j = 0; i < chArr.length; i++) {
            if (chArr[i] != ' ') {
                resultchArr[j] = chArr[i];
                j++;
            }
        }
        System.out.println(String.valueOf(resultchArr));
   }
}
