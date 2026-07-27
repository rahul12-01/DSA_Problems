class RecentCounter {
    Queue <Integer> q;
    public RecentCounter() {
        q=new LinkedList<>();
        
    }
    
    public int ping(int t) {
        // System.out.println(t);
        q.offer(t);
        while (q.peek()< t-3000){
            q.remove ();
        }
        // System.out.println(q);
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */