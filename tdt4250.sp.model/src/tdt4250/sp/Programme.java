/**
 */
package tdt4250.sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.sp.Programme#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.sp.Programme#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.sp.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.sp.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.sp.Programme#getNumberOfSemesters <em>Number Of Semesters</em>}</li>
 * </ul>
 *
 * @see tdt4250.sp.SpPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.sp.SpPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.sp.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.sp.SpPackage#getProgramme_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.sp.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.sp.Specialization}.
	 * It is bidirectional and its opposite is '{@link tdt4250.sp.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see tdt4250.sp.SpPackage#getProgramme_Specializations()
	 * @see tdt4250.sp.Specialization#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.sp.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.sp.SpPackage#getProgramme_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Number Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Semesters</em>' attribute.
	 * @see #setNumberOfSemesters(int)
	 * @see tdt4250.sp.SpPackage#getProgramme_NumberOfSemesters()
	 * @model
	 * @generated
	 */
	int getNumberOfSemesters();

	/**
	 * Sets the value of the '{@link tdt4250.sp.Programme#getNumberOfSemesters <em>Number Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Semesters</em>' attribute.
	 * @see #getNumberOfSemesters()
	 * @generated
	 */
	void setNumberOfSemesters(int value);

} // Programme
