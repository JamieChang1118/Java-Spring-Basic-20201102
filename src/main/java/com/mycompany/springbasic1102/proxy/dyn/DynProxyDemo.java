package com.mycompany.springbasic1102.proxy.dyn;


public class DynProxyDemo {
    public static void main(String[] args) {
        DynProxy dynProxy = new DynProxy(new CalcImpl());
        Object object = dynProxy.getProxy();
        if(object instanceof Calc){
            Calc calc = (Calc)object;
            int result = calc.add(2, 3);
            System.out.println(result);
            int result2 = calc.sub(5, 7);
            System.out.println(result2);
        }
    }
}
