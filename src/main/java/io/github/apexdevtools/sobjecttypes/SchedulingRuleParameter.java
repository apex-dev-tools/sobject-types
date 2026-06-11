/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
