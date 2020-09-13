/**
 */
package tdt4250.ra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.ra.Person;
import tdt4250.ra.RaPackage;
import tdt4250.ra.ResourceAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.ra.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.ra.impl.PersonImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link tdt4250.ra.impl.PersonImpl#getResourceAllocations <em>Resource Allocations</em>}</li>
 *   <li>{@link tdt4250.ra.impl.PersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link tdt4250.ra.impl.PersonImpl#getFamilyName <em>Family Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected float capacity = CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceAllocations() <em>Resource Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAllocation> resourceAllocations;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(float newCapacity) {
		float oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RaPackage.PERSON__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAllocation> getResourceAllocations() {
		if (resourceAllocations == null) {
			resourceAllocations = new EObjectWithInverseResolvingEList<ResourceAllocation>(ResourceAllocation.class, this, RaPackage.PERSON__RESOURCE_ALLOCATIONS, RaPackage.RESOURCE_ALLOCATION__PERSON);
		}
		return resourceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGivenName() {
		if (this.name == null) {
			return null;
		}
		int pos = name.lastIndexOf(' ');
		if (pos < 0) {
			return null;
		}
		return name.substring(0, pos).trim();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setGivenName(String newGivenName) {
		String familyName = getFamilyName();
		if (familyName == null) {
			familyName = "?";
		}
		if (newGivenName == null) {
			newGivenName ="";
		}
		setName(newGivenName + " " + getFamilyName().trim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFamilyName() {
		if (this.name == null) {
			return null;
		}
		int pos = name.lastIndexOf(' ');
		if (pos < 0) {
			return name;
		}
		return name.substring(pos + 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFamilyName(String newFamilyName) {
		String givenName = getGivenName();
		if (givenName == null) {
			givenName = "?";
		}
		if (newFamilyName == null) {
			newFamilyName ="";
		}
		setName(givenName + " " + newFamilyName.trim());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.PERSON__RESOURCE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceAllocations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RaPackage.PERSON__RESOURCE_ALLOCATIONS:
				return ((InternalEList<?>)getResourceAllocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RaPackage.PERSON__NAME:
				return getName();
			case RaPackage.PERSON__CAPACITY:
				return getCapacity();
			case RaPackage.PERSON__RESOURCE_ALLOCATIONS:
				return getResourceAllocations();
			case RaPackage.PERSON__GIVEN_NAME:
				return getGivenName();
			case RaPackage.PERSON__FAMILY_NAME:
				return getFamilyName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RaPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case RaPackage.PERSON__CAPACITY:
				setCapacity((Float)newValue);
				return;
			case RaPackage.PERSON__RESOURCE_ALLOCATIONS:
				getResourceAllocations().clear();
				getResourceAllocations().addAll((Collection<? extends ResourceAllocation>)newValue);
				return;
			case RaPackage.PERSON__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case RaPackage.PERSON__FAMILY_NAME:
				setFamilyName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RaPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RaPackage.PERSON__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case RaPackage.PERSON__RESOURCE_ALLOCATIONS:
				getResourceAllocations().clear();
				return;
			case RaPackage.PERSON__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case RaPackage.PERSON__FAMILY_NAME:
				setFamilyName(FAMILY_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RaPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RaPackage.PERSON__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case RaPackage.PERSON__RESOURCE_ALLOCATIONS:
				return resourceAllocations != null && !resourceAllocations.isEmpty();
			case RaPackage.PERSON__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? getGivenName() != null : !GIVEN_NAME_EDEFAULT.equals(getGivenName());
			case RaPackage.PERSON__FAMILY_NAME:
				return FAMILY_NAME_EDEFAULT == null ? getFamilyName() != null : !FAMILY_NAME_EDEFAULT.equals(getFamilyName());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
