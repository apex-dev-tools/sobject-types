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
public class ContractGrpPlanGrpClsAttr extends SObject {
	public static SObjectType$<ContractGrpPlanGrpClsAttr> SObjectType;
	public static SObjectFields$<ContractGrpPlanGrpClsAttr> Fields;

	public Id AttributeDefinitionId;
	public AttributeDefinition AttributeDefinition;
	public String AttributeName;
	public Id AttributePicklistValueId;
	public AttributePicklistValue AttributePicklistValue;
	public Id ContractGroupPlanGroupClassId;
	public ContractGroupPlanGroupClass ContractGroupPlanGroupClass;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalId;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Value;

	public ContractGrpPlanGrpClsAttr clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractGrpPlanGrpClsAttr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractGrpPlanGrpClsAttr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractGrpPlanGrpClsAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractGrpPlanGrpClsAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
