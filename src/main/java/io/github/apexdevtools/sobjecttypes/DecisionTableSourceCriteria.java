/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DecisionTableSourceCriteria extends SObject {
	public static SObjectType$<DecisionTableSourceCriteria> SObjectType;
	public static SObjectFields$<DecisionTableSourceCriteria> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DecisionTableId;
	public DecisionTable DecisionTable;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Operator;
	public Integer SequenceNumber;
	public String SourceFieldName;
	public Datetime SystemModstamp;
	public String Value;
	public String ValueType;

	public DecisionTableSourceCriteria clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableSourceCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
