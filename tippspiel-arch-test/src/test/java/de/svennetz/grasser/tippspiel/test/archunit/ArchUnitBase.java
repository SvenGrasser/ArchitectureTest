package de.svennetz.grasser.tippspiel.test.archunit;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;

public class ArchUnitBase {
	protected JavaClasses classes = new ClassFileImporter().importClasspath();

}
