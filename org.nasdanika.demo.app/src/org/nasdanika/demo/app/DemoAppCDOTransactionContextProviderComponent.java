package org.nasdanika.demo.app;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.CDOTransactionContextProviderComponent;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.cdo.security.LoginPasswordCredentials;

public class DemoAppCDOTransactionContextProviderComponent extends CDOTransactionContextProviderComponent<LoginPasswordCredentials> {

	@SuppressWarnings("unchecked")
	@Override
	protected ProtectionDomain<LoginPasswordCredentials> getProtectionDomain(CDOTransaction view) {
		CDOResource res = view.getResource("DemoApp");
		if (res!=null) {
			for (EObject e: res.getContents()) {
				if (e instanceof ProtectionDomain) {
					return (ProtectionDomain<LoginPasswordCredentials>) e;
				}
			}
		}
		return null;
	}

}
