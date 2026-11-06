class Solution {
    public double getAngle(String s) {
        // code here
                String sp[]=s.split(":",2);
        int h=Integer.parseInt(sp[0])%12;
        int m=Integer.parseInt(sp[1]);
        double ha=h*30+0.5*m;
        double ma=6*m;
        double a=Math.abs(ha-ma);
        if(a<360-a)
            return a;
        return 360-a;
    }
}