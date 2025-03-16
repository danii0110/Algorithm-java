import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, List<String>> groupToMembers = new HashMap<>();
        HashMap<String, String> memberToGroup = new HashMap<>();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
       
        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());
            List<String> members = new ArrayList<>();
            
            for (int j = 0; j < memberCount; j++) {
                String memberName = br.readLine();
                members.add(memberName);
                memberToGroup.put(memberName, groupName);
            }
            
            Collections.sort(members);
            groupToMembers.put(groupName, members);
        }
        
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            int type = Integer.parseInt(br.readLine());
            
            if (type == 0) {
                List<String> members = groupToMembers.get(query);
                for (String member : members) {
                    sb.append(member).append("\n");
                }
            } else {
                sb.append(memberToGroup.get(query)).append("\n");
            }
        }
        System.out.print(sb);
    }
}