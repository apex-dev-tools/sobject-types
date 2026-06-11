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
public class DcsnTblSourceObjectRecord extends SObject {
	public static SObjectType$<DcsnTblSourceObjectRecord> SObjectType;
	public static SObjectFields$<DcsnTblSourceObjectRecord> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime DcsnTblRecordLastModifiedDate;
	public String DecisionTable;
	public String DecisionTableSobjectRecord;
	public String HashKey;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer RecordIndex;
	public Datetime SystemModstamp;

	public DcsnTblSourceObjectRecord clone$() {throw new java.lang.UnsupportedOperationException();}
	public DcsnTblSourceObjectRecord clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DcsnTblSourceObjectRecord clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DcsnTblSourceObjectRecord clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DcsnTblSourceObjectRecord clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
