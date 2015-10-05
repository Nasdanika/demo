/**
 */
package org.nasdanika.demo.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.demo.Car;
import org.nasdanika.demo.DemoPackage;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.demo.impl.CarImpl#getMake <em>Make</em>}</li>
 *   <li>{@link org.nasdanika.demo.impl.CarImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.nasdanika.demo.impl.CarImpl#getVin <em>Vin</em>}</li>
 *   <li>{@link org.nasdanika.demo.impl.CarImpl#getMileage <em>Mileage</em>}</li>
 *   <li>{@link org.nasdanika.demo.impl.CarImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarImpl extends CDOObjectImpl implements Car {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoPackage.Literals.CAR;
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
	public String getMake() {
		return (String)eGet(DemoPackage.Literals.CAR__MAKE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMake(String newMake) {
		eSet(DemoPackage.Literals.CAR__MAKE, newMake);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return (String)eGet(DemoPackage.Literals.CAR__YEAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		eSet(DemoPackage.Literals.CAR__YEAR, newYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVin() {
		return (String)eGet(DemoPackage.Literals.CAR__VIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVin(String newVin) {
		eSet(DemoPackage.Literals.CAR__VIN, newVin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMileage() {
		return (String)eGet(DemoPackage.Literals.CAR__MILEAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMileage(String newMileage) {
		eSet(DemoPackage.Literals.CAR__MILEAGE, newMileage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return (String)eGet(DemoPackage.Literals.CAR__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		eSet(DemoPackage.Literals.CAR__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object home(HttpServletRequestContext context) throws Exception {
		return "Car details";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DemoPackage.CAR___HOME__HTTPSERVLETREQUESTCONTEXT:
				try {
					return home((HttpServletRequestContext)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //CarImpl
