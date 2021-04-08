class callbyvalue{  
    int num=99;  
     
    void change(int num){  
    num=num+1;
    }  
        
    public static void main(String args[]){  
        callbyvalue cbv =new callbyvalue();  
     
      System.out.println("Before Change "+cbv.num);  
      cbv.change(200);  
      System.out.println("After Change "+cbv.num);  
     
    }  
   }  