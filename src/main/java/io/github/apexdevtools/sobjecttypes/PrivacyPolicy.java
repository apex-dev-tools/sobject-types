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
public class PrivacyPolicy extends SObject {
	public static SObjectType$<PrivacyPolicy> SObjectType;
	public static SObjectFields$<PrivacyPolicy> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefinitionDeveloperName;
	public String DefinitionMasterLabel;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id PrivacyPolicyDefinitionId;
	public PrivacyPolicyDefinition PrivacyPolicyDefinition;
	public String RunFrequency;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public PrivacyPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
