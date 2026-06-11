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
public class FlowRecordVersionOccurrence extends SObject {
	public static SObjectType$<FlowRecordVersionOccurrence> SObjectType;
	public static SObjectFields$<FlowRecordVersionOccurrence> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public Integer Entries;
	public String ErrorDetail;
	public Integer Errors;
	public Integer Exits;
	public Id FlowRecordId;
	public FlowRecord FlowRecord;
	public Id FlowRecordVersionId;
	public FlowRecordVersion FlowRecordVersion;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String ProgressStatus;
	public Datetime ScheduledDate;
	public Integer Stopped;
	public Datetime SystemModstamp;

	public FlowRecordVersionOccurrence clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionOccurrence clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionOccurrence clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionOccurrence clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionOccurrence clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
