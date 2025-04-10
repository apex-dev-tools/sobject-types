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
