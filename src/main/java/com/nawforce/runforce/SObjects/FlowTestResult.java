/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowTestResult extends SObject {
	public static SObjectType$<FlowTestResult> SObjectType;
	public static SObjectFields$<FlowTestResult> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FlowDefinitionViewId;
	public String FlowTestViewId;
	public Integer FlowVersionNumber;
	public String FlowVersionViewId;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Result;
	public Datetime SystemModstamp;
	public Datetime TestEndDateTime;
	public Datetime TestStartDateTime;

	public FlowTestResultShare[] Shares;

	public FlowTestResult clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowTestResult clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowTestResult clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowTestResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowTestResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
