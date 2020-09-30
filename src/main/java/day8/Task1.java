package day8;

public class Task1 {
    public static void main(String[] args) {
    	StringBuilder sb = new StringBuilder();
    	long start;
    	long end;
    	
    	start = System.currentTimeMillis();
    	for (int i = 0; i < 20000; i++) {//6622
			sb.append(i + " ");
		}
    	end = System.currentTimeMillis();
    	System.out.println(end - start);
    	System.out.println(sb.toString());
    	
    	String str = "";
    	start = System.currentTimeMillis();
    	for (int i = 0; i < 20000; i++) {
			str = str + i + " ";
		}
    	end = System.currentTimeMillis();
    	System.out.println(end - start);
    	System.out.println(str);
    }
}
