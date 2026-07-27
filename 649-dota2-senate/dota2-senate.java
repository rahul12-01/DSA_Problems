class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new ArrayDeque<>();        
        Queue<Integer> d = new ArrayDeque<>();

        for (int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R')
                r.offer(i);
            else
                d.offer(i);
        }
        // System.out.println(r);
        // System.out.println(d);
        for (int i=0;i<senate.length();i++){
            if (r.size()==0)
                return "Dire";
            if (d.size()==0)
                return "Radiant";
            int rr=r.poll();
            int dd=d.poll();
            // System.out.println(rr);
            // System.out.println(dd);

            if(rr<dd)
                r.offer(rr+senate.length());
            else 
                d.offer(rr+senate.length());

        }
        return null;
    }
}