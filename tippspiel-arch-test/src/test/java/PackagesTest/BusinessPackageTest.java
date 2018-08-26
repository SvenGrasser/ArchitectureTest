package PackagesTest;

import org.junit.Test;

import com.tngtech.archunit.lang.ArchRule;

import de.svennetz.base.test.archunit.PackageRules.BusinessRules;
import de.svennetz.grasser.tippspiel.test.archunit.ArchUnitBase;

public class BusinessPackageTest extends ArchUnitBase {
	@Test
	public void business_should_not_call_services() {
		ArchRule rule = BusinessRules.business_should_not_call_services;
		rule.check(super.classes);
	}
}
