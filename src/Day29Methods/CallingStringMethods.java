package Day29Methods;

import my_uttils.StringUtil;



public class CallingStringMethods {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("hello world"));


        System.out.println(StringUtil.isPalindrome("anna"));

        System.out.println(StringUtil.fixFormat("hello"));

        System.out.println(StringUtil.camelCase("JaVA will ruLE the WoRld"));
    }
}
