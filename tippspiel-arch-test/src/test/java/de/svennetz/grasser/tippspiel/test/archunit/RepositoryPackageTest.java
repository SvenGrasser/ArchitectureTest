package de.svennetz.grasser.tippspiel.test.archunit;

import org.junit.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

import de.svennetz.base.test.archunit.PackageRules.RepositoryRules;

public class RepositoryPackageTest {
	@Test
	public void repository_should_not_call_business() {
		JavaClasses classes = new ClassFileImporter().importClasspath();

		ArchRule rule = RepositoryRules.repository_should_not_call_business;
		rule.check(classes);
	}
	

	@Test
	public void repository_should_not_call_services() {
		JavaClasses classes = new ClassFileImporter().importClasspath();

		ArchRule rule = RepositoryRules.repository_should_not_call_services;
		rule.check(classes);
	}
}
