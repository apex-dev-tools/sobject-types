/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkProcedure extends SObject {
	public static SObjectType$<WorkProcedure> SObjectType;
	public static SObjectFields$<WorkProcedure> Fields;

	public String AssociatedFlowOrchestratorName;
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
	public String LeadTimeUnitType;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ReferenceRecordId;
	public CareProgram ReferenceRecord;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AdvTherapyFieldOptOverride[] AdvTherapyFOO_WorkProcedure;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CustodyVerfcTypeOverride[] CustodyVrfy_WorkProcedure;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkProcedureFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WorkProcedureHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WorkProcedureShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public WorkTypeSvcTerrSchdPrio[] WTSP_WorkProcedure;
	public ServiceAppointmentGroup[] WorkProcedures;
	public WorkTypeStepLdTimeOvride[] WorkTypeStepLdTimeOvrideWorkProcedure;
	public WorkProcedureStep[] Work_Procedure_Steps_Work_Procedure;

	public WorkProcedure clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkProcedure clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkProcedure clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkProcedure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkProcedure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
