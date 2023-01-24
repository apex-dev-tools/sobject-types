/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContractGroupPlanGroupClassShare extends SObject {
	public static SObjectType$<ContractGroupPlanGroupClassShare> SObjectType;
	public static SObjectFields$<ContractGroupPlanGroupClassShare> Fields;

	public String AccessLevel;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public ContractGroupPlanGroupClass Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public ContractGroupPlanGroupClassShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClassShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClassShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClassShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanGroupClassShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
