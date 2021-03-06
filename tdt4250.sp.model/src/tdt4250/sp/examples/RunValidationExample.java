package tdt4250.sp.examples;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tdt4250.sp.SpPackage;
import tdt4250.sp.University;

public class RunValidationExample {

	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		// relate the RaPackage identifier used in XMI files to the RaPackage instance (EPackage meta-object) 
		resSet.getPackageRegistry().put(SpPackage.eNS_URI, SpPackage.eINSTANCE);
		// relate the XMI parser to the 'xmi' file extension
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource resource = resSet.getResource(URI.createURI(RunValidationExample.class.getResource("RunValidationExample.xmi").toString()), true);
		University uni = (University) resource.getContents().get(0);
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(uni);
		for (Diagnostic diagnostic : diagnostics.getChildren()) {			
			System.out.println(diagnostic.getMessage());
		}
	}
}
