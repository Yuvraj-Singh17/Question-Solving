class MedianFinder {

    PriorityQueue<Integer> upper,lower;
    
    public MedianFinder() {
        upper = new PriorityQueue<>((a,b) -> b-a);
        lower = new PriorityQueue<>();
    }
    /*
    
    */
    
    public void addNum(int num) {

        lower.add(num);

        upper.add(lower.poll());

        if(lower.size() < upper.size()){
            lower.add(upper.poll());
        }
    }
    
    public double findMedian() {
        if(upper.size() == lower.size()){
            int ele1 = upper.peek();
            int ele2 = lower.peek();

            return (ele1 + ele2)/2.0;
        }else{
            return lower.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */