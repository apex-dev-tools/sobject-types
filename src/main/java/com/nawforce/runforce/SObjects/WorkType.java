/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkType extends SObject {
	public static SObjectType$<WorkType> SObjectType;
	public static SObjectFields$<WorkType> Fields;

	public Id AppointmentCategoryId;
	public AppointmentCategory AppointmentCategory;
	public Integer ApptStartTimeIntvlInMin;
	public Integer AttendeeLimit;
	public Integer BlockTimeAfterAppointment;
	public String BlockTimeAfterUnit;
	public Integer BlockTimeBeforeAppointment;
	public String BlockTimeBeforeUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultAppointmentType;
	public String Description;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Decimal EstimatedDuration;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MinimumCrewSize;
	public String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public Name Owner;
	public Id ProductId;
	public Product2 Product;
	public Integer RecommendedCrewSize;
	public Id ServiceReportTemplateId;
	public ServiceReportLayout ServiceReportTemplate;
	public Boolean ShouldAutoCreateSvcAppt;
	public Datetime SystemModstamp;
	public String TimeFrameEndUnit;
	public String TimeFrameStartUnit;
	public Integer TimeframeEnd;
	public Integer TimeframeStart;

	public AppointmentInvitation[] AppointmentInvitations;
	public AppointmentTopicTimeSlot[] AppointmentTopicTimeSlots;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EngagementChannelWorkType[] EngagementChannelWorkTypes;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkTypeFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WorkTypeHistory[] Histories;
	public LinkedArticle[] LinkedArticles;
	public MaintenanceAsset[] MaintenanceAssets;
	public MaintenancePlan[] MaintenancePlans;
	public MaintenanceWorkRule[] MaintenanceWorkRules;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductServiceCampaign[] ProductServiceCampaignWorkTypes;
	public ProductRequired[] ProductsRequired;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public WorkTypeShare[] Shares;
	public Shift[] ShiftWorkTypes;
	public SkillRequirement[] SkillRequirements;
	public Visit[] VisitTypes;
	public WaitlistParticipant[] WaitlistParticipants;
	public WaitlistWorkType[] WaitlistWorkTypes;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;
	public WorkTypeGroupMember[] WorkTypeGroupMembers;
	public ShiftWorkTopic[] WorkTypeShifts;
	public ServiceTerritoryWorkType[] WorkTypes;

	public WorkType clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
