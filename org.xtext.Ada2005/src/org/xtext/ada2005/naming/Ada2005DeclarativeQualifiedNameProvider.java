package org.xtext.ada2005.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.xtext.ada2005.adb.GenericDeclaration;
import org.xtext.ada2005.adb.GenericInstantiation;
import org.xtext.ada2005.adb.LibrarySpecification;
import org.xtext.ada2005.adb.LibraryUnitDeclaration;
import org.xtext.ada2005.adb.LibraryUnitSpecification;
import org.xtext.ada2005.adb.PackageDeclaration;
import org.xtext.ada2005.adb.PackageDefinition;
import org.xtext.ada2005.adb.SubprogramSpecification;

public class Ada2005DeclarativeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	/**
	 * Default for qualifiedName dispatcher. Write a method with this signature but custom Type for dispatching other types.
	 * @since 2.3
	 */
	protected QualifiedName qualifiedName(LibraryUnitDeclaration libUnit)
	{
		String name = null; 
		LibraryUnitSpecification libraryUnitSpecification = libUnit.getLibraryUnitSpecification();
		if (libraryUnitSpecification instanceof PackageDeclaration)
		{
			name = ((PackageDeclaration) libraryUnitSpecification).getName();
		}
		else if (libraryUnitSpecification instanceof GenericInstantiation)
		{
			name = ((GenericInstantiation) libraryUnitSpecification).getName();
		}
		else if (libraryUnitSpecification instanceof SubprogramSpecification)
		{
			name = ((SubprogramSpecification) libraryUnitSpecification).getName();
		}
		else if (libraryUnitSpecification instanceof GenericDeclaration)
		{
			LibrarySpecification libSpec = ((GenericDeclaration) libraryUnitSpecification).getLibrarySpecification();
			if (libSpec instanceof SubprogramSpecification)
			{
				name = ((SubprogramSpecification) libSpec).getName();
			}
			else
			{
				name = ((PackageDefinition) libSpec).getName();
			}
		}			
			
	return getConverter().toQualifiedName(name);
	}
	
	protected QualifiedName qualifiedName(PackageDeclaration packageDec)
	{
		if (packageDec.eContainer() instanceof LibraryUnitDeclaration)
			return QualifiedName.create();
		else
			return getConverter().toQualifiedName(packageDec.getName());
	}
	
	
}
