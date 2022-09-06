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
public class SchedulingRuleParameter extends SObject {
	public static SObjectType$<SchedulingRuleParameter> SObjectType;
	public static SObjectFields$<SchedulingRuleParameter> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String SchedulingParameterKey;
	public Id SchedulingRuleId;
	public SchedulingRule SchedulingRule;
	public Datetime SystemModstamp;
	public String Value;

	public SchedulingRuleParameter clone$() {throw new java.lang.UnsupportedOperationException();}
	public SchedulingRuleParameter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingRuleParameter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingRuleParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingRuleParameter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
