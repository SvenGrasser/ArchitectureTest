package PackagesTest;

import org.junit.Test;

import com.tngtech.archunit.lang.ArchRule;

import de.svennetz.base.test.archunit.PackageRules.EntityRules;
import de.svennetz.grasser.tippspiel.test.archunit.ArchUnitBase;

public class EntityPackageTest extends ArchUnitBase {
	@Test
	public void entity_should_not_call_business() {
		ArchRule rule = EntityRules.entity_should_not_call_business;
		rule.check(super.classes);
	}
	
	@Test
	public void entity_should_not_call_repositories() {
		ArchRule rule = EntityRules.entity_should_not_call_repositories;
		rule.check(super.classes);
	}
	
	@Test
	public void entity_should_not_call_services() {
		ArchRule rule = EntityRules.entity_should_not_call_services;
		rule.check(super.classes);
	}
}
