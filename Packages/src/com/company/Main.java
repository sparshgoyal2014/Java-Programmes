package com.company;

import javafx.scene.Node;
//import org.w3c.dom.Node;  // We can not import of two different packages with the same Class name

public class Main {

    public static void main(String[] args) {
        /**
         * Note:
         * Over 9 million Developers worldwide
         * Class or interface name Conflicts are inevitable
         * Mechanism is needed to fully specify Class
         * Allow use of Classes with the same name in the same prroject(or, even, the same Class)
         */

       Node node = null;
        org.w3c.dom.Node node1 = null;

        /**
         * Some reasons to use Package is:
         * Because the package creates a new namespace , class and interface name conflicts are avoided;
         *
         */
    }
}
