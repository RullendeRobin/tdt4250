/**
 */
package tdt4250.ra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.ra.Person#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.ra.Person#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link tdt4250.ra.Person#getResourceAllocations <em>Resource Allocations</em>}</li>
 *   <li>{@link tdt4250.ra.Person#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link tdt4250.ra.Person#getFamilyName <em>Family Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.ra.RaPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.ra.RaPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.ra.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(float)
	 * @see tdt4250.ra.RaPackage#getPerson_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link tdt4250.ra.Person#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Resource Allocations</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.ra.ResourceAllocation}.
	 * It is bidirectional and its opposite is '{@link tdt4250.ra.ResourceAllocation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Allocations</em>' reference list.
	 * @see tdt4250.ra.RaPackage#getPerson_ResourceAllocations()
	 * @see tdt4250.ra.ResourceAllocation#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<ResourceAllocation> getResourceAllocations();

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see tdt4250.ra.RaPackage#getPerson_GivenName()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link tdt4250.ra.Person#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #setFamilyName(String)
	 * @see tdt4250.ra.RaPackage#getPerson_FamilyName()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link tdt4250.ra.Person#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

} // Person
