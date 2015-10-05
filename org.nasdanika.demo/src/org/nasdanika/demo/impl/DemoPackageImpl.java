/**
 */
package org.nasdanika.demo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.demo.Car;
import org.nasdanika.demo.Dealership;
import org.nasdanika.demo.DemoFactory;
import org.nasdanika.demo.DemoPackage;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoPackageImpl extends EPackageImpl implements DemoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dealershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpServletRequestContextEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.demo.DemoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DemoPackageImpl() {
		super(eNS_URI, DemoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DemoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DemoPackage init() {
		if (isInited) return (DemoPackage)EPackage.Registry.INSTANCE.getEPackage(DemoPackage.eNS_URI);

		// Obtain or create and register package
		DemoPackageImpl theDemoPackage = (DemoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDemoPackage.createPackageContents();

		// Initialize created meta-data
		theDemoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDemoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DemoPackage.eNS_URI, theDemoPackage);
		return theDemoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDealership() {
		return dealershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDealership_Name() {
		return (EAttribute)dealershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDealership_Address() {
		return (EAttribute)dealershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDealership_Inventory() {
		return (EReference)dealershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDealership__Home__HttpServletRequestContext() {
		return dealershipEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDealership__InventoryTable__HttpServletRequestContext() {
		return dealershipEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCar() {
		return carEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_Make() {
		return (EAttribute)carEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_Year() {
		return (EAttribute)carEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_Vin() {
		return (EAttribute)carEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_Mileage() {
		return (EAttribute)carEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCar_Model() {
		return (EAttribute)carEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCar__Home__HttpServletRequestContext() {
		return carEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHttpServletRequestContext() {
		return httpServletRequestContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoFactory getDemoFactory() {
		return (DemoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dealershipEClass = createEClass(DEALERSHIP);
		createEAttribute(dealershipEClass, DEALERSHIP__NAME);
		createEAttribute(dealershipEClass, DEALERSHIP__ADDRESS);
		createEReference(dealershipEClass, DEALERSHIP__INVENTORY);
		createEOperation(dealershipEClass, DEALERSHIP___HOME__HTTPSERVLETREQUESTCONTEXT);
		createEOperation(dealershipEClass, DEALERSHIP___INVENTORY_TABLE__HTTPSERVLETREQUESTCONTEXT);

		carEClass = createEClass(CAR);
		createEAttribute(carEClass, CAR__MAKE);
		createEAttribute(carEClass, CAR__YEAR);
		createEAttribute(carEClass, CAR__VIN);
		createEAttribute(carEClass, CAR__MILEAGE);
		createEAttribute(carEClass, CAR__MODEL);
		createEOperation(carEClass, CAR___HOME__HTTPSERVLETREQUESTCONTEXT);

		// Create data types
		exceptionEDataType = createEDataType(EXCEPTION);
		httpServletRequestContextEDataType = createEDataType(HTTP_SERVLET_REQUEST_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dealershipEClass, Dealership.class, "Dealership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDealership_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dealership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDealership_Address(), ecorePackage.getEString(), "address", null, 0, 1, Dealership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDealership_Inventory(), this.getCar(), null, "inventory", null, 0, -1, Dealership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDealership__Home__HttpServletRequestContext(), ecorePackage.getEJavaObject(), "home", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHttpServletRequestContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getDealership__InventoryTable__HttpServletRequestContext(), ecorePackage.getEJavaObject(), "inventoryTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHttpServletRequestContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(carEClass, Car.class, "Car", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCar_Make(), ecorePackage.getEString(), "make", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_Year(), ecorePackage.getEString(), "year", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_Vin(), ecorePackage.getEString(), "vin", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_Mileage(), ecorePackage.getEString(), "mileage", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_Model(), ecorePackage.getEString(), "model", null, 0, 1, Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCar__Home__HttpServletRequestContext(), ecorePackage.getEJavaObject(), "home", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHttpServletRequestContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		// Initialize data types
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(httpServletRequestContextEDataType, HttpServletRequestContext.class, "HttpServletRequestContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// org.nasdanika.cdo.web:home-route
		createOrgAnnotations();
		// org.nasdanika.cdo:context-parameter
		createOrg_1Annotations();
		// org.nasdanika.cdo.web:route
		createOrg_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Dealership model package.\r\n\r\nClass diagram: ![Class diagram](bundle:org.nasdanika.demo/doc/class_diagram.png)"
		   });	
		addAnnotation
		  (dealershipEClass, 
		   source, 
		   new String[] {
			 "documentation", "Dealership is the root of the model."
		   });	
		addAnnotation
		  (getDealership_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Dealership name."
		   });	
		addAnnotation
		  (getDealership_Address(), 
		   source, 
		   new String[] {
			 "documentation", "Dealership address."
		   });	
		addAnnotation
		  (getDealership_Inventory(), 
		   source, 
		   new String[] {
			 "documentation", "Dealership sells zero or more cars."
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web:home-route</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.nasdanika.cdo.web:home-route";	
		addAnnotation
		  (getDealership__Home__HttpServletRequestContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCar__Home__HttpServletRequestContext(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo:context-parameter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_1Annotations() {
		String source = "org.nasdanika.cdo:context-parameter";	
		addAnnotation
		  ((getDealership__Home__HttpServletRequestContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getDealership__InventoryTable__HttpServletRequestContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getCar__Home__HttpServletRequestContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web:route</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_2Annotations() {
		String source = "org.nasdanika.cdo.web:route";	
		addAnnotation
		  (getDealership__InventoryTable__HttpServletRequestContext(), 
		   source, 
		   new String[] {
		   });
	}

} //DemoPackageImpl
