/**
 */
package org.nasdanika.demo.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.demo.Car;
import org.nasdanika.demo.Dealership;
import org.nasdanika.demo.DemoPackage;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.RowContainer.Row;
import org.nasdanika.html.Table;
import org.nasdanika.html.Theme;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dealership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.demo.impl.DealershipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.demo.impl.DealershipImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.nasdanika.demo.impl.DealershipImpl#getInventory <em>Inventory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DealershipImpl extends CDOObjectImpl implements Dealership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DealershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoPackage.Literals.DEALERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(DemoPackage.Literals.DEALERSHIP__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(DemoPackage.Literals.DEALERSHIP__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return (String)eGet(DemoPackage.Literals.DEALERSHIP__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		eSet(DemoPackage.Literals.DEALERSHIP__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Car> getInventory() {
		return (EList<Car>)eGet(DemoPackage.Literals.DEALERSHIP__INVENTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object home(HttpServletRequestContext context) throws Exception {
		final HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		
		ApplicationPanel appPanel = htmlFactory.applicationPanel()
				.header(getName())
				.headerLink("#")
				.footer(
						htmlFactory.link("/demo-app/router/doc.html", "Documentation"))
				.width(800);
		
		appPanel.contentPanel("").id("main").style("min-height", "400px");
		
		return htmlFactory.bootstrapRouterApplication(
				Theme.Slate, 
				getName(), 
				"main/"+context.getObjectPath(this)+"/inventoryTable", 
				null, 
				appPanel);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object inventoryTable(HttpServletRequestContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		Table table = htmlFactory.table().striped();

		Row hRow = table.row();
		hRow.header("Make");
		hRow.header("Mileage");
		hRow.header("Model");
		hRow.header("Vin");
		hRow.header("Year");		
		
		for (Car car: getInventory()) {
			Row carRow = table.row();
			carRow.cell(car.getMake());
			carRow.cell(car.getMileage());
			carRow.cell(car.getModel());
			carRow.cell(htmlFactory.routeLink("main", "/"+context.getObjectPath(car)+".html", car.getVin()));
			carRow.cell(car.getYear());
		}
		
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DemoPackage.DEALERSHIP___HOME__HTTPSERVLETREQUESTCONTEXT:
				try {
					return home((HttpServletRequestContext)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case DemoPackage.DEALERSHIP___INVENTORY_TABLE__HTTPSERVLETREQUESTCONTEXT:
				try {
					return inventoryTable((HttpServletRequestContext)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //DealershipImpl
