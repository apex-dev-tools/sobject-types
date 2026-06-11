/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DecisionTableDataset extends SObject {
	public static SObjectType$<DecisionTableDataset> SObjectType;
	public static SObjectFields$<DecisionTableDataset> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DecisionTable;
	public String HashKey;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LastRefreshDate;
	public String NonhashedInputFieldValue1;
	public String NonhashedInputFieldValue2;
	public String NonhashedInputFieldValue3;
	public String NonhashedInputFieldValue4;
	public String NonhashedInputFieldValue5;
	public String NonhashedOutputFieldValue1;
	public String NonhashedOutputFieldValue2;
	public String NonhashedOutputFieldValue3;
	public String NonhashedOutputFieldValue4;
	public String NonhashedOutputFieldValue5;
	public Datetime SystemModstamp;

	public DecisionTableDataset clone$() {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDataset clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDataset clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDataset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DecisionTableDataset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
