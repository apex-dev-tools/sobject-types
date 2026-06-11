/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CareBenefitVerifySettingsChangeEvent extends SObject {
	public static SObjectType$<CareBenefitVerifySettingsChangeEvent> SObjectType;
	public static SObjectFields$<CareBenefitVerifySettingsChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String CodeSetType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultNpi;
	public String DeveloperName;
	public String GeneralPlanServiceTypeCode;
	public Id Id;
	public Boolean IsDefault;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String OrganizationName;
	public String ReplayId;
	public Id ServiceApexClassId;
	public ApexClass ServiceApexClass;
	public Id ServiceNamedCredentialId;
	public NamedCredential ServiceNamedCredential;
	public String ServiceTypeSourceSystem;
	public String UriPath;

	public CareBenefitVerifySettingsChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettingsChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettingsChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettingsChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareBenefitVerifySettingsChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
