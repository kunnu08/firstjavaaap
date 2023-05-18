package office.utility;
public class Date
{
         int dd; 
	 int mm;
	 int yy;


    	public Date()
	{
		dd=1;
		mm=8;
		yy=2200;


        }
	public Date(int x,int y,int z)	
	{
          this.dd=x;
	  this.mm=y;
	  this.yy=z;
 		
         }
	public Date(Date d)
	{
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
	}
	
	

	public void ShowDate()
       {
 		System.out.println(dd+"/"+mm+"/"+yy);

       }

}