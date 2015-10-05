/**
 */
package org.nasdanika.demo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Dealership model package.
 * 
 * Class diagram: ![Class diagram](bundle:org.nasdanika.demo/doc/class_diagram.png)
 * <!-- end-model-doc -->
 * @see org.nasdanika.demo.DemoFactory
 * @model kind="package"
 * @generated
 */
public interface DemoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "demo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.demo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.demo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemoPackage eINSTANCE = org.nasdanika.demo.impl.DemoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.demo.impl.DealershipImpl <em>Dealership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.demo.impl.DealershipImpl
	 * @see org.nasdanika.demo.impl.DemoPackageImpl#getDealership()
	 * @generated
	 */
	int DEALERSHIP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Inventory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP__INVENTORY = 2;

	/**
	 * The number of structural features of the '<em>Dealership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Home</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP___HOME__HTTPSERVLETREQUESTCONTEXT = 0;

	/**
	 * The operation id for the '<em>Inventory Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP___INVENTORY_TABLE__HTTPSERVLETREQUESTCONTEXT = 1;

	/**
	 * The number of operations of the '<em>Dealership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEALERSHIP_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.demo.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.demo.impl.CarImpl
	 * @see org.nasdanika.demo.impl.DemoPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 1;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MAKE = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Vin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__VIN = 2;

	/**
	 * The feature id for the '<em><b>Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MILEAGE = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MODEL = 4;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Home</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR___HOME__HTTPSERVLETREQUESTCONTEXT = 0;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.nasdanika.demo.impl.DemoPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>Http Servlet Request Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.web.HttpServletRequestContext
	 * @see org.nasdanika.demo.impl.DemoPackageImpl#getHttpServletRequestContext()
	 * @generated
	 */
	int HTTP_SERVLET_REQUEST_CONTEXT = 3;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.demo.Dealership <em>Dealership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dealership</em>'.
	 * @see org.nasdanika.demo.Dealership
	 * @generated
	 */
	EClass getDealership();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.demo.Dealership#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.demo.Dealership#getName()
	 * @see #getDealership()
	 * @generated
	 */
	EAttribute getDealership_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.demo.Dealership#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.nasdanika.demo.Dealership#getAddress()
	 * @see #getDealership()
	 * @generated
	 */
	EAttribute getDealership_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.demo.Dealership#getInventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventory</em>'.
	 * @see org.nasdanika.demo.Dealership#getInventory()
	 * @see #getDealership()
	 * @generated
	 */
	EReference getDealership_Inventory();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.demo.Dealership#home(org.nasdanika.web.HttpServletRequestContext) <em>Home</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Home</em>' operation.
	 * @see org.nasdanika.demo.Dealership#home(org.nasdanika.web.HttpServletRequestContext)
	 * @generated
	 */
	EOperation getDealership__Home__HttpServletRequestContext();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.demo.Dealership#inventoryTable(org.nasdanika.web.HttpServletRequestContext) <em>Inventory Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inventory Table</em>' operation.
	 * @see org.nasdanika.demo.Dealership#inventoryTable(org.nasdanika.web.HttpServletRequestContext)
	 * @generated
	 */
	EOperation getDealership__InventoryTable__HttpServletRequestContext();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.demo.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see org.nasdanika.demo.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.demo.Car#getMake <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make</em>'.
	 * @see org.nasdanika.demo.Car#getMake()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Make();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.demo.Car#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.nasdanika.demo.Car#getYear()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Year();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.demo.Car#getVin <em>Vin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vin</em>'.
	 * @see org.nasdanika.demo.Car#getVin()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Vin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.demo.Car#getMileage <em>Mileage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mileage</em>'.
	 * @see org.nasdanika.demo.Car#getMileage()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Mileage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.demo.Car#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.nasdanika.demo.Car#getModel()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Model();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.demo.Car#home(org.nasdanika.web.HttpServletRequestContext) <em>Home</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Home</em>' operation.
	 * @see org.nasdanika.demo.Car#home(org.nasdanika.web.HttpServletRequestContext)
	 * @generated
	 */
	EOperation getCar__Home__HttpServletRequestContext();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.web.HttpServletRequestContext <em>Http Servlet Request Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Http Servlet Request Context</em>'.
	 * @see org.nasdanika.web.HttpServletRequestContext
	 * @model instanceClass="org.nasdanika.web.HttpServletRequestContext"
	 * @generated
	 */
	EDataType getHttpServletRequestContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DemoFactory getDemoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.demo.impl.DealershipImpl <em>Dealership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.demo.impl.DealershipImpl
		 * @see org.nasdanika.demo.impl.DemoPackageImpl#getDealership()
		 * @generated
		 */
		EClass DEALERSHIP = eINSTANCE.getDealership();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEALERSHIP__NAME = eINSTANCE.getDealership_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEALERSHIP__ADDRESS = eINSTANCE.getDealership_Address();

		/**
		 * The meta object literal for the '<em><b>Inventory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEALERSHIP__INVENTORY = eINSTANCE.getDealership_Inventory();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEALERSHIP___HOME__HTTPSERVLETREQUESTCONTEXT = eINSTANCE.getDealership__Home__HttpServletRequestContext();

		/**
		 * The meta object literal for the '<em><b>Inventory Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEALERSHIP___INVENTORY_TABLE__HTTPSERVLETREQUESTCONTEXT = eINSTANCE.getDealership__InventoryTable__HttpServletRequestContext();

		/**
		 * The meta object literal for the '{@link org.nasdanika.demo.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.demo.impl.CarImpl
		 * @see org.nasdanika.demo.impl.DemoPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__MAKE = eINSTANCE.getCar_Make();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__YEAR = eINSTANCE.getCar_Year();

		/**
		 * The meta object literal for the '<em><b>Vin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__VIN = eINSTANCE.getCar_Vin();

		/**
		 * The meta object literal for the '<em><b>Mileage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__MILEAGE = eINSTANCE.getCar_Mileage();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__MODEL = eINSTANCE.getCar_Model();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAR___HOME__HTTPSERVLETREQUESTCONTEXT = eINSTANCE.getCar__Home__HttpServletRequestContext();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.nasdanika.demo.impl.DemoPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Http Servlet Request Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.web.HttpServletRequestContext
		 * @see org.nasdanika.demo.impl.DemoPackageImpl#getHttpServletRequestContext()
		 * @generated
		 */
		EDataType HTTP_SERVLET_REQUEST_CONTEXT = eINSTANCE.getHttpServletRequestContext();

	}

} //DemoPackage
