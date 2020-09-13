/**
 */
package tdt4250.sp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.sp.CourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.sp.CourseGroup#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tdt4250.sp.SpPackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.sp.SpPackage#getCourseGroup_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.sp.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tdt4250.sp.CourseType
	 * @see #setType(CourseType)
	 * @see tdt4250.sp.SpPackage#getCourseGroup_Type()
	 * @model
	 * @generated
	 */
	CourseType getType();

	/**
	 * Sets the value of the '{@link tdt4250.sp.CourseGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tdt4250.sp.CourseType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseType value);

} // CourseGroup
