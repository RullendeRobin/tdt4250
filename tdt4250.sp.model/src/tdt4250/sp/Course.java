/**
 */
package tdt4250.sp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.sp.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.sp.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.sp.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.sp.Course#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @see tdt4250.sp.SpPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.sp.SpPackage#getCourse_Code()
	 * @model dataType="tdt4250.sp.CourseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.sp.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.sp.SpPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.sp.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(float)
	 * @see tdt4250.sp.SpPackage#getCourse_Credit()
	 * @model
	 * @generated
	 */
	float getCredit();

	/**
	 * Sets the value of the '{@link tdt4250.sp.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.sp.AcademicLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see tdt4250.sp.AcademicLevel
	 * @see #setLevel(AcademicLevel)
	 * @see tdt4250.sp.SpPackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	AcademicLevel getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.sp.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see tdt4250.sp.AcademicLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AcademicLevel value);

} // Course
