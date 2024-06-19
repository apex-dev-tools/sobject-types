/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MaintenancePlanShare extends SObject {
	public static SObjectType$<MaintenancePlanShare> SObjectType;
	public static SObjectFields$<MaintenancePlanShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public MaintenancePlan Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public MaintenancePlanShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlanShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlanShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlanShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MaintenancePlanShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
