/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MatchingRuleItem extends SObject {
	public static SObjectType$<MatchingRuleItem> SObjectType;
	public static SObjectFields$<MatchingRuleItem> Fields;

	public String BlankValueBehavior;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MatchingMethod;
	public Id MatchingRuleId;
	public MatchingRule MatchingRule;
	public Integer SortOrder;
	public Datetime SystemModstamp;

	public MatchingRuleItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public MatchingRuleItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MatchingRuleItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MatchingRuleItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MatchingRuleItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
