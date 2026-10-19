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
public class WorkTypeStepLdTimeOvride extends SObject {
	public static SObjectType$<WorkTypeStepLdTimeOvride> SObjectType;
	public static SObjectFields$<WorkTypeStepLdTimeOvride> Fields;

	public Id CountryId;
	public GeoCountry Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LeadTime;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer Priority;
	public Id RelatedWorkTypeServiceTerritoryId;
	public ServiceTerritory RelatedWorkTypeServiceTerritory;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Datetime SystemModstamp;
	public Id WorkProcedureId;
	public WorkProcedure WorkProcedure;
	public Id WorkTypeId;
	public WorkType WorkType;
	public Id WorkTypeServiceTerritoryId;
	public ServiceTerritory WorkTypeServiceTerritory;
	public Id WorkTypeStepId;
	public WorkTypeStep WorkTypeStep;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkTypeStepLdTimeOvrideFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WorkTypeStepLdTimeOvrideHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkTypeStepLdTimeOvrideShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public WorkTypeStepLdTimeOvride clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvride clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvride clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvride clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvride clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
