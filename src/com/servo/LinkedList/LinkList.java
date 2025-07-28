package com.servo.LinkedList;

import java.util.Scanner;

public class LinkList {
    int val;
    LinkList next;

    public LinkList(int val){
        this.val = val;
        this.next = null;
    }

    public static LinkList createList(){
        LinkList head = null;
        LinkList tail = null;
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            if (a == -1) {
                return head;
            }
            if(head == null){
                head = new LinkList(a);
                tail = head;
            }
            else{
                tail.next = new LinkList(a);
                tail = tail.next;
            }
        }
    }

    public void printList(LinkList head){
        LinkList temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public void DeleteNode(LinkList head,int val){
        if(head == null){
            System.out.println("List is empty");
        }
        LinkList temp = head;
        LinkList prev = null;
        while(temp != null) {
            if (temp.val == val) {
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}
