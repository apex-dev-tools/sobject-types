/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsurancePolicyAttribute extends SObject {
	public static SObjectType$<InsurancePolicyAttribute> SObjectType;
	public static SObjectFields$<InsurancePolicyAttribute> Fields;

	public Id AttributeDefinitionId;
	public AttributeDefinition AttributeDefinition;
	public String AttributeName;
	public Id AttributePicklistValueId;
	public AttributePicklistValue AttributePicklistValue;
	public String AttributeValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalId;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;

	public InsPlcyLimit[] AssociatedAttributes;

	public InsurancePolicyAttribute clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAttribute clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAttribute clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
