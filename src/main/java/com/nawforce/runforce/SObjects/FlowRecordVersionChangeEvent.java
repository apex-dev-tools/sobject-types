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
public class FlowRecordVersionChangeEvent extends SObject {
	public static SObjectType$<FlowRecordVersionChangeEvent> SObjectType;
	public static SObjectFields$<FlowRecordVersionChangeEvent> Fields;

	public Id ActivatedById;
	public User ActivatedBy;
	public Datetime ActivatedDate;
	public Decimal ApiVersion;
	public Boolean AreMetricsLoggedToDataCloud;
	public String Builder;
	public String CapacityCategory;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id FlowRecordId;
	public FlowRecord FlowRecord;
	public String FlowType;
	public Id Id;
	public Boolean IsOverridable;
	public Boolean IsPaused;
	public Boolean IsTemplate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
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
	public String ReplayId;
	public Datetime ResumedDate;
	public Id ResumingUserId;
	public User ResumingUser;
	public String RunInMode;
	public Datetime ScheduledStartDate;
	public Id SourceTemplateId;
	public FlowRecord SourceTemplate;
	public String Status;
	public String TriggerObjectOrEventLabel;
	public Integer VersionNumber;

	public FlowRecordVersionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
