/**
 */
package org.nasdanika.demo;

import org.eclipse.emf.cdo.CDOObject;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.demo.Car#getMake <em>Make</em>}</li>
 *   <li>{@link org.nasdanika.demo.Car#getYear <em>Year</em>}</li>
 *   <li>{@link org.nasdanika.demo.Car#getVin <em>Vin</em>}</li>
 *   <li>{@link org.nasdanika.demo.Car#getMileage <em>Mileage</em>}</li>
 *   <li>{@link org.nasdanika.demo.Car#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.demo.DemoPackage#getCar()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Car extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make</em>' attribute.
	 * @see #setMake(String)
	 * @see org.nasdanika.demo.DemoPackage#getCar_Make()
	 * @model
	 * @generated
	 */
	String getMake();

	/**
	 * Sets the value of the '{@link org.nasdanika.demo.Car#getMake <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make</em>' attribute.
	 * @see #getMake()
	 * @generated
	 */
	void setMake(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see org.nasdanika.demo.DemoPackage#getCar_Year()
	 * @model
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link org.nasdanika.demo.Car#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

	/**
	 * Returns the value of the '<em><b>Vin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vin</em>' attribute.
	 * @see #setVin(String)
	 * @see org.nasdanika.demo.DemoPackage#getCar_Vin()
	 * @model
	 * @generated
	 */
	String getVin();

	/**
	 * Sets the value of the '{@link org.nasdanika.demo.Car#getVin <em>Vin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vin</em>' attribute.
	 * @see #getVin()
	 * @generated
	 */
	void setVin(String value);

	/**
	 * Returns the value of the '<em><b>Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mileage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mileage</em>' attribute.
	 * @see #setMileage(String)
	 * @see org.nasdanika.demo.DemoPackage#getCar_Mileage()
	 * @model
	 * @generated
	 */
	String getMileage();

	/**
	 * Sets the value of the '{@link org.nasdanika.demo.Car#getMileage <em>Mileage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mileage</em>' attribute.
	 * @see #getMileage()
	 * @generated
	 */
	void setMileage(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.nasdanika.demo.DemoPackage#getCar_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.demo.Car#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.demo.Exception" contextDataType="org.nasdanika.demo.HttpServletRequestContext"
	 * @generated
	 */
	Object home(HttpServletRequestContext context) throws Exception;

} // Car
