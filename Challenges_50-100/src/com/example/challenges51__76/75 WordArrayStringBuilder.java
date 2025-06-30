package com.example.challenges51__76;

class WordArrayStringBuilder {
    public static void main(String[] args) {
        String arr[]=new String[]{"This","is", "the", "best", "and", "most", "detailed", "course", "on", "java", "on", "the", "internet."};
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ");
        }

        System.out.println(sb);
    }
}
