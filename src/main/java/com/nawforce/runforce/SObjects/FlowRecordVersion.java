/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowRecordVersion extends SObject {
	public static SObjectType$<FlowRecordVersion> SObjectType;
	public static SObjectFields$<FlowRecordVersion> Fields;

	public Id ActivatedById;
	public User ActivatedBy;
	public Datetime ActivatedDate;
	public Decimal ApiVersion;
	public String Builder;
	public String CapacityCategory;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
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

	public FlowRecordVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
