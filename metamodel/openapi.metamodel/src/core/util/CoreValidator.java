/**
 */
package core.util;

import core.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;
	
	
	/**
	 * The parsed OCL expression for the definition of the '<em>validFirstName</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint api_requiredSwaggerAttributeInvOCL;
	/**
	 * The parsed OCL expression for the definition of the '<em>validLastName</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/emf/2002/Ecore/OCL";

	private static final OCL OCL_ENV = OCL.newInstance();
	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CorePackage.API:
				return validateApi((Api)value, diagnostics, context);
			case CorePackage.INFO:
				return validateInfo((Info)value, diagnostics, context);
			case CorePackage.CONTACT:
				return validateContact((Contact)value, diagnostics, context);
			case CorePackage.LICENSE:
				return validateLicense((License)value, diagnostics, context);
			case CorePackage.PATH:
				return validatePath((Path)value, diagnostics, context);
			case CorePackage.API_OPERATION:
				return validateAPIOperation((APIOperation)value, diagnostics, context);
			case CorePackage.EXTERNAL_DOCS:
				return validateExternalDocs((ExternalDocs)value, diagnostics, context);
			case CorePackage.API_PARAMETER:
				return validateAPIParameter((APIParameter)value, diagnostics, context);
			case CorePackage.ITEMS:
				return validateItems((Items)value, diagnostics, context);
			case CorePackage.SCHEMA:
				return validateSchema((Schema)value, diagnostics, context);
			case CorePackage.RESPONSE:
				return validateResponse((Response)value, diagnostics, context);
			case CorePackage.SECURITY_REQUIREMENT:
				return validateSecurityRequirement((SecurityRequirement)value, diagnostics, context);
			case CorePackage.HEADER:
				return validateHeader((Header)value, diagnostics, context);
			case CorePackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case CorePackage.SECURITY_SCHEMA:
				return validateSecuritySchema((SecuritySchema)value, diagnostics, context);
			case CorePackage.EXAMPLE:
				return validateExample((Example)value, diagnostics, context);
			case CorePackage.XML_ELEMENT:
				return validateXMLElement((XMLElement)value, diagnostics, context);
			case CorePackage.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			case CorePackage.SCHEME_TYPE:
				return validateSchemeType((SchemeType)value, diagnostics, context);
			case CorePackage.PARAMETER_LOCATION:
				return validateParameterLocation((ParameterLocation)value, diagnostics, context);
			case CorePackage.COLLECTION_FORMAT:
				return validateCollectionFormat((CollectionFormat)value, diagnostics, context);
			case CorePackage.OAUTH2_FLOW_TYPE:
				return validateOAuth2FlowType((OAuth2FlowType)value, diagnostics, context);
			case CorePackage.API_KEY_LOCATION:
				return validateAPIKeyLocation((APIKeyLocation)value, diagnostics, context);
			case CorePackage.SECURITY_SCHEME_TYPE:
				return validateSecuritySchemeType((SecuritySchemeType)value, diagnostics, context);
			case CorePackage.JSON_DATA_TYPE:
				return validateJsonDataType((JsonDataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApi(Api api, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(api, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateApi_requiredSwaggerAttribute(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateApi_requiredInfoReference(api, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredSwaggerAttribute constraint of '<em>Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public boolean validateApi_requiredSwaggerAttribute(Api api, DiagnosticChain diagnostics, Map<Object, Object> context) {
		  if (api_requiredSwaggerAttributeInvOCL == null) {
				OCL.Helper helper = OCL_ENV.createOCLHelper();
				helper.setContext(CorePackage.Literals.API);
				
				EAnnotation ocl = CorePackage.Literals.API.getEAnnotation(OCL_ANNOTATION_SOURCE);
				String expr = ocl.getDetails().get("requiredSwaggerAttribute");
				
				try {
					api_requiredSwaggerAttributeInvOCL = helper.createInvariant(expr);
				}
				catch (ParserException e) {
					throw new UnsupportedOperationException(e.getLocalizedMessage());
				}
			}
			
			Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(api_requiredSwaggerAttributeInvOCL);
			
			if (!query.check(api)) {
					if (diagnostics != null) {
						diagnostics.add
							(createDiagnostic
								(Diagnostic.ERROR,
								 DIAGNOSTIC_SOURCE,
								 0,
								 "_UI_GenericConstraint_diagnostic",
								 new Object[] { "requiredSwaggerReference", getObjectLabel(api, context) },
								 new Object[] { api },
								 context));
					}
					return false;
				}
				return true;
		}


	/**
	 * Validates the requiredInfoReference constraint of '<em>Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApi_requiredInfoReference(Api api, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "requiredInfoReference", getObjectLabel(api, context) },
						 new Object[] { api },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(info, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicense(License license, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(license, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(path, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPIOperation(APIOperation apiOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(apiOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocs(ExternalDocs externalDocs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalDocs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPIParameter(APIParameter apiParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(apiParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItems(Items items, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(items, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponse(Response response, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(response, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRequirement(SecurityRequirement securityRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(header, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySchema(SecuritySchema securitySchema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securitySchema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample(Example example, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXMLElement(XMLElement xmlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemeType(SchemeType schemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterLocation(ParameterLocation parameterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionFormat(CollectionFormat collectionFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2FlowType(OAuth2FlowType oAuth2FlowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPIKeyLocation(APIKeyLocation apiKeyLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySchemeType(SecuritySchemeType securitySchemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJsonDataType(JsonDataType jsonDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CoreValidator
