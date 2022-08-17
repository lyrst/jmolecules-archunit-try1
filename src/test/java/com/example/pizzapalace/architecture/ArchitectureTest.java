package com.example.pizzapalace.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesArchitectureRules;

@AnalyzeClasses(packages = "com.example")
public class ArchitectureTest {

    @ArchTest
    ArchRule hexagonal = JMoleculesArchitectureRules.ensureHexagonal();


}
