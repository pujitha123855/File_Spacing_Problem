import java.util.*;
public class SpacesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        String[] s = new String[7];
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        LinkedHashMap<String, String> res = new LinkedHashMap<>();
        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        // s[0] = "File1";
        // s[1] = "    File2";
        // s[2] = "    File3";
        // s[3] = "File4";
        // s[4] = "        File5";
        // s[5] = "    File6";
        // s[6] = "            File7";
    
        for(int i=0;i<7;i++){
            s[i]=sc.nextLine();
        }

        // For finding the tab spaces
        for (int i = 0; i < s.length; i++) {
            int c = s[i].lastIndexOf(" ");
            map.put(s[i].trim(), (c+1)/4);
        }
        System.out.println(map);
        // Logic for Parent file
        for (Map.Entry<String,Integer> ele : map.entrySet()) {
            if(map1.containsKey(ele.getValue())){
                map1.put(ele.getValue(),ele.getKey());
            }else{
                map1.put(ele.getValue(),ele.getKey());
            }
            if (ele.getValue() == 0) {
                res.put(ele.getKey(), "Null");
            } else{
        for(Map.Entry<Integer,String> ele1:map1.entrySet()){
            if(ele.getValue()-1==ele1.getKey()){
                res.put(ele.getKey(),ele1.getValue());
            }
        }
        }
    }
        System.out.println(res);
        System.out.println("File\tParentFile");
        System.out.println("------------------");
        // Printing the Output as (FileName ParentFile)
        for (Map.Entry<String, String> element : res.entrySet()) {
            System.out.println(element.getKey() + "\t" + element.getValue());
        }
}
}
