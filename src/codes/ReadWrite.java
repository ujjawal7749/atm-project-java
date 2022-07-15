/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;
import java.io.*;

/**
 *
 * @author ujjaw
 */
public class ReadWrite {
    
    public static LinkedList Read()
    {
        LinkedList list = new LinkedList();
        try
        {
            File file=new File("acdata.txt");    //creates a new file instance  
            FileReader fr=new FileReader(file);   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
            String line;  
            while((line=br.readLine())!=null)  
            {  
                String[] arr = line.split(",");
                Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
                list.insert(customer);
            }
            fr.close();
            return list;
        }
        catch(Exception e){
            
        return new LinkedList();}
    }
    
    public static void Write(String text,boolean tf)
    {
        try {
            FileWriter fw = new FileWriter("acdata.txt", tf);
            if(tf==true)
            {
            fw.write(text+"\n");
            }
            else fw.write(text);
            fw.close();
        }
        catch(IOException e) {
        }
    }
    
    public static void ChangeandWrite(String cnic,int value)
    {
        LinkedList list = Read();
        list.ChangeCustomerDetails(cnic, value);
        Node temp = list.head;
        
        Write("",false);
        while(temp!=null)
        {
            Write(temp.customer.toString(),true);
            temp=temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list = Read();
        list.printall();
    }
}
