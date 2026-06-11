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
public class FlowRecordVersion extends SObject {
	public static SObjectType$<FlowRecordVersion> SObjectType;
	public static SObjectFields$<FlowRecordVersion> Fields;

	public Id ActivatedById;
	public User ActivatedBy;
	public Datetime ActivatedDate;
	public Decimal ApiVersion;
	public Boolean AreMetricsLoggedToDataCloud;
	public String Builder;
	public String CapacityCategory;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public Integer Entries;
	public Integer Errors;
	public Integer Exits;
	public Id FlowRecordId;
	public FlowRecord FlowRecord;
	public String FlowType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOverridable;
	public Boolean IsPaused;
	public Boolean IsTemplate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OverriddenById;
	public FlowRecord OverriddenBy;
	public Id OverriddenFlowId;
	public FlowRecord OverriddenFlow;
	public Datetime PausedDate;
	public Id PausingUserId;
	public User PausingUser;
	public String ProgressStatus;
	public String ReasonPaused;
	public Datetime ResumedDate;
	public Id ResumingUserId;
	public User ResumingUser;
	public String RunInMode;
	public Datetime ScheduledStartDate;
	public Id SourceTemplateId;
	public FlowRecord SourceTemplate;
	public String Status;
	public Datetime SystemModstamp;
	public String TriggerObjectOrEventLabel;
	public Integer VersionNumber;

	public FlowRecordElementOccurrence[] FlowRecordVersionElementOccurrences;

	public FlowRecordVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
