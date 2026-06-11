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
	public Integer ElementEntries;
	public Integer ElementErrors;
	public String ErrorCode;
	public String ErrorDetails;
	public String FlowCategory;
	public String FlowDefinition;
	public String FlowLabel;
	public String FlowSubcategory;
	public String FlowType;
	public Integer Health;
	public Id Id;
	public String InstalledPackageName;
	public Boolean IsCitizenEnabled;
	public Boolean IsOverridable;
	public Boolean IsPaused;
	public Boolean IsTemplate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ListId;
	public Campaign List;
	public Integer LogsEnabledFlowVersion;
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
