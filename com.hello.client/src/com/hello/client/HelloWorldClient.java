package com.hello.client;

import com.hello.HelloWorld;

/**
 * @author <a href="mailto:Dzianis.Yudzenka@gmail.com">Dzianis Yudzenka</a>
 * @version 1.0
 * @since 4/11/2017
 */
public class HelloWorldClient {

    public static void main(String arg[]) {

        HelloWorld hello = new HelloWorld();
        System.out.println(hello.sayHelloWorld());

    }

}
