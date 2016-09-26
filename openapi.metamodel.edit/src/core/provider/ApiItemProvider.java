/**
 */
package core.provider;


import core.Api;
import core.CoreFactory;
import core.CorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link core.Api} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSwaggerPropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addBasePathPropertyDescriptor(object);
			addSchemesPropertyDescriptor(object);
			addConsumesPropertyDescriptor(object);
			addProducesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Swagger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwaggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Api_swagger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Api_swagger_feature", "_UI_Api_type"),
				 CorePackage.Literals.API__SWAGGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Api_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Api_host_feature", "_UI_Api_type"),
				 CorePackage.Literals.API__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Api_basePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Api_basePath_feature", "_UI_Api_type"),
				 CorePackage.Literals.API__BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schemes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Api_schemes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Api_schemes_feature", "_UI_Api_type"),
				 CorePackage.Literals.API__SCHEMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Api_consumes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Api_consumes_feature", "_UI_Api_type"),
				 CorePackage.Literals.API__CONSUMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Produces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProducesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Api_produces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Api_produces_feature", "_UI_Api_type"),
				 CorePackage.Literals.API__PRODUCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.Literals.API__INFO);
			childrenFeatures.add(CorePackage.Literals.API__PATHS);
			childrenFeatures.add(CorePackage.Literals.API__DEFINITIONS);
			childrenFeatures.add(CorePackage.Literals.API__PARAMETERS);
			childrenFeatures.add(CorePackage.Literals.API__RESPONSES);
			childrenFeatures.add(CorePackage.Literals.API__SECURITY_DEFINITIONS);
			childrenFeatures.add(CorePackage.Literals.API__SECURITY);
			childrenFeatures.add(CorePackage.Literals.API__EXTERNALDOCS);
			childrenFeatures.add(CorePackage.Literals.API__TAG);
			childrenFeatures.add(CorePackage.Literals.API__PRIMITIVE_DEFINITIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Api.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Api"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Api)object).getSwagger();
		return label == null || label.length() == 0 ?
			getString("_UI_Api_type") :
			getString("_UI_Api_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Api.class)) {
			case CorePackage.API__SWAGGER:
			case CorePackage.API__HOST:
			case CorePackage.API__BASE_PATH:
			case CorePackage.API__SCHEMES:
			case CorePackage.API__CONSUMES:
			case CorePackage.API__PRODUCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.API__INFO:
			case CorePackage.API__PATHS:
			case CorePackage.API__DEFINITIONS:
			case CorePackage.API__PARAMETERS:
			case CorePackage.API__RESPONSES:
			case CorePackage.API__SECURITY_DEFINITIONS:
			case CorePackage.API__SECURITY:
			case CorePackage.API__EXTERNALDOCS:
			case CorePackage.API__TAG:
			case CorePackage.API__PRIMITIVE_DEFINITIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__INFO,
				 CoreFactory.eINSTANCE.createInfo()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__PATHS,
				 CoreFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__DEFINITIONS,
				 CoreFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__PARAMETERS,
				 CoreFactory.eINSTANCE.createAPIParameter()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__RESPONSES,
				 CoreFactory.eINSTANCE.createResponse()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__SECURITY_DEFINITIONS,
				 CoreFactory.eINSTANCE.createSecuritySchema()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__SECURITY,
				 CoreFactory.eINSTANCE.createSecurityRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__EXTERNALDOCS,
				 CoreFactory.eINSTANCE.createExternalDocs()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__TAG,
				 CoreFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.API__PRIMITIVE_DEFINITIONS,
				 CoreFactory.eINSTANCE.createSchema()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.API__DEFINITIONS ||
			childFeature == CorePackage.Literals.API__PRIMITIVE_DEFINITIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OpenAPIEditPlugin.INSTANCE;
	}

}
