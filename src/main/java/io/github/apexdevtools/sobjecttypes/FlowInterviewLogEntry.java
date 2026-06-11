/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FlowInterviewLogEntry extends SObject {
	public static SObjectType$<FlowInterviewLogEntry> SObjectType;
	public static SObjectFields$<FlowInterviewLogEntry> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DurationSinceStartInMinutes;
	public String ElementApiName;
	public Decimal ElementDurationInMinutes;
	public String ElementLabel;
	public Id FlowInterviewLogId;
	public FlowInterviewLog FlowInterviewLog;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LogEntryTimestamp;
	public String LogEntryType;
	public String Name;
	public Datetime SystemModstamp;

	public FlowInterviewLogEntry clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLogEntry clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLogEntry clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLogEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowInterviewLogEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
