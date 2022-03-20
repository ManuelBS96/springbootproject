package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentDosImplement implements ComponentDependency{
    @Override
    public void Saludar() {
        System.out.println("Hola desde el componente DOS");
    }
}
