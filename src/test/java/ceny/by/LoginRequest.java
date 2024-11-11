package ceny.by;

import java.util.HashMap;
import java.util.Map;

    public class LoginRequest {
        public static final String URL_LOGIN = "https://ceny.by/user/login";

        public static Map<String, String> getHeader() {
            Map<String, String> haveHeader = new HashMap<>();
            haveHeader.put("accept", "application/json, text/javascript, */*; q=0.01");
            haveHeader.put("Accept-Encoding", "gzip, deflate, br");
            haveHeader.put("Connection", "keep-alive");
            haveHeader.put("content-type", "aapplication/x-www-form-urlencoded; charset=UTF-8");
            haveHeader.put("sec-fetch-mode", "cors");
            haveHeader.put("sec-ch-ua", "\"Chromium\";v=\"130\", \"Google Chrome\";v=\"130\", \"Not?A_Brand\";v=\"99\"");
            haveHeader.put("x-requested-with","XMLHttpRequest");
            return haveHeader;
        }

        public static Map<String, String> getHeaderForBadRequest() {
            Map<String, String> haveHeader = new HashMap<>();
            haveHeader.put("Host", " ");
            haveHeader.put("accept", "application/json, text/javascript, */*; q=0.01");
            haveHeader.put("Accept-Encoding", "gzip, deflate, br");
            haveHeader.put("Connection", "keep-alive");
            haveHeader.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            haveHeader.put("sec-fetch-mode", "cors");
            haveHeader.put("sec-ch-ua", "\"Chromium\";v=\"130\", \"Google Chrome\";v=\"130\", \"Not?A_Brand\";v=\"99\"");
            return haveHeader;
        }

        public static String getBodyRequestFull() {
            return "back=https%3A%2F%2Fceny.by%2F&email=ffnyuk%40gmail.com&pass=ertytthujyh&";
        }

        public static String getBodyRequestNoEmail() {
            return "back=https%3A%2F%2Fceny.by%2F&pass=ertytthujyh&";
        }

        public static String getBodyRequestNoPassword() {
            return "back=https%3A%2F%2Fceny.by%2F&email=ffnyuk%40gmail.com";
        }

        public static String getBodyRequestInccorrectSymbols() {
            return "back=https%3A%2F%2Fceny.by%2F&email=ffnyuk%40^^^!!!gmail.com&pass=ert^^^!!!ytthujyh&";
        }

    }
