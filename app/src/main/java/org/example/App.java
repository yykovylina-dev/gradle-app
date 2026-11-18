package org.example;

import com.portfolio.lib.MyUtil;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        System.out.println(MyUtil.getGreeting());
        System.out.println("Reversed: " + StringUtils.reverse("Hello, World!"));
    }
}