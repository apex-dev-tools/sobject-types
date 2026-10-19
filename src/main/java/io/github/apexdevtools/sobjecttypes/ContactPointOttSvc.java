/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContactPointOttSvc extends SObject {
	public static SObjectType$<ContactPointOttSvc> SObjectType;
	public static SObjectFields$<ContactPointOttSvc> Fields;

	public Datetime ActiveFromDateTime;
	public Datetime ActiveToDateTime;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public String BestTimeToContactTimeZone;
	public String BusinessPortfolioIdentifier;
	public String ChannelSenderCode;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EngagementChannelTypeId;
	public EngagementChannelType EngagementChannelType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Boolean IsUndeliverable;
	public Boolean IsVerified;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public Name Parent;
	public String PhoneNumber;
	public Integer PreferenceRank;
	public Datetime ProfileFirstCreatedDateTime;
	public Datetime ProfileLastUpdatedDateTime;
	public Integer ProfileOccurrenceCount;
	public Datetime SystemModstamp;
	public String UsageType;
	public String UserIdentifier;
	public String UserName;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactPointConsent[] ContactPointConsents;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ContactPointOttSvcShare[] Shares;

	public ContactPointOttSvc clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointOttSvc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointOttSvc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointOttSvc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointOttSvc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
