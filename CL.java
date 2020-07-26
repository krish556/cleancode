class Calculate
 {
     public void test1()
     {
         Inter i=new Inter();
         //calculate simple interest
         double simple_interest=i.calculateSimple(1500,3,12);
         //calculate compound interest
         double compound_interest=i.calculateCompound(2500,4,5);
        
         
     }
 }