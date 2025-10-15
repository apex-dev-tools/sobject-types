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
public class FlowRecordChangeEvent extends SObject {
	public static SObjectType$<FlowRecordChangeEvent> SObjectType;
	public static SObjectFields$<FlowRecordChangeEvent> Fields;

	public Id ActivationId;
	public MarketSegmentActivation Activation;
	public Id ActiveVersionId;
	public FlowRecordVersion ActiveVersion;
	public String ApiName;
	public Integer ApiVersion;
	public Boolean AreMetricsLoggedToDataCloud;
	public Id AssociatedRecordId;
	public SObject AssociatedRecord;
	public String Builder;
	public String CapacityCategory;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String ErrorCode;
	public String ErrorDetails;
	public String FlowCategory;
	public String FlowDefinition;
	public String FlowLabel;
	public String FlowSubcategory;
	public String FlowType;
	public Id Id;
	public String InstalledPackageName;
	public Boolean IsCitizenEnabled;
	public Boolean IsOverridable;
	public Boolean IsPaused;
	public Boolean IsTemplate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ManageableState;
	public String Name;
	public String NamespacePrefix;
	public Id OverriddenById;
	public FlowRecord OverriddenBy;
	public Id OverriddenFlowId;
	public FlowRecord OverriddenFlow;
	public Id OwnerId;
	public User Owner;
	public String ProgressStatus;
	public String ReplayId;
	public Datetime ScheduledStartDate;
	public Id SegmentId;
	public MarketSegment Segment;
	public Id SourceTemplateId;
	public FlowRecord SourceTemplate;
	public String StartSource;
	public String TriggerObjectOrEventLabel;
	public String Type;

	public FlowRecordChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
