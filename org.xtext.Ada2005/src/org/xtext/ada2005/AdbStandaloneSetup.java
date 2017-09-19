
package org.xtext.ada2005;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AdbStandaloneSetup extends AdbStandaloneSetupGenerated{

	public static Injector injector = null;
	
	public static void doSetup() {
		injector = new AdbStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

