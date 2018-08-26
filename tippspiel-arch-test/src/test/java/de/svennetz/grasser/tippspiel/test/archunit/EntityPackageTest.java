package de.svennetz.grasser.tippspiel.test.archunit;

import org.junit.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

import de.svennetz.base.test.archunit.PackageRules.EntityRules;

public class EntityPackageTest {
	@Test
	public void entity_should_not_call_business() {
		JavaClasses classes = new ClassFileImporter().importClasspath();

		ArchRule rule = EntityRules.entity_should_not_call_business;
		rule.check(classes);
	}
	
	@Test
	public void entity_should_not_call_repositories() {
		JavaClasses classes = new ClassFileImporter().importClasspath();

		ArchRule rule = EntityRules.entity_should_not_call_repositories;
		rule.check(classes);
	}
	
	@Test
	public void entity_should_not_call_services() {
		JavaClasses classes = new ClassFileImporter().importClasspath();

		ArchRule rule = EntityRules.entity_should_not_call_services;
		rule.check(classes);
	}
}
