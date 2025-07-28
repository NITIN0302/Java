package com.servo.LinkedList;

public class Main
{
    public static void main(String[] args){
        LinkList li = LinkList.createList();
        li.printList(li);
        li.DeleteNode(li,5);
        li.printList(li);

    }
}
