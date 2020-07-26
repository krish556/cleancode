class Inter{
   
	 public double calculateSimple(float pat,float ri,float tp)
	{
		return (pat*ri*tp)/100;
	}

	  public double calculateCompound(double pa,double ri,double tp)
 {
	 return (pat*(Math.pow(1+ri/100,tp)));
 }
}