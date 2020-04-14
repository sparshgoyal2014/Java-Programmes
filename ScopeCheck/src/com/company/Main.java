package com.company;

import com.sun.source.tree.Scope;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String privateVar = "This is Private to main()";
        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeChec private var is: " + scopeCheck.getPrivateVar());
        System.out.println(privateVar);
        scopeCheck.timesTwo();

        /****
         * Note: Variables with The narrow scope is used.
         */

        System.out.println("*****************************************");

        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();

        scopeCheck.useinnerClass();

        System.out.println("VarThree is not Accessible here bu using innerclass.varThree");

    }
}
