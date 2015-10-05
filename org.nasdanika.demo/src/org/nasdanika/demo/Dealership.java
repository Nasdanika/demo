/**
 */
package org.nasdanika.demo;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dealership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dealership is the root of the model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.demo.Dealership#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.demo.Dealership#getAddress <em>Address</em>}</li>
 *   <li>{@link org.nasdanika.demo.Dealership#getInventory <em>Inventory</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.demo.DemoPackage#getDealership()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Dealership extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dealership name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.demo.DemoPackage#getDealership_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.demo.Dealership#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dealership address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.nasdanika.demo.DemoPackage#getDealership_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.nasdanika.demo.Dealership#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.demo.Car}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dealership sells zero or more cars.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference list.
	 * @see org.nasdanika.demo.DemoPackage#getDealership_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Car> getInventory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.demo.Exception" contextDataType="org.nasdanika.demo.HttpServletRequestContext"
	 * @generated
	 */
	Object home(HttpServletRequestContext context) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.demo.Exception" contextDataType="org.nasdanika.demo.HttpServletRequestContext"
	 * @generated
	 */
	Object inventoryTable(HttpServletRequestContext context) throws Exception;

} // Dealership
