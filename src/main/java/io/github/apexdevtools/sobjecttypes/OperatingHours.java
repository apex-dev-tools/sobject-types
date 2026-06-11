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
public class OperatingHours extends SObject {
	public static SObjectType$<OperatingHours> SObjectType;
	public static SObjectFields$<OperatingHours> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OperatingHoursRowType;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public String TimeZone;

	public Account[] Accounts;
	public AppointmentTopicTimeSlot[] AppointmentTopicTimeSlots;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OperatingHoursFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthcarePractitionerFacility[] HealthcarePractitionerFacilityOperatingHours;
	public OperatingHoursHistory[] Histories;
	public WorkType[] OperatingHours;
	public OperatingHoursHoliday[] OperatingHoursHolidays;
	public NetworkActivityAudit[] ParentEntities;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CareProviderSearchableField[] SearchDataOperatingHours;
	public ServiceResourcePreference[] ServiceResourcePreferences;
	public ServiceTerritory[] ServiceTerritories;
	public OperatingHoursShare[] Shares;
	public TimeSlot[] TimeSlots;

	public OperatingHours clone$() {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHours clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
