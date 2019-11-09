public class Main
{
	public static void main(String[] args) {
	    
	    tool myTools[] = new tool[2];
	    for (int i=0;i<myTools.length;i++){
	        System.out.println("i demand u to enter a food:");
	        String input = System.console().readLine();
	        myTools[i] = new tool(input,i);
	    }
	    
	    for (int i=0;i<myTools.length;i++){
	        System.out.println(myTools[i].getType()+" location: "+myTools[i].getLocation());
	    }
	    
	    System.out.println();
	    
	    tool cake = new tool("cake"+"=",1);
	    tool cookie = new tool("cookie"+"=",3);
		System.out.println(cake.getType() + cake.getLocation());
		System.out.println(cookie.getType() + cookie.getLocation());
		System.out.println();
		
		System.out.println("u eat a cookie");
		cookie.setLocation(cookie.getLocation()-1);
		System.out.println(cookie.getType() + cookie.getLocation());
		System.out.println("u vomit out the cookie");
		cookie.setLocation(cookie.getLocation()+1);
		System.out.println(cookie.getType() + cookie.getLocation());
	}
}

//TOOLS START HERE!!

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
