package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{

    @Override
    public void Saludar() {
        System.out.println("Hola Mundo desde el componente");
    }
}
