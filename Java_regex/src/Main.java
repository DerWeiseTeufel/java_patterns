/*
task:
* номера автотранспорта Российской Федерации (личный, государственный, общественный транспорт)
* */

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        var allowed_letters = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У" , "Х"};
        var code = "[А|В|Е|К|М-О|Р-У|Х][0-9][0-9][0-9][А|В|Е|К|М-О|Р-У|Х][А|В|Е|К|М-О|Р-У|Х]";
        Pattern pattern = Pattern.compile(code, Pattern.CASE_INSENSITIVE);
        var my_text = "К510НВУ950ЕМфтывтм23049ао92о92оц2093ао2";
        Matcher m = pattern.matcher(my_text);
        var allMatches = new ArrayList<String>();
        while (m.find()) {
            allMatches.add(m.group());
        }
        for(String s: allMatches){
            System.out.println(s);
        }
    }
}