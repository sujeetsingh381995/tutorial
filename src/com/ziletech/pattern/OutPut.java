package com.ziletech.pattern;

class OutPut
{
    public static void main(String[] args) {
        System.out.println("From main method");
        Count count = new Count();
    }

}

class Count
{
    static {
        System.out.println("Hello I am initilzing");
    }
}