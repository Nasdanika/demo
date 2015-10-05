package org.nasdanika.demo.app;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.demo.Car;
import org.nasdanika.demo.Dealership;
import org.nasdanika.demo.DemoFactory;
import org.nasdanika.demo.DemoPackage;

public class DemoAppSessionInitializerComponent implements CDOSessionInitializer {
	
	@Override
	public void init(CDOSession session) {
		System.out.println("Initializing session");
		
		// Register packages
		CDOPackageRegistry packageRegistry = session.getPackageRegistry();
		packageRegistry.putEPackage(DemoPackage.eINSTANCE);
		
		// Populate with initial data if empty.
		CDOTransaction transaction = session.openTransaction();				
		try {
			CDOResource cRes = transaction.getOrCreateResource("/DemoApp");
			if (cRes.getContents().isEmpty()) {
				// Create initial content
				Dealership rootElement = DemoFactory.eINSTANCE.createDealership();
				rootElement.setAddress("Middle of nowhere");
				rootElement.setName("Demo Dealership");
				
				Car car = DemoFactory.eINSTANCE.createCar();
				car.setMake("Kia");
				car.setMileage("50000");
				car.setModel("Sorento");
				car.setVin("12345");
				car.setYear("2013");
				rootElement.getInventory().add(car);
				
				cRes.getContents().add(rootElement);
			}
			
			transaction.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}

}
