package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class componentTres implements ComponentDependency{

    @Override
    public void Saludar() {
        System.out.println("Hola desde el Componente TRES");
    }
}
