package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    /*

	    String string = "Rob x Kriston x Ralphe";
	    String[] splitString = string.split(" x ");

	    for(String x : splitString){
            System.out.println(x);
        }

        System.out.println(Arrays.toString(splitString));

	    String river = "Mississippi";
	    String[] splitString2 = river.split("s");

        System.out.println(Arrays.toString(splitString2));

        String[] array = {"","","",""};
        System.out.println(Arrays.toString(array));

        */

	    /*

	    String river = "Mississippi";
	    String riverpart = river.substring(2,5);  // returning substring between index 2 and 5 (including 2 and excluding 5 just before 5 i.e. 4)

        System.out.println(riverpart);

	     */


	    /*
	    String river = "Mississippi";

        Pattern pattern = Pattern.compile("Mi(.*?)pi");
        Matcher matcher = pattern.matcher(river);

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }

	     */

	    String html = "<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.se/images/:profile/0c5e670fdc6c774862ae847ab5b115367\" alt=\"Rihanna\"/>\n" +
                "\t\t\t\t\t</div>";

	    Pattern p = Pattern.compile("src=\"(.*?)\"");
	    Matcher m = p.matcher(html);
	    while(m.find()){
            System.out.println(m.group(1));
        }

        p = Pattern.compile("alt=\"(.*?)\"");
        m = p.matcher(html);
        while(m.find()){
            System.out.println(m.group(1));
        }

    }
}
