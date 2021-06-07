import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class wordmani {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		HashMap<Character,String > map = new HashMap();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			char check = Character.toLowerCase(ch);
			if(map.containsKey(check)){
				String already = map.get(check);
				map.put(check, already+ch);
			}
			else{
				map.put(check, ch+"");
			}
		}
//		System.out.println(map);
		
		char[] chararr = new char[map.size()];
		int i=0;
		for(char ch:map.keySet()){
			chararr[i] = ch;
			i++;
		}
		Arrays.sort(chararr);
//		for(char ch:chararr){
//			System.out.print(ch+" ");
//		}
		
		StringBuilder  ans= new StringBuilder();
		int first=0;
		int last = chararr.length-1;
		while(first < last ){
			ans.append(map.get(chararr[first]));
			ans.append(map.get(chararr[last]));
			
		
			first++;
			last--;
		}
		System.out.println();
		System.out.println();
		if(first==last)
		ans.append(map.get(chararr[last]));
		System.out.println(ans);

	}

}
