/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class DuplicateJobMatchingRuleDefinition extends SObject {
	public static SObjectType$<DuplicateJobMatchingRuleDefinition> SObjectType;
	public static SObjectFields$<DuplicateJobMatchingRuleDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DuplicateJobDefinitionId;
	public DuplicateJobDefinition DuplicateJobDefinition;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MatchingRuleId;
	public MatchingRule MatchingRule;
	public Datetime SystemModstamp;

	public DuplicateJobMatchingRule[] DuplicateJobMatchingRules;

	public DuplicateJobMatchingRuleDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobMatchingRuleDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobMatchingRuleDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobMatchingRuleDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DuplicateJobMatchingRuleDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
