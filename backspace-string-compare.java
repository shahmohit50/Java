class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> sk = new Stack <>();
        Stack <Character> st = new Stack <>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#' && !sk.empty()){
                sk.pop();
            }else if(s.charAt(i) != '#'){
                sk.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#' && !st.empty()){
                st.pop();
            }else if(t.charAt(i) != '#'){
                st.push(t.charAt(i));
            }
        }
        
        StringBuilder ss = new StringBuilder();
        StringBuilder sst = new StringBuilder();
        while(!sk.empty()){
            ss.append(sk.pop());
        }
        while(!st.empty()){
            sst.append(st.pop());
        }
        if(ss.toString().equals(sst.toString())){
            return true;
        }
        return false;
    }
}
