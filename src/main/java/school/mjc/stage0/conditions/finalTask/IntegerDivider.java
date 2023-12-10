package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        String result;
        if (divider==0) {
            result="division by zero";
        }else{
            int a= dividend/divider;// 25/15=1
            boolean check= (dividend-a*dividend)!=0;//25-15!=0?false:true
            result = (check) ? "can be divided completely" : "cannot be divided completely";
        }
       
        System.out.println(result);
    }
}
