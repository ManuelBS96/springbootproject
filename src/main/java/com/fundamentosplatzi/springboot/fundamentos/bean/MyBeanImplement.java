package com.fundamentosplatzi.springboot.fundamentos.bean;

import jdk.swing.interop.SwingInterOpUtils;

public class MyBeanImplement implements MyBean{


    @Override
    public void print() {
        System.out.println("Hola desde mi implementación propia del Bean");
    }
}
