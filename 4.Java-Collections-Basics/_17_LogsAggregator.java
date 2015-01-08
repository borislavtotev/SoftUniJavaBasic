import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;


public class _17_LogsAggregator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		TreeMap<String,TreeMap<Long,ArrayList<String>>> logs = new TreeMap<>(); 
		
		for (int i = 0; i < n; i++) {
			String ip = input.next("[0-9\\.]+");
			String user = input.next("[a-zA-Z]+");
			long duration = input.nextLong();
			input.nextLine();

			TreeMap<Long,ArrayList<String>> newMap = new TreeMap<>();
			ArrayList<String> ipList = new ArrayList<>();
			
			if (logs.containsKey(user)) {
				for (Long oldDur : logs.get(user).keySet()) {
					ipList.addAll(logs.get(user).get(oldDur));
					duration+=oldDur;
				}
			}
			
			ipList.add(ip);
			newMap.put(duration, ipList);
			logs.put(user,newMap);
			
		}
		
		input.close();
		
		for (String userName : logs.keySet()) {
			System.out.print(userName + ": ");
			TreeMap<Long,ArrayList<String>> newMap = logs.get(userName);
			for (Long duration : newMap.keySet()) {
				System.out.print(duration + " ");
				ArrayList<String> list = new ArrayList<String>(new HashSet<String>(newMap.get(duration)));
				Collections.sort(list);
				System.out.println(list);
			}

		}
	}
}
