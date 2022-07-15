/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author ujjaw
 */

class Node
{
    Node pre,next;
    Customer customer;
    
    public Node()
    {
        this.pre=null;
        this.next=null;
        this.customer=null;
    }
    
    public Node(Customer customer)
    {
        this.customer=customer;
    }
}

public class LinkedList {
    Node head;
    
    public LinkedList()
    {
        this.head=null;
    }
    
    public void insert(Customer customer)
    {
        Node node = new Node(customer);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            node.pre=temp;
        }
    }
    
    public void ChangeCustomerDetails(String cnic,int value)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(cnic.equals(temp.customer.cnic))
            {
                temp.customer.bal+=value;
                break;
            }
            temp=temp.next;
        }
    }
    public Customer getCustomerByCard(String cardno, String pin)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(cardno.equals(temp.customer.cardno))
            {
                if(pin.equals(temp.customer.pin))
                {
                    return temp.customer;
                }
                else
                {
                    return null;
                }
            }
            temp=temp.next;
        }
        return null;
    }
    
    public String returnbalance(String cnic)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(cnic.equals(temp.customer.cnic))   
            {
                return String.valueOf(temp.customer.bal);
            }
            temp=temp.next;
        }
        return "Not found";
    }
    
    public boolean acExists(String cnic,String acno,String cardno)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(cnic.equals(temp.customer.cnic) || acno.equals(temp.customer.acno) || cardno.equals(temp.customer.cardno))
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    
    public void printall()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.customer.toString());
            temp=temp.next;
        }
    }
}
