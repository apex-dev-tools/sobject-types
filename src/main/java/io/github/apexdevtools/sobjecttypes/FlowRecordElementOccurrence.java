/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FlowRecordElementOccurrence extends SObject {
	public static SObjectType$<FlowRecordElementOccurrence> SObjectType;
	public static SObjectFields$<FlowRecordElementOccurrence> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public Integer Entries;
	public Integer Errors;
	public Integer Exits;
	public Id FlowRecordElementId;
	public FlowRecordElement FlowRecordElement;
	public Id FlowRecordId;
	public FlowRecord FlowRecord;
	public Id FlowRecordVersionId;
	public FlowRecordVersion FlowRecordVersion;
	public Id FlowRecordVersionOccurrenceId;
	public FlowRecordVersionOccurrence FlowRecordVersionOccurrence;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer Paused;
	public Integer Retrying;
	public Integer Stopped;
	public Datetime SystemModstamp;
	public Long TotalDuration;
	public Integer Waiting;

	public FlowRecordElementOccurrence clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordElementOccurrence clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordElementOccurrence clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordElementOccurrence clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordElementOccurrence clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
