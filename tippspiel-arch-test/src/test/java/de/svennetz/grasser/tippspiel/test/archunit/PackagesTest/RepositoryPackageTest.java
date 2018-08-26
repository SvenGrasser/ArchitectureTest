package de.svennetz.grasser.tippspiel.test.archunit.PackagesTest;

import org.junit.Test;

import com.tngtech.archunit.lang.ArchRule;

import de.svennetz.base.test.archunit.PackageRules.RepositoryRules;
import de.svennetz.grasser.tippspiel.test.archunit.ArchUnitBase;

public class RepositoryPackageTest extends ArchUnitBase {
	@Test
	public void repository_should_not_call_business() {
		ArchRule rule = RepositoryRules.repository_should_not_call_business;
		rule.check(classes);
	}
	

	@Test
	public void repository_should_not_call_services() {
		ArchRule rule = RepositoryRules.repository_should_not_call_services;
		rule.check(super.classes);
	}
}
