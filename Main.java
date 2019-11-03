/******************************************************************************

yAAAAÀ

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    tool cake = new tool("cake"+"=",1);
	    tool cookie = new tool("cookie"+"=",3);
		System.out.println(cake.getType() + cake.getLocation());
		System.out.println(cookie.getType() + cookie.getLocation());
		System.out.println("u eat a cookie");
		cookie.setLocation(cookie.getLocation()-1);
		System.out.println(cookie.getType() + cookie.getLocation());
		System.out.println("u vomit out the cookie");
		cookie.setLocation(cookie.getLocation()+1);
		System.out.println(cookie.getType() + cookie.getLocation());
	}
}

//WARNING
//tool starts here

public class tool{
    private String type;
    private int toolboxLocation;
    public tool(String type, int toolboxLocation){
        this.type = type;
        this.toolboxLocation = toolboxLocation;
        
    }
    
    public void setLocation(int location){
        this.toolboxLocation = location;
    }
    public String getType(){
        return this.type;
    }
    public int getLocation(){
        return this.toolboxLocation;
    }
    
}
