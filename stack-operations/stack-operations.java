class MyStack {
    // Define your stack
ArrayList<Integer> list = new ArrayList<>();
    public void push(int x) {
        // code here
           list.add(x);
    }

    public void pop() {
        
        // code here
        list.remove(list.size()-1);
    }

        
    public int peek() {
        // code here
         return list.get(list.size()-1);
    }
        

    public int getSize() {
        // code here
        return list.size();
        
    }

    public boolean isEmpty() {
        // code here
          return list.size() == 0;
    }
}