package PackagesTest;

import org.junit.Test;

import com.tngtech.archunit.lang.ArchRule;

import de.svennetz.base.test.archunit.PackageRules.ServiceRules;
import de.svennetz.grasser.tippspiel.test.archunit.ArchUnitBase;

public class ServicePackageTest extends ArchUnitBase {
	@Test
	public void service_should_call_business() {
		ArchRule rule = ServiceRules.service_should_call_business;
		rule.check(super.classes);
	}
}
