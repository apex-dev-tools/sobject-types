/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

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
