package com.mycompany.springbasic1102.proxy.sta;

interface Subject{
    void request();
}

class RealSubject implements Subject{

    @Override
    public void request() {
        //Log...
        System.out.println("下週會有秋老虎");   // 業務程式
        //Log...
    }
}

class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void request() {
        System.out.println("Log before ...");   //公用程式
        subject.request();  // 調用指定ˇ的業務程式
        System.out.println("Log end ...");
    }
    
}

public class ProxyDemo {
    public static void main(String[] args) {
//        Subject subject = new RealSubject();
//        subject.request();
        
        // 靜態代理
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
