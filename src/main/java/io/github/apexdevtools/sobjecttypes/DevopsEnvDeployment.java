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
public class DevopsEnvDeployment extends SObject {
	public static SObjectType$<DevopsEnvDeployment> SObjectType;
	public static SObjectFields$<DevopsEnvDeployment> Fields;

	public Id BackSyncStageId;
	public DevopsPipelineStage BackSyncStage;
	public Datetime CheckDeployCompletionDate;
	public Datetime CheckDeployDate;
	public String CheckDeployIdentifier;
	public Id CheckDeployRequestInfoId;
	public DevopsRequestInfo CheckDeployRequestInfo;
	public String CheckDeployStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DeployCompletionDate;
	public Id DeployRequestInfoId;
	public DevopsRequestInfo DeployRequestInfo;
	public String DeployStatus;
	public Datetime DeploymentDate;
	public String DeploymentIdentifier;
	public Id DevopsPipelnStgPromId;
	public DevopsPipelnStgProm DevopsPipelnStgProm;
	public Integer EndRevisionCounter;
	public Id Id;
	public Boolean IsCheckDeploy;
	public Boolean IsDeleted;
	public Boolean IsFullDeploy;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String RunTests;
	public String SelectedWorkItemIds;
	public Integer StartRevisionCounter;
	public String Status;
	public Id SwapStageId;
	public DevopsPipelineStage SwapStage;
	public Datetime SystemModstamp;
	public Id TargetDeployOrgId;
	public DevopsEnvironment TargetDeployOrg;
	public String TestLevel;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DevopsEnvDeploymentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DevopsEnvDeploymentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DevopsEnvDeployment clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvDeployment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvDeployment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvDeployment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsEnvDeployment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
