package de.svennetz.grasser.tippspiel.test.archunit;

import org.junit.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

import de.svennetz.base.test.archunit.PackageRules.ServiceRules;

public class ServicePackageTest {
	@Test
	public void service_should_call_business() {
		JavaClasses classes = new ClassFileImporter().importClasspath();

		ArchRule rule = ServiceRules.service_should_call_business;
		rule.check(classes);
	}
}
