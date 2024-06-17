/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareBenefitVerifySettings extends SObject {
	public static SObjectType$<CareBenefitVerifySettings> SObjectType;
	public static SObjectFields$<CareBenefitVerifySettings> Fields;

	public String CodeSetType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultNpi;
	public String DeveloperName;
	public String GeneralPlanServiceTypeCode;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String OrganizationName;
	public Id ServiceApexClassId;
	public ApexClass ServiceApexClass;
	public Id ServiceNamedCredentialId;
	public NamedCredential ServiceNamedCredential;
	public String ServiceTypeSourceSystem;
	public Datetime SystemModstamp;
	public String UriPath;

	public CareBenefitVerifySettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
