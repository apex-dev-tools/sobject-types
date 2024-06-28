/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MatchingRule extends SObject {
	public static SObjectFields$<MatchingRule> Fields;

	public String BooleanFilter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MatchEngine;
	public String NamespacePrefix;
	public String RuleStatus;
	public String SobjectSubtype;
	public String SobjectType;
	public Datetime SystemModstamp;

	public DuplicateJobMatchingRuleDefinition[] DuplicateJobMatchingRuleDefinitions;
	public MatchingRuleItem[] MatchingRuleItems;

	public MatchingRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public MatchingRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MatchingRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MatchingRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MatchingRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
